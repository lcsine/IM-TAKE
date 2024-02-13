package com.tang.tangchat.common.websocket;
import cn.hutool.json.JSONUtil;
import com.tang.tangchat.common.websocket.domain.enums.WSReqTypeEnum;
import com.tang.tangchat.common.websocket.domain.vo.req.WSBaseReq;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

@Sharable
public class NettyWebSocketServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    /**
     * @see IdleStateEvent 读空闲事件
    * */
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) {
        if(evt instanceof WebSocketServerProtocolHandler.HandshakeComplete){
            System.out.println("握手完成");
        }else if(evt instanceof IdleStateEvent){
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
            if (idleStateEvent.state()== IdleState.READER_IDLE) {
                System.out.println("读空闲");
                //todo 用户下线
                ctx.channel().close();

            }
        }
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) {
        String text = msg.text();
        WSBaseReq wsBaseReq = JSONUtil.toBean(text, WSBaseReq.class);
        switch (WSReqTypeEnum.of(wsBaseReq.getType())) {
            case AUTHORIZE:
                break;
            case HEARTBEAT:
                break;
            //请求登录
            case LOGIN:
                System.out.println("请求二维码");
                ctx.channel().writeAndFlush(new TextWebSocketFrame("123"));
        }
    }
}

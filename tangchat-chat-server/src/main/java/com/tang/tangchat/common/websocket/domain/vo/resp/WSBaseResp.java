package com.tang.tangchat.common.websocket.domain.vo.resp;
import com.tang.tangchat.common.websocket.domain.enums.WSRespTypeEnum;
public class WSBaseResp<T> {
    /**
     * @see WSRespTypeEnum
    * */
    private Integer type;
    private  T data;
}

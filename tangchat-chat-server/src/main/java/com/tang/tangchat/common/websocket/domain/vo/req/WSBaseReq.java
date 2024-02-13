package com.tang.tangchat.common.websocket.domain.vo.req;

import lombok.Data;
import com.tang.tangchat.common.websocket.domain.enums.WSReqTypeEnum;
@Data
public class WSBaseReq {
    /**
    * @see WSReqTypeEnum
    * */
    private Integer type;
    private String data;
}

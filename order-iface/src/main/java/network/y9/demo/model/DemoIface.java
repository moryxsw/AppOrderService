package network.y9.demo.model;

import network.y9.demo.model.request.DemoRequest;
import network.y9.dto.Result;

/**
 * DemoIface
 *
 * @author moryxsw
 * @since 2023/2/21
 */
public interface DemoIface {


    Result<String> getString(DemoRequest request);




}

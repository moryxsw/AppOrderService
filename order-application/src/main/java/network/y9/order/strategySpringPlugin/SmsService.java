package network.y9.order.strategySpringPlugin;

import org.springframework.plugin.core.PluginRegistry;

import java.util.Map;
import java.util.Optional;

public class SmsService {

    private PluginRegistry<SmsPlugin, SmsRequest> registry;


    public SmsResponse sendSms(SmsRequest request){
        Optional<SmsPlugin> smsPlugin = registry.getPluginFor(request);
        return smsPlugin.orElseThrow().sendSms(request);

    }
}

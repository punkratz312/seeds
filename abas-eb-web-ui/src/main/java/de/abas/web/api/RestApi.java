package de.abas.web.api;

import de.abas.service.DataService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestApi {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(RestApi.class);
    @Autowired
    private final DataService.Factory factory;

    @java.beans.ConstructorProperties({"factory"})
    public RestApi(DataService.Factory factory) {
        this.factory = factory;
    }

    @GetMapping
    public String example() {
        String foo22 = factory.create("42").foo22();
        log.info("example request with foo22: '{}'", foo22);
        return factory.create("42").foo22();
    }

    public DataService.Factory getFactory() {
        return this.factory;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof RestApi)) return false;
        final RestApi other = (RestApi) o;
        final Object this$factory = this.getFactory();
        final Object other$factory = other.getFactory();
        if (this$factory == null ? other$factory != null : !this$factory.equals(other$factory)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $factory = this.getFactory();
        result = result * PRIME + ($factory == null ? 43 : $factory.hashCode());
        return result;
    }

    public String toString() {
        return "RestApi(factory=" + this.getFactory() + ")";
    }
}
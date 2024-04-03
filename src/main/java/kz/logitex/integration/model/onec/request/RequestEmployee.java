package kz.logitex.integration.model.onec.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement(name = "RequestData", namespace = "urn:Employee")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class RequestEmployee {
    @XmlElement(name = "BIN")
    private String bin;

    @XmlElement(name = "IIN")
    private String iin;

    @XmlElement(name = "OperationTypeId")
    private Integer operationTypeId;
}

package sk.msholto.app.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.msholto.app.models.dto.userInfo.GetRolesResponse;
import sk.msholto.app.services.security.SecurityInformationService;

@RestController
@RequestMapping("/UserInfo")
@CrossOrigin
public class UserInfoController {

    @Autowired
    private SecurityInformationService securityInformationService;

    @GetMapping(path = "/getRoles")
    public GetRolesResponse getRoles() {
        GetRolesResponse ret = new GetRolesResponse();
        ret.getRoles().addAll(securityInformationService.getRoles());

        return ret;
    }
}

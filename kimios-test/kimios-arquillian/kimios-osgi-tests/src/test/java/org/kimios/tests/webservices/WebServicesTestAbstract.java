package org.kimios.tests.webservices;

import org.kimios.kernel.controller.ISecurityController;
import org.kimios.kernel.security.model.Session;
import org.kimios.tests.OsgiKimiosService;
import org.kimios.tests.TestAbstract;
import org.kimios.webservices.SecurityService;

/**
 * Created by tom on 11/02/16.
 */
public abstract class WebServicesTestAbstract extends TestAbstract {

    @OsgiKimiosService
    SecurityService securityService;

    public void init() {
        this.initServices();
    }

    public void setSecurityService(SecurityService securityService) {
        this.securityService = securityService;
    }
}

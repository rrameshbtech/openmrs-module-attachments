package org.openmrs.module.attachments.rest;

import org.openmrs.module.attachments.obs.Attachment;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;

@Resource(name = RestConstants.VERSION_1 + "/attachment", supportedClass = Attachment.class, supportedOpenmrsVersions = {
        "2.3.0" })
public class AttachmentResource2_x extends AttachmentResource2_0 {
	
}

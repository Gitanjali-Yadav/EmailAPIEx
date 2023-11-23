package com.csi.emailModel;

import lombok.Data;

@Data

public class EmailModel {

    private String toEmail[];

    private String ccEmail[];

    private String emailSubject;

    private String emailBody;

    private String emailAttachment;


}

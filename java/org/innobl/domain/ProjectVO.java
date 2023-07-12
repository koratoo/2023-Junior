package org.innobl.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class ProjectVO {

	private int PRJNO;
    private String PRJNAME;
    private Date PRJST;
    private Date PRJEND;
    private String PRJDESC;
    private String PRJSTATUS;
    private int VNO;
}

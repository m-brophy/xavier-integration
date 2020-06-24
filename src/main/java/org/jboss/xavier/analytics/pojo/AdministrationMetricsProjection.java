package org.jboss.xavier.analytics.pojo;

import java.util.Date;

public interface AdministrationMetricsProjection {

    Long getId();

    String getOwner();

    String getOwnerAccountNumber();

    String getPayloadName();

    String getAnalysisStatus();

    Date getAnalysisInserted();

    Long getTotalVms();

}

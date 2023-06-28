package com.epam.ta.model;

import com.epam.ta.model.enums.MachineFamily;
import com.epam.ta.model.enums.OSSoftware;
import com.epam.ta.model.enums.ProvisioningModel;
import com.epam.ta.model.enums.Series;

public interface PagesTestDataBuilder {
    PagesTestDataBuilder setOsSoftware(OSSoftware osSoftware);

    PagesTestDataBuilder setProvisioningModel(ProvisioningModel provisioningModel);

    PagesTestDataBuilder setMachineFamily(MachineFamily machineFamily);

    PagesTestDataBuilder setSeries(Series series);

    PagesTestDataBuilder setMachineType(String machineType);

    PagesTestDataBuilder setBootDiskSize(int bootDiskSize);
}

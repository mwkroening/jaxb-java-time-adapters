package org.threetenjaxb.threetenjaxb;

import java.time.LocalTime;

public class LocalTimeXmlAdapterTest extends AbstractToStringAdapterTest<LocalTime, LocalTimeXmlAdapter> {
    public LocalTimeXmlAdapterTest() {
        super(LocalTimeXmlAdapter.class);
    }

    @Override
    protected LocalTime getNotNullValue() {
        return LocalTime.parse("10:15:30");
    }

    @Override
    protected String getNotValidStringValue() {
        return "blah-blah";
    }
}

package org.joda.time.chrono;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117250;
     Object term117298;

    public BasicMonthOfYearDateTimeField_add_1905304068392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117250 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term117298 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term117060 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term117418 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term117418, term117418.getClass(), "iOrdinal", (byte) 21);
        setElement(term117060, 0, term117418);
        setField(term117298, term117298.getClass(), "iTypes", term117060);
        setField(term117298, term117298.getClass(), "iChronology", null);
        Object term117492 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term117492, term117492.getClass(), "iNameKey", "UTC");
        setIntField(term117492, term117492.getClass(), "iWallOffset", 0);
        setIntField(term117492, term117492.getClass(), "iStandardOffset", 0);
        setField(term117492, term117492.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term117492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term117298;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term117250, args);
    }

};



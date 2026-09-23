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

public class BasicMonthOfYearDateTimeField_add_1905304068434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154562;
     Object term154610;

    public BasicMonthOfYearDateTimeField_add_1905304068434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154562 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term154610 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term154373 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term154730 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term154730, term154730.getClass(), "iOrdinal", (byte) 1);
        setElement(term154373, 0, term154730);
        setField(term154610, term154610.getClass(), "iTypes", term154373);
        setField(term154610, term154610.getClass(), "iChronology", null);
        Object term154804 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term154804, term154804.getClass(), "iNameKey", "UTC");
        setIntField(term154804, term154804.getClass(), "iWallOffset", 0);
        setIntField(term154804, term154804.getClass(), "iStandardOffset", 0);
        setField(term154804, term154804.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term154804);
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
        args[0] = term154610;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term154562, args);
    }

};



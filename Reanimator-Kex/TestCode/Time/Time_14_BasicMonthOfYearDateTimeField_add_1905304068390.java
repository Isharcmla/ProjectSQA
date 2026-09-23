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

public class BasicMonthOfYearDateTimeField_add_1905304068390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116395;
     Object term116443;

    public BasicMonthOfYearDateTimeField_add_1905304068390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116395 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term116443 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term116206 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term116563 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term116563, term116563.getClass(), "iOrdinal", (byte) 4);
        setElement(term116206, 0, term116563);
        setField(term116443, term116443.getClass(), "iTypes", term116206);
        setField(term116443, term116443.getClass(), "iChronology", null);
        Object term116637 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term116637, term116637.getClass(), "iNameKey", "UTC");
        setIntField(term116637, term116637.getClass(), "iWallOffset", 0);
        setIntField(term116637, term116637.getClass(), "iStandardOffset", 0);
        setField(term116637, term116637.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term116637);
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
        args[0] = term116443;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term116395, args);
    }

};



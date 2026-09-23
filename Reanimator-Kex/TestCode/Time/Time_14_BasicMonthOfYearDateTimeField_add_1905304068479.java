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

public class BasicMonthOfYearDateTimeField_add_1905304068479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186899;
     Object term186947;

    public BasicMonthOfYearDateTimeField_add_1905304068479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186899 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term186947 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term186710 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term187067 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term187067, term187067.getClass(), "iOrdinal", (byte) 14);
        setElement(term186710, 0, term187067);
        setField(term186947, term186947.getClass(), "iTypes", term186710);
        setField(term186947, term186947.getClass(), "iChronology", null);
        Object term187141 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term187141, term187141.getClass(), "iNameKey", "UTC");
        setIntField(term187141, term187141.getClass(), "iWallOffset", 0);
        setIntField(term187141, term187141.getClass(), "iStandardOffset", 0);
        setField(term187141, term187141.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term187141);
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
        args[0] = term186947;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term186899, args);
    }

};



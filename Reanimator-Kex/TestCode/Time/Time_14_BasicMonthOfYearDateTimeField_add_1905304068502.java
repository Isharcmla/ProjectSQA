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

public class BasicMonthOfYearDateTimeField_add_1905304068502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203956;
     Object term204004;

    public BasicMonthOfYearDateTimeField_add_1905304068502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203956 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term204004 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term203767 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term204124 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term204124, term204124.getClass(), "iOrdinal", (byte) 13);
        setElement(term203767, 0, term204124);
        setField(term204004, term204004.getClass(), "iTypes", term203767);
        setField(term204004, term204004.getClass(), "iChronology", null);
        Object term204198 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term204198, term204198.getClass(), "iNameKey", "UTC");
        setIntField(term204198, term204198.getClass(), "iWallOffset", 0);
        setIntField(term204198, term204198.getClass(), "iStandardOffset", 0);
        setField(term204198, term204198.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term204198);
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
        args[0] = term204004;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term203956, args);
    }

};



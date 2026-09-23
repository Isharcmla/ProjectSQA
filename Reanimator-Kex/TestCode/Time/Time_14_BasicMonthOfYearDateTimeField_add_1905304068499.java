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

public class BasicMonthOfYearDateTimeField_add_1905304068499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198082;
     Object term198130;

    public BasicMonthOfYearDateTimeField_add_1905304068499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198082 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term198130 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term197893 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term198250 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term198250, term198250.getClass(), "iOrdinal", (byte) 9);
        setElement(term197893, 0, term198250);
        setField(term198130, term198130.getClass(), "iTypes", term197893);
        setField(term198130, term198130.getClass(), "iChronology", null);
        Object term198324 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term198324, term198324.getClass(), "iNameKey", "UTC");
        setIntField(term198324, term198324.getClass(), "iWallOffset", 0);
        setIntField(term198324, term198324.getClass(), "iStandardOffset", 0);
        setField(term198324, term198324.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term198324);
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
        args[0] = term198130;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term198082, args);
    }

};



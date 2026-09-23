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

public class BasicMonthOfYearDateTimeField_add_1905304068515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213015;
     Object term213063;

    public BasicMonthOfYearDateTimeField_add_1905304068515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213015 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term213063 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term212826 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term213183 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term213183, term213183.getClass(), "iOrdinal", (byte) 2);
        setElement(term212826, 0, term213183);
        setField(term213063, term213063.getClass(), "iTypes", term212826);
        setField(term213063, term213063.getClass(), "iChronology", null);
        Object term213257 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term213257, term213257.getClass(), "iNameKey", "UTC");
        setIntField(term213257, term213257.getClass(), "iWallOffset", 0);
        setIntField(term213257, term213257.getClass(), "iStandardOffset", 0);
        setField(term213257, term213257.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term213257);
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
        args[0] = term213063;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term213015, args);
    }

};



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

public class BasicMonthOfYearDateTimeField_add_1905304068422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145264;
     Object term145312;

    public BasicMonthOfYearDateTimeField_add_1905304068422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145264 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term145312 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term145075 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term145432 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term145432, term145432.getClass(), "iOrdinal", (byte) 11);
        setElement(term145075, 0, term145432);
        setField(term145312, term145312.getClass(), "iTypes", term145075);
        setField(term145312, term145312.getClass(), "iChronology", null);
        Object term145506 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term145506, term145506.getClass(), "iNameKey", "UTC");
        setIntField(term145506, term145506.getClass(), "iWallOffset", 0);
        setIntField(term145506, term145506.getClass(), "iStandardOffset", 0);
        setField(term145506, term145506.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term145506);
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
        args[0] = term145312;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term145264, args);
    }

};



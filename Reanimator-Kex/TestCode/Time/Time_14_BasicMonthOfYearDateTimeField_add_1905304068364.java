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

public class BasicMonthOfYearDateTimeField_add_1905304068364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98458;
     Object term98506;

    public BasicMonthOfYearDateTimeField_add_1905304068364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98458 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term98506 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term98269 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term98626 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term98626, term98626.getClass(), "iOrdinal", (byte) 17);
        setElement(term98269, 0, term98626);
        setField(term98506, term98506.getClass(), "iTypes", term98269);
        setField(term98506, term98506.getClass(), "iChronology", null);
        Object term98700 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term98700, term98700.getClass(), "iNameKey", "UTC");
        setIntField(term98700, term98700.getClass(), "iWallOffset", 0);
        setIntField(term98700, term98700.getClass(), "iStandardOffset", 0);
        setField(term98700, term98700.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term98700);
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
        args[0] = term98506;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term98458, args);
    }

};



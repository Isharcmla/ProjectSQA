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

public class BasicMonthOfYearDateTimeField_add_1905304068409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136898;
     Object term136946;

    public BasicMonthOfYearDateTimeField_add_1905304068409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136898 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term136946 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term136709 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term137066 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term137066, term137066.getClass(), "iOrdinal", (byte) 15);
        setElement(term136709, 0, term137066);
        setField(term136946, term136946.getClass(), "iTypes", term136709);
        setField(term136946, term136946.getClass(), "iChronology", null);
        Object term137140 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term137140, term137140.getClass(), "iNameKey", "UTC");
        setIntField(term137140, term137140.getClass(), "iWallOffset", 0);
        setIntField(term137140, term137140.getClass(), "iStandardOffset", 0);
        setField(term137140, term137140.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term137140);
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
        args[0] = term136946;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term136898, args);
    }

};



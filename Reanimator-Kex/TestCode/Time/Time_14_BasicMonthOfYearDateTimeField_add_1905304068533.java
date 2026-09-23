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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226047;
     Object term226095;

    public BasicMonthOfYearDateTimeField_add_1905304068533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226047 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term226095 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term225888 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term226215 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term225888, 0, term226215);
        setField(term226095, term226095.getClass(), "iTypes", term225888);
        setField(term226095, term226095.getClass(), "iChronology", null);
        Object term226291 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term226291);
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
        args[0] = term226095;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term226047, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



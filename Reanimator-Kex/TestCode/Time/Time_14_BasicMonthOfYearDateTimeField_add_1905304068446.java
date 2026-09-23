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

public class BasicMonthOfYearDateTimeField_add_1905304068446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164612;
     Object term164670;

    public BasicMonthOfYearDateTimeField_add_1905304068446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164612 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term164670 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term164750 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        Object term164848 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        Object term164932 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term164848, term164848.getClass(), "iField", term164932);
        setField(term164750, term164750.getClass(), "iYear", term164848);
        setField(term164670, term164670.getClass(), "iChronology", term164750);
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
        args[0] = term164670;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term164612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



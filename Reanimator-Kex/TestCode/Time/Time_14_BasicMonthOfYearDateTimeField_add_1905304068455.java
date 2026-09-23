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

public class BasicMonthOfYearDateTimeField_add_1905304068455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167926;
     Object term167984;

    public BasicMonthOfYearDateTimeField_add_1905304068455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167926 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term167984 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term168064 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        Object term168162 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        Object term168260 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        Object term168366 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term168260, term168260.getClass(), "iField", term168366);
        setField(term168162, term168162.getClass(), "iField", term168260);
        setField(term168064, term168064.getClass(), "iYear", term168162);
        setField(term167984, term167984.getClass(), "iChronology", term168064);
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
        args[0] = term167984;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term167926, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



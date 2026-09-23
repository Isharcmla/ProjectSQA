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

public class BasicMonthOfYearDateTimeField_add_1905304068461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170483;
     Object term170541;

    public BasicMonthOfYearDateTimeField_add_1905304068461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170483 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term170541 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term170621 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        Object term170719 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        Object term170811 = newInstance(Class.forName("org.joda.time.chrono.BasicYearDateTimeField"));
        setField(term170719, term170719.getClass(), "iField", term170811);
        setField(term170621, term170621.getClass(), "iYear", term170719);
        setField(term170541, term170541.getClass(), "iChronology", term170621);
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
        args[0] = term170541;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term170483, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



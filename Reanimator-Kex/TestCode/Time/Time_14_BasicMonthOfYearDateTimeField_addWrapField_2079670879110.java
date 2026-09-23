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
import java.lang.NumberFormatException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_addWrapField_2079670879110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22165;

    public BasicMonthOfYearDateTimeField_addWrapField_2079670879110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22165 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term22245 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term22165, term22165.getClass(), "iChronology", term22245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0L;
        args[1] = 0;
        try {
            callMethod(klass, "addWrapField", argTypes, term22165, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};



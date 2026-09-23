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

public class BasicMonthOfYearDateTimeField_add_1791862157107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21154;

    public BasicMonthOfYearDateTimeField_add_1791862157107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21154 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term21240 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term21154, term21154.getClass(), "iChronology", term21240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = 0L;
        args[1] = 2147483648L;
        try {
            callMethod(klass, "add", argTypes, term21154, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};



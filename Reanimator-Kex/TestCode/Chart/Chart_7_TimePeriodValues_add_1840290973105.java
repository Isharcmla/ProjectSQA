package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimePeriodValues_add_1840290973105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19032;
     Object term19108;

    public TimePeriodValues_add_1840290973105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19032 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term19032, term19032.getClass(), "data", null);
        term19108 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValue"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriodValue");
        Object[] args = new Object[1];
        args[0] = term19108;
        try {
            callMethod(klass, "add", argTypes, term19032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



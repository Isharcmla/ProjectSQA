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

public class TimePeriodValues_updateBounds_1728641935142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29538;
     Object term29592;

    public TimePeriodValues_updateBounds_1728641935142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29538 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        term29592 = newInstance(Class.forName("org.jfree.data.time.Week"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term29592;
        args[1] = 0;
        try {
            callMethod(klass, "updateBounds", argTypes, term29538, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



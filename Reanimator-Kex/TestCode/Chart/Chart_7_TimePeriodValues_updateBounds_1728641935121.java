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

public class TimePeriodValues_updateBounds_1728641935121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23262;
     Object term23316;

    public TimePeriodValues_updateBounds_1728641935121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23262 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setIntField(term23262, term23262.getClass(), "minStartIndex", -1);
        term23316 = newInstance(Class.forName("org.jfree.data.time.Hour"));
        setLongField(term23316, term23316.getClass(), "firstMillisecond", 0L);
        setLongField(term23316, term23316.getClass(), "lastMillisecond", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term23316;
        args[1] = 0;
        try {
            callMethod(klass, "updateBounds", argTypes, term23262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



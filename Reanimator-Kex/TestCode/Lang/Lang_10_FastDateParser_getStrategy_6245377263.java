package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastDateParser_getStrategy_6245377263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9909;

    public FastDateParser_getStrategy_6245377263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9909 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term9909, term9909.getClass(), "pattern", null);
        setField(term9909, term9909.getClass(), "timeZone", null);
        setField(term9909, term9909.getClass(), "locale", null);
        setField(term9909, term9909.getClass(), "parsePattern", null);
        setField(term9909, term9909.getClass(), "strategies", null);
        setIntField(term9909, term9909.getClass(), "thisYear", 0);
        setField(term9909, term9909.getClass(), "nameValues", null);
        setField(term9909, term9909.getClass(), "currentFormatField", null);
        setField(term9909, term9909.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getStrategy", argTypes, term9909, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.lang.Object;

public class FastDateParser_getDisplayNames_2058612107115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26778;

    public FastDateParser_getDisplayNames_2058612107115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26778 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term26860 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term26898 = newInstance(Class.forName("java.util.Locale"));
        setField(term26778, term26778.getClass(), "nameValues", term26860);
        setField(term26778, term26778.getClass(), "locale", term26898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 7;
        try {
            callMethod(klass, "getDisplayNames", argTypes, term26778, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



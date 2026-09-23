package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Short;

public class DefaultKeyedValues_addValue_120496702888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16731;
     Object term16815;

    public DefaultKeyedValues_addValue_120496702888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16779 = new HashMap();
        term16731 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term16731, term16731.getClass(), "indexMap", term16779);
        term16815 = new Short((short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term16815;
        args[1] = null;
        try {
            callMethod(klass, "addValue", argTypes, term16731, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



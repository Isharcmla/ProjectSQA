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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultKeyedValues_equals_32826280341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;
     Object term329;
     Object term4088;
     Object term4094;

    public DefaultKeyedValues_equals_32826280341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term316 = new ArrayList();
        ArrayList term320 = new ArrayList();
        HashMap term324 = new HashMap();
        term315 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term315, term315.getClass(), "keys", term316);
        setField(term315, term315.getClass(), "values", term320);
        setField(term315, term315.getClass(), "indexMap", term324);
        term329 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term4089 = new ArrayList();
        ArrayList term4091 = new ArrayList();
        HashMap term4093 = new HashMap();
        term4088 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term4088, term4088.getClass(), "keys", term4089);
        setField(term4088, term4088.getClass(), "values", term4091);
        setField(term4088, term4088.getClass(), "indexMap", term4093);
        term4094 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term329;
        Object retValue = callMethod(klass, "equals", argTypes, term315, args);
        assertTrue(recursiveEquals(term315, term4088));
        assertTrue(recursiveEquals(term329, term4094));
        assertTrue(recursiveEquals(retValue, false));
    }

};



package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Object;

public class LenientDateTimeField_init_115318833714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1355;
     Object term1768;
     Object term1770;

    public LenientDateTimeField_init_115318833714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1269 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        term1355 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        term1768 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term1769 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term1768, term1768.getClass(), "iBase", null);
        setField(term1769, term1769.getClass(), "iBase", null);
        setField(term1769, term1769.getClass(), "iField", null);
        setField(term1769, term1769.getClass(), "iType", null);
        setField(term1768, term1768.getClass(), "iField", term1769);
        setField(term1768, term1768.getClass(), "iType", null);
        term1770 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term1770, term1770.getClass(), "iBase", null);
        setField(term1770, term1770.getClass(), "iField", null);
        setField(term1770, term1770.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term1355;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1768));
        assertTrue(recursiveEquals(term1355, term1770));
    }

};



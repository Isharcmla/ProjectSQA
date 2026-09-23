package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_142030084054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6854;
     Object term6942;
     Object term8350;
     Object term8354;
     Object term8355;

    public MultiKey_init_142030084054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6766 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term6642 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6766, term6766.getClass(), "keys", term6642);
        term6854 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        term6942 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        term8350 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term8351 = (Object[]) newArray("java.lang.Object", 3);
        Object term8352 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        Object term8353 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        setElement(term8351, 0, term8352);
        setElement(term8351, 1, term8353);
        setField(term8350, term8350.getClass(), "keys", term8351);
        term8354 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        term8355 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term6854;
        args[1] = term6942;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8350));
        assertTrue(recursiveEquals(term6854, term8354));
        assertTrue(recursiveEquals(term6942, term8355));
    }

};



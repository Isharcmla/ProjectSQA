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
import java.util.ArrayList;

public class MultiKey_init_142030084052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6547;
     Object term6585;
     Object term6637;
     Object term8015;
     Object term8021;
     Object term8022;
     Object term8023;

    public MultiKey_init_142030084052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6445 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term6303 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6445, term6445.getClass(), "keys", term6303);
        term6547 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        term6585 = newInstance(Class.forName("java.lang.Object"));
        term6637 = new ArrayList();
        ArrayList term8019 = new ArrayList();
        term8015 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term8016 = (Object[]) newArray("java.lang.Object", 3);
        Object term8017 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object term8018 = newInstance(Class.forName("java.lang.Object"));
        setField(term8017, term8017.getClass(), "keys", null);
        setElement(term8016, 0, term8017);
        setElement(term8016, 1, term8018);
        setElement(term8016, 2, term8019);
        setField(term8015, term8015.getClass(), "keys", term8016);
        term8021 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term8021, term8021.getClass(), "keys", null);
        term8022 = newInstance(Class.forName("java.lang.Object"));
        term8023 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term6547;
        args[1] = term6585;
        args[2] = term6637;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8015));
        assertTrue(recursiveEquals(term6547, term8021));
        assertTrue(recursiveEquals(term6585, term8022));
        assertTrue(recursiveEquals(term6637, term8023));
    }

};



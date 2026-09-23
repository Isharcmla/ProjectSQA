package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;

public class CaseInsensitiveMap_convertKey_1052215896147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27340;
     Object term27414;
     Object term27466;
     Object term27467;

    public CaseInsensitiveMap_convertKey_1052215896147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27340 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term27414 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$1"));
        term27466 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term27466, term27466.getClass(), "loadFactor", 0.0F);
        setIntField(term27466, term27466.getClass(), "size", 0);
        setField(term27466, term27466.getClass(), "data", null);
        setIntField(term27466, term27466.getClass(), "threshold", 0);
        setIntField(term27466, term27466.getClass(), "modCount", 0);
        setField(term27466, term27466.getClass(), "entrySet", null);
        setField(term27466, term27466.getClass(), "keySet", null);
        setField(term27466, term27466.getClass(), "values", null);
        setField(term27466, term27466.getClass(), "keySet", null);
        setField(term27466, term27466.getClass(), "values", null);
        term27467 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$1"));
        setField(term27467, term27467.getClass(), "val$name", null);
        setField(term27467, term27467.getClass(), "val$classFile", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27414;
        Object retValue = callMethod(klass, "convertKey", argTypes, term27340, args);
        assertTrue(recursiveEquals(term27340, term27466));
        assertTrue(recursiveEquals(term27414, term27467));
        assertTrue(recursiveEquals(retValue, "java.lang.reflect.proxygenerator$1@9a195b3"));
    }

};



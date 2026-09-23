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

public class CaseInsensitiveMap_convertKey_1052215896115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20217;
     Object term20291;
     Object term20344;
     Object term20345;

    public CaseInsensitiveMap_convertKey_1052215896115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20217 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term20291 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$1"));
        term20344 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term20344, term20344.getClass(), "loadFactor", 0.0F);
        setIntField(term20344, term20344.getClass(), "size", 0);
        setField(term20344, term20344.getClass(), "data", null);
        setIntField(term20344, term20344.getClass(), "threshold", 0);
        setIntField(term20344, term20344.getClass(), "modCount", 0);
        setField(term20344, term20344.getClass(), "entrySet", null);
        setField(term20344, term20344.getClass(), "keySet", null);
        setField(term20344, term20344.getClass(), "values", null);
        setField(term20344, term20344.getClass(), "keySet", null);
        setField(term20344, term20344.getClass(), "values", null);
        term20345 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$1"));
        setField(term20345, term20345.getClass(), "val$name", null);
        setField(term20345, term20345.getClass(), "val$classFile", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20291;
        Object retValue = callMethod(klass, "convertKey", argTypes, term20217, args);
        assertTrue(recursiveEquals(term20217, term20344));
        assertTrue(recursiveEquals(term20291, term20345));
        assertTrue(recursiveEquals(retValue, "java.lang.reflect.proxygenerator$1@31774850"));
    }

};



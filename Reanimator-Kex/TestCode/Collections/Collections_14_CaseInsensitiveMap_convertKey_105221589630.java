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

public class CaseInsensitiveMap_convertKey_105221589630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7361;
     Object term7473;
     Object term7708;
     Object term7709;

    public CaseInsensitiveMap_convertKey_105221589630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7361 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term7473 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term7708 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term7708, term7708.getClass(), "loadFactor", 0.0F);
        setIntField(term7708, term7708.getClass(), "size", 0);
        setField(term7708, term7708.getClass(), "data", null);
        setIntField(term7708, term7708.getClass(), "threshold", 0);
        setIntField(term7708, term7708.getClass(), "modCount", 0);
        setField(term7708, term7708.getClass(), "entrySet", null);
        setField(term7708, term7708.getClass(), "keySet", null);
        setField(term7708, term7708.getClass(), "values", null);
        setField(term7708, term7708.getClass(), "keySet", null);
        setField(term7708, term7708.getClass(), "values", null);
        term7709 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term7709, term7709.getClass(), "loadFactor", 0.0F);
        setIntField(term7709, term7709.getClass(), "size", 0);
        setField(term7709, term7709.getClass(), "data", null);
        setIntField(term7709, term7709.getClass(), "threshold", 0);
        setIntField(term7709, term7709.getClass(), "modCount", 0);
        setField(term7709, term7709.getClass(), "entrySet", null);
        setField(term7709, term7709.getClass(), "keySet", null);
        setField(term7709, term7709.getClass(), "values", null);
        setField(term7709, term7709.getClass(), "keySet", null);
        setField(term7709, term7709.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7473;
        Object retValue = callMethod(klass, "convertKey", argTypes, term7361, args);
        assertTrue(recursiveEquals(term7361, term7708));
        assertTrue(recursiveEquals(term7473, term7709));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};



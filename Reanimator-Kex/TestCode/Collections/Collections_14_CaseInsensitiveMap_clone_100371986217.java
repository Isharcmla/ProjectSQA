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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CaseInsensitiveMap_clone_100371986217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5061;

    public CaseInsensitiveMap_clone_100371986217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5061 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term5061, term5061.getClass(), "loadFactor", 0.0F);
        setIntField(term5061, term5061.getClass(), "size", 0);
        setField(term5061, term5061.getClass(), "data", null);
        setIntField(term5061, term5061.getClass(), "threshold", 0);
        setIntField(term5061, term5061.getClass(), "modCount", 0);
        setField(term5061, term5061.getClass(), "entrySet", null);
        setField(term5061, term5061.getClass(), "keySet", null);
        setField(term5061, term5061.getClass(), "values", null);
        setField(term5061, term5061.getClass(), "keySet", null);
        setField(term5061, term5061.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clone", argTypes, term5061, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



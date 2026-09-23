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

public class CaseInsensitiveMap_writeObject_103610881418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5066;

    public CaseInsensitiveMap_writeObject_103610881418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5066 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term5066, term5066.getClass(), "loadFactor", 0.0F);
        setIntField(term5066, term5066.getClass(), "size", 0);
        setField(term5066, term5066.getClass(), "data", null);
        setIntField(term5066, term5066.getClass(), "threshold", 0);
        setIntField(term5066, term5066.getClass(), "modCount", 0);
        setField(term5066, term5066.getClass(), "entrySet", null);
        setField(term5066, term5066.getClass(), "keySet", null);
        setField(term5066, term5066.getClass(), "values", null);
        setField(term5066, term5066.getClass(), "keySet", null);
        setField(term5066, term5066.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeObject", argTypes, term5066, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



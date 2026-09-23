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

public class CaseInsensitiveMap_readObject_176169751419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5071;

    public CaseInsensitiveMap_readObject_176169751419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5071 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term5071, term5071.getClass(), "loadFactor", 0.0F);
        setIntField(term5071, term5071.getClass(), "size", 0);
        setField(term5071, term5071.getClass(), "data", null);
        setIntField(term5071, term5071.getClass(), "threshold", 0);
        setIntField(term5071, term5071.getClass(), "modCount", 0);
        setField(term5071, term5071.getClass(), "entrySet", null);
        setField(term5071, term5071.getClass(), "keySet", null);
        setField(term5071, term5071.getClass(), "values", null);
        setField(term5071, term5071.getClass(), "keySet", null);
        setField(term5071, term5071.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectInputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readObject", argTypes, term5071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



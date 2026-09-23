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

public class CaseInsensitiveMap_convertKey_105221589616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5056;
     Object term5083;
     Object term5077;

    public CaseInsensitiveMap_convertKey_105221589616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5056 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term5056, term5056.getClass(), "loadFactor", 0.0F);
        setIntField(term5056, term5056.getClass(), "size", 0);
        setField(term5056, term5056.getClass(), "data", null);
        setIntField(term5056, term5056.getClass(), "threshold", 0);
        setIntField(term5056, term5056.getClass(), "modCount", 0);
        setField(term5056, term5056.getClass(), "entrySet", null);
        setField(term5056, term5056.getClass(), "keySet", null);
        setField(term5056, term5056.getClass(), "values", null);
        setField(term5056, term5056.getClass(), "keySet", null);
        setField(term5056, term5056.getClass(), "values", null);
        term5083 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term5083, term5083.getClass(), "loadFactor", 0.0F);
        setIntField(term5083, term5083.getClass(), "size", 0);
        setField(term5083, term5083.getClass(), "data", null);
        setIntField(term5083, term5083.getClass(), "threshold", 0);
        setIntField(term5083, term5083.getClass(), "modCount", 0);
        setField(term5083, term5083.getClass(), "entrySet", null);
        setField(term5083, term5083.getClass(), "keySet", null);
        setField(term5083, term5083.getClass(), "values", null);
        setField(term5083, term5083.getClass(), "keySet", null);
        setField(term5083, term5083.getClass(), "values", null);
        term5077 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "convertKey", argTypes, term5056, args);
        assertTrue(recursiveEquals(term5056, term5083));
        assertTrue(recursiveEquals(retValue, term5077));
    }

};



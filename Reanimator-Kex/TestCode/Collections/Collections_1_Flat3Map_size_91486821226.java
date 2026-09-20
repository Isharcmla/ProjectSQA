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
import java.lang.Object;

public class Flat3Map_size_91486821226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term6392;

    public Flat3Map_size_91486821226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        Object term49 = newInstance(Class.forName("java.lang.Object"));
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        Object term52 = newInstance(Class.forName("java.lang.Object"));
        Object term53 = newInstance(Class.forName("java.lang.Object"));
        Object term54 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term43, term43.getClass(), "size", -1465035361);
        setIntField(term43, term43.getClass(), "hash1", 1090617576);
        setIntField(term43, term43.getClass(), "hash2", -1547384488);
        setIntField(term43, term43.getClass(), "hash3", 1442160736);
        setField(term43, term43.getClass(), "key1", term48);
        setField(term43, term43.getClass(), "key2", term49);
        setField(term43, term43.getClass(), "key3", term50);
        setField(term43, term43.getClass(), "value1", term51);
        setField(term43, term43.getClass(), "value2", term52);
        setField(term43, term43.getClass(), "value3", term53);
        setFloatField(term54, term54.getClass(), "loadFactor", 0.0F);
        setIntField(term54, term54.getClass(), "size", 0);
        setField(term54, term54.getClass(), "data", null);
        setIntField(term54, term54.getClass(), "threshold", 0);
        setIntField(term54, term54.getClass(), "modCount", 0);
        setField(term54, term54.getClass(), "entrySet", null);
        setField(term54, term54.getClass(), "keySet", null);
        setField(term54, term54.getClass(), "values", null);
        setField(term54, term54.getClass(), "keySet", null);
        setField(term54, term54.getClass(), "values", null);
        setField(term43, term43.getClass(), "delegateMap", term54);
        term6392 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6393 = newInstance(Class.forName("java.lang.Object"));
        Object term6394 = newInstance(Class.forName("java.lang.Object"));
        Object term6395 = newInstance(Class.forName("java.lang.Object"));
        Object term6396 = newInstance(Class.forName("java.lang.Object"));
        Object term6397 = newInstance(Class.forName("java.lang.Object"));
        Object term6398 = newInstance(Class.forName("java.lang.Object"));
        Object term6399 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6392, term6392.getClass(), "size", -1465035361);
        setIntField(term6392, term6392.getClass(), "hash1", 1090617576);
        setIntField(term6392, term6392.getClass(), "hash2", -1547384488);
        setIntField(term6392, term6392.getClass(), "hash3", 1442160736);
        setField(term6392, term6392.getClass(), "key1", term6393);
        setField(term6392, term6392.getClass(), "key2", term6394);
        setField(term6392, term6392.getClass(), "key3", term6395);
        setField(term6392, term6392.getClass(), "value1", term6396);
        setField(term6392, term6392.getClass(), "value2", term6397);
        setField(term6392, term6392.getClass(), "value3", term6398);
        setFloatField(term6399, term6399.getClass(), "loadFactor", 0.0F);
        setIntField(term6399, term6399.getClass(), "size", 0);
        setField(term6399, term6399.getClass(), "data", null);
        setIntField(term6399, term6399.getClass(), "threshold", 0);
        setIntField(term6399, term6399.getClass(), "modCount", 0);
        setField(term6399, term6399.getClass(), "entrySet", null);
        setField(term6399, term6399.getClass(), "keySet", null);
        setField(term6399, term6399.getClass(), "values", null);
        setField(term6399, term6399.getClass(), "keySet", null);
        setField(term6399, term6399.getClass(), "values", null);
        setField(term6392, term6392.getClass(), "delegateMap", term6399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term43, args);
        assertTrue(recursiveEquals(term43, term6392));
        assertTrue(recursiveEquals(retValue, 0));
    }

};

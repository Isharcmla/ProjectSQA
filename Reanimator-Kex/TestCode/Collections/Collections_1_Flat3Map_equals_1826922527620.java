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
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_equals_1826922527620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119290;
     Object term119632;
     Object term120657;
     Object term120662;

    public Flat3Map_equals_1826922527620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term119656 = new HashMap();
        term119290 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term119430 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term119540 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term119290, term119290.getClass(), "delegateMap", null);
        setIntField(term119290, term119290.getClass(), "size", 2);
        setField(term119290, term119290.getClass(), "key2", term119656);
        setField(term119430, term119430.getClass(), "delegateMap", term119540);
        setField(term119290, term119290.getClass(), "value2", term119430);
        term119632 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term119766 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term119632, term119632.getClass(), "delegateMap", null);
        setIntField(term119632, term119632.getClass(), "size", 2);
        setIntField(term119632, term119632.getClass(), "hash2", 0);
        setField(term119632, term119632.getClass(), "key2", term119656);
        setField(term119632, term119632.getClass(), "value2", term119766);
        HashMap term120658 = new HashMap();
        term120657 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120660 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120661 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term120657, term120657.getClass(), "size", 2);
        setIntField(term120657, term120657.getClass(), "hash1", 0);
        setIntField(term120657, term120657.getClass(), "hash2", 0);
        setIntField(term120657, term120657.getClass(), "hash3", 0);
        setField(term120657, term120657.getClass(), "key1", null);
        setField(term120657, term120657.getClass(), "key2", term120658);
        setField(term120657, term120657.getClass(), "key3", null);
        setField(term120657, term120657.getClass(), "value1", null);
        setIntField(term120660, term120660.getClass(), "size", 0);
        setIntField(term120660, term120660.getClass(), "hash1", 0);
        setIntField(term120660, term120660.getClass(), "hash2", 0);
        setIntField(term120660, term120660.getClass(), "hash3", 0);
        setField(term120660, term120660.getClass(), "key1", null);
        setField(term120660, term120660.getClass(), "key2", null);
        setField(term120660, term120660.getClass(), "key3", null);
        setField(term120660, term120660.getClass(), "value1", null);
        setField(term120660, term120660.getClass(), "value2", null);
        setField(term120660, term120660.getClass(), "value3", null);
        setFloatField(term120661, term120661.getClass(), "loadFactor", 0.0F);
        setIntField(term120661, term120661.getClass(), "size", 0);
        setField(term120661, term120661.getClass(), "data", null);
        setIntField(term120661, term120661.getClass(), "threshold", 0);
        setIntField(term120661, term120661.getClass(), "modCount", 0);
        setField(term120661, term120661.getClass(), "entrySet", null);
        setField(term120661, term120661.getClass(), "keySet", null);
        setField(term120661, term120661.getClass(), "values", null);
        setField(term120661, term120661.getClass(), "keySet", null);
        setField(term120661, term120661.getClass(), "values", null);
        setField(term120660, term120660.getClass(), "delegateMap", term120661);
        setField(term120657, term120657.getClass(), "value2", term120660);
        setField(term120657, term120657.getClass(), "value3", null);
        setField(term120657, term120657.getClass(), "delegateMap", null);
        HashMap term120663 = new HashMap();
        term120662 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120665 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term120662, term120662.getClass(), "size", 2);
        setIntField(term120662, term120662.getClass(), "hash1", 0);
        setIntField(term120662, term120662.getClass(), "hash2", 0);
        setIntField(term120662, term120662.getClass(), "hash3", 0);
        setField(term120662, term120662.getClass(), "key1", null);
        setField(term120662, term120662.getClass(), "key2", term120663);
        setField(term120662, term120662.getClass(), "key3", null);
        setField(term120662, term120662.getClass(), "value1", null);
        setFloatField(term120665, term120665.getClass(), "loadFactor", 0.0F);
        setIntField(term120665, term120665.getClass(), "size", 0);
        setField(term120665, term120665.getClass(), "data", null);
        setIntField(term120665, term120665.getClass(), "threshold", 0);
        setIntField(term120665, term120665.getClass(), "modCount", 0);
        setField(term120665, term120665.getClass(), "entrySet", null);
        setField(term120665, term120665.getClass(), "keySet", null);
        setField(term120665, term120665.getClass(), "values", null);
        setField(term120665, term120665.getClass(), "keySet", null);
        setField(term120665, term120665.getClass(), "values", null);
        setField(term120662, term120662.getClass(), "value2", term120665);
        setField(term120662, term120662.getClass(), "value3", null);
        setField(term120662, term120662.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term119632;
        Object retValue = callMethod(klass, "equals", argTypes, term119290, args);
        assertTrue(recursiveEquals(term119290, term120657));
        assertTrue(recursiveEquals(term119632, term120662));
        assertTrue(recursiveEquals(retValue, true));
    }

};

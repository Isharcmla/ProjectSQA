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

public class Flat3Map_put_1944740725845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219266;
     Object term219610;
     Object term219770;
     Object term219776;

    public Flat3Map_put_1944740725845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219266 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219396 = newInstance(Class.forName("java.lang.Object"));
        Object term219434 = newInstance(Class.forName("java.lang.Object"));
        Object term219472 = newInstance(Class.forName("java.lang.Object"));
        term219610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term219266, term219266.getClass(), "delegateMap", null);
        setIntField(term219266, term219266.getClass(), "size", 3);
        setIntField(term219266, term219266.getClass(), "hash3", 0);
        setField(term219358, term219358.getClass(), "delegateMap", null);
        setIntField(term219358, term219358.getClass(), "size", 3);
        setField(term219358, term219358.getClass(), "key3", term219396);
        setField(term219358, term219358.getClass(), "key2", null);
        setField(term219358, term219358.getClass(), "value2", term219434);
        setField(term219266, term219266.getClass(), "key3", term219358);
        setIntField(term219266, term219266.getClass(), "hash2", 0);
        setField(term219266, term219266.getClass(), "key2", term219472);
        setIntField(term219266, term219266.getClass(), "hash1", 0);
        setField(term219610, term219610.getClass(), "delegateMap", null);
        setIntField(term219610, term219610.getClass(), "size", 3);
        setIntField(term219610, term219610.getClass(), "hash3", 0);
        setField(term219610, term219610.getClass(), "value3", null);
        setIntField(term219610, term219610.getClass(), "hash2", 0);
        setField(term219610, term219610.getClass(), "value2", null);
        setIntField(term219610, term219610.getClass(), "hash1", 0);
        setField(term219610, term219610.getClass(), "value1", null);
        setField(term219610, term219610.getClass(), "key3", null);
        setField(term219266, term219266.getClass(), "key1", term219610);
        term219770 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219771 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219772 = newInstance(Class.forName("java.lang.Object"));
        Object term219773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219774 = newInstance(Class.forName("java.lang.Object"));
        Object term219775 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term219770, term219770.getClass(), "size", 3);
        setIntField(term219770, term219770.getClass(), "hash1", 0);
        setIntField(term219770, term219770.getClass(), "hash2", 0);
        setIntField(term219770, term219770.getClass(), "hash3", 0);
        setIntField(term219771, term219771.getClass(), "size", 3);
        setIntField(term219771, term219771.getClass(), "hash1", 0);
        setIntField(term219771, term219771.getClass(), "hash2", 0);
        setIntField(term219771, term219771.getClass(), "hash3", 0);
        setField(term219771, term219771.getClass(), "key1", null);
        setField(term219771, term219771.getClass(), "key2", null);
        setField(term219771, term219771.getClass(), "key3", null);
        setField(term219771, term219771.getClass(), "value1", null);
        setField(term219771, term219771.getClass(), "value2", null);
        setField(term219771, term219771.getClass(), "value3", null);
        setField(term219771, term219771.getClass(), "delegateMap", null);
        setField(term219770, term219770.getClass(), "key1", term219771);
        setField(term219770, term219770.getClass(), "key2", term219772);
        setIntField(term219773, term219773.getClass(), "size", 3);
        setIntField(term219773, term219773.getClass(), "hash1", 0);
        setIntField(term219773, term219773.getClass(), "hash2", 0);
        setIntField(term219773, term219773.getClass(), "hash3", 0);
        setField(term219773, term219773.getClass(), "key1", null);
        setField(term219773, term219773.getClass(), "key2", null);
        setField(term219773, term219773.getClass(), "key3", term219774);
        setField(term219773, term219773.getClass(), "value1", null);
        setField(term219773, term219773.getClass(), "value2", term219775);
        setField(term219773, term219773.getClass(), "value3", null);
        setField(term219773, term219773.getClass(), "delegateMap", null);
        setField(term219770, term219770.getClass(), "key3", term219773);
        setField(term219770, term219770.getClass(), "value1", null);
        setField(term219770, term219770.getClass(), "value2", null);
        setField(term219770, term219770.getClass(), "value3", null);
        setField(term219770, term219770.getClass(), "delegateMap", null);
        term219776 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term219776, term219776.getClass(), "size", 3);
        setIntField(term219776, term219776.getClass(), "hash1", 0);
        setIntField(term219776, term219776.getClass(), "hash2", 0);
        setIntField(term219776, term219776.getClass(), "hash3", 0);
        setField(term219776, term219776.getClass(), "key1", null);
        setField(term219776, term219776.getClass(), "key2", null);
        setField(term219776, term219776.getClass(), "key3", null);
        setField(term219776, term219776.getClass(), "value1", null);
        setField(term219776, term219776.getClass(), "value2", null);
        setField(term219776, term219776.getClass(), "value3", null);
        setField(term219776, term219776.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term219610;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term219266, args);
        assertTrue(recursiveEquals(term219266, term219770));
        assertTrue(recursiveEquals(term219610, term219776));
        assertTrue(recursiveEquals(retValue, null));
    }

};



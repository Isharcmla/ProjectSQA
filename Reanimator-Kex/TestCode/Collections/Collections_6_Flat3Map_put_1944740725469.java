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

public class Flat3Map_put_1944740725469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85987;
     Object term86209;
     Object term86264;
     Object term86268;

    public Flat3Map_put_1944740725469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85987 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86025 = newInstance(Class.forName("java.lang.Object"));
        Object term86117 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term85987, term85987.getClass(), "delegateMap", null);
        setIntField(term85987, term85987.getClass(), "size", 2);
        setIntField(term85987, term85987.getClass(), "hash2", 0);
        setField(term85987, term85987.getClass(), "key2", term86025);
        setIntField(term85987, term85987.getClass(), "hash1", 0);
        setField(term85987, term85987.getClass(), "key1", term86117);
        term86209 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term86209, term86209.getClass(), "delegateMap", null);
        setIntField(term86209, term86209.getClass(), "size", 2);
        setIntField(term86209, term86209.getClass(), "hash2", 0);
        setField(term86209, term86209.getClass(), "value2", null);
        setIntField(term86209, term86209.getClass(), "hash1", 0);
        setField(term86209, term86209.getClass(), "value1", null);
        term86264 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86265 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86266 = newInstance(Class.forName("java.lang.Object"));
        Object term86267 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term86264, term86264.getClass(), "size", 3);
        setIntField(term86264, term86264.getClass(), "hash1", 0);
        setIntField(term86264, term86264.getClass(), "hash2", 0);
        setIntField(term86264, term86264.getClass(), "hash3", 0);
        setIntField(term86265, term86265.getClass(), "size", 0);
        setIntField(term86265, term86265.getClass(), "hash1", 0);
        setIntField(term86265, term86265.getClass(), "hash2", 0);
        setIntField(term86265, term86265.getClass(), "hash3", 0);
        setField(term86265, term86265.getClass(), "key1", null);
        setField(term86265, term86265.getClass(), "key2", null);
        setField(term86265, term86265.getClass(), "key3", null);
        setField(term86265, term86265.getClass(), "value1", null);
        setField(term86265, term86265.getClass(), "value2", null);
        setField(term86265, term86265.getClass(), "value3", null);
        setField(term86265, term86265.getClass(), "delegateMap", null);
        setField(term86264, term86264.getClass(), "key1", term86265);
        setField(term86264, term86264.getClass(), "key2", term86266);
        setIntField(term86267, term86267.getClass(), "size", 2);
        setIntField(term86267, term86267.getClass(), "hash1", 0);
        setIntField(term86267, term86267.getClass(), "hash2", 0);
        setIntField(term86267, term86267.getClass(), "hash3", 0);
        setField(term86267, term86267.getClass(), "key1", null);
        setField(term86267, term86267.getClass(), "key2", null);
        setField(term86267, term86267.getClass(), "key3", null);
        setField(term86267, term86267.getClass(), "value1", null);
        setField(term86267, term86267.getClass(), "value2", null);
        setField(term86267, term86267.getClass(), "value3", null);
        setField(term86267, term86267.getClass(), "delegateMap", null);
        setField(term86264, term86264.getClass(), "key3", term86267);
        setField(term86264, term86264.getClass(), "value1", null);
        setField(term86264, term86264.getClass(), "value2", null);
        setField(term86264, term86264.getClass(), "value3", null);
        setField(term86264, term86264.getClass(), "delegateMap", null);
        term86268 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term86268, term86268.getClass(), "size", 2);
        setIntField(term86268, term86268.getClass(), "hash1", 0);
        setIntField(term86268, term86268.getClass(), "hash2", 0);
        setIntField(term86268, term86268.getClass(), "hash3", 0);
        setField(term86268, term86268.getClass(), "key1", null);
        setField(term86268, term86268.getClass(), "key2", null);
        setField(term86268, term86268.getClass(), "key3", null);
        setField(term86268, term86268.getClass(), "value1", null);
        setField(term86268, term86268.getClass(), "value2", null);
        setField(term86268, term86268.getClass(), "value3", null);
        setField(term86268, term86268.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term86209;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term85987, args);
        assertTrue(recursiveEquals(term85987, term86264));
        assertTrue(recursiveEquals(term86209, term86268));
        assertTrue(recursiveEquals(retValue, null));
    }

};



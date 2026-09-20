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

public class Flat3Map_containsValue_2053071372318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56867;
     Object term57057;
     Object term57668;
     Object term57670;

    public Flat3Map_containsValue_2053071372318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56965 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term56867, term56867.getClass(), "delegateMap", null);
        setIntField(term56867, term56867.getClass(), "size", 3);
        setField(term56867, term56867.getClass(), "value3", term56965);
        term57057 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57155 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term57057, term57057.getClass(), "delegateMap", term57155);
        term57668 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57669 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setIntField(term57668, term57668.getClass(), "size", 3);
        setIntField(term57668, term57668.getClass(), "hash1", 0);
        setIntField(term57668, term57668.getClass(), "hash2", 0);
        setIntField(term57668, term57668.getClass(), "hash3", 0);
        setField(term57668, term57668.getClass(), "key1", null);
        setField(term57668, term57668.getClass(), "key2", null);
        setField(term57668, term57668.getClass(), "key3", null);
        setField(term57668, term57668.getClass(), "value1", null);
        setField(term57668, term57668.getClass(), "value2", null);
        setFloatField(term57669, term57669.getClass(), "loadFactor", 0.0F);
        setIntField(term57669, term57669.getClass(), "size", 0);
        setField(term57669, term57669.getClass(), "data", null);
        setIntField(term57669, term57669.getClass(), "threshold", 0);
        setIntField(term57669, term57669.getClass(), "modCount", 0);
        setField(term57669, term57669.getClass(), "entrySet", null);
        setField(term57669, term57669.getClass(), "keySet", null);
        setField(term57669, term57669.getClass(), "values", null);
        setField(term57669, term57669.getClass(), "keySet", null);
        setField(term57669, term57669.getClass(), "values", null);
        setField(term57668, term57668.getClass(), "value3", term57669);
        setField(term57668, term57668.getClass(), "delegateMap", null);
        term57670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57671 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setIntField(term57670, term57670.getClass(), "size", 0);
        setIntField(term57670, term57670.getClass(), "hash1", 0);
        setIntField(term57670, term57670.getClass(), "hash2", 0);
        setIntField(term57670, term57670.getClass(), "hash3", 0);
        setField(term57670, term57670.getClass(), "key1", null);
        setField(term57670, term57670.getClass(), "key2", null);
        setField(term57670, term57670.getClass(), "key3", null);
        setField(term57670, term57670.getClass(), "value1", null);
        setField(term57670, term57670.getClass(), "value2", null);
        setField(term57670, term57670.getClass(), "value3", null);
        setFloatField(term57671, term57671.getClass(), "loadFactor", 0.0F);
        setIntField(term57671, term57671.getClass(), "size", 0);
        setField(term57671, term57671.getClass(), "data", null);
        setIntField(term57671, term57671.getClass(), "threshold", 0);
        setIntField(term57671, term57671.getClass(), "modCount", 0);
        setField(term57671, term57671.getClass(), "entrySet", null);
        setField(term57671, term57671.getClass(), "keySet", null);
        setField(term57671, term57671.getClass(), "values", null);
        setField(term57671, term57671.getClass(), "keySet", null);
        setField(term57671, term57671.getClass(), "values", null);
        setField(term57670, term57670.getClass(), "delegateMap", term57671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57057;
        callMethod(klass, "containsValue", argTypes, term56867, args);
        assertTrue(recursiveEquals(term56867, term57668));
        assertTrue(recursiveEquals(term57057, term57670));
    }

};

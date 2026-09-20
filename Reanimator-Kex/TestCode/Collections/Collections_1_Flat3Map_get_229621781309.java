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

public class Flat3Map_get_229621781309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55619;
     Object term55712;
     Object term55714;

    public Flat3Map_get_229621781309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55619 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55674 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term55619, term55619.getClass(), "delegateMap", null);
        setIntField(term55619, term55619.getClass(), "size", 2);
        setIntField(term55619, term55619.getClass(), "hash2", -1);
        setIntField(term55674, term55674.getClass(), "size", 0);
        setField(term55619, term55619.getClass(), "value2", term55674);
        setIntField(term55619, term55619.getClass(), "hash1", 0);
        setField(term55619, term55619.getClass(), "value1", null);
        term55712 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55713 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term55712, term55712.getClass(), "size", 2);
        setIntField(term55712, term55712.getClass(), "hash1", 0);
        setIntField(term55712, term55712.getClass(), "hash2", -1);
        setIntField(term55712, term55712.getClass(), "hash3", 0);
        setField(term55712, term55712.getClass(), "key1", null);
        setField(term55712, term55712.getClass(), "key2", null);
        setField(term55712, term55712.getClass(), "key3", null);
        setField(term55712, term55712.getClass(), "value1", null);
        setFloatField(term55713, term55713.getClass(), "loadFactor", 0.0F);
        setIntField(term55713, term55713.getClass(), "size", 0);
        setField(term55713, term55713.getClass(), "data", null);
        setIntField(term55713, term55713.getClass(), "threshold", 0);
        setIntField(term55713, term55713.getClass(), "modCount", 0);
        setField(term55713, term55713.getClass(), "entrySet", null);
        setField(term55713, term55713.getClass(), "keySet", null);
        setField(term55713, term55713.getClass(), "values", null);
        setField(term55713, term55713.getClass(), "keySet", null);
        setField(term55713, term55713.getClass(), "values", null);
        setField(term55712, term55712.getClass(), "value2", term55713);
        setField(term55712, term55712.getClass(), "value3", null);
        setField(term55712, term55712.getClass(), "delegateMap", null);
        term55714 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55715 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term55714, term55714.getClass(), "size", 2);
        setIntField(term55714, term55714.getClass(), "hash1", 0);
        setIntField(term55714, term55714.getClass(), "hash2", -1);
        setIntField(term55714, term55714.getClass(), "hash3", 0);
        setField(term55714, term55714.getClass(), "key1", null);
        setField(term55714, term55714.getClass(), "key2", null);
        setField(term55714, term55714.getClass(), "key3", null);
        setField(term55714, term55714.getClass(), "value1", null);
        setFloatField(term55715, term55715.getClass(), "loadFactor", 0.0F);
        setIntField(term55715, term55715.getClass(), "size", 0);
        setField(term55715, term55715.getClass(), "data", null);
        setIntField(term55715, term55715.getClass(), "threshold", 0);
        setIntField(term55715, term55715.getClass(), "modCount", 0);
        setField(term55715, term55715.getClass(), "entrySet", null);
        setField(term55715, term55715.getClass(), "keySet", null);
        setField(term55715, term55715.getClass(), "values", null);
        setField(term55715, term55715.getClass(), "keySet", null);
        setField(term55715, term55715.getClass(), "values", null);
        setField(term55714, term55714.getClass(), "value2", term55715);
        setField(term55714, term55714.getClass(), "value3", null);
        setField(term55714, term55714.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55619;
        Object retValue = callMethod(klass, "get", argTypes, term55619, args);
        assertTrue(recursiveEquals(term55619, term55712));
        assertTrue(recursiveEquals(term55619, term55714));
        assertTrue(recursiveEquals(retValue, null));
    }

};

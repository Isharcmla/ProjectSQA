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

public class Flat3Map_get_229621781682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133944;
     Object term134128;
     Object term134773;
     Object term134775;

    public Flat3Map_get_229621781682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133944 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134036 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term133944, term133944.getClass(), "delegateMap", null);
        setIntField(term133944, term133944.getClass(), "size", 2);
        setIntField(term133944, term133944.getClass(), "hash2", 0);
        setField(term133944, term133944.getClass(), "key2", null);
        setIntField(term133944, term133944.getClass(), "hash1", 0);
        setField(term134036, term134036.getClass(), "delegateMap", null);
        setIntField(term134036, term134036.getClass(), "size", 2);
        setField(term133944, term133944.getClass(), "key1", term134036);
        term134128 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134238 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term134348 = newInstance(Class.forName("java.lang.invoke.VarHandleLongs$FieldStaticReadWrite"));
        setField(term134128, term134128.getClass(), "delegateMap", null);
        setIntField(term134128, term134128.getClass(), "size", 2);
        setIntField(term134128, term134128.getClass(), "hash2", 0);
        setIntField(term134238, term134238.getClass(), "size", 0);
        setField(term134128, term134128.getClass(), "value2", term134238);
        setIntField(term134128, term134128.getClass(), "hash1", 0);
        setField(term134128, term134128.getClass(), "value1", null);
        setField(term134128, term134128.getClass(), "key2", term134348);
        term134773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134774 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term134773, term134773.getClass(), "size", 2);
        setIntField(term134773, term134773.getClass(), "hash1", 0);
        setIntField(term134773, term134773.getClass(), "hash2", 0);
        setIntField(term134773, term134773.getClass(), "hash3", 0);
        setIntField(term134774, term134774.getClass(), "size", 2);
        setIntField(term134774, term134774.getClass(), "hash1", 0);
        setIntField(term134774, term134774.getClass(), "hash2", 0);
        setIntField(term134774, term134774.getClass(), "hash3", 0);
        setField(term134774, term134774.getClass(), "key1", null);
        setField(term134774, term134774.getClass(), "key2", null);
        setField(term134774, term134774.getClass(), "key3", null);
        setField(term134774, term134774.getClass(), "value1", null);
        setField(term134774, term134774.getClass(), "value2", null);
        setField(term134774, term134774.getClass(), "value3", null);
        setField(term134774, term134774.getClass(), "delegateMap", null);
        setField(term134773, term134773.getClass(), "key1", term134774);
        setField(term134773, term134773.getClass(), "key2", null);
        setField(term134773, term134773.getClass(), "key3", null);
        setField(term134773, term134773.getClass(), "value1", null);
        setField(term134773, term134773.getClass(), "value2", null);
        setField(term134773, term134773.getClass(), "value3", null);
        setField(term134773, term134773.getClass(), "delegateMap", null);
        term134775 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134776 = newInstance(Class.forName("java.lang.invoke.VarHandleLongs$FieldStaticReadWrite"));
        Object term134777 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term134775, term134775.getClass(), "size", 2);
        setIntField(term134775, term134775.getClass(), "hash1", 0);
        setIntField(term134775, term134775.getClass(), "hash2", 0);
        setIntField(term134775, term134775.getClass(), "hash3", 0);
        setField(term134775, term134775.getClass(), "key1", null);
        setField(term134776, term134776.getClass(), "base", null);
        setLongField(term134776, term134776.getClass(), "fieldOffset", 0L);
        setField(term134776, term134776.getClass(), "vform", null);
        setField(term134776, term134776.getClass(), "typesAndInvokers", null);
        setField(term134775, term134775.getClass(), "key2", term134776);
        setField(term134775, term134775.getClass(), "key3", null);
        setField(term134775, term134775.getClass(), "value1", null);
        setFloatField(term134777, term134777.getClass(), "loadFactor", 0.0F);
        setIntField(term134777, term134777.getClass(), "size", 0);
        setField(term134777, term134777.getClass(), "data", null);
        setIntField(term134777, term134777.getClass(), "threshold", 0);
        setIntField(term134777, term134777.getClass(), "modCount", 0);
        setField(term134777, term134777.getClass(), "entrySet", null);
        setField(term134777, term134777.getClass(), "keySet", null);
        setField(term134777, term134777.getClass(), "values", null);
        setField(term134777, term134777.getClass(), "keySet", null);
        setField(term134777, term134777.getClass(), "values", null);
        setField(term134775, term134775.getClass(), "value2", term134777);
        setField(term134775, term134775.getClass(), "value3", null);
        setField(term134775, term134775.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term134128;
        Object retValue = callMethod(klass, "get", argTypes, term133944, args);
        assertTrue(recursiveEquals(term133944, term134773));
        assertTrue(recursiveEquals(term134128, term134775));
        assertTrue(recursiveEquals(retValue, null));
    }

};

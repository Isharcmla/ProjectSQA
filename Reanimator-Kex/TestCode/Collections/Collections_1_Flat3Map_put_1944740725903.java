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

public class Flat3Map_put_1944740725903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181840;
     Object term181991;
     Object term181993;

    public Flat3Map_put_1944740725903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181894 = newInstance(Class.forName("java.lang.invoke.VarHandleInts$FieldStaticReadWrite"));
        setField(term181840, term181840.getClass(), "delegateMap", null);
        setIntField(term181840, term181840.getClass(), "size", 2);
        setIntField(term181840, term181840.getClass(), "hash2", 0);
        setField(term181840, term181840.getClass(), "value2", null);
        setIntField(term181840, term181840.getClass(), "hash1", 0);
        setField(term181840, term181840.getClass(), "value1", term181894);
        term181991 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181992 = newInstance(Class.forName("java.lang.invoke.VarHandleInts$FieldStaticReadWrite"));
        setIntField(term181991, term181991.getClass(), "size", 3);
        setIntField(term181991, term181991.getClass(), "hash1", 0);
        setIntField(term181991, term181991.getClass(), "hash2", 0);
        setIntField(term181991, term181991.getClass(), "hash3", 1468245494);
        setField(term181991, term181991.getClass(), "key1", null);
        setField(term181991, term181991.getClass(), "key2", null);
        setField(term181991, term181991.getClass(), "key3", term181991);
        setField(term181992, term181992.getClass(), "base", null);
        setLongField(term181992, term181992.getClass(), "fieldOffset", 0L);
        setField(term181992, term181992.getClass(), "vform", null);
        setField(term181992, term181992.getClass(), "typesAndInvokers", null);
        setField(term181991, term181991.getClass(), "value1", term181992);
        setField(term181991, term181991.getClass(), "value2", null);
        setField(term181991, term181991.getClass(), "value3", null);
        setField(term181991, term181991.getClass(), "delegateMap", null);
        term181993 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181994 = newInstance(Class.forName("java.lang.invoke.VarHandleInts$FieldStaticReadWrite"));
        setIntField(term181993, term181993.getClass(), "size", 3);
        setIntField(term181993, term181993.getClass(), "hash1", 0);
        setIntField(term181993, term181993.getClass(), "hash2", 0);
        setIntField(term181993, term181993.getClass(), "hash3", 1468245494);
        setField(term181993, term181993.getClass(), "key1", null);
        setField(term181993, term181993.getClass(), "key2", null);
        setField(term181993, term181993.getClass(), "key3", term181993);
        setField(term181994, term181994.getClass(), "base", null);
        setLongField(term181994, term181994.getClass(), "fieldOffset", 0L);
        setField(term181994, term181994.getClass(), "vform", null);
        setField(term181994, term181994.getClass(), "typesAndInvokers", null);
        setField(term181993, term181993.getClass(), "value1", term181994);
        setField(term181993, term181993.getClass(), "value2", null);
        setField(term181993, term181993.getClass(), "value3", null);
        setField(term181993, term181993.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term181840;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term181840, args);
        assertTrue(recursiveEquals(term181840, term181991));
        assertTrue(recursiveEquals(term181840, term181993));
        assertTrue(recursiveEquals(retValue, null));
    }

};

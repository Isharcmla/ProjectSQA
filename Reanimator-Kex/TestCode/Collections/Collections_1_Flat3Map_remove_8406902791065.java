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

public class Flat3Map_remove_8406902791065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211946;
     Object term212058;
     Object term212060;

    public Flat3Map_remove_8406902791065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211946 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211993 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$ProxyMethod"));
        setField(term211946, term211946.getClass(), "delegateMap", null);
        setIntField(term211946, term211946.getClass(), "size", 1);
        setIntField(term211946, term211946.getClass(), "hash1", 0);
        setField(term211946, term211946.getClass(), "value1", term211993);
        term212058 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212059 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$ProxyMethod"));
        setIntField(term212058, term212058.getClass(), "size", 1);
        setIntField(term212058, term212058.getClass(), "hash1", 0);
        setIntField(term212058, term212058.getClass(), "hash2", 0);
        setIntField(term212058, term212058.getClass(), "hash3", 0);
        setField(term212058, term212058.getClass(), "key1", null);
        setField(term212058, term212058.getClass(), "key2", null);
        setField(term212058, term212058.getClass(), "key3", null);
        setField(term212059, term212059.getClass(), "methodName", null);
        setField(term212059, term212059.getClass(), "parameterTypes", null);
        setField(term212059, term212059.getClass(), "returnType", null);
        setField(term212059, term212059.getClass(), "exceptionTypes", null);
        setField(term212059, term212059.getClass(), "fromClass", null);
        setField(term212059, term212059.getClass(), "methodFieldName", null);
        setField(term212059, term212059.getClass(), "this$0", null);
        setField(term212058, term212058.getClass(), "value1", term212059);
        setField(term212058, term212058.getClass(), "value2", null);
        setField(term212058, term212058.getClass(), "value3", null);
        setField(term212058, term212058.getClass(), "delegateMap", null);
        term212060 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212061 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$ProxyMethod"));
        setIntField(term212060, term212060.getClass(), "size", 1);
        setIntField(term212060, term212060.getClass(), "hash1", 0);
        setIntField(term212060, term212060.getClass(), "hash2", 0);
        setIntField(term212060, term212060.getClass(), "hash3", 0);
        setField(term212060, term212060.getClass(), "key1", null);
        setField(term212060, term212060.getClass(), "key2", null);
        setField(term212060, term212060.getClass(), "key3", null);
        setField(term212061, term212061.getClass(), "methodName", null);
        setField(term212061, term212061.getClass(), "parameterTypes", null);
        setField(term212061, term212061.getClass(), "returnType", null);
        setField(term212061, term212061.getClass(), "exceptionTypes", null);
        setField(term212061, term212061.getClass(), "fromClass", null);
        setField(term212061, term212061.getClass(), "methodFieldName", null);
        setField(term212061, term212061.getClass(), "this$0", null);
        setField(term212060, term212060.getClass(), "value1", term212061);
        setField(term212060, term212060.getClass(), "value2", null);
        setField(term212060, term212060.getClass(), "value3", null);
        setField(term212060, term212060.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term211946;
        Object retValue = callMethod(klass, "remove", argTypes, term211946, args);
        assertTrue(recursiveEquals(term211946, term212058));
        assertTrue(recursiveEquals(term211946, term212060));
        assertTrue(recursiveEquals(retValue, null));
    }

};

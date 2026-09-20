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

public class Flat3Map_remove_8406902791070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212704;
     Object term213050;
     Object term213052;

    public Flat3Map_remove_8406902791070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212704 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212753 = newInstance(Class.forName("java.util.stream.ForEachOps$ForEachOp$OfDouble"));
        setField(term212704, term212704.getClass(), "delegateMap", null);
        setIntField(term212704, term212704.getClass(), "size", 3);
        setIntField(term212704, term212704.getClass(), "hash3", 0);
        setField(term212704, term212704.getClass(), "value3", term212753);
        term213050 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213051 = newInstance(Class.forName("java.util.stream.ForEachOps$ForEachOp$OfDouble"));
        setIntField(term213050, term213050.getClass(), "size", 3);
        setIntField(term213050, term213050.getClass(), "hash1", 0);
        setIntField(term213050, term213050.getClass(), "hash2", 0);
        setIntField(term213050, term213050.getClass(), "hash3", 0);
        setField(term213050, term213050.getClass(), "key1", null);
        setField(term213050, term213050.getClass(), "key2", null);
        setField(term213050, term213050.getClass(), "key3", null);
        setField(term213050, term213050.getClass(), "value1", null);
        setField(term213050, term213050.getClass(), "value2", null);
        setField(term213051, term213051.getClass(), "consumer", null);
        setBooleanField(term213051, term213051.getClass(), "ordered", false);
        setField(term213050, term213050.getClass(), "value3", term213051);
        setField(term213050, term213050.getClass(), "delegateMap", null);
        term213052 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213053 = newInstance(Class.forName("java.util.stream.ForEachOps$ForEachOp$OfDouble"));
        setIntField(term213052, term213052.getClass(), "size", 3);
        setIntField(term213052, term213052.getClass(), "hash1", 0);
        setIntField(term213052, term213052.getClass(), "hash2", 0);
        setIntField(term213052, term213052.getClass(), "hash3", 0);
        setField(term213052, term213052.getClass(), "key1", null);
        setField(term213052, term213052.getClass(), "key2", null);
        setField(term213052, term213052.getClass(), "key3", null);
        setField(term213052, term213052.getClass(), "value1", null);
        setField(term213052, term213052.getClass(), "value2", null);
        setField(term213053, term213053.getClass(), "consumer", null);
        setBooleanField(term213053, term213053.getClass(), "ordered", false);
        setField(term213052, term213052.getClass(), "value3", term213053);
        setField(term213052, term213052.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term212704;
        Object retValue = callMethod(klass, "remove", argTypes, term212704, args);
        assertTrue(recursiveEquals(term212704, term213050));
        assertTrue(recursiveEquals(term212704, term213052));
        assertTrue(recursiveEquals(retValue, null));
    }

};

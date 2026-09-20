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

public class Flat3Map_get_229621781771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156466;
     Object term156648;
     Object term156650;

    public Flat3Map_get_229621781771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156466 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term156524 = newInstance(Class.forName("java.lang.invoke.VarHandleByteArrayAsShorts$ArrayHandle"));
        setField(term156466, term156466.getClass(), "delegateMap", null);
        setIntField(term156466, term156466.getClass(), "size", 2);
        setIntField(term156466, term156466.getClass(), "hash2", 0);
        setField(term156466, term156466.getClass(), "value2", null);
        setIntField(term156466, term156466.getClass(), "hash1", 0);
        setField(term156466, term156466.getClass(), "value1", null);
        setField(term156466, term156466.getClass(), "key2", term156524);
        term156648 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term156649 = newInstance(Class.forName("java.lang.invoke.VarHandleByteArrayAsShorts$ArrayHandle"));
        setIntField(term156648, term156648.getClass(), "size", 2);
        setIntField(term156648, term156648.getClass(), "hash1", 0);
        setIntField(term156648, term156648.getClass(), "hash2", 0);
        setIntField(term156648, term156648.getClass(), "hash3", 0);
        setField(term156648, term156648.getClass(), "key1", null);
        setBooleanField(term156649, term156649.getClass(), "be", false);
        setField(term156649, term156649.getClass(), "vform", null);
        setField(term156649, term156649.getClass(), "typesAndInvokers", null);
        setField(term156648, term156648.getClass(), "key2", term156649);
        setField(term156648, term156648.getClass(), "key3", null);
        setField(term156648, term156648.getClass(), "value1", null);
        setField(term156648, term156648.getClass(), "value2", null);
        setField(term156648, term156648.getClass(), "value3", null);
        setField(term156648, term156648.getClass(), "delegateMap", null);
        term156650 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term156651 = newInstance(Class.forName("java.lang.invoke.VarHandleByteArrayAsShorts$ArrayHandle"));
        setIntField(term156650, term156650.getClass(), "size", 2);
        setIntField(term156650, term156650.getClass(), "hash1", 0);
        setIntField(term156650, term156650.getClass(), "hash2", 0);
        setIntField(term156650, term156650.getClass(), "hash3", 0);
        setField(term156650, term156650.getClass(), "key1", null);
        setBooleanField(term156651, term156651.getClass(), "be", false);
        setField(term156651, term156651.getClass(), "vform", null);
        setField(term156651, term156651.getClass(), "typesAndInvokers", null);
        setField(term156650, term156650.getClass(), "key2", term156651);
        setField(term156650, term156650.getClass(), "key3", null);
        setField(term156650, term156650.getClass(), "value1", null);
        setField(term156650, term156650.getClass(), "value2", null);
        setField(term156650, term156650.getClass(), "value3", null);
        setField(term156650, term156650.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156466;
        Object retValue = callMethod(klass, "get", argTypes, term156466, args);
        assertTrue(recursiveEquals(term156466, term156648));
        assertTrue(recursiveEquals(term156466, term156650));
        assertTrue(recursiveEquals(retValue, null));
    }

};

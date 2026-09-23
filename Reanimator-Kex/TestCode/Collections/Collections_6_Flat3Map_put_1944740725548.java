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

public class Flat3Map_put_1944740725548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107779;
     Object term108177;
     Object term109005;
     Object term109011;

    public Flat3Map_put_1944740725548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107779 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107871 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107909 = newInstance(Class.forName("java.lang.Object"));
        Object term107947 = newInstance(Class.forName("java.lang.Object"));
        term108177 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108223 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term107779, term107779.getClass(), "delegateMap", null);
        setIntField(term107779, term107779.getClass(), "size", 3);
        setIntField(term107779, term107779.getClass(), "hash3", 0);
        setField(term107871, term107871.getClass(), "delegateMap", null);
        setIntField(term107871, term107871.getClass(), "size", 3);
        setField(term107871, term107871.getClass(), "key3", term107909);
        setField(term107871, term107871.getClass(), "key2", null);
        setField(term107871, term107871.getClass(), "value2", null);
        setIntField(term107871, term107871.getClass(), "hash3", -1);
        setIntField(term107871, term107871.getClass(), "hash2", 0);
        setIntField(term107871, term107871.getClass(), "hash1", 0);
        setField(term107871, term107871.getClass(), "key1", term107947);
        setField(term107779, term107779.getClass(), "key3", term107871);
        setIntField(term107779, term107779.getClass(), "hash2", 0);
        setField(term108177, term108177.getClass(), "delegateMap", null);
        setIntField(term108177, term108177.getClass(), "size", 3);
        setIntField(term108177, term108177.getClass(), "hash3", 0);
        setField(term108177, term108177.getClass(), "value3", null);
        setIntField(term108177, term108177.getClass(), "hash2", 0);
        setField(term108177, term108177.getClass(), "value2", null);
        setIntField(term108177, term108177.getClass(), "hash1", 0);
        setField(term108177, term108177.getClass(), "value1", null);
        setField(term108177, term108177.getClass(), "key3", null);
        setField(term108223, term108223.getClass(), "delegateMap", null);
        setIntField(term108223, term108223.getClass(), "size", 0);
        setField(term108177, term108177.getClass(), "key2", term108223);
        setField(term107779, term107779.getClass(), "key2", term108177);
        term109005 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109006 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109007 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109008 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109009 = newInstance(Class.forName("java.lang.Object"));
        Object term109010 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109005, term109005.getClass(), "size", 3);
        setIntField(term109005, term109005.getClass(), "hash1", 0);
        setIntField(term109005, term109005.getClass(), "hash2", 0);
        setIntField(term109005, term109005.getClass(), "hash3", 0);
        setField(term109005, term109005.getClass(), "key1", null);
        setIntField(term109006, term109006.getClass(), "size", 3);
        setIntField(term109006, term109006.getClass(), "hash1", 0);
        setIntField(term109006, term109006.getClass(), "hash2", 0);
        setIntField(term109006, term109006.getClass(), "hash3", 0);
        setField(term109006, term109006.getClass(), "key1", null);
        setIntField(term109007, term109007.getClass(), "size", 0);
        setIntField(term109007, term109007.getClass(), "hash1", 0);
        setIntField(term109007, term109007.getClass(), "hash2", 0);
        setIntField(term109007, term109007.getClass(), "hash3", 0);
        setField(term109007, term109007.getClass(), "key1", null);
        setField(term109007, term109007.getClass(), "key2", null);
        setField(term109007, term109007.getClass(), "key3", null);
        setField(term109007, term109007.getClass(), "value1", null);
        setField(term109007, term109007.getClass(), "value2", null);
        setField(term109007, term109007.getClass(), "value3", null);
        setField(term109007, term109007.getClass(), "delegateMap", null);
        setField(term109006, term109006.getClass(), "key2", term109007);
        setField(term109006, term109006.getClass(), "key3", null);
        setField(term109006, term109006.getClass(), "value1", null);
        setField(term109006, term109006.getClass(), "value2", null);
        setField(term109006, term109006.getClass(), "value3", null);
        setField(term109006, term109006.getClass(), "delegateMap", null);
        setField(term109005, term109005.getClass(), "key2", term109006);
        setIntField(term109008, term109008.getClass(), "size", 3);
        setIntField(term109008, term109008.getClass(), "hash1", 0);
        setIntField(term109008, term109008.getClass(), "hash2", 0);
        setIntField(term109008, term109008.getClass(), "hash3", -1);
        setField(term109008, term109008.getClass(), "key1", term109009);
        setField(term109008, term109008.getClass(), "key2", null);
        setField(term109008, term109008.getClass(), "key3", term109010);
        setField(term109008, term109008.getClass(), "value1", null);
        setField(term109008, term109008.getClass(), "value2", null);
        setField(term109008, term109008.getClass(), "value3", null);
        setField(term109008, term109008.getClass(), "delegateMap", null);
        setField(term109005, term109005.getClass(), "key3", term109008);
        setField(term109005, term109005.getClass(), "value1", null);
        setField(term109005, term109005.getClass(), "value2", null);
        setField(term109005, term109005.getClass(), "value3", null);
        setField(term109005, term109005.getClass(), "delegateMap", null);
        term109011 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109012 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term109011, term109011.getClass(), "size", 3);
        setIntField(term109011, term109011.getClass(), "hash1", 0);
        setIntField(term109011, term109011.getClass(), "hash2", 0);
        setIntField(term109011, term109011.getClass(), "hash3", 0);
        setField(term109011, term109011.getClass(), "key1", null);
        setIntField(term109012, term109012.getClass(), "size", 0);
        setIntField(term109012, term109012.getClass(), "hash1", 0);
        setIntField(term109012, term109012.getClass(), "hash2", 0);
        setIntField(term109012, term109012.getClass(), "hash3", 0);
        setField(term109012, term109012.getClass(), "key1", null);
        setField(term109012, term109012.getClass(), "key2", null);
        setField(term109012, term109012.getClass(), "key3", null);
        setField(term109012, term109012.getClass(), "value1", null);
        setField(term109012, term109012.getClass(), "value2", null);
        setField(term109012, term109012.getClass(), "value3", null);
        setField(term109012, term109012.getClass(), "delegateMap", null);
        setField(term109011, term109011.getClass(), "key2", term109012);
        setField(term109011, term109011.getClass(), "key3", null);
        setField(term109011, term109011.getClass(), "value1", null);
        setField(term109011, term109011.getClass(), "value2", null);
        setField(term109011, term109011.getClass(), "value3", null);
        setField(term109011, term109011.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term108177;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term107779, args);
        assertTrue(recursiveEquals(term107779, term109005));
        assertTrue(recursiveEquals(term108177, term109011));
        assertTrue(recursiveEquals(retValue, null));
    }

};



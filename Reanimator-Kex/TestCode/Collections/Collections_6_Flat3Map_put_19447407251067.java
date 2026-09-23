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

public class Flat3Map_put_19447407251067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310463;
     Object term310982;
     Object term310985;

    public Flat3Map_put_19447407251067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310463 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310509 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310564 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term310463, term310463.getClass(), "delegateMap", null);
        setIntField(term310463, term310463.getClass(), "size", 1);
        setIntField(term310463, term310463.getClass(), "hash1", 0);
        setField(term310463, term310463.getClass(), "value1", null);
        setField(term310509, term310509.getClass(), "delegateMap", term310564);
        setField(term310463, term310463.getClass(), "key1", term310509);
        term310982 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310983 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310984 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term310982, term310982.getClass(), "size", 2);
        setIntField(term310982, term310982.getClass(), "hash1", 0);
        setIntField(term310982, term310982.getClass(), "hash2", 0);
        setIntField(term310982, term310982.getClass(), "hash3", 0);
        setIntField(term310983, term310983.getClass(), "size", 0);
        setIntField(term310983, term310983.getClass(), "hash1", 0);
        setIntField(term310983, term310983.getClass(), "hash2", 0);
        setIntField(term310983, term310983.getClass(), "hash3", 0);
        setField(term310983, term310983.getClass(), "key1", null);
        setField(term310983, term310983.getClass(), "key2", null);
        setField(term310983, term310983.getClass(), "key3", null);
        setField(term310983, term310983.getClass(), "value1", null);
        setField(term310983, term310983.getClass(), "value2", null);
        setField(term310983, term310983.getClass(), "value3", null);
        setFloatField(term310984, term310984.getClass(), "loadFactor", 0.0F);
        setIntField(term310984, term310984.getClass(), "size", 0);
        setField(term310984, term310984.getClass(), "data", null);
        setIntField(term310984, term310984.getClass(), "threshold", 0);
        setIntField(term310984, term310984.getClass(), "modCount", 0);
        setField(term310984, term310984.getClass(), "entrySet", null);
        setField(term310984, term310984.getClass(), "keySet", null);
        setField(term310984, term310984.getClass(), "values", null);
        setField(term310984, term310984.getClass(), "keySet", null);
        setField(term310984, term310984.getClass(), "values", null);
        setField(term310983, term310983.getClass(), "delegateMap", term310984);
        setField(term310982, term310982.getClass(), "key1", term310983);
        setField(term310982, term310982.getClass(), "key2", term310982);
        setField(term310982, term310982.getClass(), "key3", null);
        setField(term310982, term310982.getClass(), "value1", null);
        setField(term310982, term310982.getClass(), "value2", null);
        setField(term310982, term310982.getClass(), "value3", null);
        setField(term310982, term310982.getClass(), "delegateMap", null);
        term310985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310986 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310987 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term310985, term310985.getClass(), "size", 2);
        setIntField(term310985, term310985.getClass(), "hash1", 0);
        setIntField(term310985, term310985.getClass(), "hash2", 0);
        setIntField(term310985, term310985.getClass(), "hash3", 0);
        setIntField(term310986, term310986.getClass(), "size", 0);
        setIntField(term310986, term310986.getClass(), "hash1", 0);
        setIntField(term310986, term310986.getClass(), "hash2", 0);
        setIntField(term310986, term310986.getClass(), "hash3", 0);
        setField(term310986, term310986.getClass(), "key1", null);
        setField(term310986, term310986.getClass(), "key2", null);
        setField(term310986, term310986.getClass(), "key3", null);
        setField(term310986, term310986.getClass(), "value1", null);
        setField(term310986, term310986.getClass(), "value2", null);
        setField(term310986, term310986.getClass(), "value3", null);
        setFloatField(term310987, term310987.getClass(), "loadFactor", 0.0F);
        setIntField(term310987, term310987.getClass(), "size", 0);
        setField(term310987, term310987.getClass(), "data", null);
        setIntField(term310987, term310987.getClass(), "threshold", 0);
        setIntField(term310987, term310987.getClass(), "modCount", 0);
        setField(term310987, term310987.getClass(), "entrySet", null);
        setField(term310987, term310987.getClass(), "keySet", null);
        setField(term310987, term310987.getClass(), "values", null);
        setField(term310987, term310987.getClass(), "keySet", null);
        setField(term310987, term310987.getClass(), "values", null);
        setField(term310986, term310986.getClass(), "delegateMap", term310987);
        setField(term310985, term310985.getClass(), "key1", term310986);
        setField(term310985, term310985.getClass(), "key2", term310985);
        setField(term310985, term310985.getClass(), "key3", null);
        setField(term310985, term310985.getClass(), "value1", null);
        setField(term310985, term310985.getClass(), "value2", null);
        setField(term310985, term310985.getClass(), "value3", null);
        setField(term310985, term310985.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term310463;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term310463, args);
        assertTrue(recursiveEquals(term310463, term310982));
        assertTrue(recursiveEquals(term310463, term310985));
        assertTrue(recursiveEquals(retValue, null));
    }

};



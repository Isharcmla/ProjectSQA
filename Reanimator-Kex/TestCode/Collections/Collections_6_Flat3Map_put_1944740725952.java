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

public class Flat3Map_put_1944740725952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262014;
     Object term262246;

    public Flat3Map_put_1944740725952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262014 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term262106 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term262154 = newInstance(Class.forName("java.nio.file.Files$2"));
        setField(term262014, term262014.getClass(), "delegateMap", null);
        setIntField(term262014, term262014.getClass(), "size", 3);
        setIntField(term262014, term262014.getClass(), "hash3", -420670320);
        setField(term262014, term262014.getClass(), "key3", null);
        setIntField(term262014, term262014.getClass(), "hash2", -420670320);
        setField(term262106, term262106.getClass(), "delegateMap", null);
        setIntField(term262106, term262106.getClass(), "size", 3);
        setField(term262106, term262106.getClass(), "key3", null);
        setField(term262106, term262106.getClass(), "value3", null);
        setIntField(term262106, term262106.getClass(), "hash3", 1677729808);
        setIntField(term262106, term262106.getClass(), "hash2", 810614784);
        setIntField(term262106, term262106.getClass(), "hash1", 25387010);
        setField(term262106, term262106.getClass(), "value2", null);
        setField(term262106, term262106.getClass(), "value1", null);
        setField(term262014, term262014.getClass(), "key2", term262106);
        setIntField(term262014, term262014.getClass(), "hash1", -420670320);
        setField(term262014, term262014.getClass(), "key1", null);
        setField(term262014, term262014.getClass(), "value3", term262154);
        setField(term262014, term262014.getClass(), "value2", null);
        setField(term262014, term262014.getClass(), "value1", null);
        term262246 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term262340 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term262468 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term262246, term262246.getClass(), "delegateMap", null);
        setIntField(term262246, term262246.getClass(), "size", 3);
        setIntField(term262246, term262246.getClass(), "hash3", 740816896);
        setField(term262246, term262246.getClass(), "value3", null);
        setIntField(term262246, term262246.getClass(), "hash2", 981532688);
        setField(term262246, term262246.getClass(), "value2", null);
        setIntField(term262246, term262246.getClass(), "hash1", -2143019904);
        setIntField(term262340, term262340.getClass(), "size", 0);
        setField(term262246, term262246.getClass(), "value1", term262340);
        setField(term262246, term262246.getClass(), "key3", null);
        setField(term262246, term262246.getClass(), "key2", null);
        setField(term262246, term262246.getClass(), "key1", term262468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term262246;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term262014, args);
        assertTrue(recursiveEquals(term262246, 652129701));
        assertTrue(recursiveEquals(retValue, null));
    }

};



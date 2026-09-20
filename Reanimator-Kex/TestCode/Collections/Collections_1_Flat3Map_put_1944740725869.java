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

public class Flat3Map_put_1944740725869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175050;
     Object term175507;
     Object term175509;

    public Flat3Map_put_1944740725869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175050 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175114 = newInstance(Class.forName("org.apache.commons.collections.iterators.UniqueFilterIterator"));
        setField(term175050, term175050.getClass(), "delegateMap", null);
        setIntField(term175050, term175050.getClass(), "size", 1);
        setIntField(term175050, term175050.getClass(), "hash1", 0);
        setField(term175050, term175050.getClass(), "value1", term175114);
        term175507 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175508 = newInstance(Class.forName("org.apache.commons.collections.iterators.UniqueFilterIterator"));
        setIntField(term175507, term175507.getClass(), "size", 2);
        setIntField(term175507, term175507.getClass(), "hash1", 0);
        setIntField(term175507, term175507.getClass(), "hash2", 1780153582);
        setIntField(term175507, term175507.getClass(), "hash3", 0);
        setField(term175507, term175507.getClass(), "key1", null);
        setField(term175507, term175507.getClass(), "key2", term175507);
        setField(term175507, term175507.getClass(), "key3", null);
        setField(term175508, term175508.getClass(), "iterator", null);
        setField(term175508, term175508.getClass(), "predicate", null);
        setField(term175508, term175508.getClass(), "nextObject", null);
        setBooleanField(term175508, term175508.getClass(), "nextObjectSet", false);
        setField(term175507, term175507.getClass(), "value1", term175508);
        setField(term175507, term175507.getClass(), "value2", null);
        setField(term175507, term175507.getClass(), "value3", null);
        setField(term175507, term175507.getClass(), "delegateMap", null);
        term175509 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175510 = newInstance(Class.forName("org.apache.commons.collections.iterators.UniqueFilterIterator"));
        setIntField(term175509, term175509.getClass(), "size", 2);
        setIntField(term175509, term175509.getClass(), "hash1", 0);
        setIntField(term175509, term175509.getClass(), "hash2", 1780153582);
        setIntField(term175509, term175509.getClass(), "hash3", 0);
        setField(term175509, term175509.getClass(), "key1", null);
        setField(term175509, term175509.getClass(), "key2", term175509);
        setField(term175509, term175509.getClass(), "key3", null);
        setField(term175510, term175510.getClass(), "iterator", null);
        setField(term175510, term175510.getClass(), "predicate", null);
        setField(term175510, term175510.getClass(), "nextObject", null);
        setBooleanField(term175510, term175510.getClass(), "nextObjectSet", false);
        setField(term175509, term175509.getClass(), "value1", term175510);
        setField(term175509, term175509.getClass(), "value2", null);
        setField(term175509, term175509.getClass(), "value3", null);
        setField(term175509, term175509.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term175050;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term175050, args);
        assertTrue(recursiveEquals(term175050, term175507));
        assertTrue(recursiveEquals(term175050, term175509));
        assertTrue(recursiveEquals(retValue, null));
    }

};

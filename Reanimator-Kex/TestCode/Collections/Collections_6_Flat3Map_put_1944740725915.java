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

public class Flat3Map_put_1944740725915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243243;
     Object term243615;
     Object term243783;
     Object term243784;

    public Flat3Map_put_1944740725915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243243 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term243335 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term243662 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term243523 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term243243, term243243.getClass(), "delegateMap", null);
        setIntField(term243243, term243243.getClass(), "size", 3);
        setIntField(term243243, term243243.getClass(), "hash3", 1769734144);
        setField(term243243, term243243.getClass(), "key3", null);
        setIntField(term243243, term243243.getClass(), "hash2", 1769734144);
        setField(term243243, term243243.getClass(), "key2", null);
        setIntField(term243243, term243243.getClass(), "hash1", 1769734144);
        setIntField(term243662, term243662.getClass(), "size", 0);
        setField(term243335, term243335.getClass(), "delegateMap", term243662);
        setField(term243243, term243243.getClass(), "key1", term243335);
        setField(term243243, term243243.getClass(), "value3", term243523);
        setField(term243243, term243243.getClass(), "value2", null);
        setField(term243243, term243243.getClass(), "value1", null);
        term243615 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term243615, term243615.getClass(), "delegateMap", null);
        setIntField(term243615, term243615.getClass(), "size", 3);
        setIntField(term243615, term243615.getClass(), "hash3", 1497897843);
        setField(term243615, term243615.getClass(), "value3", null);
        setIntField(term243615, term243615.getClass(), "hash2", 499716);
        setField(term243615, term243615.getClass(), "value2", null);
        setIntField(term243615, term243615.getClass(), "hash1", 271336585);
        setField(term243615, term243615.getClass(), "value1", term243662);
        term243783 = newInstance(Class.forName("java.lang.Object"));
        term243784 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term243784, term243784.getClass(), "size", 3);
        setIntField(term243784, term243784.getClass(), "hash1", 271336585);
        setIntField(term243784, term243784.getClass(), "hash2", 499716);
        setIntField(term243784, term243784.getClass(), "hash3", 1497897843);
        setField(term243784, term243784.getClass(), "key1", null);
        setField(term243784, term243784.getClass(), "key2", null);
        setField(term243784, term243784.getClass(), "key3", null);
        setField(term243784, term243784.getClass(), "value1", null);
        setField(term243784, term243784.getClass(), "value2", null);
        setField(term243784, term243784.getClass(), "value3", null);
        setField(term243784, term243784.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term243615;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term243243, args);
        assertTrue(recursiveEquals(term243243, term243783));
        assertTrue(recursiveEquals(term243615, term243784));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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
import java.util.HashMap;

public class Flat3Map_get_229621781764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154651;
     Object term154883;
     Object term155575;
     Object term155578;

    public Flat3Map_get_229621781764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term154791 = new HashMap();
        term154651 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term154743 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term154651, term154651.getClass(), "delegateMap", null);
        setIntField(term154651, term154651.getClass(), "size", 2);
        setIntField(term154651, term154651.getClass(), "hash2", 0);
        setField(term154743, term154743.getClass(), "delegateMap", null);
        setIntField(term154743, term154743.getClass(), "size", 2);
        setField(term154743, term154743.getClass(), "key2", term154791);
        setField(term154743, term154743.getClass(), "key1", null);
        setField(term154743, term154743.getClass(), "value1", null);
        setField(term154651, term154651.getClass(), "key2", term154743);
        HashMap term154931 = new HashMap();
        term154883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term154883, term154883.getClass(), "delegateMap", null);
        setIntField(term154883, term154883.getClass(), "size", 2);
        setIntField(term154883, term154883.getClass(), "hash2", 0);
        setField(term154883, term154883.getClass(), "value2", null);
        setIntField(term154883, term154883.getClass(), "hash1", 0);
        setField(term154883, term154883.getClass(), "value1", null);
        setField(term154883, term154883.getClass(), "key2", null);
        setField(term154883, term154883.getClass(), "key1", term154931);
        HashMap term155577 = new HashMap();
        term155575 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term155576 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term155575, term155575.getClass(), "size", 2);
        setIntField(term155575, term155575.getClass(), "hash1", 0);
        setIntField(term155575, term155575.getClass(), "hash2", 0);
        setIntField(term155575, term155575.getClass(), "hash3", 0);
        setField(term155575, term155575.getClass(), "key1", null);
        setIntField(term155576, term155576.getClass(), "size", 2);
        setIntField(term155576, term155576.getClass(), "hash1", 0);
        setIntField(term155576, term155576.getClass(), "hash2", 0);
        setIntField(term155576, term155576.getClass(), "hash3", 0);
        setField(term155576, term155576.getClass(), "key1", null);
        setField(term155576, term155576.getClass(), "key2", term155577);
        setField(term155576, term155576.getClass(), "key3", null);
        setField(term155576, term155576.getClass(), "value1", null);
        setField(term155576, term155576.getClass(), "value2", null);
        setField(term155576, term155576.getClass(), "value3", null);
        setField(term155576, term155576.getClass(), "delegateMap", null);
        setField(term155575, term155575.getClass(), "key2", term155576);
        setField(term155575, term155575.getClass(), "key3", null);
        setField(term155575, term155575.getClass(), "value1", null);
        setField(term155575, term155575.getClass(), "value2", null);
        setField(term155575, term155575.getClass(), "value3", null);
        setField(term155575, term155575.getClass(), "delegateMap", null);
        HashMap term155579 = new HashMap();
        term155578 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term155578, term155578.getClass(), "size", 2);
        setIntField(term155578, term155578.getClass(), "hash1", 0);
        setIntField(term155578, term155578.getClass(), "hash2", 0);
        setIntField(term155578, term155578.getClass(), "hash3", 0);
        setField(term155578, term155578.getClass(), "key1", term155579);
        setField(term155578, term155578.getClass(), "key2", null);
        setField(term155578, term155578.getClass(), "key3", null);
        setField(term155578, term155578.getClass(), "value1", null);
        setField(term155578, term155578.getClass(), "value2", null);
        setField(term155578, term155578.getClass(), "value3", null);
        setField(term155578, term155578.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154883;
        Object retValue = callMethod(klass, "get", argTypes, term154651, args);
        assertTrue(recursiveEquals(term154651, term155575));
        assertTrue(recursiveEquals(term154883, term155578));
        assertTrue(recursiveEquals(retValue, null));
    }

};

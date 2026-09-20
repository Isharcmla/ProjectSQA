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

public class Flat3Map_get_229621781660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128673;
     Object term128857;
     Object term129513;
     Object term129515;

    public Flat3Map_get_229621781660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128673 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128765 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term128673, term128673.getClass(), "delegateMap", null);
        setIntField(term128673, term128673.getClass(), "size", 2);
        setIntField(term128673, term128673.getClass(), "hash2", 0);
        setField(term128765, term128765.getClass(), "delegateMap", null);
        setIntField(term128765, term128765.getClass(), "size", 2);
        setField(term128673, term128673.getClass(), "key2", term128765);
        HashMap term128905 = new HashMap();
        term128857 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term128857, term128857.getClass(), "delegateMap", null);
        setIntField(term128857, term128857.getClass(), "size", 2);
        setIntField(term128857, term128857.getClass(), "hash2", 0);
        setField(term128857, term128857.getClass(), "value2", null);
        setIntField(term128857, term128857.getClass(), "hash1", 0);
        setField(term128857, term128857.getClass(), "value1", null);
        setField(term128857, term128857.getClass(), "key2", term128905);
        term129513 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term129513, term129513.getClass(), "size", 2);
        setIntField(term129513, term129513.getClass(), "hash1", 0);
        setIntField(term129513, term129513.getClass(), "hash2", 0);
        setIntField(term129513, term129513.getClass(), "hash3", 0);
        setField(term129513, term129513.getClass(), "key1", null);
        setIntField(term129514, term129514.getClass(), "size", 2);
        setIntField(term129514, term129514.getClass(), "hash1", 0);
        setIntField(term129514, term129514.getClass(), "hash2", 0);
        setIntField(term129514, term129514.getClass(), "hash3", 0);
        setField(term129514, term129514.getClass(), "key1", null);
        setField(term129514, term129514.getClass(), "key2", null);
        setField(term129514, term129514.getClass(), "key3", null);
        setField(term129514, term129514.getClass(), "value1", null);
        setField(term129514, term129514.getClass(), "value2", null);
        setField(term129514, term129514.getClass(), "value3", null);
        setField(term129514, term129514.getClass(), "delegateMap", null);
        setField(term129513, term129513.getClass(), "key2", term129514);
        setField(term129513, term129513.getClass(), "key3", null);
        setField(term129513, term129513.getClass(), "value1", null);
        setField(term129513, term129513.getClass(), "value2", null);
        setField(term129513, term129513.getClass(), "value3", null);
        setField(term129513, term129513.getClass(), "delegateMap", null);
        HashMap term129516 = new HashMap();
        term129515 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term129515, term129515.getClass(), "size", 2);
        setIntField(term129515, term129515.getClass(), "hash1", 0);
        setIntField(term129515, term129515.getClass(), "hash2", 0);
        setIntField(term129515, term129515.getClass(), "hash3", 0);
        setField(term129515, term129515.getClass(), "key1", null);
        setField(term129515, term129515.getClass(), "key2", term129516);
        setField(term129515, term129515.getClass(), "key3", null);
        setField(term129515, term129515.getClass(), "value1", null);
        setField(term129515, term129515.getClass(), "value2", null);
        setField(term129515, term129515.getClass(), "value3", null);
        setField(term129515, term129515.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term128857;
        Object retValue = callMethod(klass, "get", argTypes, term128673, args);
        assertTrue(recursiveEquals(term128673, term129513));
        assertTrue(recursiveEquals(term128857, term129515));
        assertTrue(recursiveEquals(retValue, null));
    }

};

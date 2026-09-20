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

public class Flat3Map_remove_840690279591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112675;
     Object term113747;

    public Flat3Map_remove_840690279591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112675 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112767 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term112675, term112675.getClass(), "delegateMap", null);
        setIntField(term112675, term112675.getClass(), "size", 3);
        setField(term112675, term112675.getClass(), "key3", term112767);
        term113747 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113748 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term113747, term113747.getClass(), "size", 2);
        setIntField(term113747, term113747.getClass(), "hash1", 0);
        setIntField(term113747, term113747.getClass(), "hash2", 0);
        setIntField(term113747, term113747.getClass(), "hash3", 0);
        setField(term113747, term113747.getClass(), "key1", null);
        setIntField(term113748, term113748.getClass(), "size", 0);
        setIntField(term113748, term113748.getClass(), "hash1", 0);
        setIntField(term113748, term113748.getClass(), "hash2", 0);
        setIntField(term113748, term113748.getClass(), "hash3", 0);
        setField(term113748, term113748.getClass(), "key1", null);
        setField(term113748, term113748.getClass(), "key2", null);
        setField(term113748, term113748.getClass(), "key3", null);
        setField(term113748, term113748.getClass(), "value1", null);
        setField(term113748, term113748.getClass(), "value2", null);
        setField(term113748, term113748.getClass(), "value3", null);
        setField(term113748, term113748.getClass(), "delegateMap", null);
        setField(term113747, term113747.getClass(), "key2", term113748);
        setField(term113747, term113747.getClass(), "key3", null);
        setField(term113747, term113747.getClass(), "value1", null);
        setField(term113747, term113747.getClass(), "value2", null);
        setField(term113747, term113747.getClass(), "value3", null);
        setField(term113747, term113747.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term112675, args);
        assertTrue(recursiveEquals(term112675, term113747));
        assertTrue(recursiveEquals(retValue, null));
    }

};

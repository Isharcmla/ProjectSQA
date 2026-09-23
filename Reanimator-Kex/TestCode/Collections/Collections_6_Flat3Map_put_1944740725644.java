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

public class Flat3Map_put_1944740725644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142583;
     Object term143244;
     Object term143246;

    public Flat3Map_put_1944740725644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142583 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142628 = newInstance(Class.forName("java.io.ObjectInputStream$ValidationList$1"));
        setField(term142583, term142583.getClass(), "delegateMap", null);
        setIntField(term142583, term142583.getClass(), "size", 2);
        setIntField(term142583, term142583.getClass(), "hash2", 0);
        setField(term142583, term142583.getClass(), "value2", null);
        setIntField(term142583, term142583.getClass(), "hash1", 0);
        setField(term142583, term142583.getClass(), "value1", term142628);
        term143244 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143245 = newInstance(Class.forName("java.io.ObjectInputStream$ValidationList$1"));
        setIntField(term143244, term143244.getClass(), "size", 3);
        setIntField(term143244, term143244.getClass(), "hash1", 0);
        setIntField(term143244, term143244.getClass(), "hash2", 0);
        setIntField(term143244, term143244.getClass(), "hash3", 1459417089);
        setField(term143244, term143244.getClass(), "key1", null);
        setField(term143244, term143244.getClass(), "key2", null);
        setField(term143244, term143244.getClass(), "key3", term143244);
        setField(term143245, term143245.getClass(), "this$0", null);
        setField(term143244, term143244.getClass(), "value1", term143245);
        setField(term143244, term143244.getClass(), "value2", null);
        setField(term143244, term143244.getClass(), "value3", null);
        setField(term143244, term143244.getClass(), "delegateMap", null);
        term143246 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143247 = newInstance(Class.forName("java.io.ObjectInputStream$ValidationList$1"));
        setIntField(term143246, term143246.getClass(), "size", 3);
        setIntField(term143246, term143246.getClass(), "hash1", 0);
        setIntField(term143246, term143246.getClass(), "hash2", 0);
        setIntField(term143246, term143246.getClass(), "hash3", 1459417089);
        setField(term143246, term143246.getClass(), "key1", null);
        setField(term143246, term143246.getClass(), "key2", null);
        setField(term143246, term143246.getClass(), "key3", term143246);
        setField(term143247, term143247.getClass(), "this$0", null);
        setField(term143246, term143246.getClass(), "value1", term143247);
        setField(term143246, term143246.getClass(), "value2", null);
        setField(term143246, term143246.getClass(), "value3", null);
        setField(term143246, term143246.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term142583;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term142583, args);
        assertTrue(recursiveEquals(term142583, term143244));
        assertTrue(recursiveEquals(term142583, term143246));
        assertTrue(recursiveEquals(retValue, null));
    }

};



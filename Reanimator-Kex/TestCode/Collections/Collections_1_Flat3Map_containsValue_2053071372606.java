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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_containsValue_2053071372606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116476;
     Object term116766;
     Object term117089;
     Object term117096;

    public Flat3Map_containsValue_2053071372606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term116528 = new ArrayList();
        HashMap term116576 = new HashMap();
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        ((HashMap) term116576).put((Object)null, (Object)null);
        term116476 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term116766 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term116476, term116476.getClass(), "delegateMap", null);
        setIntField(term116476, term116476.getClass(), "size", 3);
        setField(term116476, term116476.getClass(), "value3", term116528);
        setField(term116476, term116476.getClass(), "value2", term116576);
        setField(term116766, term116766.getClass(), "delegateMap", null);
        setIntField(term116766, term116766.getClass(), "size", -50);
        setField(term116476, term116476.getClass(), "value1", term116766);
        HashMap term117091 = new HashMap();
        ArrayList term117094 = new ArrayList();
        term117089 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117090 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term117089, term117089.getClass(), "size", 3);
        setIntField(term117089, term117089.getClass(), "hash1", 0);
        setIntField(term117089, term117089.getClass(), "hash2", 0);
        setIntField(term117089, term117089.getClass(), "hash3", 0);
        setField(term117089, term117089.getClass(), "key1", null);
        setField(term117089, term117089.getClass(), "key2", null);
        setField(term117089, term117089.getClass(), "key3", null);
        setIntField(term117090, term117090.getClass(), "size", -50);
        setIntField(term117090, term117090.getClass(), "hash1", 0);
        setIntField(term117090, term117090.getClass(), "hash2", 0);
        setIntField(term117090, term117090.getClass(), "hash3", 0);
        setField(term117090, term117090.getClass(), "key1", null);
        setField(term117090, term117090.getClass(), "key2", null);
        setField(term117090, term117090.getClass(), "key3", null);
        setField(term117090, term117090.getClass(), "value1", null);
        setField(term117090, term117090.getClass(), "value2", null);
        setField(term117090, term117090.getClass(), "value3", null);
        setField(term117090, term117090.getClass(), "delegateMap", null);
        setField(term117089, term117089.getClass(), "value1", term117090);
        setField(term117089, term117089.getClass(), "value2", term117091);
        setField(term117089, term117089.getClass(), "value3", term117094);
        setField(term117089, term117089.getClass(), "delegateMap", null);
        term117096 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term117096, term117096.getClass(), "size", -50);
        setIntField(term117096, term117096.getClass(), "hash1", 0);
        setIntField(term117096, term117096.getClass(), "hash2", 0);
        setIntField(term117096, term117096.getClass(), "hash3", 0);
        setField(term117096, term117096.getClass(), "key1", null);
        setField(term117096, term117096.getClass(), "key2", null);
        setField(term117096, term117096.getClass(), "key3", null);
        setField(term117096, term117096.getClass(), "value1", null);
        setField(term117096, term117096.getClass(), "value2", null);
        setField(term117096, term117096.getClass(), "value3", null);
        setField(term117096, term117096.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term116766;
        callMethod(klass, "containsValue", argTypes, term116476, args);
        assertTrue(recursiveEquals(term116476, term117089));
        assertTrue(recursiveEquals(term116766, term117096));
    }

};

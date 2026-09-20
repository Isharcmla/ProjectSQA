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

public class Flat3Map_get_229621781731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146559;
     Object term146835;
     Object term147077;
     Object term147080;

    public Flat3Map_get_229621781731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146651 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146743 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term146559, term146559.getClass(), "delegateMap", null);
        setIntField(term146559, term146559.getClass(), "size", 3);
        setIntField(term146559, term146559.getClass(), "hash3", 0);
        setField(term146651, term146651.getClass(), "delegateMap", null);
        setIntField(term146651, term146651.getClass(), "size", 3);
        setField(term146651, term146651.getClass(), "key3", term146743);
        setField(term146651, term146651.getClass(), "key2", null);
        setField(term146651, term146651.getClass(), "value2", null);
        setField(term146559, term146559.getClass(), "key3", term146651);
        term146835 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146903 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setField(term146835, term146835.getClass(), "delegateMap", null);
        setIntField(term146835, term146835.getClass(), "size", 3);
        setIntField(term146835, term146835.getClass(), "hash3", 0);
        setField(term146835, term146835.getClass(), "value3", null);
        setIntField(term146835, term146835.getClass(), "hash2", 0);
        setField(term146835, term146835.getClass(), "value2", null);
        setIntField(term146835, term146835.getClass(), "hash1", 0);
        setField(term146835, term146835.getClass(), "value1", null);
        setField(term146835, term146835.getClass(), "key3", null);
        setField(term146835, term146835.getClass(), "key2", null);
        setField(term146835, term146835.getClass(), "key1", term146903);
        term147077 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147078 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147079 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term147077, term147077.getClass(), "size", 3);
        setIntField(term147077, term147077.getClass(), "hash1", 0);
        setIntField(term147077, term147077.getClass(), "hash2", 0);
        setIntField(term147077, term147077.getClass(), "hash3", 0);
        setField(term147077, term147077.getClass(), "key1", null);
        setField(term147077, term147077.getClass(), "key2", null);
        setIntField(term147078, term147078.getClass(), "size", 3);
        setIntField(term147078, term147078.getClass(), "hash1", 0);
        setIntField(term147078, term147078.getClass(), "hash2", 0);
        setIntField(term147078, term147078.getClass(), "hash3", 0);
        setField(term147078, term147078.getClass(), "key1", null);
        setField(term147078, term147078.getClass(), "key2", null);
        setIntField(term147079, term147079.getClass(), "size", 0);
        setIntField(term147079, term147079.getClass(), "hash1", 0);
        setIntField(term147079, term147079.getClass(), "hash2", 0);
        setIntField(term147079, term147079.getClass(), "hash3", 0);
        setField(term147079, term147079.getClass(), "key1", null);
        setField(term147079, term147079.getClass(), "key2", null);
        setField(term147079, term147079.getClass(), "key3", null);
        setField(term147079, term147079.getClass(), "value1", null);
        setField(term147079, term147079.getClass(), "value2", null);
        setField(term147079, term147079.getClass(), "value3", null);
        setField(term147079, term147079.getClass(), "delegateMap", null);
        setField(term147078, term147078.getClass(), "key3", term147079);
        setField(term147078, term147078.getClass(), "value1", null);
        setField(term147078, term147078.getClass(), "value2", null);
        setField(term147078, term147078.getClass(), "value3", null);
        setField(term147078, term147078.getClass(), "delegateMap", null);
        setField(term147077, term147077.getClass(), "key3", term147078);
        setField(term147077, term147077.getClass(), "value1", null);
        setField(term147077, term147077.getClass(), "value2", null);
        setField(term147077, term147077.getClass(), "value3", null);
        setField(term147077, term147077.getClass(), "delegateMap", null);
        term147080 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147081 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setIntField(term147080, term147080.getClass(), "size", 3);
        setIntField(term147080, term147080.getClass(), "hash1", 0);
        setIntField(term147080, term147080.getClass(), "hash2", 0);
        setIntField(term147080, term147080.getClass(), "hash3", 0);
        setField(term147081, term147081.getClass(), "buffer", null);
        setIntField(term147081, term147081.getClass(), "pos", 0);
        setIntField(term147081, term147081.getClass(), "count", 0);
        setField(term147080, term147080.getClass(), "key1", term147081);
        setField(term147080, term147080.getClass(), "key2", null);
        setField(term147080, term147080.getClass(), "key3", null);
        setField(term147080, term147080.getClass(), "value1", null);
        setField(term147080, term147080.getClass(), "value2", null);
        setField(term147080, term147080.getClass(), "value3", null);
        setField(term147080, term147080.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term146835;
        Object retValue = callMethod(klass, "get", argTypes, term146559, args);
        assertTrue(recursiveEquals(term146559, term147077));
        assertTrue(recursiveEquals(term146835, term147080));
        assertTrue(recursiveEquals(retValue, null));
    }

};

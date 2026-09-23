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

public class Flat3Map_put_1944740725340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56317;
     Object term56493;
     Object term56782;
     Object term56785;

    public Flat3Map_put_1944740725340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56317 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56355 = newInstance(Class.forName("java.lang.Object"));
        term56493 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term56317, term56317.getClass(), "delegateMap", null);
        setIntField(term56317, term56317.getClass(), "size", 3);
        setIntField(term56317, term56317.getClass(), "hash3", 0);
        setField(term56317, term56317.getClass(), "key3", term56355);
        setIntField(term56317, term56317.getClass(), "hash2", -1);
        setIntField(term56317, term56317.getClass(), "hash1", 0);
        setField(term56493, term56493.getClass(), "delegateMap", null);
        setIntField(term56493, term56493.getClass(), "size", 3);
        setIntField(term56493, term56493.getClass(), "hash3", 0);
        setField(term56493, term56493.getClass(), "value3", null);
        setIntField(term56493, term56493.getClass(), "hash2", 0);
        setField(term56493, term56493.getClass(), "value2", null);
        setIntField(term56493, term56493.getClass(), "hash1", 0);
        setField(term56493, term56493.getClass(), "value1", null);
        setField(term56317, term56317.getClass(), "key1", term56493);
        term56782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56783 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56784 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term56782, term56782.getClass(), "size", 3);
        setIntField(term56782, term56782.getClass(), "hash1", 0);
        setIntField(term56782, term56782.getClass(), "hash2", -1);
        setIntField(term56782, term56782.getClass(), "hash3", 0);
        setIntField(term56783, term56783.getClass(), "size", 3);
        setIntField(term56783, term56783.getClass(), "hash1", 0);
        setIntField(term56783, term56783.getClass(), "hash2", 0);
        setIntField(term56783, term56783.getClass(), "hash3", 0);
        setField(term56783, term56783.getClass(), "key1", null);
        setField(term56783, term56783.getClass(), "key2", null);
        setField(term56783, term56783.getClass(), "key3", null);
        setField(term56783, term56783.getClass(), "value1", null);
        setField(term56783, term56783.getClass(), "value2", null);
        setField(term56783, term56783.getClass(), "value3", null);
        setField(term56783, term56783.getClass(), "delegateMap", null);
        setField(term56782, term56782.getClass(), "key1", term56783);
        setField(term56782, term56782.getClass(), "key2", null);
        setField(term56782, term56782.getClass(), "key3", term56784);
        setField(term56782, term56782.getClass(), "value1", null);
        setField(term56782, term56782.getClass(), "value2", null);
        setField(term56782, term56782.getClass(), "value3", null);
        setField(term56782, term56782.getClass(), "delegateMap", null);
        term56785 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56785, term56785.getClass(), "size", 3);
        setIntField(term56785, term56785.getClass(), "hash1", 0);
        setIntField(term56785, term56785.getClass(), "hash2", 0);
        setIntField(term56785, term56785.getClass(), "hash3", 0);
        setField(term56785, term56785.getClass(), "key1", null);
        setField(term56785, term56785.getClass(), "key2", null);
        setField(term56785, term56785.getClass(), "key3", null);
        setField(term56785, term56785.getClass(), "value1", null);
        setField(term56785, term56785.getClass(), "value2", null);
        setField(term56785, term56785.getClass(), "value3", null);
        setField(term56785, term56785.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term56493;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term56317, args);
        assertTrue(recursiveEquals(term56317, term56782));
        assertTrue(recursiveEquals(term56493, term56785));
        assertTrue(recursiveEquals(retValue, null));
    }

};



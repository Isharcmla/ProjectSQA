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
import java.lang.Object;

public class Flat3Map_put_19447407251005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284302;
     Object term284596;

    public Flat3Map_put_19447407251005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284302 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term284394 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term284504 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term284302, term284302.getClass(), "delegateMap", null);
        setIntField(term284302, term284302.getClass(), "size", 3);
        setIntField(term284302, term284302.getClass(), "hash3", 0);
        setField(term284394, term284394.getClass(), "delegateMap", null);
        setIntField(term284394, term284394.getClass(), "size", 3);
        setField(term284394, term284394.getClass(), "key3", term284504);
        setField(term284394, term284394.getClass(), "key2", null);
        setField(term284394, term284394.getClass(), "value2", null);
        setIntField(term284394, term284394.getClass(), "hash3", -1);
        setIntField(term284394, term284394.getClass(), "hash2", -1);
        setField(term284302, term284302.getClass(), "key3", term284394);
        term284596 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term284688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term284596, term284596.getClass(), "delegateMap", null);
        setIntField(term284596, term284596.getClass(), "size", 3);
        setIntField(term284596, term284596.getClass(), "hash3", 0);
        setField(term284596, term284596.getClass(), "value3", null);
        setIntField(term284596, term284596.getClass(), "hash2", 0);
        setField(term284596, term284596.getClass(), "value2", null);
        setIntField(term284596, term284596.getClass(), "hash1", 0);
        setField(term284596, term284596.getClass(), "value1", null);
        setField(term284596, term284596.getClass(), "key3", null);
        setField(term284596, term284596.getClass(), "key2", null);
        setField(term284688, term284688.getClass(), "delegateMap", null);
        setIntField(term284688, term284688.getClass(), "size", 0);
        setField(term284596, term284596.getClass(), "key1", term284688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term284596;
        args[1] = null;
        callMethod(klass, "put", argTypes, term284302, args);
    }

};



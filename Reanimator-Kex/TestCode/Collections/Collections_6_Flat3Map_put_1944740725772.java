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

public class Flat3Map_put_1944740725772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196663;
     Object term197129;

    public Flat3Map_put_1944740725772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196755 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196853 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        Object term196945 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term197037 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term196663, term196663.getClass(), "delegateMap", null);
        setIntField(term196663, term196663.getClass(), "size", 3);
        setIntField(term196663, term196663.getClass(), "hash3", 0);
        setField(term196663, term196663.getClass(), "key3", null);
        setIntField(term196663, term196663.getClass(), "hash2", 0);
        setField(term196663, term196663.getClass(), "key2", null);
        setIntField(term196663, term196663.getClass(), "hash1", 0);
        setIntField(term196853, term196853.getClass(), "size", 0);
        setField(term196755, term196755.getClass(), "delegateMap", term196853);
        setField(term196663, term196663.getClass(), "key1", term196755);
        setField(term196663, term196663.getClass(), "value3", term196945);
        setField(term196663, term196663.getClass(), "value2", null);
        setField(term196663, term196663.getClass(), "value1", term197037);
        term197129 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term197229 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceMap"));
        setField(term197129, term197129.getClass(), "delegateMap", null);
        setIntField(term197129, term197129.getClass(), "size", 3);
        setIntField(term197129, term197129.getClass(), "hash3", 537411500);
        setField(term197129, term197129.getClass(), "value3", null);
        setIntField(term197129, term197129.getClass(), "hash2", 267894868);
        setField(term197129, term197129.getClass(), "value2", null);
        setIntField(term197129, term197129.getClass(), "hash1", -805306368);
        setIntField(term197229, term197229.getClass(), "size", 0);
        setField(term197129, term197129.getClass(), "value1", term197229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term197129;
        args[1] = null;
        callMethod(klass, "put", argTypes, term196663, args);
    }

};



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

public class Flat3Map_put_1944740725333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55571;
     Object term55619;
     Object term55632;
     Object term55634;

    public Flat3Map_put_1944740725333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55571 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term55571, term55571.getClass(), "delegateMap", null);
        setIntField(term55571, term55571.getClass(), "size", 2);
        term55619 = newInstance(Class.forName("java.util.Collections"));
        term55632 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55633 = newInstance(Class.forName("java.util.Collections"));
        setIntField(term55632, term55632.getClass(), "size", 3);
        setIntField(term55632, term55632.getClass(), "hash1", 0);
        setIntField(term55632, term55632.getClass(), "hash2", 0);
        setIntField(term55632, term55632.getClass(), "hash3", 1132364575);
        setField(term55632, term55632.getClass(), "key1", null);
        setField(term55632, term55632.getClass(), "key2", null);
        setField(term55632, term55632.getClass(), "key3", term55633);
        setField(term55632, term55632.getClass(), "value1", null);
        setField(term55632, term55632.getClass(), "value2", null);
        setField(term55632, term55632.getClass(), "value3", null);
        setField(term55632, term55632.getClass(), "delegateMap", null);
        term55634 = newInstance(Class.forName("java.util.Collections"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term55619;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term55571, args);
        assertTrue(recursiveEquals(term55571, term55632));
        assertTrue(recursiveEquals(term55619, term55634));
        assertTrue(recursiveEquals(retValue, null));
    }

};



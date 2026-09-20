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

public class Flat3Map_put_1944740725888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178791;
     Object term178921;
     Object term179773;
     Object term179776;

    public Flat3Map_put_1944740725888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178791 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178829 = newInstance(Class.forName("java.lang.Object"));
        setField(term178791, term178791.getClass(), "delegateMap", null);
        setIntField(term178791, term178791.getClass(), "size", 2);
        setIntField(term178791, term178791.getClass(), "hash2", 0);
        setField(term178791, term178791.getClass(), "key2", term178829);
        setIntField(term178791, term178791.getClass(), "hash1", -1);
        term178921 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term178921, term178921.getClass(), "delegateMap", null);
        setIntField(term178921, term178921.getClass(), "size", 2);
        setIntField(term178921, term178921.getClass(), "hash2", 0);
        setField(term178921, term178921.getClass(), "value2", null);
        setIntField(term178921, term178921.getClass(), "hash1", 0);
        setField(term178921, term178921.getClass(), "value1", null);
        term179773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179774 = newInstance(Class.forName("java.lang.Object"));
        Object term179775 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term179773, term179773.getClass(), "size", 3);
        setIntField(term179773, term179773.getClass(), "hash1", -1);
        setIntField(term179773, term179773.getClass(), "hash2", 0);
        setIntField(term179773, term179773.getClass(), "hash3", 0);
        setField(term179773, term179773.getClass(), "key1", null);
        setField(term179773, term179773.getClass(), "key2", term179774);
        setIntField(term179775, term179775.getClass(), "size", 2);
        setIntField(term179775, term179775.getClass(), "hash1", 0);
        setIntField(term179775, term179775.getClass(), "hash2", 0);
        setIntField(term179775, term179775.getClass(), "hash3", 0);
        setField(term179775, term179775.getClass(), "key1", null);
        setField(term179775, term179775.getClass(), "key2", null);
        setField(term179775, term179775.getClass(), "key3", null);
        setField(term179775, term179775.getClass(), "value1", null);
        setField(term179775, term179775.getClass(), "value2", null);
        setField(term179775, term179775.getClass(), "value3", null);
        setField(term179775, term179775.getClass(), "delegateMap", null);
        setField(term179773, term179773.getClass(), "key3", term179775);
        setField(term179773, term179773.getClass(), "value1", null);
        setField(term179773, term179773.getClass(), "value2", null);
        setField(term179773, term179773.getClass(), "value3", null);
        setField(term179773, term179773.getClass(), "delegateMap", null);
        term179776 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term179776, term179776.getClass(), "size", 2);
        setIntField(term179776, term179776.getClass(), "hash1", 0);
        setIntField(term179776, term179776.getClass(), "hash2", 0);
        setIntField(term179776, term179776.getClass(), "hash3", 0);
        setField(term179776, term179776.getClass(), "key1", null);
        setField(term179776, term179776.getClass(), "key2", null);
        setField(term179776, term179776.getClass(), "key3", null);
        setField(term179776, term179776.getClass(), "value1", null);
        setField(term179776, term179776.getClass(), "value2", null);
        setField(term179776, term179776.getClass(), "value3", null);
        setField(term179776, term179776.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term178921;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term178791, args);
        assertTrue(recursiveEquals(term178791, term179773));
        assertTrue(recursiveEquals(term178921, term179776));
        assertTrue(recursiveEquals(retValue, null));
    }

};

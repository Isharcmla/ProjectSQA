package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.HashMap;

public class DefaultKeyedValues_removeValue_46125998899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24269;
     Object term24373;
     Object term24392;
     Object term24394;

    public DefaultKeyedValues_removeValue_46125998899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24317 = new HashMap();
        term24269 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term24269, term24269.getClass(), "indexMap", term24317);
        term24373 = newInstance(Class.forName("java.nio.DirectIntBufferU"));
        HashMap term24393 = new HashMap();
        term24392 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term24392, term24392.getClass(), "keys", null);
        setField(term24392, term24392.getClass(), "values", null);
        setField(term24392, term24392.getClass(), "indexMap", term24393);
        term24394 = newInstance(Class.forName("java.nio.DirectIntBufferU"));
        setField(term24394, term24394.getClass(), "att", null);
        setField(term24394, term24394.getClass(), "hb", null);
        setIntField(term24394, term24394.getClass(), "offset", 0);
        setBooleanField(term24394, term24394.getClass(), "isReadOnly", false);
        setIntField(term24394, term24394.getClass(), "mark", 0);
        setIntField(term24394, term24394.getClass(), "position", 0);
        setIntField(term24394, term24394.getClass(), "limit", 0);
        setIntField(term24394, term24394.getClass(), "capacity", 0);
        setLongField(term24394, term24394.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term24373;
        callMethod(klass, "removeValue", argTypes, term24269, args);
        assertTrue(recursiveEquals(term24269, term24392));
        assertTrue(recursiveEquals(term24373, term24394));
    }

};



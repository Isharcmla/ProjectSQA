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

public class Flat3Map_remove_840690279940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188603;
     Object term188679;
     Object term188889;
     Object term188890;

    public Flat3Map_remove_840690279940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188603 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term188603, term188603.getClass(), "delegateMap", null);
        setIntField(term188603, term188603.getClass(), "size", 2);
        setIntField(term188603, term188603.getClass(), "hash2", 0);
        term188679 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        term188889 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term188889, term188889.getClass(), "size", 2);
        setIntField(term188889, term188889.getClass(), "hash1", 0);
        setIntField(term188889, term188889.getClass(), "hash2", 0);
        setIntField(term188889, term188889.getClass(), "hash3", 0);
        setField(term188889, term188889.getClass(), "key1", null);
        setField(term188889, term188889.getClass(), "key2", null);
        setField(term188889, term188889.getClass(), "key3", null);
        setField(term188889, term188889.getClass(), "value1", null);
        setField(term188889, term188889.getClass(), "value2", null);
        setField(term188889, term188889.getClass(), "value3", null);
        setField(term188889, term188889.getClass(), "delegateMap", null);
        term188890 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        setField(term188890, term188890.getClass(), "this$1", null);
        setField(term188890, term188890.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term188679;
        Object retValue = callMethod(klass, "remove", argTypes, term188603, args);
        assertTrue(recursiveEquals(term188603, term188889));
        assertTrue(recursiveEquals(term188679, term188890));
        assertTrue(recursiveEquals(retValue, null));
    }

};

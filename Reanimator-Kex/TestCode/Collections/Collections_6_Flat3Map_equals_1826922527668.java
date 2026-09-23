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

public class Flat3Map_equals_1826922527668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151722;
     Object term151948;
     Object term152583;
     Object term152585;

    public Flat3Map_equals_1826922527668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151722 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term151856 = newInstance(Class.forName("java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder"));
        setField(term151722, term151722.getClass(), "delegateMap", null);
        setIntField(term151722, term151722.getClass(), "size", 3);
        setField(term151722, term151722.getClass(), "key3", null);
        setField(term151722, term151722.getClass(), "value3", null);
        setField(term151722, term151722.getClass(), "key2", null);
        setField(term151722, term151722.getClass(), "value2", null);
        setField(term151722, term151722.getClass(), "key1", term151856);
        term151948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152082 = newInstance(Class.forName("java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder"));
        setField(term151948, term151948.getClass(), "delegateMap", null);
        setIntField(term151948, term151948.getClass(), "size", 3);
        setField(term151948, term151948.getClass(), "key3", term152082);
        setField(term151948, term151948.getClass(), "key2", null);
        setField(term151948, term151948.getClass(), "value2", null);
        term152583 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152584 = newInstance(Class.forName("java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder"));
        setIntField(term152583, term152583.getClass(), "size", 3);
        setIntField(term152583, term152583.getClass(), "hash1", 0);
        setIntField(term152583, term152583.getClass(), "hash2", 0);
        setIntField(term152583, term152583.getClass(), "hash3", 0);
        setField(term152583, term152583.getClass(), "key1", term152584);
        setField(term152583, term152583.getClass(), "key2", null);
        setField(term152583, term152583.getClass(), "key3", null);
        setField(term152583, term152583.getClass(), "value1", null);
        setField(term152583, term152583.getClass(), "value2", null);
        setField(term152583, term152583.getClass(), "value3", null);
        setField(term152583, term152583.getClass(), "delegateMap", null);
        term152585 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152586 = newInstance(Class.forName("java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder"));
        setIntField(term152585, term152585.getClass(), "size", 3);
        setIntField(term152585, term152585.getClass(), "hash1", 0);
        setIntField(term152585, term152585.getClass(), "hash2", 0);
        setIntField(term152585, term152585.getClass(), "hash3", 0);
        setField(term152585, term152585.getClass(), "key1", null);
        setField(term152585, term152585.getClass(), "key2", null);
        setField(term152585, term152585.getClass(), "key3", term152586);
        setField(term152585, term152585.getClass(), "value1", null);
        setField(term152585, term152585.getClass(), "value2", null);
        setField(term152585, term152585.getClass(), "value3", null);
        setField(term152585, term152585.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151948;
        Object retValue = callMethod(klass, "equals", argTypes, term151722, args);
        assertTrue(recursiveEquals(term151722, term152583));
        assertTrue(recursiveEquals(term151948, term152585));
        assertTrue(recursiveEquals(retValue, false));
    }

};



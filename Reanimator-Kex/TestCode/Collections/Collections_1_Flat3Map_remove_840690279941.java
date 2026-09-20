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

public class Flat3Map_remove_840690279941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188792;
     Object term188876;
     Object term188906;
     Object term188907;

    public Flat3Map_remove_840690279941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188792 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term188792, term188792.getClass(), "delegateMap", null);
        setIntField(term188792, term188792.getClass(), "size", 1073741824);
        term188876 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        term188906 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term188906, term188906.getClass(), "size", 1073741824);
        setIntField(term188906, term188906.getClass(), "hash1", 0);
        setIntField(term188906, term188906.getClass(), "hash2", 0);
        setIntField(term188906, term188906.getClass(), "hash3", 0);
        setField(term188906, term188906.getClass(), "key1", null);
        setField(term188906, term188906.getClass(), "key2", null);
        setField(term188906, term188906.getClass(), "key3", null);
        setField(term188906, term188906.getClass(), "value1", null);
        setField(term188906, term188906.getClass(), "value2", null);
        setField(term188906, term188906.getClass(), "value3", null);
        setField(term188906, term188906.getClass(), "delegateMap", null);
        term188907 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        setField(term188907, term188907.getClass(), "pattern", null);
        setField(term188907, term188907.getClass(), "filters", null);
        setLongField(term188907, term188907.getClass(), "maxStreamBytes", 0L);
        setLongField(term188907, term188907.getClass(), "maxDepth", 0L);
        setLongField(term188907, term188907.getClass(), "maxReferences", 0L);
        setLongField(term188907, term188907.getClass(), "maxArrayLength", 0L);
        setBooleanField(term188907, term188907.getClass(), "checkComponentType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term188876;
        Object retValue = callMethod(klass, "remove", argTypes, term188792, args);
        assertTrue(recursiveEquals(term188792, term188906));
        assertTrue(recursiveEquals(term188876, term188907));
        assertTrue(recursiveEquals(retValue, null));
    }

};

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

public class Flat3Map_remove_840690279813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165772;
     Object term165780;
     Object term165781;

    public Flat3Map_remove_840690279813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165772 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term165772, term165772.getClass(), "delegateMap", null);
        setIntField(term165772, term165772.getClass(), "size", 0);
        term165780 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165780, term165780.getClass(), "size", 0);
        setIntField(term165780, term165780.getClass(), "hash1", 0);
        setIntField(term165780, term165780.getClass(), "hash2", 0);
        setIntField(term165780, term165780.getClass(), "hash3", 0);
        setField(term165780, term165780.getClass(), "key1", null);
        setField(term165780, term165780.getClass(), "key2", null);
        setField(term165780, term165780.getClass(), "key3", null);
        setField(term165780, term165780.getClass(), "value1", null);
        setField(term165780, term165780.getClass(), "value2", null);
        setField(term165780, term165780.getClass(), "value3", null);
        setField(term165780, term165780.getClass(), "delegateMap", null);
        term165781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165781, term165781.getClass(), "size", 0);
        setIntField(term165781, term165781.getClass(), "hash1", 0);
        setIntField(term165781, term165781.getClass(), "hash2", 0);
        setIntField(term165781, term165781.getClass(), "hash3", 0);
        setField(term165781, term165781.getClass(), "key1", null);
        setField(term165781, term165781.getClass(), "key2", null);
        setField(term165781, term165781.getClass(), "key3", null);
        setField(term165781, term165781.getClass(), "value1", null);
        setField(term165781, term165781.getClass(), "value2", null);
        setField(term165781, term165781.getClass(), "value3", null);
        setField(term165781, term165781.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term165772;
        Object retValue = callMethod(klass, "remove", argTypes, term165772, args);
        assertTrue(recursiveEquals(term165772, term165780));
        assertTrue(recursiveEquals(term165772, term165781));
        assertTrue(recursiveEquals(retValue, null));
    }

};

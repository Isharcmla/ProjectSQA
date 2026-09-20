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

public class Flat3Map_remove_8406902791079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213819;
     Object term214791;
     Object term214792;

    public Flat3Map_remove_8406902791079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213819 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term213819, term213819.getClass(), "delegateMap", null);
        setIntField(term213819, term213819.getClass(), "size", 1);
        setIntField(term213819, term213819.getClass(), "hash1", 0);
        setField(term213819, term213819.getClass(), "value1", null);
        term214791 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term214791, term214791.getClass(), "size", 1);
        setIntField(term214791, term214791.getClass(), "hash1", 0);
        setIntField(term214791, term214791.getClass(), "hash2", 0);
        setIntField(term214791, term214791.getClass(), "hash3", 0);
        setField(term214791, term214791.getClass(), "key1", null);
        setField(term214791, term214791.getClass(), "key2", null);
        setField(term214791, term214791.getClass(), "key3", null);
        setField(term214791, term214791.getClass(), "value1", null);
        setField(term214791, term214791.getClass(), "value2", null);
        setField(term214791, term214791.getClass(), "value3", null);
        setField(term214791, term214791.getClass(), "delegateMap", null);
        term214792 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term214792, term214792.getClass(), "size", 1);
        setIntField(term214792, term214792.getClass(), "hash1", 0);
        setIntField(term214792, term214792.getClass(), "hash2", 0);
        setIntField(term214792, term214792.getClass(), "hash3", 0);
        setField(term214792, term214792.getClass(), "key1", null);
        setField(term214792, term214792.getClass(), "key2", null);
        setField(term214792, term214792.getClass(), "key3", null);
        setField(term214792, term214792.getClass(), "value1", null);
        setField(term214792, term214792.getClass(), "value2", null);
        setField(term214792, term214792.getClass(), "value3", null);
        setField(term214792, term214792.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term213819;
        Object retValue = callMethod(klass, "remove", argTypes, term213819, args);
        assertTrue(recursiveEquals(term213819, term214791));
        assertTrue(recursiveEquals(term213819, term214792));
        assertTrue(recursiveEquals(retValue, null));
    }

};

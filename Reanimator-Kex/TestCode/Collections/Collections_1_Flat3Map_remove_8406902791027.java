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

public class Flat3Map_remove_8406902791027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205588;
     Object term205686;
     Object term205814;
     Object term205815;

    public Flat3Map_remove_8406902791027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205588 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term205588, term205588.getClass(), "delegateMap", null);
        setIntField(term205588, term205588.getClass(), "size", 1);
        term205686 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        term205814 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term205814, term205814.getClass(), "size", 1);
        setIntField(term205814, term205814.getClass(), "hash1", 0);
        setIntField(term205814, term205814.getClass(), "hash2", 0);
        setIntField(term205814, term205814.getClass(), "hash3", 0);
        setField(term205814, term205814.getClass(), "key1", null);
        setField(term205814, term205814.getClass(), "key2", null);
        setField(term205814, term205814.getClass(), "key3", null);
        setField(term205814, term205814.getClass(), "value1", null);
        setField(term205814, term205814.getClass(), "value2", null);
        setField(term205814, term205814.getClass(), "value3", null);
        setField(term205814, term205814.getClass(), "delegateMap", null);
        term205815 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        setField(term205815, term205815.getClass(), "backtrace", null);
        setField(term205815, term205815.getClass(), "detailMessage", null);
        setField(term205815, term205815.getClass(), "cause", null);
        setField(term205815, term205815.getClass(), "stackTrace", null);
        setIntField(term205815, term205815.getClass(), "depth", 0);
        setField(term205815, term205815.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term205686;
        Object retValue = callMethod(klass, "remove", argTypes, term205588, args);
        assertTrue(recursiveEquals(term205588, term205814));
        assertTrue(recursiveEquals(term205686, term205815));
        assertTrue(recursiveEquals(retValue, null));
    }

};

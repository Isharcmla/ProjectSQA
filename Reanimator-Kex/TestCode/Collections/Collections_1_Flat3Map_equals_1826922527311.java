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

public class Flat3Map_equals_1826922527311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55823;
     Object term56047;
     Object term56088;
     Object term56090;

    public Flat3Map_equals_1826922527311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55823 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55935 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term55823, term55823.getClass(), "delegateMap", term55935);
        term56047 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term56088 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56089 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term56088, term56088.getClass(), "size", 0);
        setIntField(term56088, term56088.getClass(), "hash1", 0);
        setIntField(term56088, term56088.getClass(), "hash2", 0);
        setIntField(term56088, term56088.getClass(), "hash3", 0);
        setField(term56088, term56088.getClass(), "key1", null);
        setField(term56088, term56088.getClass(), "key2", null);
        setField(term56088, term56088.getClass(), "key3", null);
        setField(term56088, term56088.getClass(), "value1", null);
        setField(term56088, term56088.getClass(), "value2", null);
        setField(term56088, term56088.getClass(), "value3", null);
        setFloatField(term56089, term56089.getClass(), "loadFactor", 0.0F);
        setIntField(term56089, term56089.getClass(), "size", 0);
        setField(term56089, term56089.getClass(), "data", null);
        setIntField(term56089, term56089.getClass(), "threshold", 0);
        setIntField(term56089, term56089.getClass(), "modCount", 0);
        setField(term56089, term56089.getClass(), "entrySet", null);
        setField(term56089, term56089.getClass(), "keySet", null);
        setField(term56089, term56089.getClass(), "values", null);
        setField(term56089, term56089.getClass(), "keySet", null);
        setField(term56089, term56089.getClass(), "values", null);
        setField(term56088, term56088.getClass(), "delegateMap", term56089);
        term56090 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term56090, term56090.getClass(), "loadFactor", 0.0F);
        setIntField(term56090, term56090.getClass(), "size", 0);
        setField(term56090, term56090.getClass(), "data", null);
        setIntField(term56090, term56090.getClass(), "threshold", 0);
        setIntField(term56090, term56090.getClass(), "modCount", 0);
        setField(term56090, term56090.getClass(), "entrySet", null);
        setField(term56090, term56090.getClass(), "keySet", null);
        setField(term56090, term56090.getClass(), "values", null);
        setField(term56090, term56090.getClass(), "keySet", null);
        setField(term56090, term56090.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56047;
        Object retValue = callMethod(klass, "equals", argTypes, term55823, args);
        assertTrue(recursiveEquals(term55823, term56088));
        assertTrue(recursiveEquals(term56047, term56090));
        assertTrue(recursiveEquals(retValue, true));
    }

};

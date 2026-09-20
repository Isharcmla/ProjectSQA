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
import java.util.HashMap;

public class Flat3Map_equals_1826922527721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143610;
     Object term143750;
     Object term144785;
     Object term144788;

    public Flat3Map_equals_1826922527721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term143658 = new HashMap();
        term143610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term143610, term143610.getClass(), "delegateMap", null);
        setIntField(term143610, term143610.getClass(), "size", 3);
        setField(term143610, term143610.getClass(), "key3", null);
        setField(term143610, term143610.getClass(), "value3", null);
        setField(term143610, term143610.getClass(), "key2", term143658);
        HashMap term143798 = new HashMap();
        term143750 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term143750, term143750.getClass(), "delegateMap", null);
        setIntField(term143750, term143750.getClass(), "size", 3);
        setField(term143750, term143750.getClass(), "key3", term143798);
        setField(term143750, term143750.getClass(), "key2", null);
        setField(term143750, term143750.getClass(), "value2", null);
        HashMap term144786 = new HashMap();
        term144785 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term144785, term144785.getClass(), "size", 3);
        setIntField(term144785, term144785.getClass(), "hash1", 0);
        setIntField(term144785, term144785.getClass(), "hash2", 0);
        setIntField(term144785, term144785.getClass(), "hash3", 0);
        setField(term144785, term144785.getClass(), "key1", null);
        setField(term144785, term144785.getClass(), "key2", term144786);
        setField(term144785, term144785.getClass(), "key3", null);
        setField(term144785, term144785.getClass(), "value1", null);
        setField(term144785, term144785.getClass(), "value2", null);
        setField(term144785, term144785.getClass(), "value3", null);
        setField(term144785, term144785.getClass(), "delegateMap", null);
        HashMap term144789 = new HashMap();
        term144788 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term144788, term144788.getClass(), "size", 3);
        setIntField(term144788, term144788.getClass(), "hash1", 0);
        setIntField(term144788, term144788.getClass(), "hash2", 0);
        setIntField(term144788, term144788.getClass(), "hash3", 0);
        setField(term144788, term144788.getClass(), "key1", null);
        setField(term144788, term144788.getClass(), "key2", null);
        setField(term144788, term144788.getClass(), "key3", term144789);
        setField(term144788, term144788.getClass(), "value1", null);
        setField(term144788, term144788.getClass(), "value2", null);
        setField(term144788, term144788.getClass(), "value3", null);
        setField(term144788, term144788.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term143750;
        Object retValue = callMethod(klass, "equals", argTypes, term143610, args);
        assertTrue(recursiveEquals(term143610, term144785));
        assertTrue(recursiveEquals(term143750, term144788));
        assertTrue(recursiveEquals(retValue, true));
    }

};

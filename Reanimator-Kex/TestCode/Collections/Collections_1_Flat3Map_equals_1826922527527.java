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

public class Flat3Map_equals_1826922527527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100041;
     Object term100181;
     Object term100331;
     Object term100334;

    public Flat3Map_equals_1826922527527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term100253 = new HashMap();
        term100041 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term100041, term100041.getClass(), "delegateMap", null);
        setIntField(term100041, term100041.getClass(), "size", 2);
        setField(term100041, term100041.getClass(), "key2", term100253);
        HashMap term100229 = new HashMap();
        term100181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term100181, term100181.getClass(), "delegateMap", null);
        setIntField(term100181, term100181.getClass(), "size", 2);
        setIntField(term100181, term100181.getClass(), "hash2", 0);
        setField(term100181, term100181.getClass(), "key2", term100229);
        setIntField(term100181, term100181.getClass(), "hash1", 0);
        setField(term100181, term100181.getClass(), "key1", term100253);
        HashMap term100332 = new HashMap();
        term100331 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term100331, term100331.getClass(), "size", 2);
        setIntField(term100331, term100331.getClass(), "hash1", 0);
        setIntField(term100331, term100331.getClass(), "hash2", 0);
        setIntField(term100331, term100331.getClass(), "hash3", 0);
        setField(term100331, term100331.getClass(), "key1", null);
        setField(term100331, term100331.getClass(), "key2", term100332);
        setField(term100331, term100331.getClass(), "key3", null);
        setField(term100331, term100331.getClass(), "value1", null);
        setField(term100331, term100331.getClass(), "value2", null);
        setField(term100331, term100331.getClass(), "value3", null);
        setField(term100331, term100331.getClass(), "delegateMap", null);
        HashMap term100335 = new HashMap();
        HashMap term100337 = new HashMap();
        term100334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term100334, term100334.getClass(), "size", 2);
        setIntField(term100334, term100334.getClass(), "hash1", 0);
        setIntField(term100334, term100334.getClass(), "hash2", 0);
        setIntField(term100334, term100334.getClass(), "hash3", 0);
        setField(term100334, term100334.getClass(), "key1", term100335);
        setField(term100334, term100334.getClass(), "key2", term100337);
        setField(term100334, term100334.getClass(), "key3", null);
        setField(term100334, term100334.getClass(), "value1", null);
        setField(term100334, term100334.getClass(), "value2", null);
        setField(term100334, term100334.getClass(), "value3", null);
        setField(term100334, term100334.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100181;
        Object retValue = callMethod(klass, "equals", argTypes, term100041, args);
        assertTrue(recursiveEquals(term100041, term100331));
        assertTrue(recursiveEquals(term100181, term100334));
        assertTrue(recursiveEquals(retValue, false));
    }

};

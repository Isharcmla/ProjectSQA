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

public class Flat3Map_equals_1826922527246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43350;
     Object term43442;
     Object term43734;
     Object term43735;

    public Flat3Map_equals_1826922527246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43350 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term43350, term43350.getClass(), "delegateMap", null);
        setIntField(term43350, term43350.getClass(), "size", 1);
        setField(term43350, term43350.getClass(), "key1", null);
        setField(term43350, term43350.getClass(), "value1", null);
        HashMap term43490 = new HashMap();
        term43442 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term43442, term43442.getClass(), "delegateMap", null);
        setIntField(term43442, term43442.getClass(), "size", 1);
        setField(term43442, term43442.getClass(), "key1", null);
        setField(term43442, term43442.getClass(), "value1", term43490);
        term43734 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43734, term43734.getClass(), "size", 1);
        setIntField(term43734, term43734.getClass(), "hash1", 0);
        setIntField(term43734, term43734.getClass(), "hash2", 0);
        setIntField(term43734, term43734.getClass(), "hash3", 0);
        setField(term43734, term43734.getClass(), "key1", null);
        setField(term43734, term43734.getClass(), "key2", null);
        setField(term43734, term43734.getClass(), "key3", null);
        setField(term43734, term43734.getClass(), "value1", null);
        setField(term43734, term43734.getClass(), "value2", null);
        setField(term43734, term43734.getClass(), "value3", null);
        setField(term43734, term43734.getClass(), "delegateMap", null);
        HashMap term43736 = new HashMap();
        term43735 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43735, term43735.getClass(), "size", 1);
        setIntField(term43735, term43735.getClass(), "hash1", 0);
        setIntField(term43735, term43735.getClass(), "hash2", 0);
        setIntField(term43735, term43735.getClass(), "hash3", 0);
        setField(term43735, term43735.getClass(), "key1", null);
        setField(term43735, term43735.getClass(), "key2", null);
        setField(term43735, term43735.getClass(), "key3", null);
        setField(term43735, term43735.getClass(), "value1", term43736);
        setField(term43735, term43735.getClass(), "value2", null);
        setField(term43735, term43735.getClass(), "value3", null);
        setField(term43735, term43735.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43442;
        Object retValue = callMethod(klass, "equals", argTypes, term43350, args);
        assertTrue(recursiveEquals(term43350, term43734));
        assertTrue(recursiveEquals(term43442, term43735));
        assertTrue(recursiveEquals(retValue, false));
    }

};

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
import java.lang.String;

public class Flat3Map_put_1944740725804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202250;
     Object term202566;
     Object term213670;

    public Flat3Map_put_1944740725804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202250 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term202342 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term202436 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term202474 = newInstance(Class.forName("java.lang.Object"));
        setField(term202250, term202250.getClass(), "delegateMap", null);
        setIntField(term202250, term202250.getClass(), "size", 3);
        setIntField(term202250, term202250.getClass(), "hash3", -527365799);
        setField(term202250, term202250.getClass(), "key3", null);
        setIntField(term202250, term202250.getClass(), "hash2", -527365799);
        setField(term202250, term202250.getClass(), "key2", null);
        setIntField(term202250, term202250.getClass(), "hash1", -527365799);
        setIntField(term202436, term202436.getClass(), "size", 0);
        setField(term202342, term202342.getClass(), "delegateMap", term202436);
        setField(term202250, term202250.getClass(), "key1", term202342);
        setField(term202250, term202250.getClass(), "value3", null);
        setField(term202250, term202250.getClass(), "value2", null);
        setField(term202250, term202250.getClass(), "value1", term202474);
        term202566 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term202676 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term202566, term202566.getClass(), "delegateMap", null);
        setIntField(term202566, term202566.getClass(), "size", 3);
        setIntField(term202566, term202566.getClass(), "hash3", -1900011239);
        setField(term202566, term202566.getClass(), "value3", null);
        setIntField(term202566, term202566.getClass(), "hash2", 29403168);
        setField(term202566, term202566.getClass(), "value2", null);
        setIntField(term202566, term202566.getClass(), "hash1", 1343242272);
        setIntField(term202676, term202676.getClass(), "size", 0);
        setField(term202566, term202566.getClass(), "value1", term202676);
        term213670 = Class.forName((String) "java.util.stream.SpinedBuffer$OfLong$1Splitr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term202566;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term202250, args);
        assertTrue(recursiveEquals(term202250, term213670));
        assertTrue(recursiveEquals(term202566, 34363745832L));
        assertTrue(recursiveEquals(retValue, null));
    }

};



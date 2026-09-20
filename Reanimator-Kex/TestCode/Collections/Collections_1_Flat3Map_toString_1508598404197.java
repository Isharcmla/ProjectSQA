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

public class Flat3Map_toString_1508598404197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33568;
     Object term33682;

    public Flat3Map_toString_1508598404197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33568 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term33568, term33568.getClass(), "delegateMap", null);
        setIntField(term33568, term33568.getClass(), "size", 2);
        setField(term33568, term33568.getClass(), "key2", "");
        setField(term33568, term33568.getClass(), "value2", term33568);
        term33682 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term33682, term33682.getClass(), "size", 2);
        setIntField(term33682, term33682.getClass(), "hash1", 0);
        setIntField(term33682, term33682.getClass(), "hash2", 0);
        setIntField(term33682, term33682.getClass(), "hash3", 0);
        setField(term33682, term33682.getClass(), "key1", null);
        setField(term33682, term33682.getClass(), "key2", "");
        setField(term33682, term33682.getClass(), "key3", null);
        setField(term33682, term33682.getClass(), "value1", null);
        setField(term33682, term33682.getClass(), "value2", term33682);
        setField(term33682, term33682.getClass(), "value3", null);
        setField(term33682, term33682.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term33568, args);
        assertTrue(recursiveEquals(term33568, term33682));
        assertTrue(recursiveEquals(retValue, "{=(this Map),null=null}"));
    }

};

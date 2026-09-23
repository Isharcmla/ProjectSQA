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

public class Flat3Map_toString_1508598404230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38080;
     Object term38375;

    public Flat3Map_toString_1508598404230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38080 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38080, term38080.getClass(), "delegateMap", null);
        setIntField(term38080, term38080.getClass(), "size", 3);
        setField(term38080, term38080.getClass(), "key3", "");
        setField(term38080, term38080.getClass(), "value3", term38080);
        term38375 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term38375, term38375.getClass(), "size", 3);
        setIntField(term38375, term38375.getClass(), "hash1", 0);
        setIntField(term38375, term38375.getClass(), "hash2", 0);
        setIntField(term38375, term38375.getClass(), "hash3", 0);
        setField(term38375, term38375.getClass(), "key1", null);
        setField(term38375, term38375.getClass(), "key2", null);
        setField(term38375, term38375.getClass(), "key3", "");
        setField(term38375, term38375.getClass(), "value1", null);
        setField(term38375, term38375.getClass(), "value2", null);
        setField(term38375, term38375.getClass(), "value3", term38375);
        setField(term38375, term38375.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term38080, args);
        assertTrue(recursiveEquals(term38080, term38375));
        assertTrue(recursiveEquals(retValue, "{=(this Map),null=null,null=null}"));
    }

};



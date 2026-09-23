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
import java.lang.Object;
import java.util.HashMap;

public class Flat3Map_put_1944740725706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171393;
     Object term171701;

    public Flat3Map_put_1944740725706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term171571 = new HashMap();
        term171393 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171485 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171523 = newInstance(Class.forName("java.lang.Object"));
        Object term171609 = newInstance(Class.forName("java.lang.Object"));
        setField(term171393, term171393.getClass(), "delegateMap", null);
        setIntField(term171393, term171393.getClass(), "size", 3);
        setIntField(term171393, term171393.getClass(), "hash3", 1732511306);
        setField(term171485, term171485.getClass(), "delegateMap", null);
        setIntField(term171485, term171485.getClass(), "size", 3);
        setField(term171485, term171485.getClass(), "key3", term171523);
        setField(term171485, term171485.getClass(), "key2", null);
        setField(term171485, term171485.getClass(), "value2", null);
        setIntField(term171485, term171485.getClass(), "hash3", 33685569);
        setIntField(term171485, term171485.getClass(), "hash2", -1916792640);
        setIntField(term171485, term171485.getClass(), "hash1", -1810757360);
        setField(term171485, term171485.getClass(), "value3", null);
        setField(term171485, term171485.getClass(), "value1", null);
        setField(term171393, term171393.getClass(), "key3", term171485);
        setIntField(term171393, term171393.getClass(), "hash2", 1732511306);
        setField(term171393, term171393.getClass(), "key2", null);
        setIntField(term171393, term171393.getClass(), "hash1", 1732511306);
        setField(term171393, term171393.getClass(), "key1", null);
        setField(term171393, term171393.getClass(), "value3", null);
        setField(term171393, term171393.getClass(), "value2", term171571);
        setField(term171393, term171393.getClass(), "value1", term171609);
        term171701 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171741 = newInstance(Class.forName("java.io.Console$1"));
        setField(term171701, term171701.getClass(), "delegateMap", null);
        setIntField(term171701, term171701.getClass(), "size", 3);
        setIntField(term171701, term171701.getClass(), "hash3", 995234570);
        setField(term171701, term171701.getClass(), "value3", null);
        setIntField(term171701, term171701.getClass(), "hash2", -907005952);
        setField(term171701, term171701.getClass(), "value2", null);
        setIntField(term171701, term171701.getClass(), "hash1", 1644282688);
        setField(term171701, term171701.getClass(), "value1", null);
        setField(term171701, term171701.getClass(), "key3", null);
        setField(term171701, term171701.getClass(), "key2", term171741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term171701;
        args[1] = null;
        callMethod(klass, "put", argTypes, term171393, args);
    }

};



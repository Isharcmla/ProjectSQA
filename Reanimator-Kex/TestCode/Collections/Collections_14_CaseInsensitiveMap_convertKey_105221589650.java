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

public class CaseInsensitiveMap_convertKey_105221589650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9656;
     Object term9728;
     Object term10547;
     Object term10548;

    public CaseInsensitiveMap_convertKey_105221589650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9656 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term9728 = newInstance(Class.forName("java.util.stream.LongPipeline$3$1"));
        term10547 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term10547, term10547.getClass(), "loadFactor", 0.0F);
        setIntField(term10547, term10547.getClass(), "size", 0);
        setField(term10547, term10547.getClass(), "data", null);
        setIntField(term10547, term10547.getClass(), "threshold", 0);
        setIntField(term10547, term10547.getClass(), "modCount", 0);
        setField(term10547, term10547.getClass(), "entrySet", null);
        setField(term10547, term10547.getClass(), "keySet", null);
        setField(term10547, term10547.getClass(), "values", null);
        setField(term10547, term10547.getClass(), "keySet", null);
        setField(term10547, term10547.getClass(), "values", null);
        term10548 = newInstance(Class.forName("java.util.stream.LongPipeline$3$1"));
        setField(term10548, term10548.getClass(), "this$1", null);
        setField(term10548, term10548.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9728;
        Object retValue = callMethod(klass, "convertKey", argTypes, term9656, args);
        assertTrue(recursiveEquals(term9656, term10547));
        assertTrue(recursiveEquals(term9728, term10548));
        assertTrue(recursiveEquals(retValue, "java.util.stream.longpipeline$3$1@60f97864"));
    }

};



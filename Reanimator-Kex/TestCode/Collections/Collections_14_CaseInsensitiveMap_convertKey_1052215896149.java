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

public class CaseInsensitiveMap_convertKey_1052215896149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27635;
     Object term27727;
     Object term27789;
     Object term27790;

    public CaseInsensitiveMap_convertKey_1052215896149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27635 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term27727 = newInstance(Class.forName("java.lang.invoke.InvokerBytecodeGenerator$1"));
        term27789 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term27789, term27789.getClass(), "loadFactor", 0.0F);
        setIntField(term27789, term27789.getClass(), "size", 0);
        setField(term27789, term27789.getClass(), "data", null);
        setIntField(term27789, term27789.getClass(), "threshold", 0);
        setIntField(term27789, term27789.getClass(), "modCount", 0);
        setField(term27789, term27789.getClass(), "entrySet", null);
        setField(term27789, term27789.getClass(), "keySet", null);
        setField(term27789, term27789.getClass(), "values", null);
        setField(term27789, term27789.getClass(), "keySet", null);
        setField(term27789, term27789.getClass(), "values", null);
        term27790 = newInstance(Class.forName("java.lang.invoke.InvokerBytecodeGenerator$1"));
        setField(term27790, term27790.getClass(), "val$className", null);
        setField(term27790, term27790.getClass(), "val$classFile", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27727;
        Object retValue = callMethod(klass, "convertKey", argTypes, term27635, args);
        assertTrue(recursiveEquals(term27635, term27789));
        assertTrue(recursiveEquals(term27727, term27790));
        assertTrue(recursiveEquals(retValue, "java.lang.invoke.invokerbytecodegenerator$1@72d0eeef"));
    }

};



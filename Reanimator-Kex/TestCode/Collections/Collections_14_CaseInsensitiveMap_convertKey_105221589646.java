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

public class CaseInsensitiveMap_convertKey_105221589646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9066;
     Object term9184;
     Object term10289;
     Object term10291;
     Object term10292;

    public CaseInsensitiveMap_convertKey_105221589646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9066 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term9184 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        term10289 = newInstance(Class.forName("org.apache.commons.collections.buffer.BoundedFifoBuffer$1"));
        Object term10290 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setIntField(term10289, term10289.getClass(), "index", 0);
        setIntField(term10289, term10289.getClass(), "lastReturnedIndex", -1);
        setBooleanField(term10289, term10289.getClass(), "isFirst", false);
        setField(term10290, term10290.getClass(), "elements", null);
        setIntField(term10290, term10290.getClass(), "start", 0);
        setIntField(term10290, term10290.getClass(), "end", 0);
        setBooleanField(term10290, term10290.getClass(), "full", false);
        setIntField(term10290, term10290.getClass(), "maxElements", 0);
        setField(term10289, term10289.getClass(), "this$0", term10290);
        term10291 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setField(term10291, term10291.getClass(), "elements", null);
        setIntField(term10291, term10291.getClass(), "start", 0);
        setIntField(term10291, term10291.getClass(), "end", 0);
        setBooleanField(term10291, term10291.getClass(), "full", false);
        setIntField(term10291, term10291.getClass(), "maxElements", 0);
        term10292 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setField(term10292, term10292.getClass(), "elements", null);
        setIntField(term10292, term10292.getClass(), "start", 0);
        setIntField(term10292, term10292.getClass(), "end", 0);
        setBooleanField(term10292, term10292.getClass(), "full", false);
        setIntField(term10292, term10292.getClass(), "maxElements", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9184;
        Object retValue = callMethod(klass, "convertKey", argTypes, term9066, args);
        assertTrue(recursiveEquals(term9066, term10289));
        assertTrue(recursiveEquals(term9184, term10291));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};



package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;

public class MultiKey_equals_169725075533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1868;
     Object term1972;
     Object term1978;
     Object term1979;

    public MultiKey_equals_169725075533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1868 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        term1972 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        term1978 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term1978, term1978.getClass(), "keys", null);
        term1979 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term1979, term1979.getClass(), "keys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1972;
        Object retValue = callMethod(klass, "equals", argTypes, term1868, args);
        assertTrue(recursiveEquals(term1868, term1978));
        assertTrue(recursiveEquals(term1972, term1979));
        assertTrue(recursiveEquals(retValue, true));
    }

};



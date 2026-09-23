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

public class MultiKey_equals_169725075530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1241;
     Object term1357;
     Object term1358;

    public MultiKey_equals_169725075530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1241 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        term1357 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term1357, term1357.getClass(), "keys", null);
        term1358 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term1358, term1358.getClass(), "keys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1241;
        Object retValue = callMethod(klass, "equals", argTypes, term1241, args);
        assertTrue(recursiveEquals(term1241, term1357));
        assertTrue(recursiveEquals(term1241, term1358));
        assertTrue(recursiveEquals(retValue, true));
    }

};



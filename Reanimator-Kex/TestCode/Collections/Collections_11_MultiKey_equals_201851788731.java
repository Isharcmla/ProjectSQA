package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;

public class MultiKey_equals_201851788731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1720;
     Object term1822;
     Object term1828;
     Object term1829;

    public MultiKey_equals_201851788731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1720 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        term1822 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        term1828 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term1828, term1828.getClass(), "keys", null);
        term1829 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term1829, term1829.getClass(), "keys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1822;
        Object retValue = callMethod(klass, "equals", argTypes, term1720, args);
        assertTrue(recursiveEquals(term1720, term1828));
        assertTrue(recursiveEquals(term1822, term1829));
        assertTrue(recursiveEquals(retValue, true));
    }

};



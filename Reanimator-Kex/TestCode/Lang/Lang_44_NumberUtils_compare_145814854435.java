package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Float;

public class NumberUtils_compare_145814854435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251;
     Object term253;

    public NumberUtils_compare_145814854435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251 = new Float(0.13238746F);
        term253 = new Float(0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term251;
        args[1] = term253;
        Object retValue = callMethod(klass, "compare", argTypes, null, args);
        assertTrue(recursiveEquals(term251, 0.13238746F));
        assertTrue(recursiveEquals(term253, 0.2707036F));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



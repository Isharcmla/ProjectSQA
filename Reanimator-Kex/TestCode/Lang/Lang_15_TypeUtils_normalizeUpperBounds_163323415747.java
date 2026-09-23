package org.apache.commons.lang3.reflect;

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
import static org.apache.commons.lang3.reflect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.reflect.EqualityUtils.*;
import java.lang.Object;

public class TypeUtils_normalizeUpperBounds_163323415747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term2284;
     Object term2282;

    public TypeUtils_normalizeUpperBounds_163323415747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98 = (Object[]) newArray("java.lang.reflect.Type", 3);
        term2284 = (Object[]) newArray("java.lang.reflect.Type", 3);
        term2282 = (Object[]) newArray("java.lang.reflect.Type", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98;
        Object retValue = callMethod(klass, "normalizeUpperBounds", argTypes, null, args);
        assertTrue(recursiveEquals(term98, term2284));
        assertTrue(recursiveEquals(retValue, term2282));
    }

};



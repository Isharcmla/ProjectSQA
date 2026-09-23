package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class BigMatrixImpl_getColumnMatrix_737863698245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92504;
     Object term96953;

    public BigMatrixImpl_getColumnMatrix_737863698245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92504 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term92388 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term92389 = (Object[]) newArray("java.math.BigDecimal", 1);
        setElement(term92388, 0, term92389);
        setField(term92504, term92504.getClass(), "data", term92388);
        term96953 = Class.forName((String) "java.nio.channels.FileChannel$MapMode");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getColumnMatrix", argTypes, term92504, args);
        assertTrue(recursiveEquals(retValue, 6029312));
    }

};



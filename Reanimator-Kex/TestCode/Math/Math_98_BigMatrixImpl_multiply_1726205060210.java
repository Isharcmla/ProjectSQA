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
import java.lang.Object;

public class BigMatrixImpl_multiply_1726205060210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92175;
     Object term92269;

    public BigMatrixImpl_multiply_1726205060210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92175 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term92058 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term92059 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term92058, 0, term92059);
        setField(term92175, term92175.getClass(), "data", term92058);
        term92269 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term92060 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        setField(term92269, term92269.getClass(), "data", term92060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Object[] args = new Object[1];
        args[0] = term92269;
        callMethod(klass, "multiply", argTypes, term92175, args);
    }

};



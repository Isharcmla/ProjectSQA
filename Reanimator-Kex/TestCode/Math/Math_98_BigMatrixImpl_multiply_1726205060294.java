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

public class BigMatrixImpl_multiply_1726205060294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101341;
     Object term101435;

    public BigMatrixImpl_multiply_1726205060294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101341 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term101220 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term101221 = (Object[]) newArray("java.math.BigDecimal", 1);
        setElement(term101220, 0, term101221);
        setField(term101341, term101341.getClass(), "data", term101220);
        term101435 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term101222 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term101223 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term101222, 0, term101223);
        setField(term101435, term101435.getClass(), "data", term101222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Object[] args = new Object[1];
        args[0] = term101435;
        callMethod(klass, "multiply", argTypes, term101341, args);
    }

};



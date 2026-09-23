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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_subtract_542426484281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100358;
     Object term100498;

    public BigMatrixImpl_subtract_542426484281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100358 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term100241 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term100242 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term100404 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term100244 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term100242, 0, term100404);
        setElement(term100241, 0, term100242);
        setElement(term100241, 1, term100244);
        setField(term100358, term100358.getClass(), "data", term100241);
        term100498 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        setField(term100498, term100498.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Object[] args = new Object[1];
        args[0] = term100498;
        try {
            callMethod(klass, "subtract", argTypes, term100358, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



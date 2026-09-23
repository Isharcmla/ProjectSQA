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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_getLUMatrix_1437168255338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111019;

    public BigMatrixImpl_getLUMatrix_1437168255338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111019 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term110870 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 4);
        Object[] term110871 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term111065 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term110873 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term111111 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term110875 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term111157 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term110877 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term111203 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term110871, 0, term111065);
        setElement(term110870, 0, term110871);
        setElement(term110873, 0, term111111);
        setElement(term110870, 1, term110873);
        setElement(term110875, 0, term111157);
        setElement(term110870, 2, term110875);
        setElement(term110877, 0, term111203);
        setElement(term110870, 3, term110877);
        setField(term111019, term111019.getClass(), "lu", term110870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLUMatrix", argTypes, term111019, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



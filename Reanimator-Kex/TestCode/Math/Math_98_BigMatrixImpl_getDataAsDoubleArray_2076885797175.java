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

public class BigMatrixImpl_getDataAsDoubleArray_2076885797175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85835;

    public BigMatrixImpl_getDataAsDoubleArray_2076885797175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85835 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term85711 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term85712 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term85713 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term85711, 0, term85712);
        setElement(term85711, 1, term85713);
        setField(term85835, term85835.getClass(), "data", term85711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAsDoubleArray", argTypes, term85835, args);
    }

};



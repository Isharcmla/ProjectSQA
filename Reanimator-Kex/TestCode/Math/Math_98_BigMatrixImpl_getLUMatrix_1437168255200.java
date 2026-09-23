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

public class BigMatrixImpl_getLUMatrix_1437168255200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90040;

    public BigMatrixImpl_getLUMatrix_1437168255200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90040 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term89907 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term89908 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term89909 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term90086 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term89907, 0, term89908);
        setElement(term89909, 0, term90086);
        setElement(term89907, 1, term89909);
        setField(term90040, term90040.getClass(), "lu", term89907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLUMatrix", argTypes, term90040, args);
    }

};



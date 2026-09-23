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

public class BigMatrixImpl_operate_198278436222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94206;
     Object term94090;

    public BigMatrixImpl_operate_198278436222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94206 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term94091 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term94092 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term94093 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term94091, 0, term94092);
        setElement(term94091, 1, term94093);
        setField(term94206, term94206.getClass(), "data", term94091);
        term94090 = (Object[]) newArray("java.math.BigDecimal", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term94090;
        callMethod(klass, "operate", argTypes, term94206, args);
    }

};



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

public class BigMatrixImpl_operate_198278436321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107741;
     Object term107597;

    public BigMatrixImpl_operate_198278436321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107741 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term107598 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term107599 = (Object[]) newArray("java.math.BigDecimal", 512);
        Object term107787 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term107833 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term107599, 0, term107787);
        setElement(term107599, 256, term107833);
        setElement(term107598, 0, term107599);
        setField(term107741, term107741.getClass(), "data", term107598);
        term107597 = (Object[]) newArray("java.math.BigDecimal", 512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term107597;
        callMethod(klass, "operate", argTypes, term107741, args);
    }

};



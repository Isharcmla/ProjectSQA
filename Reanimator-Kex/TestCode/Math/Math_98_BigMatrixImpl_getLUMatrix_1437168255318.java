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

public class BigMatrixImpl_getLUMatrix_1437168255318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107353;

    public BigMatrixImpl_getLUMatrix_1437168255318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107353 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term107212 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 4);
        Object[] term107213 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term107214 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term107215 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term107216 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term107212, 0, term107213);
        setElement(term107212, 1, term107214);
        setElement(term107212, 2, term107215);
        setElement(term107212, 3, term107216);
        setField(term107353, term107353.getClass(), "lu", term107212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLUMatrix", argTypes, term107353, args);
    }

};



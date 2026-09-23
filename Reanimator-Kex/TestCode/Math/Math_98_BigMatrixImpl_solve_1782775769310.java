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

public class BigMatrixImpl_solve_1782775769310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105729;
     Object term105465;

    public BigMatrixImpl_solve_1782775769310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105729 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term105508 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 9);
        Object[] term105509 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term105510 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term105511 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term105512 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term105513 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term105514 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term105508, 0, term105509);
        setElement(term105508, 1, term105510);
        setElement(term105508, 2, term105511);
        setElement(term105508, 3, term105509);
        setElement(term105508, 4, term105512);
        setElement(term105508, 5, term105509);
        setElement(term105508, 6, term105513);
        setElement(term105508, 7, term105514);
        setElement(term105508, 8, term105511);
        setField(term105729, term105729.getClass(), "data", term105508);
        term105465 = (double[]) newDoubleArray(9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term105465;
        callMethod(klass, "solve", argTypes, term105729, args);
    }

};



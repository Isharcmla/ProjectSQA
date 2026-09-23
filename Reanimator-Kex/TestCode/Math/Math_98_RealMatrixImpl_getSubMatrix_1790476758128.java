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

public class RealMatrixImpl_getSubMatrix_1790476758128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79528;
     Object term79384;
     Object term79386;

    public RealMatrixImpl_getSubMatrix_1790476758128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79528 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term79396 = (Object[]) newArray("[D", 1);
        setField(term79528, term79528.getClass(), "data", term79396);
        term79384 = (int[]) newIntArray(1);
        setIntElement(term79384, 0, 1073741824);
        term79386 = (int[]) newIntArray(8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term79384;
        args[1] = term79386;
        callMethod(klass, "getSubMatrix", argTypes, term79528, args);
    }

};



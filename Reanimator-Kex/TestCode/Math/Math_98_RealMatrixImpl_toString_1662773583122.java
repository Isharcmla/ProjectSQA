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

public class RealMatrixImpl_toString_1662773583122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78060;

    public RealMatrixImpl_toString_1662773583122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78060 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term75601 = (Object[]) newArray("[D", 3);
        double[] term75602 = (double[]) newDoubleArray(6);
        double[] term75609 = (double[]) newDoubleArray(12);
        double[] term75622 = (double[]) newDoubleArray(256);
        setElement(term75601, 0, term75602);
        setElement(term75601, 1, term75609);
        setElement(term75601, 2, term75622);
        setField(term78060, term78060.getClass(), "data", term75601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term78060, args);
    }

};



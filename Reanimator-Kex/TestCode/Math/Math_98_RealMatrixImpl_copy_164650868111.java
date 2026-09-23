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

public class RealMatrixImpl_copy_164650868111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58358;

    public RealMatrixImpl_copy_164650868111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58358 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term57509 = (Object[]) newArray("[D", 6);
        double[] term57510 = (double[]) newDoubleArray(144);
        double[] term57655 = (double[]) newDoubleArray(2);
        double[] term57658 = (double[]) newDoubleArray(18);
        double[] term57677 = (double[]) newDoubleArray(1);
        double[] term57679 = (double[]) newDoubleArray(9);
        setElement(term57509, 0, term57510);
        setElement(term57509, 1, term57655);
        setElement(term57509, 2, term57658);
        setElement(term57509, 3, term57677);
        setElement(term57509, 4, term57679);
        setField(term58358, term58358.getClass(), "data", term57509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term58358, args);
    }

};



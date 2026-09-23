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

public class RealMatrixImpl_copy_164650868142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31842;

    public RealMatrixImpl_copy_164650868142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31842 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term28037 = (Object[]) newArray("[D", 5);
        double[] term28038 = (double[]) newDoubleArray(156);
        double[] term28195 = (double[]) newDoubleArray(9);
        double[] term28205 = (double[]) newDoubleArray(10);
        double[] term28216 = (double[]) newDoubleArray(492);
        double[] term28709 = (double[]) newDoubleArray(489);
        setElement(term28037, 0, term28038);
        setElement(term28037, 1, term28195);
        setElement(term28037, 2, term28205);
        setElement(term28037, 3, term28216);
        setElement(term28037, 4, term28709);
        setField(term31842, term31842.getClass(), "data", term28037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "copy", argTypes, term31842, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



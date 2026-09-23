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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class RealMatrixImpl_init_84873431350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term63;

    public RealMatrixImpl_init_84873431350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = (Object[]) newArray("[D", 2);
        double[] term48 = (double[]) newDoubleArray(6);
        double[] term55 = (double[]) newDoubleArray(7);
        setDoubleElement(term48, 0, 0.6436713023569729);
        setDoubleElement(term48, 1, 0.7332741045694002);
        setDoubleElement(term48, 2, 0.4569171842750229);
        setDoubleElement(term48, 3, 0.8598297828918529);
        setDoubleElement(term48, 4, 0.43692187681405226);
        setDoubleElement(term48, 5, 0.7633268466829064);
        setElement(term47, 0, term48);
        setDoubleElement(term55, 0, 0.13481025392611334);
        setDoubleElement(term55, 1, 0.3800088629986428);
        setDoubleElement(term55, 2, 0.5840714198152577);
        setDoubleElement(term55, 3, 0.7559240768573477);
        setDoubleElement(term55, 4, 0.10667076642995188);
        setDoubleElement(term55, 5, 0.11493000848982304);
        setDoubleElement(term55, 6, 0.37161417339133307);
        setElement(term47, 1, term55);
        term63 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term47;
        args[1] = term63;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class EigenDecompositionImpl_computeShiftIncrement_634567364138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49389;

    public EigenDecompositionImpl_computeShiftIncrement_634567364138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49389 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term48763 = (double[]) newDoubleArray(489);
        setDoubleField(term49389, term49389.getClass(), "dMin", 4.5079976738816E15);
        setIntField(term49389, term49389.getClass(), "pingPong", 0);
        setDoubleField(term49389, term49389.getClass(), "dMin2", -9.2166166374137201E18);
        setDoubleField(term49389, term49389.getClass(), "dN2", -9.2166166374137201E18);
        setField(term49389, term49389.getClass(), "work", term48763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = 2;
        try {
            callMethod(klass, "computeShiftIncrement", argTypes, term49389, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



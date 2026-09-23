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

public class EigenDecompositionImpl_goodStep_1467100277126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46048;

    public EigenDecompositionImpl_goodStep_1467100277126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46048 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term45906 = (double[]) newDoubleArray(0);
        setDoubleField(term46048, term46048.getClass(), "g", 0.0);
        setIntField(term46048, term46048.getClass(), "pingPong", 0);
        setField(term46048, term46048.getClass(), "work", term45906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 262142;
        args[1] = 262144;
        try {
            callMethod(klass, "goodStep", argTypes, term46048, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



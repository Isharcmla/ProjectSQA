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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SingularValueDecompositionImpl_getCovariance_191630612548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16341;

    public SingularValueDecompositionImpl_getCovariance_191630612548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16341 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term16124 = (double[]) newDoubleArray(5);
        setDoubleElement(term16124, 0, 5.1881467707308114E18);
        setDoubleElement(term16124, 1, -9.2211202370243133E18);
        setDoubleElement(term16124, 2, -9.2121130377695724E18);
        setDoubleElement(term16124, 3, -4.6094342185969254E18);
        setDoubleElement(term16124, 4, 4.611721202816254E18);
        setField(term16341, term16341.getClass(), "singularValues", term16124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -3.0000000074505806;
        try {
            callMethod(klass, "getCovariance", argTypes, term16341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



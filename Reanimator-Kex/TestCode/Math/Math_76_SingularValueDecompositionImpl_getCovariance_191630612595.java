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
import java.lang.Object;

public class SingularValueDecompositionImpl_getCovariance_191630612595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41054;

    public SingularValueDecompositionImpl_getCovariance_191630612595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41054 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term40651 = (double[]) newDoubleArray(34);
        Object term41166 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term40651, 0, 5.7646080404751181E17);
        setDoubleElement(term40651, 1, 3.6030997350883584E16);
        setDoubleElement(term40651, 2, 4.6128163208793969E18);
        setDoubleElement(term40651, 3, -8.6468936577685729E18);
        setField(term41054, term41054.getClass(), "singularValues", term40651);
        setField(term41054, term41054.getClass(), "cachedVt", null);
        setField(term41054, term41054.getClass(), "cachedV", null);
        setIntField(term41054, term41054.getClass(), "m", -2147483648);
        setIntField(term41054, term41054.getClass(), "n", -2147483648);
        setField(term41054, term41054.getClass(), "eigenDecomposition", term41166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.781359532238857E-308;
        try {
            callMethod(klass, "getCovariance", argTypes, term41054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



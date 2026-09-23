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

public class SingularValueDecompositionImpl_getCovariance_191630612578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34050;

    public SingularValueDecompositionImpl_getCovariance_191630612578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34050 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term33313 = (double[]) newDoubleArray(65);
        Object term34162 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term33313, 0, 1.5091899180257312E17);
        setDoubleElement(term33313, 1, 5.1943388809307505E18);
        setDoubleElement(term33313, 2, 5.8233561688835738E17);
        setDoubleElement(term33313, 3, 1.1585485991158912E18);
        setDoubleElement(term33313, 4, -8.6262228737221908E18);
        setDoubleElement(term33313, 5, -4.0275757573969464E18);
        setField(term34050, term34050.getClass(), "singularValues", term33313);
        setField(term34050, term34050.getClass(), "cachedVt", null);
        setField(term34050, term34050.getClass(), "cachedV", null);
        setIntField(term34050, term34050.getClass(), "m", -2147483648);
        setIntField(term34050, term34050.getClass(), "n", -2147483648);
        setField(term34050, term34050.getClass(), "eigenDecomposition", term34162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -1.0736533582039583E10;
        try {
            callMethod(klass, "getCovariance", argTypes, term34050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



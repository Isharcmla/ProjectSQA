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

public class SingularValueDecompositionImpl_getCovariance_1916306125104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48513;

    public SingularValueDecompositionImpl_getCovariance_1916306125104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48513 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term48261 = (double[]) newDoubleArray(6);
        Object term48611 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setDoubleElement(term48261, 0, -9.1850914400221266E18);
        setDoubleElement(term48261, 1, -9.223372036854776E18);
        setDoubleElement(term48261, 2, 9.007199254740992E15);
        setDoubleElement(term48261, 3, 2.3080948090273792E18);
        setDoubleElement(term48261, 4, 4.6139378182410732E18);
        setDoubleElement(term48261, 5, 1.0);
        setField(term48513, term48513.getClass(), "singularValues", term48261);
        setField(term48513, term48513.getClass(), "cachedVt", null);
        setField(term48513, term48513.getClass(), "cachedV", term48611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -6.0;
        callMethod(klass, "getCovariance", argTypes, term48513, args);
    }

};



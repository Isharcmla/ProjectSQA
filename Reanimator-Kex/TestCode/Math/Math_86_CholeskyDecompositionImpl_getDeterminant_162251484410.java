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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class CholeskyDecompositionImpl_getDeterminant_162251484410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term3590;

    public CholeskyDecompositionImpl_getDeterminant_162251484410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term79 = (Object[]) newArray("[D", 1);
        double[] term80 = (double[]) newDoubleArray(6);
        setDoubleElement(term80, 0, 0.6300849762307866);
        setDoubleElement(term80, 1, 0.9737083944266686);
        setDoubleElement(term80, 2, 0.0668892744806211);
        setDoubleElement(term80, 3, 0.3587267442738795);
        setDoubleElement(term80, 4, 0.07802449704920456);
        setDoubleElement(term80, 5, 0.5279279537140873);
        setElement(term79, 0, term80);
        setField(term78, term78.getClass(), "lTData", term79);
        setField(term78, term78.getClass(), "cachedL", null);
        setField(term78, term78.getClass(), "cachedLT", null);
        term3590 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term3591 = (Object[]) newArray("[D", 1);
        double[] term3592 = (double[]) newDoubleArray(6);
        setDoubleElement(term3592, 0, 0.6300849762307866);
        setDoubleElement(term3592, 1, 0.9737083944266686);
        setDoubleElement(term3592, 2, 0.0668892744806211);
        setDoubleElement(term3592, 3, 0.3587267442738795);
        setDoubleElement(term3592, 4, 0.07802449704920456);
        setDoubleElement(term3592, 5, 0.5279279537140873);
        setElement(term3591, 0, term3592);
        setField(term3590, term3590.getClass(), "lTData", term3591);
        setField(term3590, term3590.getClass(), "cachedL", null);
        setField(term3590, term3590.getClass(), "cachedLT", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeterminant", argTypes, term78, args);
        assertTrue(recursiveEquals(term78, term3590));
    }

};



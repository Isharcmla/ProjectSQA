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

public class SingularValueDecompositionImpl_getSolver_1804940021109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49767;

    public SingularValueDecompositionImpl_getSolver_1804940021109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49767 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term49863 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object term49961 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term49767, term49767.getClass(), "singularValues", null);
        setField(term49767, term49767.getClass(), "cachedUt", term49863);
        setField(term49767, term49767.getClass(), "cachedV", term49961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolver", argTypes, term49767, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



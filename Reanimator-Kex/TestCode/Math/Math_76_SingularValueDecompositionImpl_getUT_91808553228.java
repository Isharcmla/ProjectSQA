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

public class SingularValueDecompositionImpl_getUT_91808553228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5564;

    public SingularValueDecompositionImpl_getUT_91808553228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5564 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term5660 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term5564, term5564.getClass(), "cachedUt", null);
        setField(term5564, term5564.getClass(), "cachedU", term5660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUT", argTypes, term5564, args);
    }

};



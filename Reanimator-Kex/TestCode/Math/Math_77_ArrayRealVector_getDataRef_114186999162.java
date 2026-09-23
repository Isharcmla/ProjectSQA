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

public class ArrayRealVector_getDataRef_114186999162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;
     Object term9939;
     Object term9936;

    public ArrayRealVector_getDataRef_114186999162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term261 = (double[]) newDoubleArray(0);
        setField(term260, term260.getClass(), "data", term261);
        term9939 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term9940 = (double[]) newDoubleArray(0);
        setField(term9939, term9939.getClass(), "data", term9940);
        term9936 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDataRef", argTypes, term260, args);
        assertTrue(recursiveEquals(term260, term9939));
        assertTrue(recursiveEquals(retValue, term9936));
    }

};



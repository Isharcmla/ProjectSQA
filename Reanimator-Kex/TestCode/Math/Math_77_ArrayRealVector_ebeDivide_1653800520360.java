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
import java.lang.Double;

public class ArrayRealVector_ebeDivide_1653800520360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86824;
     Object term86922;
     Object term113927;
     Object term113929;
     Object term113907;

    public ArrayRealVector_ebeDivide_1653800520360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86824 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term86644 = (double[]) newDoubleArray(8);
        setField(term86824, term86824.getClass(), "data", term86644);
        term86922 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term86922, term86922.getClass(), "data", term86644);
        term113927 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term113928 = (double[]) newDoubleArray(8);
        setField(term113927, term113927.getClass(), "data", term113928);
        term113929 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term113930 = (double[]) newDoubleArray(8);
        setField(term113929, term113929.getClass(), "data", term113930);
        term113907 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term113908 = (double[]) newDoubleArray(8);
        setDoubleElement(term113908, 0, Double.NaN);
        setDoubleElement(term113908, 1, Double.NaN);
        setDoubleElement(term113908, 2, Double.NaN);
        setDoubleElement(term113908, 3, Double.NaN);
        setDoubleElement(term113908, 4, Double.NaN);
        setDoubleElement(term113908, 5, Double.NaN);
        setDoubleElement(term113908, 6, Double.NaN);
        setDoubleElement(term113908, 7, Double.NaN);
        setField(term113907, term113907.getClass(), "data", term113908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term86922;
        Object retValue = callMethod(klass, "ebeDivide", argTypes, term86824, args);
        assertTrue(recursiveEquals(term86824, term113927));
        assertTrue(recursiveEquals(term86922, term113929));
        assertTrue(recursiveEquals(retValue, term113907));
    }

};



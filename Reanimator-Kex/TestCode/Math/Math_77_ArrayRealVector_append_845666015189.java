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

public class ArrayRealVector_append_845666015189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;
     Object term368;
     Object term16776;
     Object term16778;
     Object term16770;

    public ArrayRealVector_append_845666015189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term367 = (double[]) newDoubleArray(0);
        setField(term366, term366.getClass(), "data", term367);
        term368 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term369 = (double[]) newDoubleArray(0);
        setField(term368, term368.getClass(), "data", term369);
        term16776 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16777 = (double[]) newDoubleArray(0);
        setField(term16776, term16776.getClass(), "data", term16777);
        term16778 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16779 = (double[]) newDoubleArray(0);
        setField(term16778, term16778.getClass(), "data", term16779);
        term16770 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16771 = (double[]) newDoubleArray(0);
        setField(term16770, term16770.getClass(), "data", term16771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term368;
        Object retValue = callMethod(klass, "append", argTypes, term366, args);
        assertTrue(recursiveEquals(term366, term16776));
        assertTrue(recursiveEquals(term368, term16778));
        assertTrue(recursiveEquals(retValue, term16770));
    }

};



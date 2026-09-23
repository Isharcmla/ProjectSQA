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

public class ArrayRealVector_mapAddToSelf_795411843267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68286;
     Object term68304;
     Object term68300;

    public ArrayRealVector_mapAddToSelf_795411843267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68286 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68175 = (double[]) newDoubleArray(1);
        setField(term68286, term68286.getClass(), "data", term68175);
        term68304 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68305 = (double[]) newDoubleArray(1);
        setField(term68304, term68304.getClass(), "data", term68305);
        term68300 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68301 = (double[]) newDoubleArray(1);
        setField(term68300, term68300.getClass(), "data", term68301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "mapAddToSelf", argTypes, term68286, args);
        assertTrue(recursiveEquals(term68286, term68304));
        assertTrue(recursiveEquals(retValue, term68300));
    }

};



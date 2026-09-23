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

public class ArrayRealVector_mapSignumToSelf_1143548034247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36863;
     Object term47659;
     Object term47656;

    public ArrayRealVector_mapSignumToSelf_1143548034247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36863 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term36752 = (double[]) newDoubleArray(1);
        setField(term36863, term36863.getClass(), "data", term36752);
        term47659 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47660 = (double[]) newDoubleArray(1);
        setField(term47659, term47659.getClass(), "data", term47660);
        term47656 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47657 = (double[]) newDoubleArray(1);
        setField(term47656, term47656.getClass(), "data", term47657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSignumToSelf", argTypes, term36863, args);
        assertTrue(recursiveEquals(term36863, term47659));
        assertTrue(recursiveEquals(retValue, term47656));
    }

};



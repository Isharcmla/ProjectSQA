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

public class ArrayRealVector_mapTanToSelf_1137030510353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84801;
     Object term107769;
     Object term107766;

    public ArrayRealVector_mapTanToSelf_1137030510353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84801 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term84690 = (double[]) newDoubleArray(1);
        setField(term84801, term84801.getClass(), "data", term84690);
        term107769 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term107770 = (double[]) newDoubleArray(1);
        setField(term107769, term107769.getClass(), "data", term107770);
        term107766 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term107767 = (double[]) newDoubleArray(1);
        setField(term107766, term107766.getClass(), "data", term107767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapTanToSelf", argTypes, term84801, args);
        assertTrue(recursiveEquals(term84801, term107769));
        assertTrue(recursiveEquals(retValue, term107766));
    }

};



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

public class ArrayRealVector_mapExpToSelf_502651150251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47890;
     Object term47907;
     Object term47904;

    public ArrayRealVector_mapExpToSelf_502651150251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47890 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47779 = (double[]) newDoubleArray(1);
        setField(term47890, term47890.getClass(), "data", term47779);
        term47907 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47908 = (double[]) newDoubleArray(1);
        setDoubleElement(term47908, 0, 1.0);
        setField(term47907, term47907.getClass(), "data", term47908);
        term47904 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47905 = (double[]) newDoubleArray(1);
        setDoubleElement(term47905, 0, 1.0);
        setField(term47904, term47904.getClass(), "data", term47905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapExpToSelf", argTypes, term47890, args);
        assertTrue(recursiveEquals(term47890, term47907));
        assertTrue(recursiveEquals(retValue, term47904));
    }

};



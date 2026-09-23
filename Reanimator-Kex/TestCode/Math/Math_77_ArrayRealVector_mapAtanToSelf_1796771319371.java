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

public class ArrayRealVector_mapAtanToSelf_1796771319371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124637;
     Object term124893;
     Object term124890;

    public ArrayRealVector_mapAtanToSelf_1796771319371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124637 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term124526 = (double[]) newDoubleArray(1);
        setField(term124637, term124637.getClass(), "data", term124526);
        term124893 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term124894 = (double[]) newDoubleArray(1);
        setField(term124893, term124893.getClass(), "data", term124894);
        term124890 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term124891 = (double[]) newDoubleArray(1);
        setField(term124890, term124890.getClass(), "data", term124891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAtanToSelf", argTypes, term124637, args);
        assertTrue(recursiveEquals(term124637, term124893));
        assertTrue(recursiveEquals(retValue, term124890));
    }

};



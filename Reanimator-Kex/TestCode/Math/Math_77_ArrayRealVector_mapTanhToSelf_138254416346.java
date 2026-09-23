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

public class ArrayRealVector_mapTanhToSelf_138254416346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82000;
     Object term104525;
     Object term104522;

    public ArrayRealVector_mapTanhToSelf_138254416346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82000 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term81889 = (double[]) newDoubleArray(1);
        setField(term82000, term82000.getClass(), "data", term81889);
        term104525 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104526 = (double[]) newDoubleArray(1);
        setField(term104525, term104525.getClass(), "data", term104526);
        term104522 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104523 = (double[]) newDoubleArray(1);
        setField(term104522, term104522.getClass(), "data", term104523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapTanhToSelf", argTypes, term82000, args);
        assertTrue(recursiveEquals(term82000, term104525));
        assertTrue(recursiveEquals(retValue, term104522));
    }

};



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

public class ArrayRealVector_mapCoshToSelf_1868732714137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term7008;
     Object term7006;

    public ArrayRealVector_mapCoshToSelf_1868732714137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term185 = (double[]) newDoubleArray(0);
        setField(term184, term184.getClass(), "data", term185);
        term7008 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7009 = (double[]) newDoubleArray(0);
        setField(term7008, term7008.getClass(), "data", term7009);
        term7006 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7007 = (double[]) newDoubleArray(0);
        setField(term7006, term7006.getClass(), "data", term7007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCoshToSelf", argTypes, term184, args);
        assertTrue(recursiveEquals(term184, term7008));
        assertTrue(recursiveEquals(retValue, term7006));
    }

};



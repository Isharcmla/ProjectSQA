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

public class ArrayRealVector_mapUlpToSelf_120604758154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218;
     Object term7093;
     Object term7091;

    public ArrayRealVector_mapUlpToSelf_120604758154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term219 = (double[]) newDoubleArray(0);
        setField(term218, term218.getClass(), "data", term219);
        term7093 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7094 = (double[]) newDoubleArray(0);
        setField(term7093, term7093.getClass(), "data", term7094);
        term7091 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7092 = (double[]) newDoubleArray(0);
        setField(term7091, term7091.getClass(), "data", term7092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapUlpToSelf", argTypes, term218, args);
        assertTrue(recursiveEquals(term218, term7093));
        assertTrue(recursiveEquals(retValue, term7091));
    }

};



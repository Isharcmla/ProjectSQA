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

public class ArrayRealVector_mapAsinToSelf_1571928000144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;
     Object term7043;
     Object term7041;

    public ArrayRealVector_mapAsinToSelf_1571928000144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term199 = (double[]) newDoubleArray(0);
        setField(term198, term198.getClass(), "data", term199);
        term7043 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7044 = (double[]) newDoubleArray(0);
        setField(term7043, term7043.getClass(), "data", term7044);
        term7041 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7042 = (double[]) newDoubleArray(0);
        setField(term7041, term7041.getClass(), "data", term7042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAsinToSelf", argTypes, term198, args);
        assertTrue(recursiveEquals(term198, term7043));
        assertTrue(recursiveEquals(retValue, term7041));
    }

};



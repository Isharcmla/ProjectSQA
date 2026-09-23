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
import java.lang.Object;

public class OpenMapRealVector_getDistance_163490235991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4757;
     Object term4864;
     Object term46232;
     Object term46237;

    public OpenMapRealVector_getDistance_163490235991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4757 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term4758 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4759 = (int[]) newIntArray(32);
        double[] term4792 = (double[]) newDoubleArray(32);
        byte[] term4825 = (byte[]) newByteArray(32);
        setField(term4758, term4758.getClass(), "keys", term4759);
        setField(term4758, term4758.getClass(), "values", term4792);
        setField(term4758, term4758.getClass(), "states", term4825);
        setDoubleField(term4758, term4758.getClass(), "missingEntries", 0.0);
        setIntField(term4758, term4758.getClass(), "size", 0);
        setIntField(term4758, term4758.getClass(), "mask", 31);
        setIntField(term4758, term4758.getClass(), "count", 0);
        setField(term4757, term4757.getClass(), "entries", term4758);
        setIntField(term4757, term4757.getClass(), "virtualSize", -73683645);
        setDoubleField(term4757, term4757.getClass(), "epsilon", 1.0E-12);
        term4864 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term4865 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4866 = (int[]) newIntArray(32);
        double[] term4899 = (double[]) newDoubleArray(32);
        byte[] term4932 = (byte[]) newByteArray(32);
        setField(term4865, term4865.getClass(), "keys", term4866);
        setField(term4865, term4865.getClass(), "values", term4899);
        setField(term4865, term4865.getClass(), "states", term4932);
        setDoubleField(term4865, term4865.getClass(), "missingEntries", 0.0);
        setIntField(term4865, term4865.getClass(), "size", 0);
        setIntField(term4865, term4865.getClass(), "mask", 31);
        setIntField(term4865, term4865.getClass(), "count", 0);
        setField(term4864, term4864.getClass(), "entries", term4865);
        setIntField(term4864, term4864.getClass(), "virtualSize", -226514366);
        setDoubleField(term4864, term4864.getClass(), "epsilon", 1.0E-12);
        term46232 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term46233 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term46234 = (int[]) newIntArray(32);
        double[] term46235 = (double[]) newDoubleArray(32);
        byte[] term46236 = (byte[]) newByteArray(32);
        setField(term46233, term46233.getClass(), "keys", term46234);
        setField(term46233, term46233.getClass(), "values", term46235);
        setField(term46233, term46233.getClass(), "states", term46236);
        setDoubleField(term46233, term46233.getClass(), "missingEntries", 0.0);
        setIntField(term46233, term46233.getClass(), "size", 0);
        setIntField(term46233, term46233.getClass(), "mask", 31);
        setIntField(term46233, term46233.getClass(), "count", 0);
        setField(term46232, term46232.getClass(), "entries", term46233);
        setIntField(term46232, term46232.getClass(), "virtualSize", -73683645);
        setDoubleField(term46232, term46232.getClass(), "epsilon", 1.0E-12);
        term46237 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term46238 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term46239 = (int[]) newIntArray(32);
        double[] term46240 = (double[]) newDoubleArray(32);
        byte[] term46241 = (byte[]) newByteArray(32);
        setField(term46238, term46238.getClass(), "keys", term46239);
        setField(term46238, term46238.getClass(), "values", term46240);
        setField(term46238, term46238.getClass(), "states", term46241);
        setDoubleField(term46238, term46238.getClass(), "missingEntries", 0.0);
        setIntField(term46238, term46238.getClass(), "size", 0);
        setIntField(term46238, term46238.getClass(), "mask", 31);
        setIntField(term46238, term46238.getClass(), "count", 0);
        setField(term46237, term46237.getClass(), "entries", term46238);
        setIntField(term46237, term46237.getClass(), "virtualSize", -226514366);
        setDoubleField(term46237, term46237.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term4864;
        Object retValue = callMethod(klass, "getDistance", argTypes, term4757, args);
        assertTrue(recursiveEquals(term4757, term46232));
        assertTrue(recursiveEquals(term4864, term46237));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};



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

public class OpenMapRealVector_getDistance_163490235992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4757;
     Object term4864;
     Object term46885;
     Object term46890;

    public OpenMapRealVector_getDistance_163490235992() {
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
        term46885 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term46886 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term46887 = (int[]) newIntArray(32);
        double[] term46888 = (double[]) newDoubleArray(32);
        byte[] term46889 = (byte[]) newByteArray(32);
        setField(term46886, term46886.getClass(), "keys", term46887);
        setField(term46886, term46886.getClass(), "values", term46888);
        setField(term46886, term46886.getClass(), "states", term46889);
        setDoubleField(term46886, term46886.getClass(), "missingEntries", 0.0);
        setIntField(term46886, term46886.getClass(), "size", 0);
        setIntField(term46886, term46886.getClass(), "mask", 31);
        setIntField(term46886, term46886.getClass(), "count", 0);
        setField(term46885, term46885.getClass(), "entries", term46886);
        setIntField(term46885, term46885.getClass(), "virtualSize", -73683645);
        setDoubleField(term46885, term46885.getClass(), "epsilon", 1.0E-12);
        term46890 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term46891 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term46892 = (int[]) newIntArray(32);
        double[] term46893 = (double[]) newDoubleArray(32);
        byte[] term46894 = (byte[]) newByteArray(32);
        setField(term46891, term46891.getClass(), "keys", term46892);
        setField(term46891, term46891.getClass(), "values", term46893);
        setField(term46891, term46891.getClass(), "states", term46894);
        setDoubleField(term46891, term46891.getClass(), "missingEntries", 0.0);
        setIntField(term46891, term46891.getClass(), "size", 0);
        setIntField(term46891, term46891.getClass(), "mask", 31);
        setIntField(term46891, term46891.getClass(), "count", 0);
        setField(term46890, term46890.getClass(), "entries", term46891);
        setIntField(term46890, term46890.getClass(), "virtualSize", -226514366);
        setDoubleField(term46890, term46890.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term4864;
        Object retValue = callMethod(klass, "getDistance", argTypes, term4757, args);
        assertTrue(recursiveEquals(term4757, term46885));
        assertTrue(recursiveEquals(term4864, term46890));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};



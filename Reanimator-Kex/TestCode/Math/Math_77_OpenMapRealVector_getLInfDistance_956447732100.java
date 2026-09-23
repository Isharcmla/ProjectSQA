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

public class OpenMapRealVector_getLInfDistance_956447732100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6817;
     Object term6924;
     Object term79855;
     Object term79860;

    public OpenMapRealVector_getLInfDistance_956447732100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6817 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term6818 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term6819 = (int[]) newIntArray(32);
        double[] term6852 = (double[]) newDoubleArray(32);
        byte[] term6885 = (byte[]) newByteArray(32);
        setField(term6818, term6818.getClass(), "keys", term6819);
        setField(term6818, term6818.getClass(), "values", term6852);
        setField(term6818, term6818.getClass(), "states", term6885);
        setDoubleField(term6818, term6818.getClass(), "missingEntries", 0.0);
        setIntField(term6818, term6818.getClass(), "size", 0);
        setIntField(term6818, term6818.getClass(), "mask", 31);
        setIntField(term6818, term6818.getClass(), "count", 0);
        setField(term6817, term6817.getClass(), "entries", term6818);
        setIntField(term6817, term6817.getClass(), "virtualSize", -157887805);
        setDoubleField(term6817, term6817.getClass(), "epsilon", 1.0E-12);
        term6924 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term6925 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term6926 = (int[]) newIntArray(32);
        double[] term6959 = (double[]) newDoubleArray(32);
        byte[] term6992 = (byte[]) newByteArray(32);
        setField(term6925, term6925.getClass(), "keys", term6926);
        setField(term6925, term6925.getClass(), "values", term6959);
        setField(term6925, term6925.getClass(), "states", term6992);
        setDoubleField(term6925, term6925.getClass(), "missingEntries", 0.0);
        setIntField(term6925, term6925.getClass(), "size", 0);
        setIntField(term6925, term6925.getClass(), "mask", 31);
        setIntField(term6925, term6925.getClass(), "count", 0);
        setField(term6924, term6924.getClass(), "entries", term6925);
        setIntField(term6924, term6924.getClass(), "virtualSize", 1876565163);
        setDoubleField(term6924, term6924.getClass(), "epsilon", 1.0E-12);
        term79855 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term79856 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term79857 = (int[]) newIntArray(32);
        double[] term79858 = (double[]) newDoubleArray(32);
        byte[] term79859 = (byte[]) newByteArray(32);
        setField(term79856, term79856.getClass(), "keys", term79857);
        setField(term79856, term79856.getClass(), "values", term79858);
        setField(term79856, term79856.getClass(), "states", term79859);
        setDoubleField(term79856, term79856.getClass(), "missingEntries", 0.0);
        setIntField(term79856, term79856.getClass(), "size", 0);
        setIntField(term79856, term79856.getClass(), "mask", 31);
        setIntField(term79856, term79856.getClass(), "count", 0);
        setField(term79855, term79855.getClass(), "entries", term79856);
        setIntField(term79855, term79855.getClass(), "virtualSize", -157887805);
        setDoubleField(term79855, term79855.getClass(), "epsilon", 1.0E-12);
        term79860 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term79861 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term79862 = (int[]) newIntArray(32);
        double[] term79863 = (double[]) newDoubleArray(32);
        byte[] term79864 = (byte[]) newByteArray(32);
        setField(term79861, term79861.getClass(), "keys", term79862);
        setField(term79861, term79861.getClass(), "values", term79863);
        setField(term79861, term79861.getClass(), "states", term79864);
        setDoubleField(term79861, term79861.getClass(), "missingEntries", 0.0);
        setIntField(term79861, term79861.getClass(), "size", 0);
        setIntField(term79861, term79861.getClass(), "mask", 31);
        setIntField(term79861, term79861.getClass(), "count", 0);
        setField(term79860, term79860.getClass(), "entries", term79861);
        setIntField(term79860, term79860.getClass(), "virtualSize", 1876565163);
        setDoubleField(term79860, term79860.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term6924;
        Object retValue = callMethod(klass, "getLInfDistance", argTypes, term6817, args);
        assertTrue(recursiveEquals(term6817, term79855));
        assertTrue(recursiveEquals(term6924, term79860));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};



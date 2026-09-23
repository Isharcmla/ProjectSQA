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
import java.lang.Double;

public class OpenMapRealVector_isDefaultValue_124964528974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;
     Object term775;
     Object term17676;

    public OpenMapRealVector_isDefaultValue_124964528974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term669 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term670 = (int[]) newIntArray(32);
        double[] term703 = (double[]) newDoubleArray(32);
        byte[] term736 = (byte[]) newByteArray(32);
        setField(term669, term669.getClass(), "keys", term670);
        setField(term669, term669.getClass(), "values", term703);
        setField(term669, term669.getClass(), "states", term736);
        setDoubleField(term669, term669.getClass(), "missingEntries", 0.0);
        setIntField(term669, term669.getClass(), "size", 0);
        setIntField(term669, term669.getClass(), "mask", 31);
        setIntField(term669, term669.getClass(), "count", 0);
        setField(term668, term668.getClass(), "entries", term669);
        setIntField(term668, term668.getClass(), "virtualSize", 1725571209);
        setDoubleField(term668, term668.getClass(), "epsilon", 1.0E-12);
        term775 = new Double(0.1374549299694151);
        term17676 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term17677 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term17678 = (int[]) newIntArray(32);
        double[] term17679 = (double[]) newDoubleArray(32);
        byte[] term17680 = (byte[]) newByteArray(32);
        setField(term17677, term17677.getClass(), "keys", term17678);
        setField(term17677, term17677.getClass(), "values", term17679);
        setField(term17677, term17677.getClass(), "states", term17680);
        setDoubleField(term17677, term17677.getClass(), "missingEntries", 0.0);
        setIntField(term17677, term17677.getClass(), "size", 0);
        setIntField(term17677, term17677.getClass(), "mask", 31);
        setIntField(term17677, term17677.getClass(), "count", 0);
        setField(term17676, term17676.getClass(), "entries", term17677);
        setIntField(term17676, term17676.getClass(), "virtualSize", 1725571209);
        setDoubleField(term17676, term17676.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term775;
        Object retValue = callMethod(klass, "isDefaultValue", argTypes, term668, args);
        assertTrue(recursiveEquals(term668, term17676));
        assertTrue(recursiveEquals(term775, 0.1374549299694151));
        assertTrue(recursiveEquals(retValue, false));
    }

};



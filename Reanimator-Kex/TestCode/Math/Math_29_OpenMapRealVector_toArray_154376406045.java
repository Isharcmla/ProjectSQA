package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_toArray_154376406045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8607;

    public OpenMapRealVector_toArray_154376406045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8607 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term8608 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term8609 = (int[]) newIntArray(32);
        double[] term8642 = (double[]) newDoubleArray(32);
        byte[] term8675 = (byte[]) newByteArray(32);
        setField(term8608, term8608.getClass(), "keys", term8609);
        setField(term8608, term8608.getClass(), "values", term8642);
        setField(term8608, term8608.getClass(), "states", term8675);
        setDoubleField(term8608, term8608.getClass(), "missingEntries", 0.0);
        setIntField(term8608, term8608.getClass(), "size", 0);
        setIntField(term8608, term8608.getClass(), "mask", 31);
        setIntField(term8608, term8608.getClass(), "count", 0);
        setField(term8607, term8607.getClass(), "entries", term8608);
        setIntField(term8607, term8607.getClass(), "virtualSize", -1048298087);
        setDoubleField(term8607, term8607.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toArray", argTypes, term8607, args);
    }

};



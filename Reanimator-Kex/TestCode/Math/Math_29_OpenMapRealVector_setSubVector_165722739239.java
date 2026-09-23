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
import java.lang.Integer;

public class OpenMapRealVector_setSubVector_165722739239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7182;
     Object term7289;

    public OpenMapRealVector_setSubVector_165722739239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7182 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term7183 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term7184 = (int[]) newIntArray(32);
        double[] term7217 = (double[]) newDoubleArray(32);
        byte[] term7250 = (byte[]) newByteArray(32);
        setField(term7183, term7183.getClass(), "keys", term7184);
        setField(term7183, term7183.getClass(), "values", term7217);
        setField(term7183, term7183.getClass(), "states", term7250);
        setDoubleField(term7183, term7183.getClass(), "missingEntries", 0.0);
        setIntField(term7183, term7183.getClass(), "size", 0);
        setIntField(term7183, term7183.getClass(), "mask", 31);
        setIntField(term7183, term7183.getClass(), "count", 0);
        setField(term7182, term7182.getClass(), "entries", term7183);
        setIntField(term7182, term7182.getClass(), "virtualSize", -1016503459);
        setDoubleField(term7182, term7182.getClass(), "epsilon", 1.0E-12);
        term7289 = new Integer(-1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[2];
        args[0] = term7289;
        args[1] = null;
        callMethod(klass, "setSubVector", argTypes, term7182, args);
    }

};



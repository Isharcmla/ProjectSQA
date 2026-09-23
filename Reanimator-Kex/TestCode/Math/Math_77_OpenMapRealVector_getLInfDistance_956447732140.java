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
import java.lang.Object;

public class OpenMapRealVector_getLInfDistance_956447732140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143959;
     Object term144169;

    public OpenMapRealVector_getLInfDistance_956447732140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143959 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term144067 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term141828 = (byte[]) newByteArray(32);
        setIntField(term144067, term144067.getClass(), "count", 0);
        setByteElement(term141828, 6, (byte) -128);
        setByteElement(term141828, 7, (byte) -128);
        setByteElement(term141828, 8, (byte) -128);
        setByteElement(term141828, 13, (byte) -128);
        setByteElement(term141828, 16, (byte) -128);
        setByteElement(term141828, 22, (byte) -128);
        setByteElement(term141828, 23, (byte) -128);
        setByteElement(term141828, 24, (byte) -128);
        setByteElement(term141828, 27, (byte) -128);
        setByteElement(term141828, 31, (byte) -128);
        setField(term144067, term144067.getClass(), "states", term141828);
        setField(term143959, term143959.getClass(), "entries", term144067);
        term144169 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term144277 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term142927 = (byte[]) newByteArray(22);
        setIntField(term144277, term144277.getClass(), "count", 0);
        setByteElement(term142927, 0, (byte) -128);
        setByteElement(term142927, 1, (byte) -128);
        setByteElement(term142927, 4, (byte) -128);
        setByteElement(term142927, 7, (byte) -128);
        setByteElement(term142927, 9, (byte) -128);
        setByteElement(term142927, 14, (byte) -128);
        setField(term144277, term144277.getClass(), "states", term142927);
        setField(term144169, term144169.getClass(), "entries", term144277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term144169;
        callMethod(klass, "getLInfDistance", argTypes, term143959, args);
    }

};



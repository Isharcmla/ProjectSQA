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

public class OpenMapRealVector_getLInfDistance_956447732156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153122;
     Object term153332;

    public OpenMapRealVector_getLInfDistance_956447732156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153122 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term153230 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term151139 = (byte[]) newByteArray(32);
        setIntField(term153230, term153230.getClass(), "count", 0);
        setByteElement(term151139, 0, (byte) -128);
        setByteElement(term151139, 9, (byte) -128);
        setByteElement(term151139, 10, (byte) -128);
        setByteElement(term151139, 13, (byte) -128);
        setByteElement(term151139, 20, (byte) -128);
        setByteElement(term151139, 21, (byte) -128);
        setByteElement(term151139, 30, (byte) -128);
        setByteElement(term151139, 31, (byte) -128);
        setField(term153230, term153230.getClass(), "states", term151139);
        setField(term153122, term153122.getClass(), "entries", term153230);
        term153332 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term153440 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term152237 = (byte[]) newByteArray(18);
        setIntField(term153440, term153440.getClass(), "count", 0);
        setByteElement(term152237, 0, (byte) -128);
        setByteElement(term152237, 2, (byte) -128);
        setByteElement(term152237, 5, (byte) -128);
        setByteElement(term152237, 6, (byte) -128);
        setByteElement(term152237, 9, (byte) -128);
        setByteElement(term152237, 10, (byte) -128);
        setByteElement(term152237, 13, (byte) -128);
        setByteElement(term152237, 16, (byte) -128);
        setByteElement(term152237, 17, (byte) -128);
        setField(term153440, term153440.getClass(), "states", term152237);
        setField(term153332, term153332.getClass(), "entries", term153440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term153332;
        callMethod(klass, "getLInfDistance", argTypes, term153122, args);
    }

};



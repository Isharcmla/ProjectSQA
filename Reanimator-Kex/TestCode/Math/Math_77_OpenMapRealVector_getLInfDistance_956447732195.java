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

public class OpenMapRealVector_getLInfDistance_956447732195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213595;
     Object term213805;

    public OpenMapRealVector_getLInfDistance_956447732195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213595 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term213703 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term210206 = (byte[]) newByteArray(32);
        setIntField(term213703, term213703.getClass(), "count", 0);
        setByteElement(term210206, 12, (byte) -128);
        setByteElement(term210206, 15, (byte) -128);
        setByteElement(term210206, 16, (byte) -128);
        setByteElement(term210206, 17, (byte) -128);
        setByteElement(term210206, 19, (byte) -128);
        setByteElement(term210206, 21, (byte) -128);
        setByteElement(term210206, 23, (byte) -128);
        setByteElement(term210206, 24, (byte) -128);
        setByteElement(term210206, 29, (byte) -128);
        setByteElement(term210206, 31, (byte) -128);
        setField(term213703, term213703.getClass(), "states", term210206);
        setField(term213595, term213595.getClass(), "entries", term213703);
        term213805 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term213913 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term211306 = (byte[]) newByteArray(64);
        setIntField(term213913, term213913.getClass(), "count", 0);
        setByteElement(term211306, 5, (byte) -128);
        setByteElement(term211306, 8, (byte) -128);
        setByteElement(term211306, 9, (byte) -128);
        setByteElement(term211306, 13, (byte) -128);
        setByteElement(term211306, 14, (byte) -128);
        setByteElement(term211306, 17, (byte) -128);
        setByteElement(term211306, 26, (byte) 1);
        setField(term213913, term213913.getClass(), "states", term211306);
        setField(term213805, term213805.getClass(), "entries", term213913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term213805;
        callMethod(klass, "getLInfDistance", argTypes, term213595, args);
    }

};



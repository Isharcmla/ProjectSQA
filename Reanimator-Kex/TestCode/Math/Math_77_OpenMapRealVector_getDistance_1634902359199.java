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

public class OpenMapRealVector_getDistance_1634902359199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220744;
     Object term220954;

    public OpenMapRealVector_getDistance_1634902359199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220744 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term220852 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term219139 = (byte[]) newByteArray(32);
        setIntField(term220852, term220852.getClass(), "count", 0);
        setByteElement(term219139, 1, (byte) -128);
        setByteElement(term219139, 9, (byte) -128);
        setByteElement(term219139, 13, (byte) -128);
        setByteElement(term219139, 17, (byte) -128);
        setByteElement(term219139, 20, (byte) -128);
        setByteElement(term219139, 23, (byte) -128);
        setByteElement(term219139, 24, (byte) -128);
        setByteElement(term219139, 29, (byte) -128);
        setByteElement(term219139, 31, (byte) -128);
        setField(term220852, term220852.getClass(), "states", term219139);
        setField(term220744, term220744.getClass(), "entries", term220852);
        term220954 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term221062 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term220240 = (byte[]) newByteArray(8);
        setIntField(term221062, term221062.getClass(), "count", 0);
        setByteElement(term220240, 1, (byte) -128);
        setByteElement(term220240, 2, (byte) -128);
        setByteElement(term220240, 7, (byte) -128);
        setField(term221062, term221062.getClass(), "states", term220240);
        setField(term220954, term220954.getClass(), "entries", term221062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term220954;
        callMethod(klass, "getDistance", argTypes, term220744, args);
    }

};



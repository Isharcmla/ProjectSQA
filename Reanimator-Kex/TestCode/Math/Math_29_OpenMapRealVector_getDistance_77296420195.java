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

public class OpenMapRealVector_getDistance_77296420195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92480;
     Object term92694;

    public OpenMapRealVector_getDistance_77296420195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92480 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term92590 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term90908 = (byte[]) newByteArray(32);
        setIntField(term92590, term92590.getClass(), "count", 0);
        setByteElement(term90908, 0, (byte) -128);
        setByteElement(term90908, 1, (byte) -128);
        setByteElement(term90908, 2, (byte) -128);
        setByteElement(term90908, 3, (byte) -128);
        setByteElement(term90908, 6, (byte) -128);
        setByteElement(term90908, 7, (byte) -128);
        setByteElement(term90908, 8, (byte) -128);
        setByteElement(term90908, 9, (byte) -128);
        setByteElement(term90908, 10, (byte) -128);
        setByteElement(term90908, 11, (byte) -128);
        setByteElement(term90908, 12, (byte) -128);
        setByteElement(term90908, 13, (byte) -128);
        setByteElement(term90908, 14, (byte) -128);
        setByteElement(term90908, 15, (byte) -128);
        setByteElement(term90908, 16, (byte) -128);
        setByteElement(term90908, 17, (byte) -128);
        setByteElement(term90908, 18, (byte) -128);
        setByteElement(term90908, 19, (byte) -128);
        setByteElement(term90908, 20, (byte) -128);
        setByteElement(term90908, 21, (byte) -128);
        setByteElement(term90908, 22, (byte) -128);
        setByteElement(term90908, 23, (byte) -128);
        setByteElement(term90908, 24, (byte) -128);
        setByteElement(term90908, 25, (byte) -128);
        setByteElement(term90908, 26, (byte) -128);
        setByteElement(term90908, 27, (byte) -128);
        setByteElement(term90908, 28, (byte) -128);
        setByteElement(term90908, 29, (byte) -128);
        setByteElement(term90908, 30, (byte) -128);
        setByteElement(term90908, 31, (byte) -128);
        setField(term92590, term92590.getClass(), "states", term90908);
        setField(term92480, term92480.getClass(), "entries", term92590);
        term92694 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term92804 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term92005 = (byte[]) newByteArray(7);
        setIntField(term92804, term92804.getClass(), "count", 0);
        setByteElement(term92005, 0, (byte) -128);
        setByteElement(term92005, 1, (byte) -128);
        setByteElement(term92005, 2, (byte) -128);
        setByteElement(term92005, 3, (byte) -128);
        setByteElement(term92005, 4, (byte) -128);
        setByteElement(term92005, 6, (byte) -128);
        setField(term92804, term92804.getClass(), "states", term92005);
        setField(term92694, term92694.getClass(), "entries", term92804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term92694;
        callMethod(klass, "getDistance", argTypes, term92480, args);
    }

};



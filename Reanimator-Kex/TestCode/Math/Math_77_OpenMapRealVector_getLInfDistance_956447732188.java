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

public class OpenMapRealVector_getLInfDistance_956447732188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194618;
     Object term194828;

    public OpenMapRealVector_getLInfDistance_956447732188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194618 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term194726 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term192319 = (byte[]) newByteArray(32);
        setIntField(term194726, term194726.getClass(), "count", 0);
        setByteElement(term192319, 0, (byte) -128);
        setByteElement(term192319, 4, (byte) -128);
        setByteElement(term192319, 6, (byte) -128);
        setByteElement(term192319, 7, (byte) -128);
        setByteElement(term192319, 14, (byte) -128);
        setByteElement(term192319, 15, (byte) -128);
        setByteElement(term192319, 17, (byte) -128);
        setByteElement(term192319, 18, (byte) -128);
        setByteElement(term192319, 20, (byte) -128);
        setByteElement(term192319, 25, (byte) -128);
        setByteElement(term192319, 26, (byte) -128);
        setByteElement(term192319, 30, (byte) -128);
        setField(term194726, term194726.getClass(), "states", term192319);
        setField(term194618, term194618.getClass(), "entries", term194726);
        term194828 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term194936 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term193419 = (byte[]) newByteArray(25);
        setIntField(term194936, term194936.getClass(), "count", 0);
        setByteElement(term193419, 0, (byte) -128);
        setByteElement(term193419, 5, (byte) -128);
        setByteElement(term193419, 11, (byte) -128);
        setByteElement(term193419, 13, (byte) -128);
        setByteElement(term193419, 16, (byte) -128);
        setByteElement(term193419, 24, (byte) -128);
        setField(term194936, term194936.getClass(), "states", term193419);
        setField(term194828, term194828.getClass(), "entries", term194936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term194828;
        callMethod(klass, "getLInfDistance", argTypes, term194618, args);
    }

};



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

public class OpenMapRealVector_getL1Distance_162419452193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209066;
     Object term209276;

    public OpenMapRealVector_getL1Distance_162419452193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209066 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term209174 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term200847 = (byte[]) newByteArray(32);
        setIntField(term209174, term209174.getClass(), "count", 0);
        setByteElement(term200847, 7, (byte) -128);
        setByteElement(term200847, 9, (byte) -128);
        setByteElement(term200847, 11, (byte) -128);
        setByteElement(term200847, 12, (byte) -128);
        setByteElement(term200847, 14, (byte) -128);
        setByteElement(term200847, 16, (byte) -128);
        setByteElement(term200847, 21, (byte) -128);
        setByteElement(term200847, 31, (byte) -128);
        setField(term209174, term209174.getClass(), "states", term200847);
        setField(term209066, term209066.getClass(), "entries", term209174);
        term209276 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term209384 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term201947 = (byte[]) newByteArray(512);
        setIntField(term209384, term209384.getClass(), "count", 0);
        setByteElement(term201947, 0, (byte) -128);
        setByteElement(term201947, 1, (byte) -128);
        setByteElement(term201947, 2, (byte) -128);
        setByteElement(term201947, 8, (byte) -128);
        setByteElement(term201947, 10, (byte) -128);
        setByteElement(term201947, 11, (byte) -128);
        setByteElement(term201947, 12, (byte) 1);
        setField(term209384, term209384.getClass(), "states", term201947);
        setField(term209276, term209276.getClass(), "entries", term209384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term209276;
        callMethod(klass, "getL1Distance", argTypes, term209066, args);
    }

};



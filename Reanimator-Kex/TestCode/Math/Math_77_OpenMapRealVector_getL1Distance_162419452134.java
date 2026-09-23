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

public class OpenMapRealVector_getL1Distance_162419452134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110115;
     Object term110325;

    public OpenMapRealVector_getL1Distance_162419452134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110115 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term110223 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term107502 = (byte[]) newByteArray(32);
        setIntField(term110223, term110223.getClass(), "count", 0);
        setByteElement(term107502, 1, (byte) -128);
        setByteElement(term107502, 3, (byte) -128);
        setByteElement(term107502, 8, (byte) -128);
        setByteElement(term107502, 9, (byte) -128);
        setByteElement(term107502, 14, (byte) -128);
        setByteElement(term107502, 25, (byte) -128);
        setByteElement(term107502, 31, (byte) -128);
        setField(term110223, term110223.getClass(), "states", term107502);
        setField(term110115, term110115.getClass(), "entries", term110223);
        term110325 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term110433 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term108601 = (byte[]) newByteArray(30);
        setIntField(term110433, term110433.getClass(), "count", 0);
        setByteElement(term108601, 1, (byte) -128);
        setByteElement(term108601, 6, (byte) -128);
        setByteElement(term108601, 8, (byte) -128);
        setByteElement(term108601, 9, (byte) -128);
        setByteElement(term108601, 15, (byte) -128);
        setByteElement(term108601, 18, (byte) -128);
        setByteElement(term108601, 20, (byte) -128);
        setByteElement(term108601, 24, (byte) -128);
        setByteElement(term108601, 25, (byte) -128);
        setByteElement(term108601, 26, (byte) -128);
        setByteElement(term108601, 27, (byte) -128);
        setField(term110433, term110433.getClass(), "states", term108601);
        setField(term110325, term110325.getClass(), "entries", term110433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term110325;
        callMethod(klass, "getL1Distance", argTypes, term110115, args);
    }

};



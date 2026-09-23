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

public class OpenMapRealVector_getL1Distance_162419452143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155988;
     Object term156198;

    public OpenMapRealVector_getL1Distance_162419452143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155988 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term156096 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term153509 = (byte[]) newByteArray(32);
        setIntField(term156096, term156096.getClass(), "count", 0);
        setByteElement(term153509, 0, (byte) -128);
        setByteElement(term153509, 6, (byte) -128);
        setByteElement(term153509, 7, (byte) -128);
        setByteElement(term153509, 10, (byte) -128);
        setByteElement(term153509, 12, (byte) -128);
        setByteElement(term153509, 17, (byte) -128);
        setByteElement(term153509, 18, (byte) -128);
        setByteElement(term153509, 20, (byte) -128);
        setByteElement(term153509, 26, (byte) -128);
        setByteElement(term153509, 28, (byte) -128);
        setByteElement(term153509, 31, (byte) -128);
        setField(term156096, term156096.getClass(), "states", term153509);
        setField(term155988, term155988.getClass(), "entries", term156096);
        term156198 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term156306 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term154607 = (byte[]) newByteArray(28);
        setIntField(term156306, term156306.getClass(), "count", 0);
        setByteElement(term154607, 0, (byte) -128);
        setByteElement(term154607, 2, (byte) -128);
        setByteElement(term154607, 3, (byte) -128);
        setByteElement(term154607, 6, (byte) -128);
        setByteElement(term154607, 7, (byte) -128);
        setByteElement(term154607, 17, (byte) -128);
        setByteElement(term154607, 18, (byte) -128);
        setByteElement(term154607, 27, (byte) -128);
        setField(term156306, term156306.getClass(), "states", term154607);
        setField(term156198, term156198.getClass(), "entries", term156306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term156198;
        callMethod(klass, "getL1Distance", argTypes, term155988, args);
    }

};



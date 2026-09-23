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

public class OpenMapRealVector_getL1Distance_162419452128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124795;
     Object term125005;

    public OpenMapRealVector_getL1Distance_162419452128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124795 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term124903 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term122977 = (byte[]) newByteArray(32);
        setIntField(term124903, term124903.getClass(), "count", 0);
        setByteElement(term122977, 0, (byte) -128);
        setByteElement(term122977, 1, (byte) -128);
        setByteElement(term122977, 3, (byte) -128);
        setByteElement(term122977, 7, (byte) -128);
        setByteElement(term122977, 8, (byte) -128);
        setByteElement(term122977, 12, (byte) -128);
        setByteElement(term122977, 15, (byte) -128);
        setByteElement(term122977, 16, (byte) -128);
        setByteElement(term122977, 20, (byte) -128);
        setByteElement(term122977, 21, (byte) -128);
        setByteElement(term122977, 29, (byte) -128);
        setField(term124903, term124903.getClass(), "states", term122977);
        setField(term124795, term124795.getClass(), "entries", term124903);
        term125005 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term125113 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term124076 = (byte[]) newByteArray(14);
        setIntField(term125113, term125113.getClass(), "count", 0);
        setByteElement(term124076, 1, (byte) -128);
        setByteElement(term124076, 6, (byte) -128);
        setByteElement(term124076, 8, (byte) -128);
        setByteElement(term124076, 10, (byte) -128);
        setField(term125113, term125113.getClass(), "states", term124076);
        setField(term125005, term125005.getClass(), "entries", term125113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term125005;
        callMethod(klass, "getL1Distance", argTypes, term124795, args);
    }

};



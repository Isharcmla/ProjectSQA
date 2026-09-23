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

public class OpenMapRealVector_getL1Distance_162419452186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191300;
     Object term191510;

    public OpenMapRealVector_getL1Distance_162419452186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191300 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term191408 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term189112 = (byte[]) newByteArray(32);
        setIntField(term191408, term191408.getClass(), "count", 0);
        setByteElement(term189112, 1, (byte) -128);
        setByteElement(term189112, 3, (byte) -128);
        setByteElement(term189112, 4, (byte) -128);
        setByteElement(term189112, 7, (byte) -128);
        setByteElement(term189112, 12, (byte) -128);
        setByteElement(term189112, 13, (byte) -128);
        setByteElement(term189112, 20, (byte) -128);
        setByteElement(term189112, 21, (byte) -128);
        setByteElement(term189112, 31, (byte) -128);
        setField(term191408, term191408.getClass(), "states", term189112);
        setField(term191300, term191300.getClass(), "entries", term191408);
        term191510 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term191618 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term190212 = (byte[]) newByteArray(23);
        setIntField(term191618, term191618.getClass(), "count", 0);
        setByteElement(term190212, 1, (byte) -128);
        setByteElement(term190212, 4, (byte) -128);
        setByteElement(term190212, 7, (byte) -128);
        setByteElement(term190212, 8, (byte) -128);
        setByteElement(term190212, 14, (byte) -128);
        setByteElement(term190212, 19, (byte) -128);
        setByteElement(term190212, 20, (byte) -128);
        setField(term191618, term191618.getClass(), "states", term190212);
        setField(term191510, term191510.getClass(), "entries", term191618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term191510;
        callMethod(klass, "getL1Distance", argTypes, term191300, args);
    }

};



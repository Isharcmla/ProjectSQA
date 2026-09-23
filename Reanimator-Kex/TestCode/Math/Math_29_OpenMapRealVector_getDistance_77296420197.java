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

public class OpenMapRealVector_getDistance_77296420197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100583;

    public OpenMapRealVector_getDistance_77296420197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100583 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term100693 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term99374 = (byte[]) newByteArray(31);
        setIntField(term100693, term100693.getClass(), "count", 0);
        setByteElement(term99374, 27, (byte) 1);
        setByteElement(term99374, 28, (byte) 1);
        setByteElement(term99374, 29, (byte) 1);
        setByteElement(term99374, 30, (byte) 1);
        setField(term100693, term100693.getClass(), "states", term99374);
        setField(term100583, term100583.getClass(), "entries", term100693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getDistance", argTypes, term100583, args);
    }

};



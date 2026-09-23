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

public class OpenMapRealVector_init_1480801966213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253785;

    public OpenMapRealVector_init_1480801966213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term254077 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term254185 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term254077, term254077.getClass(), "virtualSize", 0);
        setField(term254077, term254077.getClass(), "entries", term254185);
        setDoubleField(term254077, term254077.getClass(), "epsilon", 0.0);
        term253785 = (double[]) newDoubleArray(2);
        setDoubleElement(term253785, 0, 6.0139893381810752E17);
        setDoubleElement(term253785, 1, -6.8274545607227146E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term253785;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



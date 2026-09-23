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
import java.lang.Double;

public class OpenMapRealVector_init_594250566115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100142;

    public OpenMapRealVector_init_594250566115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100406 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term100514 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term100406, term100406.getClass(), "virtualSize", 0);
        setField(term100406, term100406.getClass(), "entries", term100514);
        setDoubleField(term100406, term100406.getClass(), "epsilon", 0.0);
        Double term100560 = new Double(5.67347999932425E14);
        Double term100606 = new Double(7.037149295673344E15);
        Double term100652 = new Double(-4.6105600326211994E18);
        term100142 = (Object[]) newArray("java.lang.Double", 4);
        setElement(term100142, 0, term100560);
        setElement(term100142, 1, term100606);
        setElement(term100142, 2, term100652);
        setElement(term100142, 3, term100560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term100142;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



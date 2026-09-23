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

public class OpenMapRealVector_init_594250566118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101029;

    public OpenMapRealVector_init_594250566118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101254 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term101362 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term101254, term101254.getClass(), "virtualSize", 0);
        setField(term101254, term101254.getClass(), "entries", term101362);
        setDoubleField(term101254, term101254.getClass(), "epsilon", 0.0);
        Double term101408 = new Double(2.20677836479430944E17);
        Double term101454 = new Double(0.0);
        term101029 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term101029, 0, term101408);
        setElement(term101029, 1, term101454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term101029;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



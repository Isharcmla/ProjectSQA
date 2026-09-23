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

public class OpenMapRealVector_init_594250566113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97200;

    public OpenMapRealVector_init_594250566113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97585 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term97693 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term97585, term97585.getClass(), "virtualSize", 0);
        setField(term97585, term97585.getClass(), "entries", term97693);
        setDoubleField(term97585, term97585.getClass(), "epsilon", 0.0);
        Double term97739 = new Double(-8.9351416601661932E18);
        Double term97785 = new Double(-8.9351416607030641E18);
        Double term97831 = new Double(-9.2232312993643233E18);
        Double term97877 = new Double(1.16206944138349773E18);
        term97200 = (Object[]) newArray("java.lang.Double", 4);
        setElement(term97200, 0, term97739);
        setElement(term97200, 1, term97785);
        setElement(term97200, 2, term97831);
        setElement(term97200, 3, term97877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term97200;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



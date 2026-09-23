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

public class OpenMapRealVector_init_594250566123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102297;

    public OpenMapRealVector_init_594250566123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102586 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term102694 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term102586, term102586.getClass(), "virtualSize", 0);
        setField(term102586, term102586.getClass(), "entries", term102694);
        setDoubleField(term102586, term102586.getClass(), "epsilon", 0.0);
        Double term102740 = new Double(-9.2222461369479332E18);
        Double term102786 = new Double(5.73887221858305E14);
        Double term102832 = new Double(1.15320952618745856E18);
        Double term102878 = new Double(-9.2171731099524792E18);
        term102297 = (Object[]) newArray("java.lang.Double", 18);
        setElement(term102297, 0, term102740);
        setElement(term102297, 1, term102786);
        setElement(term102297, 2, term102832);
        setElement(term102297, 3, term102878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term102297;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



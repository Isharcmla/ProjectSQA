package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_asin_1415968746414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102507;
     Object term103219;
     Object term103216;

    public Complex_asin_1415968746414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102507 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term102507, term102507.getClass(), "real", 2.3058430779331707E18);
        setDoubleField(term102507, term102507.getClass(), "imaginary", -6.9175290276410819E18);
        term103219 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term103219, term103219.getClass(), "imaginary", -6.9175290276410819E18);
        setDoubleField(term103219, term103219.getClass(), "real", 2.3058430779331707E18);
        term103216 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term103216, term103216.getClass(), "imaginary", -44.126417744193866);
        setDoubleField(term103216, term103216.getClass(), "real", 0.32175056333733887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term102507, args);
        assertTrue(recursiveEquals(term102507, term103219));
        assertTrue(recursiveEquals(retValue, term103216));
    }

};



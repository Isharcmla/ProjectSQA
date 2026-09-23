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

public class Complex_asin_1415968746485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121684;
     Object term121895;
     Object term121892;

    public Complex_asin_1415968746485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121684 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term121684, term121684.getClass(), "real", -9.1513144342269133E18);
        setDoubleField(term121684, term121684.getClass(), "imaginary", -9.2188684372274053E18);
        term121895 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term121895, term121895.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term121895, term121895.getClass(), "real", -9.1513144342269133E18);
        term121892 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term121892, term121892.getClass(), "imaginary", -44.703840879735154);
        setDoubleField(term121892, term121892.getClass(), "real", -0.7817208075995653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term121684, args);
        assertTrue(recursiveEquals(term121684, term121895));
        assertTrue(recursiveEquals(retValue, term121892));
    }

};



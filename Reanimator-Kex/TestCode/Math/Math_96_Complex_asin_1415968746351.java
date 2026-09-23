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

public class Complex_asin_1415968746351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79805;
     Object term80224;
     Object term80221;

    public Complex_asin_1415968746351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79805 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term79805, term79805.getClass(), "real", -9.2042317384374026E18);
        setDoubleField(term79805, term79805.getClass(), "imaginary", -8.0704505322468803E18);
        term80224 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term80224, term80224.getClass(), "imaginary", -8.0704505322468803E18);
        setDoubleField(term80224, term80224.getClass(), "real", -9.2042317384374026E18);
        term80221 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term80221, term80221.getClass(), "imaginary", -44.64449643047422);
        setDoubleField(term80221, term80221.getClass(), "real", -0.8509367020093338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term79805, args);
        assertTrue(recursiveEquals(term79805, term80224));
        assertTrue(recursiveEquals(retValue, term80221));
    }

};



package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;

public class Fraction_doubleValue_192016168530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term924;

    public Fraction_doubleValue_192016168530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term34, term34.getClass(), "denominator", 1134449235);
        setIntField(term34, term34.getClass(), "numerator", -883034806);
        term924 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term924, term924.getClass(), "denominator", 1134449235);
        setIntField(term924, term924.getClass(), "numerator", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "doubleValue", argTypes, term34, args);
        assertTrue(recursiveEquals(term34, term924));
        assertTrue(recursiveEquals(retValue, -0.7783819484879815));
    }

};



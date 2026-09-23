package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_compareTo_1399869179785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321579;
     Object term321669;
     Object term322101;
     Object term322102;

    public Fraction_compareTo_1399869179785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321579 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term321579, term321579.getClass(), "numerator", 1079628126);
        setIntField(term321579, term321579.getClass(), "denominator", 204820989);
        term321669 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term321669, term321669.getClass(), "denominator", 232737883);
        setIntField(term321669, term321669.getClass(), "numerator", 1600769845);
        term322101 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term322101, term322101.getClass(), "denominator", 204820989);
        setIntField(term322101, term322101.getClass(), "numerator", 1079628126);
        term322102 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term322102, term322102.getClass(), "denominator", 232737883);
        setIntField(term322102, term322102.getClass(), "numerator", 1600769845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term321669;
        Object retValue = callMethod(klass, "compareTo", argTypes, term321579, args);
        assertTrue(recursiveEquals(term321579, term322101));
        assertTrue(recursiveEquals(term321669, term322102));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



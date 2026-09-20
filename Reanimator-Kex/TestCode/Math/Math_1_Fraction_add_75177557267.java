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

public class Fraction_add_75177557267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9543;
     Object term9633;
     Object term9744;
     Object term9745;
     Object term9741;

    public Fraction_add_75177557267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9543 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term9543, term9543.getClass(), "numerator", 1048576);
        setIntField(term9543, term9543.getClass(), "denominator", -212292225);
        term9633 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term9633, term9633.getClass(), "numerator", 1048576);
        setIntField(term9633, term9633.getClass(), "denominator", -413825);
        term9744 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term9744, term9744.getClass(), "denominator", -212292225);
        setIntField(term9744, term9744.getClass(), "numerator", 1048576);
        term9745 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term9745, term9745.getClass(), "denominator", -413825);
        setIntField(term9745, term9745.getClass(), "numerator", 1048576);
        term9741 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term9741, term9741.getClass(), "denominator", 212292225);
        setIntField(term9741, term9741.getClass(), "numerator", -538968064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term9633;
        Object retValue = callMethod(klass, "add", argTypes, term9543, args);
        assertTrue(recursiveEquals(term9543, term9744));
        assertTrue(recursiveEquals(term9633, term9745));
        assertTrue(recursiveEquals(retValue, term9741));
    }

};

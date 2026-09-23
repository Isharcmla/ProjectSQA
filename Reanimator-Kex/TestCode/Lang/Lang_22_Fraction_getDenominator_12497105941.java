package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_getDenominator_12497105941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term2614;

    public Fraction_getDenominator_12497105941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term90, term90.getClass(), "numerator", 1134449235);
        setIntField(term90, term90.getClass(), "denominator", -883034806);
        setField(term90, term90.getClass(), "toString", "xxtlPwDYFs");
        setField(term90, term90.getClass(), "toProperString", "jJCZpVmanW");
        term2614 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term2614, term2614.getClass(), "numerator", 1134449235);
        setIntField(term2614, term2614.getClass(), "denominator", -883034806);
        setField(term2614, term2614.getClass(), "toString", "xxtlPwDYFs");
        setField(term2614, term2614.getClass(), "toProperString", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominator", argTypes, term90, args);
        assertTrue(recursiveEquals(term90, term2614));
        assertTrue(recursiveEquals(retValue, -883034806));
    }

};



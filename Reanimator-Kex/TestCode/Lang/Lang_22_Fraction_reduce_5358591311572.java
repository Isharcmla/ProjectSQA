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

public class Fraction_reduce_5358591311572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511535;
     Object term512520;
     Object term512517;

    public Fraction_reduce_5358591311572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511535 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term511535, term511535.getClass(), "numerator", -733444350);
        setIntField(term511535, term511535.getClass(), "denominator", 1648217687);
        term512520 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term512520, term512520.getClass(), "numerator", -733444350);
        setIntField(term512520, term512520.getClass(), "denominator", 1648217687);
        setField(term512520, term512520.getClass(), "toString", null);
        setField(term512520, term512520.getClass(), "toProperString", null);
        term512517 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term512517, term512517.getClass(), "numerator", -733444350);
        setIntField(term512517, term512517.getClass(), "denominator", 1648217687);
        setField(term512517, term512517.getClass(), "toString", null);
        setField(term512517, term512517.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term511535, args);
        assertTrue(recursiveEquals(term511535, term512520));
        assertTrue(recursiveEquals(retValue, term512517));
    }

};



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

public class Complex_acos_1430561531179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27891;
     Object term28123;
     Object term28120;

    public Complex_acos_1430561531179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27891 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27891, term27891.getClass(), "real", -6.9169660776876605E18);
        setDoubleField(term27891, term27891.getClass(), "imaginary", -6.9175290276410819E18);
        term28123 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term28123, term28123.getClass(), "imaginary", -6.9175290276410819E18);
        setDoubleField(term28123, term28123.getClass(), "real", -6.9169660776876605E18);
        term28120 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term28120, term28120.getClass(), "imaginary", -7.278045395879426);
        setDoubleField(term28120, term28120.getClass(), "real", -0.7853981633974483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term27891, args);
        assertTrue(recursiveEquals(term27891, term28123));
        assertTrue(recursiveEquals(retValue, term28120));
    }

};



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

public class Complex_acos_1430561531418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103976;
     Object term104760;
     Object term104757;

    public Complex_acos_1430561531418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103976 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term103976, term103976.getClass(), "real", 5.7646075230342349E17);
        setDoubleField(term103976, term103976.getClass(), "imaginary", 4.6116948145204101E18);
        term104760 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term104760, term104760.getClass(), "imaginary", 4.6116948145204101E18);
        setDoubleField(term104760, term104760.getClass(), "real", 5.7646075230342349E17);
        term104757 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term104757, term104757.getClass(), "imaginary", -43.67602634654761);
        setDoubleField(term104757, term104757.getClass(), "real", 1.4464415669982953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term103976, args);
        assertTrue(recursiveEquals(term103976, term104760));
        assertTrue(recursiveEquals(retValue, term104757));
    }

};



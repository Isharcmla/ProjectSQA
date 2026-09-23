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

public class Complex_pow_629025138193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31073;
     Object term31157;
     Object term31235;
     Object term31236;
     Object term31232;

    public Complex_pow_629025138193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31073 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31073, term31073.getClass(), "real", 2.8823037615171181E17);
        setDoubleField(term31073, term31073.getClass(), "imaginary", -6.9175290276410163E18);
        term31157 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31157, term31157.getClass(), "real", -9.2188684028676669E18);
        setDoubleField(term31157, term31157.getClass(), "imaginary", -9.2188678874715914E18);
        term31235 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31235, term31235.getClass(), "imaginary", -6.9175290276410163E18);
        setDoubleField(term31235, term31235.getClass(), "real", 2.8823037615171181E17);
        term31236 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31236, term31236.getClass(), "imaginary", -9.2188678874715914E18);
        setDoubleField(term31236, term31236.getClass(), "real", -9.2188684028676669E18);
        term31232 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31232, term31232.getClass(), "imaginary", -0.0);
        setDoubleField(term31232, term31232.getClass(), "real", -0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term31157;
        Object retValue = callMethod(klass, "pow", argTypes, term31073, args);
        assertTrue(recursiveEquals(term31073, term31235));
        assertTrue(recursiveEquals(term31157, term31236));
        assertTrue(recursiveEquals(retValue, term31232));
    }

};



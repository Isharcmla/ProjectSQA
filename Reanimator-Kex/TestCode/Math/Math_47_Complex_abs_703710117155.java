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

public class Complex_abs_703710117155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14585;
     Object term14615;

    public Complex_abs_703710117155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14585 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term14585, term14585.getClass(), "isNaN", false);
        setBooleanField(term14585, term14585.getClass(), "isInfinite", false);
        setDoubleField(term14585, term14585.getClass(), "real", 5.62949953421312E15);
        setDoubleField(term14585, term14585.getClass(), "imaginary", -9.2188684372274053E18);
        term14615 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14615, term14615.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term14615, term14615.getClass(), "real", 5.62949953421312E15);
        setBooleanField(term14615, term14615.getClass(), "isNaN", false);
        setBooleanField(term14615, term14615.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term14585, args);
        assertTrue(recursiveEquals(term14585, term14615));
        assertTrue(recursiveEquals(retValue, 9.2188701560534333E18));
    }

};



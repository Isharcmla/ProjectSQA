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

public class Complex_asin_1415968746309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64297;
     Object term64711;
     Object term64708;

    public Complex_asin_1415968746309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64297 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term64297, term64297.getClass(), "real", 2.3059837467020493E18);
        setDoubleField(term64297, term64297.getClass(), "imaginary", -4.6116860184273879E18);
        term64711 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term64711, term64711.getClass(), "imaginary", -4.6116860184273879E18);
        setDoubleField(term64711, term64711.getClass(), "real", 2.3059837467020493E18);
        term64708 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term64708, term64708.getClass(), "imaginary", -43.77985635818842);
        setDoubleField(term64708, term64708.getClass(), "real", 0.4636720227652817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term64297, args);
        assertTrue(recursiveEquals(term64297, term64711));
        assertTrue(recursiveEquals(retValue, term64708));
    }

};



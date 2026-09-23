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

public class Complex_asin_1415968746521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133367;
     Object term133578;
     Object term133575;

    public Complex_asin_1415968746521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133367 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term133367, term133367.getClass(), "real", 1.125899906842624E15);
        setDoubleField(term133367, term133367.getClass(), "imaginary", -9.079256573901013E18);
        term133578 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term133578, term133578.getClass(), "imaginary", -9.079256573901013E18);
        setDoubleField(term133578, term133578.getClass(), "real", 1.125899906842624E15);
        term133575 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term133575, term133575.getClass(), "imaginary", -44.34567117628197);
        setDoubleField(term133575, term133575.getClass(), "real", 1.2400793962666E-4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term133367, args);
        assertTrue(recursiveEquals(term133367, term133578));
        assertTrue(recursiveEquals(retValue, term133575));
    }

};



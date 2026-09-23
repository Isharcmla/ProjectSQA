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

public class Complex_acos_1430561531489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122858;
     Object term123069;
     Object term123066;

    public Complex_acos_1430561531489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122858 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term122858, term122858.getClass(), "real", 7.205786891583488E16);
        setDoubleField(term122858, term122858.getClass(), "imaginary", 2.3058430113611776E18);
        term123069 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term123069, term123069.getClass(), "imaginary", 2.3058430113611776E18);
        setDoubleField(term123069, term123069.getClass(), "real", 7.205786891583488E16);
        term123066 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term123066, term123066.getClass(), "imaginary", -42.975613242355216);
        setDoubleField(term123066, term123066.getClass(), "real", 1.5395563743007166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term122858, args);
        assertTrue(recursiveEquals(term122858, term123069));
        assertTrue(recursiveEquals(retValue, term123066));
    }

};



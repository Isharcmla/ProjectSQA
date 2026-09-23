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

public class Complex_acos_1430561531366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84652;
     Object term85478;
     Object term85475;

    public Complex_acos_1430561531366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84652 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term84652, term84652.getClass(), "real", 128.0);
        setDoubleField(term84652, term84652.getClass(), "imaginary", 2.3080948090273792E18);
        term85478 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term85478, term85478.getClass(), "imaginary", 2.3080948090273792E18);
        setDoubleField(term85478, term85478.getClass(), "real", 128.0);
        term85475 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term85475, term85475.getClass(), "imaginary", -42.97610128068966);
        setDoubleField(term85475, term85475.getClass(), "real", 1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term84652, args);
        assertTrue(recursiveEquals(term84652, term85478));
        assertTrue(recursiveEquals(retValue, term85475));
    }

};



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

public class Complex_sqrt1z_866612664461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114705;
     Object term115632;
     Object term115629;

    public Complex_sqrt1z_866612664461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114705 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term114705, term114705.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term114705, term114705.getClass(), "imaginary", -9.2188684372263567E18);
        term115632 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115632, term115632.getClass(), "imaginary", -9.2188684372263567E18);
        setDoubleField(term115632, term115632.getClass(), "real", -9.2188684372274053E18);
        term115629 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115629, term115629.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term115629, term115629.getClass(), "real", 9.2188684372263557E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term114705, args);
        assertTrue(recursiveEquals(term114705, term115632));
        assertTrue(recursiveEquals(retValue, term115629));
    }

};



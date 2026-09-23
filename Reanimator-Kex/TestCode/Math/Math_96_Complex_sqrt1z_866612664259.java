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

public class Complex_sqrt1z_866612664259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48230;
     Object term48327;
     Object term48324;

    public Complex_sqrt1z_866612664259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48230 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48230, term48230.getClass(), "real", -9.2188684372253082E18);
        setDoubleField(term48230, term48230.getClass(), "imaginary", -9.2188684372190167E18);
        term48327 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48327, term48327.getClass(), "imaginary", -9.2188684372190167E18);
        setDoubleField(term48327, term48327.getClass(), "real", -9.2188684372253082E18);
        term48324 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48324, term48324.getClass(), "imaginary", -9.2188684372253082E18);
        setDoubleField(term48324, term48324.getClass(), "real", 9.2188684372190167E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term48230, args);
        assertTrue(recursiveEquals(term48230, term48327));
        assertTrue(recursiveEquals(retValue, term48324));
    }

};



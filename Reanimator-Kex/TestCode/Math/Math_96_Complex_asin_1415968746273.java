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

public class Complex_asin_1415968746273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52051;
     Object term52478;
     Object term52475;

    public Complex_asin_1415968746273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52051 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term52051, term52051.getClass(), "real", -9.0792568487789199E18);
        setDoubleField(term52051, term52051.getClass(), "imaginary", -9.2166166374137201E18);
        term52478 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term52478, term52478.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term52478, term52478.getClass(), "real", -9.0792568487789199E18);
        term52475 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term52475, term52475.getClass(), "imaginary", -44.699808987962776);
        setDoubleField(term52475, term52475.getClass(), "real", -0.7778906121431219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term52051, args);
        assertTrue(recursiveEquals(term52051, term52478));
        assertTrue(recursiveEquals(retValue, term52475));
    }

};



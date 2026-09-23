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

public class Complex_asin_141596874666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2290;
     Object term2816;
     Object term2813;

    public Complex_asin_141596874666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2290 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2290, term2290.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term2290, term2290.getClass(), "imaginary", -9.2031058385316086E18);
        term2816 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2816, term2816.getClass(), "imaginary", -9.2031058385316086E18);
        setDoubleField(term2816, term2816.getClass(), "real", 9.2188684372274053E18);
        term2813 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2813, term2813.getClass(), "imaginary", -44.70664983641161);
        setDoubleField(term2813, term2813.getClass(), "real", 0.7862538043083048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term2290, args);
        assertTrue(recursiveEquals(term2290, term2816));
        assertTrue(recursiveEquals(retValue, term2813));
    }

};



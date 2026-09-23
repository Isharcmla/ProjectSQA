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

public class Complex_asin_1415968746173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26800;
     Object term27011;
     Object term27008;

    public Complex_asin_1415968746173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26800 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term26800, term26800.getClass(), "real", 5.7646075257185894E17);
        setDoubleField(term26800, term26800.getClass(), "imaginary", -9.1873432398357463E18);
        term27011 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27011, term27011.getClass(), "imaginary", -9.1873432398357463E18);
        setDoubleField(term27011, term27011.getClass(), "real", 5.7646075257185894E17);
        term27008 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27008, term27008.getClass(), "imaginary", -44.35947026543281);
        setDoubleField(term27008, term27008.getClass(), "real", 0.06266295064521053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term26800, args);
        assertTrue(recursiveEquals(term26800, term27011));
        assertTrue(recursiveEquals(retValue, term27008));
    }

};



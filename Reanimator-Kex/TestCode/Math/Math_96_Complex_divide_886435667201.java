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

public class Complex_divide_886435667201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32955;
     Object term33039;
     Object term33078;
     Object term33079;
     Object term33075;

    public Complex_divide_886435667201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32955 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32955, term32955.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term32955, term32955.getClass(), "imaginary", -9.2166166374137201E18);
        term33039 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33039, term33039.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term33039, term33039.getClass(), "imaginary", -9.2166166374137201E18);
        term33078 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33078, term33078.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term33078, term33078.getClass(), "real", -9.2188684372274053E18);
        term33079 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33079, term33079.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term33079, term33079.getClass(), "real", 9.2188684372274053E18);
        term33075 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33075, term33075.getClass(), "imaginary", -0.999999970161265);
        setDoubleField(term33075, term33075.getClass(), "real", -2.4428972397230893E-4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term33039;
        Object retValue = callMethod(klass, "divide", argTypes, term32955, args);
        assertTrue(recursiveEquals(term32955, term33078));
        assertTrue(recursiveEquals(term33039, term33079));
        assertTrue(recursiveEquals(retValue, term33075));
    }

};



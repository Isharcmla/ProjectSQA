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

public class Complex_log_95678275189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30521;
     Object term30554;
     Object term30551;

    public Complex_log_95678275189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30521 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30521, term30521.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term30521, term30521.getClass(), "imaginary", 9.2188684372274053E18);
        term30554 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30554, term30554.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term30554, term30554.getClass(), "real", -9.2188684372274053E18);
        term30551 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30551, term30551.getClass(), "imaginary", 2.356194490192345);
        setDoubleField(term30551, term30551.getClass(), "real", 44.01435756505842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "log", argTypes, term30521, args);
        assertTrue(recursiveEquals(term30521, term30554));
        assertTrue(recursiveEquals(retValue, term30551));
    }

};



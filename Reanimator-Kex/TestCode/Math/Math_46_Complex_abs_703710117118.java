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

public class Complex_abs_703710117118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7072;
     Object term7105;

    public Complex_abs_703710117118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7072 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7072, term7072.getClass(), "isNaN", false);
        setBooleanField(term7072, term7072.getClass(), "isInfinite", false);
        setDoubleField(term7072, term7072.getClass(), "real", 9.2195614560039731E18);
        setDoubleField(term7072, term7072.getClass(), "imaginary", -3.810580850802688E15);
        term7105 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7105, term7105.getClass(), "imaginary", -3.810580850802688E15);
        setDoubleField(term7105, term7105.getClass(), "real", 9.2195614560039731E18);
        setBooleanField(term7105, term7105.getClass(), "isNaN", false);
        setBooleanField(term7105, term7105.getClass(), "isInfinite", false);
        setBooleanField(term7105, term7105.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term7072, args);
        assertTrue(recursiveEquals(term7072, term7105));
        assertTrue(recursiveEquals(retValue, 9.219562243488599E18));
    }

};



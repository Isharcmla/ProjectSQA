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

public class Complex_asin_1415968746241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43234;
     Object term43450;
     Object term43447;

    public Complex_asin_1415968746241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43234 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term43234, term43234.getClass(), "real", -9.0792216644068311E18);
        setDoubleField(term43234, term43234.getClass(), "imaginary", -4.6094342186137027E18);
        term43450 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term43450, term43450.getClass(), "imaginary", -4.6094342186137027E18);
        setDoubleField(term43450, term43450.getClass(), "real", -9.0792216644068311E18);
        term43447 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term43447, term43447.getClass(), "imaginary", -44.460329370849635);
        setDoubleField(term43447, term43447.getClass(), "real", -1.1010152948868803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term43234, args);
        assertTrue(recursiveEquals(term43234, term43450));
        assertTrue(recursiveEquals(retValue, term43447));
    }

};



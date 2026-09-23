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
import java.lang.Double;

public class Complex_asin_141596874651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;
     Object term492;
     Object term482;

    public Complex_asin_141596874651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term103, term103.getClass(), "imaginary", 0.8878841294187743);
        setDoubleField(term103, term103.getClass(), "real", 0.6588948704887806);
        setBooleanField(term103, term103.getClass(), "isNaN", true);
        setBooleanField(term103, term103.getClass(), "isInfinite", false);
        term492 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term492, term492.getClass(), "imaginary", 0.8878841294187743);
        setDoubleField(term492, term492.getClass(), "real", 0.6588948704887806);
        setBooleanField(term492, term492.getClass(), "isNaN", true);
        setBooleanField(term492, term492.getClass(), "isInfinite", false);
        term482 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term482, term482.getClass(), "imaginary", Double.NaN);
        setDoubleField(term482, term482.getClass(), "real", Double.NaN);
        setBooleanField(term482, term482.getClass(), "isNaN", true);
        setBooleanField(term482, term482.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term103, args);
        assertTrue(recursiveEquals(term103, term492));
        assertTrue(recursiveEquals(retValue, term482));
    }

};



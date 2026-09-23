package org.apache.commons.math.stat.descriptive.moment;

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
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.moment.EqualityUtils.*;
import java.lang.Double;

public class Variance_evaluate_1226774499136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178507;
     Object term172569;
     Object term194970;
     Object term194971;

    public Variance_evaluate_1226774499136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178507 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term172569 = (double[]) newDoubleArray(483);
        term194970 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term194970, term194970.getClass(), "moment", null);
        setBooleanField(term194970, term194970.getClass(), "incMoment", false);
        setBooleanField(term194970, term194970.getClass(), "isBiasCorrected", false);
        setField(term194970, term194970.getClass(), "storedData", null);
        term194971 = (double[]) newDoubleArray(483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term172569;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term178507, args);
        assertTrue(recursiveEquals(term178507, term194970));
        assertTrue(recursiveEquals(term172569, term194971));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};



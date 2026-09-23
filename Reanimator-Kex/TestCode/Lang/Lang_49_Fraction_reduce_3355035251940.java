package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035251940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569876;
     Object term570175;
     Object term570169;

    public Fraction_reduce_3355035251940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569876 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term569876, term569876.getClass(), "numerator", 123784178);
        setIntField(term569876, term569876.getClass(), "denominator", 1929598993);
        term570175 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570175, term570175.getClass(), "numerator", 123784178);
        setIntField(term570175, term570175.getClass(), "denominator", 1929598993);
        setField(term570175, term570175.getClass(), "toString", null);
        setField(term570175, term570175.getClass(), "toProperString", null);
        term570169 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570169, term570169.getClass(), "numerator", 17683454);
        setIntField(term570169, term570169.getClass(), "denominator", 275656999);
        setField(term570169, term570169.getClass(), "toString", null);
        setField(term570169, term570169.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term569876, args);
        assertTrue(recursiveEquals(term569876, term570175));
        assertTrue(recursiveEquals(retValue, term570169));
    }

};



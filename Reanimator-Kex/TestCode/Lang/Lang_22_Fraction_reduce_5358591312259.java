package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736901;
     Object term737510;
     Object term737504;

    public Fraction_reduce_5358591312259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736901 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term736901, term736901.getClass(), "numerator", 470944162);
        setIntField(term736901, term736901.getClass(), "denominator", 1743863849);
        term737510 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term737510, term737510.getClass(), "numerator", 470944162);
        setIntField(term737510, term737510.getClass(), "denominator", 1743863849);
        setField(term737510, term737510.getClass(), "toString", null);
        setField(term737510, term737510.getClass(), "toProperString", null);
        term737504 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term737504, term737504.getClass(), "numerator", 36226474);
        setIntField(term737504, term737504.getClass(), "denominator", 134143373);
        setField(term737504, term737504.getClass(), "toString", null);
        setField(term737504, term737504.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term736901, args);
        assertTrue(recursiveEquals(term736901, term737510));
        assertTrue(recursiveEquals(retValue, term737504));
    }

};



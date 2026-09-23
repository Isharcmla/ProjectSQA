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

public class Fraction_reduce_535859131217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54926;
     Object term55820;
     Object term55814;

    public Fraction_reduce_535859131217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54926 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term54926, term54926.getClass(), "numerator", -1064701266);
        setIntField(term54926, term54926.getClass(), "denominator", 2143120113);
        term55820 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term55820, term55820.getClass(), "numerator", -1064701266);
        setIntField(term55820, term55820.getClass(), "denominator", 2143120113);
        setField(term55820, term55820.getClass(), "toString", null);
        setField(term55820, term55820.getClass(), "toProperString", null);
        term55814 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term55814, term55814.getClass(), "numerator", -354900422);
        setIntField(term55814, term55814.getClass(), "denominator", 714373371);
        setField(term55814, term55814.getClass(), "toString", null);
        setField(term55814, term55814.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term54926, args);
        assertTrue(recursiveEquals(term54926, term55820));
        assertTrue(recursiveEquals(retValue, term55814));
    }

};



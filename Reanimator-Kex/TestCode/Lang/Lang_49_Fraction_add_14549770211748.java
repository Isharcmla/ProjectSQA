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

public class Fraction_add_14549770211748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511341;
     Object term511421;
     Object term512239;
     Object term512240;
     Object term512236;

    public Fraction_add_14549770211748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511341 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term511341, term511341.getClass(), "numerator", 32);
        setIntField(term511341, term511341.getClass(), "denominator", 1083572412);
        term511421 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term511421, term511421.getClass(), "numerator", 64);
        setIntField(term511421, term511421.getClass(), "denominator", -1540685874);
        term512239 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term512239, term512239.getClass(), "numerator", 32);
        setIntField(term512239, term512239.getClass(), "denominator", 1083572412);
        setField(term512239, term512239.getClass(), "toString", null);
        setField(term512239, term512239.getClass(), "toProperString", null);
        term512240 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term512240, term512240.getClass(), "numerator", 64);
        setIntField(term512240, term512240.getClass(), "denominator", -1540685874);
        setField(term512240, term512240.getClass(), "toString", null);
        setField(term512240, term512240.getClass(), "toProperString", null);
        term512236 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term512236, term512236.getClass(), "numerator", 42834800);
        setIntField(term512236, term512236.getClass(), "denominator", -165682870);
        setField(term512236, term512236.getClass(), "toString", null);
        setField(term512236, term512236.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term511421;
        Object retValue = callMethod(klass, "add", argTypes, term511341, args);
        assertTrue(recursiveEquals(term511341, term512239));
        assertTrue(recursiveEquals(term511421, term512240));
        assertTrue(recursiveEquals(retValue, term512236));
    }

};



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

public class Fraction_reduce_535859131782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247446;
     Object term247987;
     Object term247981;

    public Fraction_reduce_535859131782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247446 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term247446, term247446.getClass(), "numerator", -536870910);
        setIntField(term247446, term247446.getClass(), "denominator", 2141970423);
        term247987 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term247987, term247987.getClass(), "numerator", -536870910);
        setIntField(term247987, term247987.getClass(), "denominator", 2141970423);
        setField(term247987, term247987.getClass(), "toString", null);
        setField(term247987, term247987.getClass(), "toProperString", null);
        term247981 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term247981, term247981.getClass(), "numerator", -178956970);
        setIntField(term247981, term247981.getClass(), "denominator", 713990141);
        setField(term247981, term247981.getClass(), "toString", null);
        setField(term247981, term247981.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term247446, args);
        assertTrue(recursiveEquals(term247446, term247987));
        assertTrue(recursiveEquals(retValue, term247981));
    }

};



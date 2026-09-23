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

public class Fraction_reduce_535859131757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238960;
     Object term239669;
     Object term239666;

    public Fraction_reduce_535859131757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238960 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term238960, term238960.getClass(), "numerator", -1708736478);
        setIntField(term238960, term238960.getClass(), "denominator", 1560707207);
        term239669 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239669, term239669.getClass(), "numerator", -1708736478);
        setIntField(term239669, term239669.getClass(), "denominator", 1560707207);
        setField(term239669, term239669.getClass(), "toString", null);
        setField(term239669, term239669.getClass(), "toProperString", null);
        term239666 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239666, term239666.getClass(), "numerator", -1708736478);
        setIntField(term239666, term239666.getClass(), "denominator", 1560707207);
        setField(term239666, term239666.getClass(), "toString", null);
        setField(term239666, term239666.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term238960, args);
        assertTrue(recursiveEquals(term238960, term239669));
        assertTrue(recursiveEquals(retValue, term239666));
    }

};



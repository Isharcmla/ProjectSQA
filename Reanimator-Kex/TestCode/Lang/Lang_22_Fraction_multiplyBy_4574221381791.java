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

public class Fraction_multiplyBy_4574221381791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582944;
     Object term583026;
     Object term583615;
     Object term583616;
     Object term583606;

    public Fraction_multiplyBy_4574221381791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582944 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term582944, term582944.getClass(), "numerator", 1828716544);
        setIntField(term582944, term582944.getClass(), "denominator", 262144);
        term583026 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term583026, term583026.getClass(), "numerator", 1073741824);
        setIntField(term583026, term583026.getClass(), "denominator", 262144);
        term583615 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term583615, term583615.getClass(), "numerator", 1828716544);
        setIntField(term583615, term583615.getClass(), "denominator", 262144);
        setField(term583615, term583615.getClass(), "toString", null);
        setField(term583615, term583615.getClass(), "toProperString", null);
        term583616 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term583616, term583616.getClass(), "numerator", 1073741824);
        setIntField(term583616, term583616.getClass(), "denominator", 262144);
        setField(term583616, term583616.getClass(), "toString", null);
        setField(term583616, term583616.getClass(), "toProperString", null);
        term583606 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term583606, term583606.getClass(), "numerator", 28573696);
        setIntField(term583606, term583606.getClass(), "denominator", 1);
        setField(term583606, term583606.getClass(), "toString", null);
        setField(term583606, term583606.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term583026;
        Object retValue = callMethod(klass, "multiplyBy", argTypes, term582944, args);
        assertTrue(recursiveEquals(term582944, term583615));
        assertTrue(recursiveEquals(term583026, term583616));
        assertTrue(recursiveEquals(retValue, term583606));
    }

};



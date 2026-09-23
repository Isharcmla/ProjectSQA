package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314652;
     Object term314740;

    public Fraction_add_1925368547835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314652 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term314652, term314652.getClass(), "numerator", 1073741824);
        setIntField(term314652, term314652.getClass(), "denominator", -144695565);
        term314740 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term314740, term314740.getClass(), "numerator", 268435456);
        setIntField(term314740, term314740.getClass(), "denominator", 1742712631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term314740;
        callMethod(klass, "add", argTypes, term314652, args);
    }

};



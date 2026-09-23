package org.jfree.chart.renderer;

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
import static org.jfree.chart.renderer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.renderer.EqualityUtils.*;

public class GrayPaintScale_equals_147369133512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term19;
     Object term64;
     Object term65;

    public GrayPaintScale_equals_147369133512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term16, term16.getClass(), "lowerBound", 0.2641345529914265);
        setDoubleField(term16, term16.getClass(), "upperBound", 1.0);
        term19 = newInstance(Class.forName("java.lang.Object"));
        term64 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term64, term64.getClass(), "lowerBound", 0.2641345529914265);
        setDoubleField(term64, term64.getClass(), "upperBound", 1.0);
        term65 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19;
        Object retValue = callMethod(klass, "equals", argTypes, term16, args);
        assertTrue(recursiveEquals(term16, term64));
        assertTrue(recursiveEquals(term19, term65));
        assertTrue(recursiveEquals(retValue, false));
    }

};



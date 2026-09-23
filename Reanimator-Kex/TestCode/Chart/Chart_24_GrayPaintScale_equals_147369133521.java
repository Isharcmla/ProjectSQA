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

public class GrayPaintScale_equals_147369133521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006;
     Object term1090;
     Object term1102;
     Object term1103;

    public GrayPaintScale_equals_147369133521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1006 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1006, term1006.getClass(), "lowerBound", 7.1156874112496435E18);
        term1090 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1090, term1090.getClass(), "lowerBound", -5.6520175323457126E18);
        term1102 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1102, term1102.getClass(), "lowerBound", 7.1156874112496435E18);
        setDoubleField(term1102, term1102.getClass(), "upperBound", 0.0);
        term1103 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1103, term1103.getClass(), "lowerBound", -5.6520175323457126E18);
        setDoubleField(term1103, term1103.getClass(), "upperBound", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1090;
        Object retValue = callMethod(klass, "equals", argTypes, term1006, args);
        assertTrue(recursiveEquals(term1006, term1102));
        assertTrue(recursiveEquals(term1090, term1103));
        assertTrue(recursiveEquals(retValue, false));
    }

};



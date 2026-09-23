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
import java.lang.Double;

public class GrayPaintScale_getPaint_65824968211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term14;
     Object term56;
     Object term49;

    public GrayPaintScale_getPaint_65824968211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term11, term11.getClass(), "lowerBound", 0.28570734989730284);
        setDoubleField(term11, term11.getClass(), "upperBound", 1.0);
        term14 = new Double(0.40176586625454525);
        term56 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term56, term56.getClass(), "lowerBound", 0.28570734989730284);
        setDoubleField(term56, term56.getClass(), "upperBound", 1.0);
        term49 = newInstance(Class.forName("java.awt.Color"));
        setIntField(term49, term49.getClass(), "value", -14079703);
        setField(term49, term49.getClass(), "frgbvalue", null);
        setField(term49, term49.getClass(), "fvalue", null);
        setFloatField(term49, term49.getClass(), "falpha", 0.0F);
        setField(term49, term49.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term14;
        Object retValue = callMethod(klass, "getPaint", argTypes, term11, args);
        assertTrue(recursiveEquals(term11, term56));
        assertTrue(recursiveEquals(term14, 0.40176586625454525));
        assertTrue(recursiveEquals(retValue, term49));
    }

};



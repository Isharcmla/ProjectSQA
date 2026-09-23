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

public class GrayPaintScale_equals_147369133523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;
     Object term1301;
     Object term1315;
     Object term1316;

    public GrayPaintScale_equals_147369133523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1217 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1217, term1217.getClass(), "lowerBound", -9.2188332528553165E18);
        setDoubleField(term1217, term1217.getClass(), "upperBound", 7.7259251612909568E18);
        term1301 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1301, term1301.getClass(), "lowerBound", -9.2188332528553165E18);
        setDoubleField(term1301, term1301.getClass(), "upperBound", -5.3029885606918881E18);
        term1315 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1315, term1315.getClass(), "lowerBound", -9.2188332528553165E18);
        setDoubleField(term1315, term1315.getClass(), "upperBound", 7.7259251612909568E18);
        term1316 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term1316, term1316.getClass(), "lowerBound", -9.2188332528553165E18);
        setDoubleField(term1316, term1316.getClass(), "upperBound", -5.3029885606918881E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1301;
        Object retValue = callMethod(klass, "equals", argTypes, term1217, args);
        assertTrue(recursiveEquals(term1217, term1315));
        assertTrue(recursiveEquals(term1301, term1316));
        assertTrue(recursiveEquals(retValue, false));
    }

};



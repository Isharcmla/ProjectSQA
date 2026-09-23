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

public class GrayPaintScale_clone_52569106313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term73;
     Object term67;

    public GrayPaintScale_clone_52569106313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term20, term20.getClass(), "lowerBound", 0.36923381893433327);
        setDoubleField(term20, term20.getClass(), "upperBound", 1.0);
        term73 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term73, term73.getClass(), "lowerBound", 0.36923381893433327);
        setDoubleField(term73, term73.getClass(), "upperBound", 1.0);
        term67 = newInstance(Class.forName("org.jfree.chart.renderer.GrayPaintScale"));
        setDoubleField(term67, term67.getClass(), "lowerBound", 0.36923381893433327);
        setDoubleField(term67, term67.getClass(), "upperBound", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.GrayPaintScale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term20, args);
        assertTrue(recursiveEquals(term20, term73));
        assertTrue(recursiveEquals(retValue, term67));
    }

};



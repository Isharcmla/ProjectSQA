package org.jfree.chart.renderer.category;

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
import java.lang.NullPointerException;
import static org.jfree.chart.renderer.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Integer;

public class AbstractCategoryItemRenderer_updateCrosshairValues_1796993309118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943;
     Object term953;
     Object term955;
     Object term957;
     Object term959;
     Object term961;

    public AbstractCategoryItemRenderer_updateCrosshairValues_1796993309118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943 = newInstance(Class.forName("org.jfree.chart.plot.CategoryCrosshairState"));
        setField(term943, term943.getClass(), "rowKey", null);
        setField(term943, term943.getClass(), "columnKey", null);
        setBooleanField(term943, term943.getClass(), "calculateDistanceInDataSpace", true);
        setDoubleField(term943, term943.getClass(), "anchorX", 0.2641345529914265);
        setDoubleField(term943, term943.getClass(), "anchorY", 0.36923381893433327);
        setField(term943, term943.getClass(), "anchor", null);
        setDoubleField(term943, term943.getClass(), "crosshairX", 0.6076495596892013);
        setDoubleField(term943, term943.getClass(), "crosshairY", 0.37773193782763337);
        setIntField(term943, term943.getClass(), "datasetIndex", -2068769794);
        setIntField(term943, term943.getClass(), "domainAxisIndex", -117576464);
        setIntField(term943, term943.getClass(), "rangeAxisIndex", -1007160944);
        setDoubleField(term943, term943.getClass(), "distance", 0.8474802076607362);
        term953 = new Double(0.5183269973490326);
        term955 = new Integer(1135664017);
        term957 = new Double(0.7655020693602768);
        term959 = new Double(0.1374549299694151);
        term961 = newInstance(Class.forName("org.jfree.chart.plot.PlotOrientation"));
        setField(term961, term961.getClass(), "name", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("org.jfree.chart.plot.CategoryCrosshairState");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        argTypes[3] = double.class;
        argTypes[4] = int.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        argTypes[7] = Class.forName("org.jfree.chart.plot.PlotOrientation");
        Object[] args = new Object[8];
        args[0] = term943;
        args[1] = null;
        args[2] = null;
        args[3] = term953;
        args[4] = term955;
        args[5] = term957;
        args[6] = term959;
        args[7] = term961;
        try {
            callMethod(klass, "updateCrosshairValues", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};

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
import java.lang.Object;
import java.util.ArrayList;

public class AbstractCategoryItemRenderer_createState_488326313101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public AbstractCategoryItemRenderer_createState_488326313101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85 = new ArrayList();
        ArrayList term90 = new ArrayList();
        ArrayList term94 = new ArrayList();
        term72 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term73 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term74 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term79 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term80 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term89 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term74, term74.getClass(), "x", 0.0);
        setDoubleField(term74, term74.getClass(), "y", 0.0);
        setDoubleField(term74, term74.getClass(), "width", 0.0);
        setDoubleField(term74, term74.getClass(), "height", 0.0);
        setField(term73, term73.getClass(), "chartArea", term74);
        setField(term79, term79.getClass(), "owner", term73);
        setField(term79, term79.getClass(), "plotArea", null);
        setDoubleField(term80, term80.getClass(), "x", 0.0);
        setDoubleField(term80, term80.getClass(), "y", 0.0);
        setDoubleField(term80, term80.getClass(), "width", 0.0);
        setDoubleField(term80, term80.getClass(), "height", 0.0);
        setField(term79, term79.getClass(), "dataArea", term80);
        setField(term79, term79.getClass(), "subplotInfo", term85);
        setField(term73, term73.getClass(), "plotInfo", term79);
        setField(term89, term89.getClass(), "entities", term90);
        setField(term73, term73.getClass(), "entities", term89);
        setField(term73, term73.getClass(), "renderingSource", null);
        setField(term72, term72.getClass(), "owner", term73);
        setField(term72, term72.getClass(), "plotArea", null);
        setField(term72, term72.getClass(), "dataArea", null);
        setField(term72, term72.getClass(), "subplotInfo", term94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[1];
        args[0] = term72;
        try {
            callMethod(klass, "createState", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};

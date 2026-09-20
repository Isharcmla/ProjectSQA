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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.renderer.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class AbstractCategoryItemRenderer_initialise_884075054102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;

    public AbstractCategoryItemRenderer_initialise_884075054102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term111 = new ArrayList();
        ArrayList term116 = new ArrayList();
        ArrayList term120 = new ArrayList();
        term98 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term99 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term100 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term105 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term106 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term115 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term100, term100.getClass(), "x", 0.0);
        setDoubleField(term100, term100.getClass(), "y", 0.0);
        setDoubleField(term100, term100.getClass(), "width", 0.0);
        setDoubleField(term100, term100.getClass(), "height", 0.0);
        setField(term99, term99.getClass(), "chartArea", term100);
        setField(term105, term105.getClass(), "owner", term99);
        setField(term105, term105.getClass(), "plotArea", null);
        setDoubleField(term106, term106.getClass(), "x", 0.0);
        setDoubleField(term106, term106.getClass(), "y", 0.0);
        setDoubleField(term106, term106.getClass(), "width", 0.0);
        setDoubleField(term106, term106.getClass(), "height", 0.0);
        setField(term105, term105.getClass(), "dataArea", term106);
        setField(term105, term105.getClass(), "subplotInfo", term111);
        setField(term99, term99.getClass(), "plotInfo", term105);
        setField(term115, term115.getClass(), "entities", term116);
        setField(term99, term99.getClass(), "entities", term115);
        setField(term99, term99.getClass(), "renderingSource", null);
        setField(term98, term98.getClass(), "owner", term99);
        setField(term98, term98.getClass(), "plotArea", null);
        setField(term98, term98.getClass(), "dataArea", null);
        setField(term98, term98.getClass(), "subplotInfo", term120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.CategoryPlot");
        argTypes[3] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[4] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term98;
        try {
            callMethod(klass, "initialise", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};

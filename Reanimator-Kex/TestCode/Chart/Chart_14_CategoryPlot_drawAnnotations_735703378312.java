package org.jfree.chart.plot;

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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class CategoryPlot_drawAnnotations_735703378312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3286;

    public CategoryPlot_drawAnnotations_735703378312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3299 = new ArrayList();
        ArrayList term3304 = new ArrayList();
        ArrayList term3308 = new ArrayList();
        term3286 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3287 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3288 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3293 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3294 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3303 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3288, term3288.getClass(), "x", 0.0);
        setDoubleField(term3288, term3288.getClass(), "y", 0.0);
        setDoubleField(term3288, term3288.getClass(), "width", 0.0);
        setDoubleField(term3288, term3288.getClass(), "height", 0.0);
        setField(term3287, term3287.getClass(), "chartArea", term3288);
        setField(term3293, term3293.getClass(), "owner", term3287);
        setField(term3293, term3293.getClass(), "plotArea", null);
        setDoubleField(term3294, term3294.getClass(), "x", 0.0);
        setDoubleField(term3294, term3294.getClass(), "y", 0.0);
        setDoubleField(term3294, term3294.getClass(), "width", 0.0);
        setDoubleField(term3294, term3294.getClass(), "height", 0.0);
        setField(term3293, term3293.getClass(), "dataArea", term3294);
        setField(term3293, term3293.getClass(), "subplotInfo", term3299);
        setField(term3287, term3287.getClass(), "plotInfo", term3293);
        setField(term3303, term3303.getClass(), "entities", term3304);
        setField(term3287, term3287.getClass(), "entities", term3303);
        setField(term3286, term3286.getClass(), "owner", term3287);
        setField(term3286, term3286.getClass(), "plotArea", null);
        setField(term3286, term3286.getClass(), "dataArea", null);
        setField(term3286, term3286.getClass(), "subplotInfo", term3308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term3286;
        try {
            callMethod(klass, "drawAnnotations", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



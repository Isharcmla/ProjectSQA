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

public class XYPlot_drawAnnotations_1402403819382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843;

    public XYPlot_drawAnnotations_1402403819382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term856 = new ArrayList();
        ArrayList term861 = new ArrayList();
        ArrayList term865 = new ArrayList();
        term843 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term844 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term845 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term850 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term851 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term860 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term845, term845.getClass(), "x", 0.0);
        setDoubleField(term845, term845.getClass(), "y", 0.0);
        setDoubleField(term845, term845.getClass(), "width", 0.0);
        setDoubleField(term845, term845.getClass(), "height", 0.0);
        setField(term844, term844.getClass(), "chartArea", term845);
        setField(term850, term850.getClass(), "owner", term844);
        setField(term850, term850.getClass(), "plotArea", null);
        setDoubleField(term851, term851.getClass(), "x", 0.0);
        setDoubleField(term851, term851.getClass(), "y", 0.0);
        setDoubleField(term851, term851.getClass(), "width", 0.0);
        setDoubleField(term851, term851.getClass(), "height", 0.0);
        setField(term850, term850.getClass(), "dataArea", term851);
        setField(term850, term850.getClass(), "subplotInfo", term856);
        setField(term844, term844.getClass(), "plotInfo", term850);
        setField(term860, term860.getClass(), "entities", term861);
        setField(term844, term844.getClass(), "entities", term860);
        setField(term844, term844.getClass(), "renderingSource", null);
        setField(term843, term843.getClass(), "owner", term844);
        setField(term843, term843.getClass(), "plotArea", null);
        setField(term843, term843.getClass(), "dataArea", null);
        setField(term843, term843.getClass(), "subplotInfo", term865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term843;
        try {
            callMethod(klass, "drawAnnotations", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



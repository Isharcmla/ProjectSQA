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
import java.util.LinkedList;
import java.lang.Double;
import java.lang.Object;
import java.util.ArrayList;

public class PiePlot_drawLabels_929115373216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;
     Object term369;
     Object term371;

    public PiePlot_drawLabels_929115373216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = new LinkedList();
        term369 = new Double(0.7633268466829064);
        ArrayList term392 = new ArrayList();
        ArrayList term396 = new ArrayList();
        ArrayList term399 = new ArrayList();
        term371 = newInstance(Class.forName("org.jfree.chart.plot.PiePlotState"));
        Object term379 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term380 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term381 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term386 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term387 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term395 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setIntField(term371, term371.getClass(), "passesRequired", 1585847225);
        setDoubleField(term371, term371.getClass(), "total", 0.13481025392611334);
        setDoubleField(term371, term371.getClass(), "latestAngle", 0.3800088629986428);
        setField(term371, term371.getClass(), "explodedPieArea", null);
        setField(term371, term371.getClass(), "pieArea", null);
        setDoubleField(term371, term371.getClass(), "pieCenterX", 0.5840714198152577);
        setDoubleField(term371, term371.getClass(), "pieCenterY", 0.7559240768573477);
        setDoubleField(term371, term371.getClass(), "pieHRadius", 0.10667076642995188);
        setDoubleField(term371, term371.getClass(), "pieWRadius", 0.11493000848982304);
        setField(term371, term371.getClass(), "linkArea", null);
        setDoubleField(term381, term381.getClass(), "x", 0.0);
        setDoubleField(term381, term381.getClass(), "y", 0.0);
        setDoubleField(term381, term381.getClass(), "width", 0.0);
        setDoubleField(term381, term381.getClass(), "height", 0.0);
        setField(term380, term380.getClass(), "chartArea", term381);
        setField(term386, term386.getClass(), "owner", term380);
        setField(term386, term386.getClass(), "plotArea", null);
        setDoubleField(term387, term387.getClass(), "x", 0.0);
        setDoubleField(term387, term387.getClass(), "y", 0.0);
        setDoubleField(term387, term387.getClass(), "width", 0.0);
        setDoubleField(term387, term387.getClass(), "height", 0.0);
        setField(term386, term386.getClass(), "dataArea", term387);
        setField(term386, term386.getClass(), "subplotInfo", term392);
        setField(term380, term380.getClass(), "plotInfo", term386);
        setField(term395, term395.getClass(), "entities", term396);
        setField(term380, term380.getClass(), "entities", term395);
        setField(term379, term379.getClass(), "owner", term380);
        setField(term379, term379.getClass(), "plotArea", null);
        setField(term379, term379.getClass(), "dataArea", null);
        setField(term379, term379.getClass(), "subplotInfo", term399);
        setField(term371, term371.getClass(), "info", term379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = double.class;
        argTypes[3] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[4] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[5] = Class.forName("org.jfree.chart.plot.PiePlotState");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term366;
        args[2] = term369;
        args[3] = null;
        args[4] = null;
        args[5] = term371;
        try {
            callMethod(klass, "drawLabels", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



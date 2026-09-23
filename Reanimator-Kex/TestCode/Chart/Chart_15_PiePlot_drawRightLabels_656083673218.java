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
import java.lang.Float;
import java.lang.Object;
import java.util.ArrayList;

public class PiePlot_drawRightLabels_656083673218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437;
     Object term439;

    public PiePlot_drawRightLabels_656083673218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437 = new Float(0.3455959F);
        ArrayList term460 = new ArrayList();
        ArrayList term464 = new ArrayList();
        ArrayList term467 = new ArrayList();
        term439 = newInstance(Class.forName("org.jfree.chart.plot.PiePlotState"));
        Object term447 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term448 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term449 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term454 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term455 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term463 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setIntField(term439, term439.getClass(), "passesRequired", -1685132342);
        setDoubleField(term439, term439.getClass(), "total", 0.3587267442738795);
        setDoubleField(term439, term439.getClass(), "latestAngle", 0.07802449704920456);
        setField(term439, term439.getClass(), "explodedPieArea", null);
        setField(term439, term439.getClass(), "pieArea", null);
        setDoubleField(term439, term439.getClass(), "pieCenterX", 0.5279279537140873);
        setDoubleField(term439, term439.getClass(), "pieCenterY", 0.3202192021706908);
        setDoubleField(term439, term439.getClass(), "pieHRadius", 0.22651340641904605);
        setDoubleField(term439, term439.getClass(), "pieWRadius", 0.8878841294187743);
        setField(term439, term439.getClass(), "linkArea", null);
        setDoubleField(term449, term449.getClass(), "x", 0.0);
        setDoubleField(term449, term449.getClass(), "y", 0.0);
        setDoubleField(term449, term449.getClass(), "width", 0.0);
        setDoubleField(term449, term449.getClass(), "height", 0.0);
        setField(term448, term448.getClass(), "chartArea", term449);
        setField(term454, term454.getClass(), "owner", term448);
        setField(term454, term454.getClass(), "plotArea", null);
        setDoubleField(term455, term455.getClass(), "x", 0.0);
        setDoubleField(term455, term455.getClass(), "y", 0.0);
        setDoubleField(term455, term455.getClass(), "width", 0.0);
        setDoubleField(term455, term455.getClass(), "height", 0.0);
        setField(term454, term454.getClass(), "dataArea", term455);
        setField(term454, term454.getClass(), "subplotInfo", term460);
        setField(term448, term448.getClass(), "plotInfo", term454);
        setField(term463, term463.getClass(), "entities", term464);
        setField(term448, term448.getClass(), "entities", term463);
        setField(term447, term447.getClass(), "owner", term448);
        setField(term447, term447.getClass(), "plotArea", null);
        setField(term447, term447.getClass(), "dataArea", null);
        setField(term447, term447.getClass(), "subplotInfo", term467);
        setField(term439, term439.getClass(), "info", term447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.jfree.data.KeyedValues");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[4] = float.class;
        argTypes[5] = Class.forName("org.jfree.chart.plot.PiePlotState");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term437;
        args[5] = term439;
        try {
            callMethod(klass, "drawRightLabels", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



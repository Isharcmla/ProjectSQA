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

public class PiePlot_drawLeftLabels_1690097676217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term405;

    public PiePlot_drawLeftLabels_1690097676217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = new Float(0.2707036F);
        ArrayList term426 = new ArrayList();
        ArrayList term430 = new ArrayList();
        ArrayList term433 = new ArrayList();
        term405 = newInstance(Class.forName("org.jfree.chart.plot.PiePlotState"));
        Object term413 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term414 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term415 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term420 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term421 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term429 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setIntField(term405, term405.getClass(), "passesRequired", 597278769);
        setDoubleField(term405, term405.getClass(), "total", 0.37161417339133307);
        setDoubleField(term405, term405.getClass(), "latestAngle", 0.6805867182029153);
        setField(term405, term405.getClass(), "explodedPieArea", null);
        setField(term405, term405.getClass(), "pieArea", null);
        setDoubleField(term405, term405.getClass(), "pieCenterX", 0.2852810965221698);
        setDoubleField(term405, term405.getClass(), "pieCenterY", 0.6300849762307866);
        setDoubleField(term405, term405.getClass(), "pieHRadius", 0.9737083944266686);
        setDoubleField(term405, term405.getClass(), "pieWRadius", 0.0668892744806211);
        setField(term405, term405.getClass(), "linkArea", null);
        setDoubleField(term415, term415.getClass(), "x", 0.0);
        setDoubleField(term415, term415.getClass(), "y", 0.0);
        setDoubleField(term415, term415.getClass(), "width", 0.0);
        setDoubleField(term415, term415.getClass(), "height", 0.0);
        setField(term414, term414.getClass(), "chartArea", term415);
        setField(term420, term420.getClass(), "owner", term414);
        setField(term420, term420.getClass(), "plotArea", null);
        setDoubleField(term421, term421.getClass(), "x", 0.0);
        setDoubleField(term421, term421.getClass(), "y", 0.0);
        setDoubleField(term421, term421.getClass(), "width", 0.0);
        setDoubleField(term421, term421.getClass(), "height", 0.0);
        setField(term420, term420.getClass(), "dataArea", term421);
        setField(term420, term420.getClass(), "subplotInfo", term426);
        setField(term414, term414.getClass(), "plotInfo", term420);
        setField(term429, term429.getClass(), "entities", term430);
        setField(term414, term414.getClass(), "entities", term429);
        setField(term413, term413.getClass(), "owner", term414);
        setField(term413, term413.getClass(), "plotArea", null);
        setField(term413, term413.getClass(), "dataArea", null);
        setField(term413, term413.getClass(), "subplotInfo", term433);
        setField(term405, term405.getClass(), "info", term413);
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
        args[4] = term403;
        args[5] = term405;
        try {
            callMethod(klass, "drawLeftLabels", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



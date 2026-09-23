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

public class PiePlot_drawRightLabel_1578694765223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548;
     Object term580;

    public PiePlot_drawRightLabel_1578694765223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term569 = new ArrayList();
        ArrayList term573 = new ArrayList();
        ArrayList term576 = new ArrayList();
        term548 = newInstance(Class.forName("org.jfree.chart.plot.PiePlotState"));
        Object term556 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term557 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term558 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term563 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term564 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term572 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setIntField(term548, term548.getClass(), "passesRequired", 1622346318);
        setDoubleField(term548, term548.getClass(), "total", 0.20737514139742264);
        setDoubleField(term548, term548.getClass(), "latestAngle", 0.7919370314903882);
        setField(term548, term548.getClass(), "explodedPieArea", null);
        setField(term548, term548.getClass(), "pieArea", null);
        setDoubleField(term548, term548.getClass(), "pieCenterX", 0.2109867221632754);
        setDoubleField(term548, term548.getClass(), "pieCenterY", 0.3227335400819148);
        setDoubleField(term548, term548.getClass(), "pieHRadius", 0.43337207054070237);
        setDoubleField(term548, term548.getClass(), "pieWRadius", 0.13246999699526574);
        setField(term548, term548.getClass(), "linkArea", null);
        setDoubleField(term558, term558.getClass(), "x", 0.0);
        setDoubleField(term558, term558.getClass(), "y", 0.0);
        setDoubleField(term558, term558.getClass(), "width", 0.0);
        setDoubleField(term558, term558.getClass(), "height", 0.0);
        setField(term557, term557.getClass(), "chartArea", term558);
        setField(term563, term563.getClass(), "owner", term557);
        setField(term563, term563.getClass(), "plotArea", null);
        setDoubleField(term564, term564.getClass(), "x", 0.0);
        setDoubleField(term564, term564.getClass(), "y", 0.0);
        setDoubleField(term564, term564.getClass(), "width", 0.0);
        setDoubleField(term564, term564.getClass(), "height", 0.0);
        setField(term563, term563.getClass(), "dataArea", term564);
        setField(term563, term563.getClass(), "subplotInfo", term569);
        setField(term557, term557.getClass(), "plotInfo", term563);
        setField(term572, term572.getClass(), "entities", term573);
        setField(term557, term557.getClass(), "entities", term572);
        setField(term556, term556.getClass(), "owner", term557);
        setField(term556, term556.getClass(), "plotArea", null);
        setField(term556, term556.getClass(), "dataArea", null);
        setField(term556, term556.getClass(), "subplotInfo", term576);
        setField(term548, term548.getClass(), "info", term556);
        ArrayList term610 = new ArrayList();
        term580 = newInstance(Class.forName("org.jfree.chart.plot.PieLabelRecord"));
        Object term584 = newInstance(Class.forName("org.jfree.chart.text.TextBox"));
        Object term585 = newInstance(Class.forName("java.awt.Color"));
        Object term588 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term594 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term595 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term601 = newInstance(Class.forName("java.awt.Color"));
        Object term604 = newInstance(Class.forName("java.awt.Color"));
        Object term609 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term614 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        setField(term580, term580.getClass(), "key", null);
        setDoubleField(term580, term580.getClass(), "angle", 0.9126850255993704);
        setDoubleField(term580, term580.getClass(), "baseY", 0.11179067076100713);
        setDoubleField(term580, term580.getClass(), "allocatedY", 0.5306473989087822);
        setIntField(term585, term585.getClass(), "value", -16777216);
        setField(term585, term585.getClass(), "frgbvalue", null);
        setField(term585, term585.getClass(), "fvalue", null);
        setFloatField(term585, term585.getClass(), "falpha", 0.0F);
        setField(term585, term585.getClass(), "cs", null);
        setField(term584, term584.getClass(), "outlinePaint", term585);
        setFloatField(term588, term588.getClass(), "width", 1.0F);
        setIntField(term588, term588.getClass(), "join", 0);
        setIntField(term588, term588.getClass(), "cap", 2);
        setFloatField(term588, term588.getClass(), "miterlimit", 10.0F);
        setField(term588, term588.getClass(), "dash", null);
        setFloatField(term588, term588.getClass(), "dash_phase", 0.0F);
        setField(term584, term584.getClass(), "outlineStroke", term588);
        setField(term595, term595.getClass(), "name", "");
        setField(term594, term594.getClass(), "unitType", term595);
        setDoubleField(term594, term594.getClass(), "top", 1.0);
        setDoubleField(term594, term594.getClass(), "left", 3.0);
        setDoubleField(term594, term594.getClass(), "bottom", 1.0);
        setDoubleField(term594, term594.getClass(), "right", 3.0);
        setField(term584, term584.getClass(), "interiorGap", term594);
        setIntField(term601, term601.getClass(), "value", -64);
        setField(term601, term601.getClass(), "frgbvalue", null);
        setField(term601, term601.getClass(), "fvalue", null);
        setFloatField(term601, term601.getClass(), "falpha", 0.0F);
        setField(term601, term601.getClass(), "cs", null);
        setField(term584, term584.getClass(), "backgroundPaint", term601);
        setIntField(term604, term604.getClass(), "value", -8355712);
        setField(term604, term604.getClass(), "frgbvalue", null);
        setField(term604, term604.getClass(), "fvalue", null);
        setFloatField(term604, term604.getClass(), "falpha", 0.0F);
        setField(term604, term604.getClass(), "cs", null);
        setField(term584, term584.getClass(), "shadowPaint", term604);
        setDoubleField(term584, term584.getClass(), "shadowXOffset", 2.0);
        setDoubleField(term584, term584.getClass(), "shadowYOffset", 2.0);
        setField(term609, term609.getClass(), "lines", term610);
        setField(term614, term614.getClass(), "name", "");
        setField(term609, term609.getClass(), "lineAlignment", term614);
        setField(term584, term584.getClass(), "textBlock", term609);
        setField(term580, term580.getClass(), "label", term584);
        setDoubleField(term580, term580.getClass(), "labelHeight", 0.022483645678509023);
        setDoubleField(term580, term580.getClass(), "gap", 0.025133051616627267);
        setDoubleField(term580, term580.getClass(), "linkPercent", 0.016575281023182953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.plot.PiePlotState");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PieLabelRecord");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term548;
        args[2] = term580;
        try {
            callMethod(klass, "drawRightLabel", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



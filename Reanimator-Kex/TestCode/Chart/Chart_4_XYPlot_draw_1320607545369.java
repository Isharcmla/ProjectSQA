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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class XYPlot_draw_1320607545369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708;
     Object term714;

    public XYPlot_draw_1320607545369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term709 = new HashMap();
        term708 = newInstance(Class.forName("org.jfree.chart.plot.PlotState"));
        setField(term708, term708.getClass(), "sharedAxisStates", term709);
        ArrayList term727 = new ArrayList();
        ArrayList term732 = new ArrayList();
        ArrayList term736 = new ArrayList();
        term714 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term715 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term716 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term721 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term722 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term731 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term716, term716.getClass(), "x", 0.0);
        setDoubleField(term716, term716.getClass(), "y", 0.0);
        setDoubleField(term716, term716.getClass(), "width", 0.0);
        setDoubleField(term716, term716.getClass(), "height", 0.0);
        setField(term715, term715.getClass(), "chartArea", term716);
        setField(term721, term721.getClass(), "owner", term715);
        setField(term721, term721.getClass(), "plotArea", null);
        setDoubleField(term722, term722.getClass(), "x", 0.0);
        setDoubleField(term722, term722.getClass(), "y", 0.0);
        setDoubleField(term722, term722.getClass(), "width", 0.0);
        setDoubleField(term722, term722.getClass(), "height", 0.0);
        setField(term721, term721.getClass(), "dataArea", term722);
        setField(term721, term721.getClass(), "subplotInfo", term727);
        setField(term715, term715.getClass(), "plotInfo", term721);
        setField(term731, term731.getClass(), "entities", term732);
        setField(term715, term715.getClass(), "entities", term731);
        setField(term715, term715.getClass(), "renderingSource", null);
        setField(term714, term714.getClass(), "owner", term715);
        setField(term714, term714.getClass(), "plotArea", null);
        setField(term714, term714.getClass(), "dataArea", null);
        setField(term714, term714.getClass(), "subplotInfo", term736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotState");
        argTypes[4] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term708;
        args[4] = term714;
        try {
            callMethod(klass, "draw", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



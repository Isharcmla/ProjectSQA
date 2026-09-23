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

public class XYPlot_drawAxes_460191484330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736;

    public XYPlot_drawAxes_460191484330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term749 = new ArrayList();
        ArrayList term754 = new ArrayList();
        ArrayList term758 = new ArrayList();
        term736 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term737 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term738 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term743 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term744 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term753 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term738, term738.getClass(), "x", 0.0);
        setDoubleField(term738, term738.getClass(), "y", 0.0);
        setDoubleField(term738, term738.getClass(), "width", 0.0);
        setDoubleField(term738, term738.getClass(), "height", 0.0);
        setField(term737, term737.getClass(), "chartArea", term738);
        setField(term743, term743.getClass(), "owner", term737);
        setField(term743, term743.getClass(), "plotArea", null);
        setDoubleField(term744, term744.getClass(), "x", 0.0);
        setDoubleField(term744, term744.getClass(), "y", 0.0);
        setDoubleField(term744, term744.getClass(), "width", 0.0);
        setDoubleField(term744, term744.getClass(), "height", 0.0);
        setField(term743, term743.getClass(), "dataArea", term744);
        setField(term743, term743.getClass(), "subplotInfo", term749);
        setField(term737, term737.getClass(), "plotInfo", term743);
        setField(term753, term753.getClass(), "entities", term754);
        setField(term737, term737.getClass(), "entities", term753);
        setField(term736, term736.getClass(), "owner", term737);
        setField(term736, term736.getClass(), "plotArea", null);
        setField(term736, term736.getClass(), "dataArea", null);
        setField(term736, term736.getClass(), "subplotInfo", term758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term736;
        try {
            callMethod(klass, "drawAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



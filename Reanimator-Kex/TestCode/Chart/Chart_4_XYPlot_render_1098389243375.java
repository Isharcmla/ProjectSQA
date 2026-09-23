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
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class XYPlot_render_1098389243375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;
     Object term783;
     Object term809;

    public XYPlot_render_1098389243375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781 = new Integer(-1145578966);
        ArrayList term796 = new ArrayList();
        ArrayList term801 = new ArrayList();
        ArrayList term805 = new ArrayList();
        term783 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term784 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term785 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term790 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term791 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term800 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term785, term785.getClass(), "x", 0.0);
        setDoubleField(term785, term785.getClass(), "y", 0.0);
        setDoubleField(term785, term785.getClass(), "width", 0.0);
        setDoubleField(term785, term785.getClass(), "height", 0.0);
        setField(term784, term784.getClass(), "chartArea", term785);
        setField(term790, term790.getClass(), "owner", term784);
        setField(term790, term790.getClass(), "plotArea", null);
        setDoubleField(term791, term791.getClass(), "x", 0.0);
        setDoubleField(term791, term791.getClass(), "y", 0.0);
        setDoubleField(term791, term791.getClass(), "width", 0.0);
        setDoubleField(term791, term791.getClass(), "height", 0.0);
        setField(term790, term790.getClass(), "dataArea", term791);
        setField(term790, term790.getClass(), "subplotInfo", term796);
        setField(term784, term784.getClass(), "plotInfo", term790);
        setField(term800, term800.getClass(), "entities", term801);
        setField(term784, term784.getClass(), "entities", term800);
        setField(term784, term784.getClass(), "renderingSource", null);
        setField(term783, term783.getClass(), "owner", term784);
        setField(term783, term783.getClass(), "plotArea", null);
        setField(term783, term783.getClass(), "dataArea", null);
        setField(term783, term783.getClass(), "subplotInfo", term805);
        term809 = newInstance(Class.forName("org.jfree.chart.plot.CrosshairState"));
        setBooleanField(term809, term809.getClass(), "calculateDistanceInDataSpace", false);
        setDoubleField(term809, term809.getClass(), "anchorX", 0.6076495596892013);
        setDoubleField(term809, term809.getClass(), "anchorY", 0.37773193782763337);
        setField(term809, term809.getClass(), "anchor", null);
        setDoubleField(term809, term809.getClass(), "crosshairX", 0.8474802076607362);
        setDoubleField(term809, term809.getClass(), "crosshairY", 0.5183269973490326);
        setIntField(term809, term809.getClass(), "datasetIndex", 679763016);
        setIntField(term809, term809.getClass(), "domainAxisIndex", 1962444399);
        setIntField(term809, term809.getClass(), "rangeAxisIndex", 767834723);
        setDoubleField(term809, term809.getClass(), "distance", 0.7655020693602768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[4] = Class.forName("org.jfree.chart.plot.CrosshairState");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term781;
        args[3] = term783;
        args[4] = term809;
        try {
            callMethod(klass, "render", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



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

public class XYPlot_render_1098389243331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;
     Object term764;
     Object term790;

    public XYPlot_render_1098389243331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term762 = new Integer(-1530420153);
        ArrayList term777 = new ArrayList();
        ArrayList term782 = new ArrayList();
        ArrayList term786 = new ArrayList();
        term764 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term765 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term766 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term771 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term772 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term781 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term766, term766.getClass(), "x", 0.0);
        setDoubleField(term766, term766.getClass(), "y", 0.0);
        setDoubleField(term766, term766.getClass(), "width", 0.0);
        setDoubleField(term766, term766.getClass(), "height", 0.0);
        setField(term765, term765.getClass(), "chartArea", term766);
        setField(term771, term771.getClass(), "owner", term765);
        setField(term771, term771.getClass(), "plotArea", null);
        setDoubleField(term772, term772.getClass(), "x", 0.0);
        setDoubleField(term772, term772.getClass(), "y", 0.0);
        setDoubleField(term772, term772.getClass(), "width", 0.0);
        setDoubleField(term772, term772.getClass(), "height", 0.0);
        setField(term771, term771.getClass(), "dataArea", term772);
        setField(term771, term771.getClass(), "subplotInfo", term777);
        setField(term765, term765.getClass(), "plotInfo", term771);
        setField(term781, term781.getClass(), "entities", term782);
        setField(term765, term765.getClass(), "entities", term781);
        setField(term764, term764.getClass(), "owner", term765);
        setField(term764, term764.getClass(), "plotArea", null);
        setField(term764, term764.getClass(), "dataArea", null);
        setField(term764, term764.getClass(), "subplotInfo", term786);
        term790 = newInstance(Class.forName("org.jfree.chart.plot.CrosshairState"));
        setBooleanField(term790, term790.getClass(), "calculateDistanceInDataSpace", true);
        setDoubleField(term790, term790.getClass(), "anchorX", 0.6076495596892013);
        setDoubleField(term790, term790.getClass(), "anchorY", 0.37773193782763337);
        setField(term790, term790.getClass(), "anchor", null);
        setDoubleField(term790, term790.getClass(), "crosshairX", 0.8474802076607362);
        setDoubleField(term790, term790.getClass(), "crosshairY", 0.5183269973490326);
        setIntField(term790, term790.getClass(), "domainAxisIndex", -469968304);
        setIntField(term790, term790.getClass(), "rangeAxisIndex", -1145578966);
        setDoubleField(term790, term790.getClass(), "distance", 0.7655020693602768);
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
        args[2] = term762;
        args[3] = term764;
        args[4] = term790;
        try {
            callMethod(klass, "render", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



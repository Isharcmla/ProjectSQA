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
import java.lang.Double;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class CategoryPlot_zoomRangeAxes_792292360309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3508;
     Object term3510;
     Object term3536;

    public CategoryPlot_zoomRangeAxes_792292360309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3508 = new Double(0.6862221294683138);
        ArrayList term3523 = new ArrayList();
        ArrayList term3528 = new ArrayList();
        ArrayList term3532 = new ArrayList();
        term3510 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3511 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3512 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3517 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3518 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3527 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3512, term3512.getClass(), "x", 0.0);
        setDoubleField(term3512, term3512.getClass(), "y", 0.0);
        setDoubleField(term3512, term3512.getClass(), "width", 0.0);
        setDoubleField(term3512, term3512.getClass(), "height", 0.0);
        setField(term3511, term3511.getClass(), "chartArea", term3512);
        setField(term3517, term3517.getClass(), "owner", term3511);
        setField(term3517, term3517.getClass(), "plotArea", null);
        setDoubleField(term3518, term3518.getClass(), "x", 0.0);
        setDoubleField(term3518, term3518.getClass(), "y", 0.0);
        setDoubleField(term3518, term3518.getClass(), "width", 0.0);
        setDoubleField(term3518, term3518.getClass(), "height", 0.0);
        setField(term3517, term3517.getClass(), "dataArea", term3518);
        setField(term3517, term3517.getClass(), "subplotInfo", term3523);
        setField(term3511, term3511.getClass(), "plotInfo", term3517);
        setField(term3527, term3527.getClass(), "entities", term3528);
        setField(term3511, term3511.getClass(), "entities", term3527);
        setField(term3510, term3510.getClass(), "owner", term3511);
        setField(term3510, term3510.getClass(), "plotArea", null);
        setField(term3510, term3510.getClass(), "dataArea", null);
        setField(term3510, term3510.getClass(), "subplotInfo", term3532);
        term3536 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term3508;
        args[1] = term3510;
        args[2] = null;
        args[3] = term3536;
        try {
            callMethod(klass, "zoomRangeAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



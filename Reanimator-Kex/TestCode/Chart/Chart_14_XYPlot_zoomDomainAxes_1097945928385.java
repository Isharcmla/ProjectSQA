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

public class XYPlot_zoomDomainAxes_1097945928385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1303;
     Object term1305;

    public XYPlot_zoomDomainAxes_1097945928385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1303 = new Double(0.3202192021706908);
        ArrayList term1318 = new ArrayList();
        ArrayList term1323 = new ArrayList();
        ArrayList term1327 = new ArrayList();
        term1305 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1306 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term1307 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1312 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term1313 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term1322 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term1307, term1307.getClass(), "x", 0.0);
        setDoubleField(term1307, term1307.getClass(), "y", 0.0);
        setDoubleField(term1307, term1307.getClass(), "width", 0.0);
        setDoubleField(term1307, term1307.getClass(), "height", 0.0);
        setField(term1306, term1306.getClass(), "chartArea", term1307);
        setField(term1312, term1312.getClass(), "owner", term1306);
        setField(term1312, term1312.getClass(), "plotArea", null);
        setDoubleField(term1313, term1313.getClass(), "x", 0.0);
        setDoubleField(term1313, term1313.getClass(), "y", 0.0);
        setDoubleField(term1313, term1313.getClass(), "width", 0.0);
        setDoubleField(term1313, term1313.getClass(), "height", 0.0);
        setField(term1312, term1312.getClass(), "dataArea", term1313);
        setField(term1312, term1312.getClass(), "subplotInfo", term1318);
        setField(term1306, term1306.getClass(), "plotInfo", term1312);
        setField(term1322, term1322.getClass(), "entities", term1323);
        setField(term1306, term1306.getClass(), "entities", term1322);
        setField(term1305, term1305.getClass(), "owner", term1306);
        setField(term1305, term1305.getClass(), "plotArea", null);
        setField(term1305, term1305.getClass(), "dataArea", null);
        setField(term1305, term1305.getClass(), "subplotInfo", term1327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term1303;
        args[1] = term1305;
        args[2] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



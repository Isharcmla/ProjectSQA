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

public class PiePlot_drawPie_1173481574213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;

    public PiePlot_drawPie_1173481574213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term273 = new ArrayList();
        ArrayList term278 = new ArrayList();
        ArrayList term282 = new ArrayList();
        term260 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term261 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term262 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term267 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term268 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term277 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term262, term262.getClass(), "x", 0.0);
        setDoubleField(term262, term262.getClass(), "y", 0.0);
        setDoubleField(term262, term262.getClass(), "width", 0.0);
        setDoubleField(term262, term262.getClass(), "height", 0.0);
        setField(term261, term261.getClass(), "chartArea", term262);
        setField(term267, term267.getClass(), "owner", term261);
        setField(term267, term267.getClass(), "plotArea", null);
        setDoubleField(term268, term268.getClass(), "x", 0.0);
        setDoubleField(term268, term268.getClass(), "y", 0.0);
        setDoubleField(term268, term268.getClass(), "width", 0.0);
        setDoubleField(term268, term268.getClass(), "height", 0.0);
        setField(term267, term267.getClass(), "dataArea", term268);
        setField(term267, term267.getClass(), "subplotInfo", term273);
        setField(term261, term261.getClass(), "plotInfo", term267);
        setField(term277, term277.getClass(), "entities", term278);
        setField(term261, term261.getClass(), "entities", term277);
        setField(term260, term260.getClass(), "owner", term261);
        setField(term260, term260.getClass(), "plotArea", null);
        setField(term260, term260.getClass(), "dataArea", null);
        setField(term260, term260.getClass(), "subplotInfo", term282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term260;
        try {
            callMethod(klass, "drawPie", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



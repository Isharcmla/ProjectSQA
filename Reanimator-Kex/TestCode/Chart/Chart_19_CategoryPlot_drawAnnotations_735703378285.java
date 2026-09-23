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

public class CategoryPlot_drawAnnotations_735703378285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3013;

    public CategoryPlot_drawAnnotations_735703378285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3026 = new ArrayList();
        ArrayList term3031 = new ArrayList();
        ArrayList term3035 = new ArrayList();
        term3013 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3014 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3015 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3020 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3021 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3030 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3015, term3015.getClass(), "x", 0.0);
        setDoubleField(term3015, term3015.getClass(), "y", 0.0);
        setDoubleField(term3015, term3015.getClass(), "width", 0.0);
        setDoubleField(term3015, term3015.getClass(), "height", 0.0);
        setField(term3014, term3014.getClass(), "chartArea", term3015);
        setField(term3020, term3020.getClass(), "owner", term3014);
        setField(term3020, term3020.getClass(), "plotArea", null);
        setDoubleField(term3021, term3021.getClass(), "x", 0.0);
        setDoubleField(term3021, term3021.getClass(), "y", 0.0);
        setDoubleField(term3021, term3021.getClass(), "width", 0.0);
        setDoubleField(term3021, term3021.getClass(), "height", 0.0);
        setField(term3020, term3020.getClass(), "dataArea", term3021);
        setField(term3020, term3020.getClass(), "subplotInfo", term3026);
        setField(term3014, term3014.getClass(), "plotInfo", term3020);
        setField(term3030, term3030.getClass(), "entities", term3031);
        setField(term3014, term3014.getClass(), "entities", term3030);
        setField(term3013, term3013.getClass(), "owner", term3014);
        setField(term3013, term3013.getClass(), "plotArea", null);
        setField(term3013, term3013.getClass(), "dataArea", null);
        setField(term3013, term3013.getClass(), "subplotInfo", term3035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term3013;
        try {
            callMethod(klass, "drawAnnotations", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



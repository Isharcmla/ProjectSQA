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

public class CategoryPlot_zoomDomainAxes_797992853307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3450;
     Object term3452;
     Object term3478;

    public CategoryPlot_zoomDomainAxes_797992853307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3450 = new Double(0.7591353014991907);
        ArrayList term3465 = new ArrayList();
        ArrayList term3470 = new ArrayList();
        ArrayList term3474 = new ArrayList();
        term3452 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3453 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3454 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3459 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3460 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3469 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3454, term3454.getClass(), "x", 0.0);
        setDoubleField(term3454, term3454.getClass(), "y", 0.0);
        setDoubleField(term3454, term3454.getClass(), "width", 0.0);
        setDoubleField(term3454, term3454.getClass(), "height", 0.0);
        setField(term3453, term3453.getClass(), "chartArea", term3454);
        setField(term3459, term3459.getClass(), "owner", term3453);
        setField(term3459, term3459.getClass(), "plotArea", null);
        setDoubleField(term3460, term3460.getClass(), "x", 0.0);
        setDoubleField(term3460, term3460.getClass(), "y", 0.0);
        setDoubleField(term3460, term3460.getClass(), "width", 0.0);
        setDoubleField(term3460, term3460.getClass(), "height", 0.0);
        setField(term3459, term3459.getClass(), "dataArea", term3460);
        setField(term3459, term3459.getClass(), "subplotInfo", term3465);
        setField(term3453, term3453.getClass(), "plotInfo", term3459);
        setField(term3469, term3469.getClass(), "entities", term3470);
        setField(term3453, term3453.getClass(), "entities", term3469);
        setField(term3452, term3452.getClass(), "owner", term3453);
        setField(term3452, term3452.getClass(), "plotArea", null);
        setField(term3452, term3452.getClass(), "dataArea", null);
        setField(term3452, term3452.getClass(), "subplotInfo", term3474);
        term3478 = new Boolean(true);
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
        args[0] = term3450;
        args[1] = term3452;
        args[2] = null;
        args[3] = term3478;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



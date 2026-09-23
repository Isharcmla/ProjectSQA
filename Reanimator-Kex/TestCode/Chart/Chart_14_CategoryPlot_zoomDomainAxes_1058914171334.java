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

public class CategoryPlot_zoomDomainAxes_1058914171334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3679;
     Object term3681;

    public CategoryPlot_zoomDomainAxes_1058914171334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3679 = new Double(0.8454723071922143);
        ArrayList term3694 = new ArrayList();
        ArrayList term3699 = new ArrayList();
        ArrayList term3703 = new ArrayList();
        term3681 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3682 = newInstance(Class.forName("org.jfree.chart.ChartRenderingInfo"));
        Object term3683 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3688 = newInstance(Class.forName("org.jfree.chart.plot.PlotRenderingInfo"));
        Object term3689 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        Object term3698 = newInstance(Class.forName("org.jfree.chart.entity.StandardEntityCollection"));
        setDoubleField(term3683, term3683.getClass(), "x", 0.0);
        setDoubleField(term3683, term3683.getClass(), "y", 0.0);
        setDoubleField(term3683, term3683.getClass(), "width", 0.0);
        setDoubleField(term3683, term3683.getClass(), "height", 0.0);
        setField(term3682, term3682.getClass(), "chartArea", term3683);
        setField(term3688, term3688.getClass(), "owner", term3682);
        setField(term3688, term3688.getClass(), "plotArea", null);
        setDoubleField(term3689, term3689.getClass(), "x", 0.0);
        setDoubleField(term3689, term3689.getClass(), "y", 0.0);
        setDoubleField(term3689, term3689.getClass(), "width", 0.0);
        setDoubleField(term3689, term3689.getClass(), "height", 0.0);
        setField(term3688, term3688.getClass(), "dataArea", term3689);
        setField(term3688, term3688.getClass(), "subplotInfo", term3694);
        setField(term3682, term3682.getClass(), "plotInfo", term3688);
        setField(term3698, term3698.getClass(), "entities", term3699);
        setField(term3682, term3682.getClass(), "entities", term3698);
        setField(term3681, term3681.getClass(), "owner", term3682);
        setField(term3681, term3681.getClass(), "plotArea", null);
        setField(term3681, term3681.getClass(), "dataArea", null);
        setField(term3681, term3681.getClass(), "subplotInfo", term3703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotRenderingInfo");
        argTypes[2] = Class.forName("java.awt.geom.Point2D");
        Object[] args = new Object[3];
        args[0] = term3679;
        args[1] = term3681;
        args[2] = null;
        try {
            callMethod(klass, "zoomDomainAxes", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



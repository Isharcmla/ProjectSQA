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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultiplePiePlot_draw_10445304037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8505;

    public MultiplePiePlot_draw_10445304037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8505 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8505, term8505.getClass(), "pieChart", null);
        setField(term8505, term8505.getClass(), "dataset", null);
        setField(term8505, term8505.getClass(), "dataExtractOrder", null);
        setDoubleField(term8505, term8505.getClass(), "limit", 0.0);
        setField(term8505, term8505.getClass(), "aggregatedItemsKey", null);
        setField(term8505, term8505.getClass(), "aggregatedItemsPaint", null);
        setField(term8505, term8505.getClass(), "sectionPaints", null);
        setField(term8505, term8505.getClass(), "parent", null);
        setField(term8505, term8505.getClass(), "datasetGroup", null);
        setField(term8505, term8505.getClass(), "noDataMessage", null);
        setField(term8505, term8505.getClass(), "noDataMessageFont", null);
        setField(term8505, term8505.getClass(), "noDataMessagePaint", null);
        setField(term8505, term8505.getClass(), "insets", null);
        setBooleanField(term8505, term8505.getClass(), "outlineVisible", false);
        setField(term8505, term8505.getClass(), "outlineStroke", null);
        setField(term8505, term8505.getClass(), "outlinePaint", null);
        setField(term8505, term8505.getClass(), "backgroundPaint", null);
        setField(term8505, term8505.getClass(), "backgroundImage", null);
        setIntField(term8505, term8505.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8505, term8505.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8505, term8505.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8505, term8505.getClass(), "backgroundAlpha", 0.0F);
        setField(term8505, term8505.getClass(), "drawingSupplier", null);
        setField(term8505, term8505.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
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
        args[3] = null;
        args[4] = null;
        callMethod(klass, "draw", argTypes, term8505, args);
    }

};



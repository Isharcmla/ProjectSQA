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

public class MultiplePiePlot_getLegendItems_91081102939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8519;

    public MultiplePiePlot_getLegendItems_91081102939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8519 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8519, term8519.getClass(), "pieChart", null);
        setField(term8519, term8519.getClass(), "dataset", null);
        setField(term8519, term8519.getClass(), "dataExtractOrder", null);
        setDoubleField(term8519, term8519.getClass(), "limit", 0.0);
        setField(term8519, term8519.getClass(), "aggregatedItemsKey", null);
        setField(term8519, term8519.getClass(), "aggregatedItemsPaint", null);
        setField(term8519, term8519.getClass(), "sectionPaints", null);
        setField(term8519, term8519.getClass(), "parent", null);
        setField(term8519, term8519.getClass(), "datasetGroup", null);
        setField(term8519, term8519.getClass(), "noDataMessage", null);
        setField(term8519, term8519.getClass(), "noDataMessageFont", null);
        setField(term8519, term8519.getClass(), "noDataMessagePaint", null);
        setField(term8519, term8519.getClass(), "insets", null);
        setBooleanField(term8519, term8519.getClass(), "outlineVisible", false);
        setField(term8519, term8519.getClass(), "outlineStroke", null);
        setField(term8519, term8519.getClass(), "outlinePaint", null);
        setField(term8519, term8519.getClass(), "backgroundPaint", null);
        setField(term8519, term8519.getClass(), "backgroundImage", null);
        setIntField(term8519, term8519.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8519, term8519.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8519, term8519.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8519, term8519.getClass(), "backgroundAlpha", 0.0F);
        setField(term8519, term8519.getClass(), "drawingSupplier", null);
        setField(term8519, term8519.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLegendItems", argTypes, term8519, args);
    }

};



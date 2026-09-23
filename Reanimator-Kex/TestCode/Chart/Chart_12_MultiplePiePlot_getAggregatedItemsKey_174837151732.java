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

public class MultiplePiePlot_getAggregatedItemsKey_174837151732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8470;

    public MultiplePiePlot_getAggregatedItemsKey_174837151732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8470 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8470, term8470.getClass(), "pieChart", null);
        setField(term8470, term8470.getClass(), "dataset", null);
        setField(term8470, term8470.getClass(), "dataExtractOrder", null);
        setDoubleField(term8470, term8470.getClass(), "limit", 0.0);
        setField(term8470, term8470.getClass(), "aggregatedItemsKey", null);
        setField(term8470, term8470.getClass(), "aggregatedItemsPaint", null);
        setField(term8470, term8470.getClass(), "sectionPaints", null);
        setField(term8470, term8470.getClass(), "parent", null);
        setField(term8470, term8470.getClass(), "datasetGroup", null);
        setField(term8470, term8470.getClass(), "noDataMessage", null);
        setField(term8470, term8470.getClass(), "noDataMessageFont", null);
        setField(term8470, term8470.getClass(), "noDataMessagePaint", null);
        setField(term8470, term8470.getClass(), "insets", null);
        setBooleanField(term8470, term8470.getClass(), "outlineVisible", false);
        setField(term8470, term8470.getClass(), "outlineStroke", null);
        setField(term8470, term8470.getClass(), "outlinePaint", null);
        setField(term8470, term8470.getClass(), "backgroundPaint", null);
        setField(term8470, term8470.getClass(), "backgroundImage", null);
        setIntField(term8470, term8470.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8470, term8470.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8470, term8470.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8470, term8470.getClass(), "backgroundAlpha", 0.0F);
        setField(term8470, term8470.getClass(), "drawingSupplier", null);
        setField(term8470, term8470.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAggregatedItemsKey", argTypes, term8470, args);
    }

};



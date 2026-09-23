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

public class MultiplePiePlot_getDataExtractOrder_151562067231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8463;

    public MultiplePiePlot_getDataExtractOrder_151562067231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8463 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8463, term8463.getClass(), "pieChart", null);
        setField(term8463, term8463.getClass(), "dataset", null);
        setField(term8463, term8463.getClass(), "dataExtractOrder", null);
        setDoubleField(term8463, term8463.getClass(), "limit", 0.0);
        setField(term8463, term8463.getClass(), "aggregatedItemsKey", null);
        setField(term8463, term8463.getClass(), "aggregatedItemsPaint", null);
        setField(term8463, term8463.getClass(), "sectionPaints", null);
        setField(term8463, term8463.getClass(), "parent", null);
        setField(term8463, term8463.getClass(), "datasetGroup", null);
        setField(term8463, term8463.getClass(), "noDataMessage", null);
        setField(term8463, term8463.getClass(), "noDataMessageFont", null);
        setField(term8463, term8463.getClass(), "noDataMessagePaint", null);
        setField(term8463, term8463.getClass(), "insets", null);
        setBooleanField(term8463, term8463.getClass(), "outlineVisible", false);
        setField(term8463, term8463.getClass(), "outlineStroke", null);
        setField(term8463, term8463.getClass(), "outlinePaint", null);
        setField(term8463, term8463.getClass(), "backgroundPaint", null);
        setField(term8463, term8463.getClass(), "backgroundImage", null);
        setIntField(term8463, term8463.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8463, term8463.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8463, term8463.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8463, term8463.getClass(), "backgroundAlpha", 0.0F);
        setField(term8463, term8463.getClass(), "drawingSupplier", null);
        setField(term8463, term8463.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataExtractOrder", argTypes, term8463, args);
    }

};



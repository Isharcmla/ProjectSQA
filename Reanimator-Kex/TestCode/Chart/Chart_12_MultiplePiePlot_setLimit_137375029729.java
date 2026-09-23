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
import java.lang.Double;

public class MultiplePiePlot_setLimit_137375029729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8447;
     Object term8454;

    public MultiplePiePlot_setLimit_137375029729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8447 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8447, term8447.getClass(), "pieChart", null);
        setField(term8447, term8447.getClass(), "dataset", null);
        setField(term8447, term8447.getClass(), "dataExtractOrder", null);
        setDoubleField(term8447, term8447.getClass(), "limit", 0.0);
        setField(term8447, term8447.getClass(), "aggregatedItemsKey", null);
        setField(term8447, term8447.getClass(), "aggregatedItemsPaint", null);
        setField(term8447, term8447.getClass(), "sectionPaints", null);
        setField(term8447, term8447.getClass(), "parent", null);
        setField(term8447, term8447.getClass(), "datasetGroup", null);
        setField(term8447, term8447.getClass(), "noDataMessage", null);
        setField(term8447, term8447.getClass(), "noDataMessageFont", null);
        setField(term8447, term8447.getClass(), "noDataMessagePaint", null);
        setField(term8447, term8447.getClass(), "insets", null);
        setBooleanField(term8447, term8447.getClass(), "outlineVisible", false);
        setField(term8447, term8447.getClass(), "outlineStroke", null);
        setField(term8447, term8447.getClass(), "outlinePaint", null);
        setField(term8447, term8447.getClass(), "backgroundPaint", null);
        setField(term8447, term8447.getClass(), "backgroundImage", null);
        setIntField(term8447, term8447.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8447, term8447.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8447, term8447.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8447, term8447.getClass(), "backgroundAlpha", 0.0F);
        setField(term8447, term8447.getClass(), "drawingSupplier", null);
        setField(term8447, term8447.getClass(), "listenerList", null);
        term8454 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term8454;
        callMethod(klass, "setLimit", argTypes, term8447, args);
    }

};



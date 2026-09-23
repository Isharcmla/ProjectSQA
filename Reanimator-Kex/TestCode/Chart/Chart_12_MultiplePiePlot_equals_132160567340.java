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

public class MultiplePiePlot_equals_132160567340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8526;

    public MultiplePiePlot_equals_132160567340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8526 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8526, term8526.getClass(), "pieChart", null);
        setField(term8526, term8526.getClass(), "dataset", null);
        setField(term8526, term8526.getClass(), "dataExtractOrder", null);
        setDoubleField(term8526, term8526.getClass(), "limit", 0.0);
        setField(term8526, term8526.getClass(), "aggregatedItemsKey", null);
        setField(term8526, term8526.getClass(), "aggregatedItemsPaint", null);
        setField(term8526, term8526.getClass(), "sectionPaints", null);
        setField(term8526, term8526.getClass(), "parent", null);
        setField(term8526, term8526.getClass(), "datasetGroup", null);
        setField(term8526, term8526.getClass(), "noDataMessage", null);
        setField(term8526, term8526.getClass(), "noDataMessageFont", null);
        setField(term8526, term8526.getClass(), "noDataMessagePaint", null);
        setField(term8526, term8526.getClass(), "insets", null);
        setBooleanField(term8526, term8526.getClass(), "outlineVisible", false);
        setField(term8526, term8526.getClass(), "outlineStroke", null);
        setField(term8526, term8526.getClass(), "outlinePaint", null);
        setField(term8526, term8526.getClass(), "backgroundPaint", null);
        setField(term8526, term8526.getClass(), "backgroundImage", null);
        setIntField(term8526, term8526.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8526, term8526.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8526, term8526.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8526, term8526.getClass(), "backgroundAlpha", 0.0F);
        setField(term8526, term8526.getClass(), "drawingSupplier", null);
        setField(term8526, term8526.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term8526, args);
    }

};



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

public class MultiplePiePlot_setPieChart_132071047230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8456;

    public MultiplePiePlot_setPieChart_132071047230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8456 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8456, term8456.getClass(), "pieChart", null);
        setField(term8456, term8456.getClass(), "dataset", null);
        setField(term8456, term8456.getClass(), "dataExtractOrder", null);
        setDoubleField(term8456, term8456.getClass(), "limit", 0.0);
        setField(term8456, term8456.getClass(), "aggregatedItemsKey", null);
        setField(term8456, term8456.getClass(), "aggregatedItemsPaint", null);
        setField(term8456, term8456.getClass(), "sectionPaints", null);
        setField(term8456, term8456.getClass(), "parent", null);
        setField(term8456, term8456.getClass(), "datasetGroup", null);
        setField(term8456, term8456.getClass(), "noDataMessage", null);
        setField(term8456, term8456.getClass(), "noDataMessageFont", null);
        setField(term8456, term8456.getClass(), "noDataMessagePaint", null);
        setField(term8456, term8456.getClass(), "insets", null);
        setBooleanField(term8456, term8456.getClass(), "outlineVisible", false);
        setField(term8456, term8456.getClass(), "outlineStroke", null);
        setField(term8456, term8456.getClass(), "outlinePaint", null);
        setField(term8456, term8456.getClass(), "backgroundPaint", null);
        setField(term8456, term8456.getClass(), "backgroundImage", null);
        setIntField(term8456, term8456.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8456, term8456.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8456, term8456.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8456, term8456.getClass(), "backgroundAlpha", 0.0F);
        setField(term8456, term8456.getClass(), "drawingSupplier", null);
        setField(term8456, term8456.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.JFreeChart");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPieChart", argTypes, term8456, args);
    }

};



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

public class MultiplePiePlot_setDataset_123489177925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8419;

    public MultiplePiePlot_setDataset_123489177925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8419 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8419, term8419.getClass(), "pieChart", null);
        setField(term8419, term8419.getClass(), "dataset", null);
        setField(term8419, term8419.getClass(), "dataExtractOrder", null);
        setDoubleField(term8419, term8419.getClass(), "limit", 0.0);
        setField(term8419, term8419.getClass(), "aggregatedItemsKey", null);
        setField(term8419, term8419.getClass(), "aggregatedItemsPaint", null);
        setField(term8419, term8419.getClass(), "sectionPaints", null);
        setField(term8419, term8419.getClass(), "parent", null);
        setField(term8419, term8419.getClass(), "datasetGroup", null);
        setField(term8419, term8419.getClass(), "noDataMessage", null);
        setField(term8419, term8419.getClass(), "noDataMessageFont", null);
        setField(term8419, term8419.getClass(), "noDataMessagePaint", null);
        setField(term8419, term8419.getClass(), "insets", null);
        setBooleanField(term8419, term8419.getClass(), "outlineVisible", false);
        setField(term8419, term8419.getClass(), "outlineStroke", null);
        setField(term8419, term8419.getClass(), "outlinePaint", null);
        setField(term8419, term8419.getClass(), "backgroundPaint", null);
        setField(term8419, term8419.getClass(), "backgroundImage", null);
        setIntField(term8419, term8419.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8419, term8419.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8419, term8419.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8419, term8419.getClass(), "backgroundAlpha", 0.0F);
        setField(term8419, term8419.getClass(), "drawingSupplier", null);
        setField(term8419, term8419.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.category.CategoryDataset");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataset", argTypes, term8419, args);
    }

};



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

public class MultiplePiePlot_setDataExtractOrder_20119573027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8433;

    public MultiplePiePlot_setDataExtractOrder_20119573027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8433 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8433, term8433.getClass(), "pieChart", null);
        setField(term8433, term8433.getClass(), "dataset", null);
        setField(term8433, term8433.getClass(), "dataExtractOrder", null);
        setDoubleField(term8433, term8433.getClass(), "limit", 0.0);
        setField(term8433, term8433.getClass(), "aggregatedItemsKey", null);
        setField(term8433, term8433.getClass(), "aggregatedItemsPaint", null);
        setField(term8433, term8433.getClass(), "sectionPaints", null);
        setField(term8433, term8433.getClass(), "parent", null);
        setField(term8433, term8433.getClass(), "datasetGroup", null);
        setField(term8433, term8433.getClass(), "noDataMessage", null);
        setField(term8433, term8433.getClass(), "noDataMessageFont", null);
        setField(term8433, term8433.getClass(), "noDataMessagePaint", null);
        setField(term8433, term8433.getClass(), "insets", null);
        setBooleanField(term8433, term8433.getClass(), "outlineVisible", false);
        setField(term8433, term8433.getClass(), "outlineStroke", null);
        setField(term8433, term8433.getClass(), "outlinePaint", null);
        setField(term8433, term8433.getClass(), "backgroundPaint", null);
        setField(term8433, term8433.getClass(), "backgroundImage", null);
        setIntField(term8433, term8433.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8433, term8433.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8433, term8433.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8433, term8433.getClass(), "backgroundAlpha", 0.0F);
        setField(term8433, term8433.getClass(), "drawingSupplier", null);
        setField(term8433, term8433.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.TableOrder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataExtractOrder", argTypes, term8433, args);
    }

};



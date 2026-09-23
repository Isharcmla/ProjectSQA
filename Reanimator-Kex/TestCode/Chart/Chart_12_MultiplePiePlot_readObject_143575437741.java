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

public class MultiplePiePlot_readObject_143575437741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8533;

    public MultiplePiePlot_readObject_143575437741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8533 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term8533, term8533.getClass(), "pieChart", null);
        setField(term8533, term8533.getClass(), "dataset", null);
        setField(term8533, term8533.getClass(), "dataExtractOrder", null);
        setDoubleField(term8533, term8533.getClass(), "limit", 0.0);
        setField(term8533, term8533.getClass(), "aggregatedItemsKey", null);
        setField(term8533, term8533.getClass(), "aggregatedItemsPaint", null);
        setField(term8533, term8533.getClass(), "sectionPaints", null);
        setField(term8533, term8533.getClass(), "parent", null);
        setField(term8533, term8533.getClass(), "datasetGroup", null);
        setField(term8533, term8533.getClass(), "noDataMessage", null);
        setField(term8533, term8533.getClass(), "noDataMessageFont", null);
        setField(term8533, term8533.getClass(), "noDataMessagePaint", null);
        setField(term8533, term8533.getClass(), "insets", null);
        setBooleanField(term8533, term8533.getClass(), "outlineVisible", false);
        setField(term8533, term8533.getClass(), "outlineStroke", null);
        setField(term8533, term8533.getClass(), "outlinePaint", null);
        setField(term8533, term8533.getClass(), "backgroundPaint", null);
        setField(term8533, term8533.getClass(), "backgroundImage", null);
        setIntField(term8533, term8533.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term8533, term8533.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term8533, term8533.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term8533, term8533.getClass(), "backgroundAlpha", 0.0F);
        setField(term8533, term8533.getClass(), "drawingSupplier", null);
        setField(term8533, term8533.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectInputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readObject", argTypes, term8533, args);
    }

};



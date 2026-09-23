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

public class MultiplePiePlot_writeObject_71016567720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3839;

    public MultiplePiePlot_writeObject_71016567720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3839 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        setField(term3839, term3839.getClass(), "pieChart", null);
        setField(term3839, term3839.getClass(), "dataset", null);
        setField(term3839, term3839.getClass(), "dataExtractOrder", null);
        setDoubleField(term3839, term3839.getClass(), "limit", 0.0);
        setField(term3839, term3839.getClass(), "aggregatedItemsKey", null);
        setField(term3839, term3839.getClass(), "aggregatedItemsPaint", null);
        setField(term3839, term3839.getClass(), "sectionPaints", null);
        setField(term3839, term3839.getClass(), "parent", null);
        setField(term3839, term3839.getClass(), "datasetGroup", null);
        setField(term3839, term3839.getClass(), "noDataMessage", null);
        setField(term3839, term3839.getClass(), "noDataMessageFont", null);
        setField(term3839, term3839.getClass(), "noDataMessagePaint", null);
        setField(term3839, term3839.getClass(), "insets", null);
        setBooleanField(term3839, term3839.getClass(), "outlineVisible", false);
        setField(term3839, term3839.getClass(), "outlineStroke", null);
        setField(term3839, term3839.getClass(), "outlinePaint", null);
        setField(term3839, term3839.getClass(), "backgroundPaint", null);
        setField(term3839, term3839.getClass(), "backgroundImage", null);
        setIntField(term3839, term3839.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term3839, term3839.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term3839, term3839.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term3839, term3839.getClass(), "backgroundAlpha", 0.0F);
        setField(term3839, term3839.getClass(), "drawingSupplier", null);
        setField(term3839, term3839.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeObject", argTypes, term3839, args);
    }

};



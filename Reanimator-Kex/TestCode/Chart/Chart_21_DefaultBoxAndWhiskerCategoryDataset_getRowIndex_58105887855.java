package org.jfree.data.statistics;

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
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.statistics.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public class DefaultBoxAndWhiskerCategoryDataset_getRowIndex_58105887855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620;
     Object term6200;

    public DefaultBoxAndWhiskerCategoryDataset_getRowIndex_58105887855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term622 = new ArrayList();
        ArrayList term626 = new ArrayList();
        ArrayList term630 = new ArrayList();
        term620 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term621 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term640 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term643 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term650 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term651 = (Object[]) newArray("java.lang.Object", 0);
        setField(term621, term621.getClass(), "rowKeys", term622);
        setField(term621, term621.getClass(), "columnKeys", term626);
        setField(term621, term621.getClass(), "rows", term630);
        setField(term620, term620.getClass(), "data", term621);
        setDoubleField(term620, term620.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term620, term620.getClass(), "minimumRangeValueRow", -1);
        setIntField(term620, term620.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term620, term620.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term620, term620.getClass(), "maximumRangeValueRow", -1);
        setIntField(term620, term620.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term640, term640.getClass(), "lower", 0.0);
        setDoubleField(term640, term640.getClass(), "upper", 0.0);
        setField(term620, term620.getClass(), "rangeBounds", term640);
        setField(term643, term643.getClass(), "id", "NOID");
        setField(term620, term620.getClass(), "group", term643);
        setField(term650, term650.getClass(), "listenerList", term651);
        setField(term620, term620.getClass(), "listenerList", term650);
        ArrayList term6202 = new ArrayList();
        ArrayList term6204 = new ArrayList();
        ArrayList term6206 = new ArrayList();
        term6200 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6201 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6208 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6209 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6212 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6213 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6201, term6201.getClass(), "rowKeys", term6202);
        setField(term6201, term6201.getClass(), "columnKeys", term6204);
        setField(term6201, term6201.getClass(), "rows", term6206);
        setField(term6200, term6200.getClass(), "data", term6201);
        setDoubleField(term6200, term6200.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6200, term6200.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6200, term6200.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6200, term6200.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6200, term6200.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6200, term6200.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6208, term6208.getClass(), "lower", 0.0);
        setDoubleField(term6208, term6208.getClass(), "upper", 0.0);
        setField(term6200, term6200.getClass(), "rangeBounds", term6208);
        setField(term6209, term6209.getClass(), "id", "NOID");
        setField(term6200, term6200.getClass(), "group", term6209);
        setField(term6212, term6212.getClass(), "listenerList", term6213);
        setField(term6200, term6200.getClass(), "listenerList", term6212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRowIndex", argTypes, term620, args);
        assertTrue(recursiveEquals(term620, term6200));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



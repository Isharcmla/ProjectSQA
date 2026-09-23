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

public class DefaultBoxAndWhiskerCategoryDataset_equals_49940229074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1332;
     Object term1364;
     Object term10229;
     Object term10243;

    public DefaultBoxAndWhiskerCategoryDataset_equals_49940229074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1334 = new ArrayList();
        ArrayList term1338 = new ArrayList();
        ArrayList term1342 = new ArrayList();
        term1332 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1333 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1352 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1355 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1362 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1363 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1333, term1333.getClass(), "rowKeys", term1334);
        setField(term1333, term1333.getClass(), "columnKeys", term1338);
        setField(term1333, term1333.getClass(), "rows", term1342);
        setField(term1332, term1332.getClass(), "data", term1333);
        setDoubleField(term1332, term1332.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1332, term1332.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1332, term1332.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1332, term1332.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1332, term1332.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1332, term1332.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1352, term1352.getClass(), "lower", 0.0);
        setDoubleField(term1352, term1352.getClass(), "upper", 0.0);
        setField(term1332, term1332.getClass(), "rangeBounds", term1352);
        setField(term1355, term1355.getClass(), "id", "NOID");
        setField(term1332, term1332.getClass(), "group", term1355);
        setField(term1362, term1362.getClass(), "listenerList", term1363);
        setField(term1332, term1332.getClass(), "listenerList", term1362);
        term1364 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term10231 = new ArrayList();
        ArrayList term10233 = new ArrayList();
        ArrayList term10235 = new ArrayList();
        term10229 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term10230 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term10237 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term10238 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term10241 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10242 = (Object[]) newArray("java.lang.Object", 0);
        setField(term10230, term10230.getClass(), "rowKeys", term10231);
        setField(term10230, term10230.getClass(), "columnKeys", term10233);
        setField(term10230, term10230.getClass(), "rows", term10235);
        setField(term10229, term10229.getClass(), "data", term10230);
        setDoubleField(term10229, term10229.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term10229, term10229.getClass(), "minimumRangeValueRow", -1);
        setIntField(term10229, term10229.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term10229, term10229.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term10229, term10229.getClass(), "maximumRangeValueRow", -1);
        setIntField(term10229, term10229.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term10237, term10237.getClass(), "lower", 0.0);
        setDoubleField(term10237, term10237.getClass(), "upper", 0.0);
        setField(term10229, term10229.getClass(), "rangeBounds", term10237);
        setField(term10238, term10238.getClass(), "id", "NOID");
        setField(term10229, term10229.getClass(), "group", term10238);
        setField(term10241, term10241.getClass(), "listenerList", term10242);
        setField(term10229, term10229.getClass(), "listenerList", term10241);
        term10243 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1364;
        Object retValue = callMethod(klass, "equals", argTypes, term1332, args);
        assertTrue(recursiveEquals(term1332, term10229));
        assertTrue(recursiveEquals(term1364, term10243));
        assertTrue(recursiveEquals(retValue, false));
    }

};



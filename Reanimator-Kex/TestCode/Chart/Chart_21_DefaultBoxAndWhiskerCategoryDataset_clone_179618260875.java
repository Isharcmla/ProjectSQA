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

public class DefaultBoxAndWhiskerCategoryDataset_clone_179618260875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1369;
     Object term10366;
     Object term10344;

    public DefaultBoxAndWhiskerCategoryDataset_clone_179618260875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1371 = new ArrayList();
        ArrayList term1375 = new ArrayList();
        ArrayList term1379 = new ArrayList();
        term1369 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1370 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1389 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1392 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1399 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1400 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1370, term1370.getClass(), "rowKeys", term1371);
        setField(term1370, term1370.getClass(), "columnKeys", term1375);
        setField(term1370, term1370.getClass(), "rows", term1379);
        setField(term1369, term1369.getClass(), "data", term1370);
        setDoubleField(term1369, term1369.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1369, term1369.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1369, term1369.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1369, term1369.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1369, term1369.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1369, term1369.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1389, term1389.getClass(), "lower", 0.0);
        setDoubleField(term1389, term1389.getClass(), "upper", 0.0);
        setField(term1369, term1369.getClass(), "rangeBounds", term1389);
        setField(term1392, term1392.getClass(), "id", "NOID");
        setField(term1369, term1369.getClass(), "group", term1392);
        setField(term1399, term1399.getClass(), "listenerList", term1400);
        setField(term1369, term1369.getClass(), "listenerList", term1399);
        ArrayList term10368 = new ArrayList();
        ArrayList term10370 = new ArrayList();
        ArrayList term10372 = new ArrayList();
        term10366 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term10367 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term10374 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term10375 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term10378 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10379 = (Object[]) newArray("java.lang.Object", 0);
        setField(term10367, term10367.getClass(), "rowKeys", term10368);
        setField(term10367, term10367.getClass(), "columnKeys", term10370);
        setField(term10367, term10367.getClass(), "rows", term10372);
        setField(term10366, term10366.getClass(), "data", term10367);
        setDoubleField(term10366, term10366.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term10366, term10366.getClass(), "minimumRangeValueRow", -1);
        setIntField(term10366, term10366.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term10366, term10366.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term10366, term10366.getClass(), "maximumRangeValueRow", -1);
        setIntField(term10366, term10366.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term10374, term10374.getClass(), "lower", 0.0);
        setDoubleField(term10374, term10374.getClass(), "upper", 0.0);
        setField(term10366, term10366.getClass(), "rangeBounds", term10374);
        setField(term10375, term10375.getClass(), "id", "NOID");
        setField(term10366, term10366.getClass(), "group", term10375);
        setField(term10378, term10378.getClass(), "listenerList", term10379);
        setField(term10366, term10366.getClass(), "listenerList", term10378);
        ArrayList term10346 = new ArrayList();
        ArrayList term10350 = new ArrayList();
        ArrayList term10354 = new ArrayList();
        term10344 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term10345 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term10305 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term10308 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term10364 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10365 = (Object[]) newArray("java.lang.Object", 0);
        setField(term10345, term10345.getClass(), "rowKeys", term10346);
        setField(term10345, term10345.getClass(), "columnKeys", term10350);
        setField(term10345, term10345.getClass(), "rows", term10354);
        setField(term10344, term10344.getClass(), "data", term10345);
        setDoubleField(term10344, term10344.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term10344, term10344.getClass(), "minimumRangeValueRow", -1);
        setIntField(term10344, term10344.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term10344, term10344.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term10344, term10344.getClass(), "maximumRangeValueRow", -1);
        setIntField(term10344, term10344.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term10305, term10305.getClass(), "lower", 0.0);
        setDoubleField(term10305, term10305.getClass(), "upper", 0.0);
        setField(term10344, term10344.getClass(), "rangeBounds", term10305);
        setField(term10308, term10308.getClass(), "id", "NOID");
        setField(term10344, term10344.getClass(), "group", term10308);
        setField(term10364, term10364.getClass(), "listenerList", term10365);
        setField(term10344, term10344.getClass(), "listenerList", term10364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term1369, args);
        assertTrue(recursiveEquals(term1369, term10366));
        assertTrue(recursiveEquals(retValue, term10344));
    }

};



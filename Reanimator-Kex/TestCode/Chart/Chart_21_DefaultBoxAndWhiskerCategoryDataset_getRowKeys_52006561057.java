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

public class DefaultBoxAndWhiskerCategoryDataset_getRowKeys_52006561057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694;
     Object term6574;
     Object term6541;

    public DefaultBoxAndWhiskerCategoryDataset_getRowKeys_52006561057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term696 = new ArrayList();
        ArrayList term700 = new ArrayList();
        ArrayList term704 = new ArrayList();
        term694 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term695 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term714 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term717 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term724 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term725 = (Object[]) newArray("java.lang.Object", 0);
        setField(term695, term695.getClass(), "rowKeys", term696);
        setField(term695, term695.getClass(), "columnKeys", term700);
        setField(term695, term695.getClass(), "rows", term704);
        setField(term694, term694.getClass(), "data", term695);
        setDoubleField(term694, term694.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term694, term694.getClass(), "minimumRangeValueRow", -1);
        setIntField(term694, term694.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term694, term694.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term694, term694.getClass(), "maximumRangeValueRow", -1);
        setIntField(term694, term694.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term714, term714.getClass(), "lower", 0.0);
        setDoubleField(term714, term714.getClass(), "upper", 0.0);
        setField(term694, term694.getClass(), "rangeBounds", term714);
        setField(term717, term717.getClass(), "id", "NOID");
        setField(term694, term694.getClass(), "group", term717);
        setField(term724, term724.getClass(), "listenerList", term725);
        setField(term694, term694.getClass(), "listenerList", term724);
        ArrayList term6576 = new ArrayList();
        ArrayList term6578 = new ArrayList();
        ArrayList term6580 = new ArrayList();
        term6574 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6575 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6582 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6583 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6586 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6587 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6575, term6575.getClass(), "rowKeys", term6576);
        setField(term6575, term6575.getClass(), "columnKeys", term6578);
        setField(term6575, term6575.getClass(), "rows", term6580);
        setField(term6574, term6574.getClass(), "data", term6575);
        setDoubleField(term6574, term6574.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6574, term6574.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6574, term6574.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6574, term6574.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6574, term6574.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6574, term6574.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6582, term6582.getClass(), "lower", 0.0);
        setDoubleField(term6582, term6582.getClass(), "upper", 0.0);
        setField(term6574, term6574.getClass(), "rangeBounds", term6582);
        setField(term6583, term6583.getClass(), "id", "NOID");
        setField(term6574, term6574.getClass(), "group", term6583);
        setField(term6586, term6586.getClass(), "listenerList", term6587);
        setField(term6574, term6574.getClass(), "listenerList", term6586);
        ArrayList term6542 = new ArrayList();
        term6541 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term6541, term6541.getClass(), "list", term6542);
        setField(term6541, term6541.getClass(), "c", term6542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowKeys", argTypes, term694, args);
        assertTrue(recursiveEquals(term694, term6574));
        assertTrue(recursiveEquals(retValue, term6541));
    }

};



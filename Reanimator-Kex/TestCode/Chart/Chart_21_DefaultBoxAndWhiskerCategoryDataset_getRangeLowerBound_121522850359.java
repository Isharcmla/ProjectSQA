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
import java.lang.Boolean;

public class DefaultBoxAndWhiskerCategoryDataset_getRangeLowerBound_121522850359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802;
     Object term834;
     Object term6699;

    public DefaultBoxAndWhiskerCategoryDataset_getRangeLowerBound_121522850359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term804 = new ArrayList();
        ArrayList term808 = new ArrayList();
        ArrayList term812 = new ArrayList();
        term802 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term803 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term822 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term825 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term832 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term833 = (Object[]) newArray("java.lang.Object", 0);
        setField(term803, term803.getClass(), "rowKeys", term804);
        setField(term803, term803.getClass(), "columnKeys", term808);
        setField(term803, term803.getClass(), "rows", term812);
        setField(term802, term802.getClass(), "data", term803);
        setDoubleField(term802, term802.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term802, term802.getClass(), "minimumRangeValueRow", -1);
        setIntField(term802, term802.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term802, term802.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term802, term802.getClass(), "maximumRangeValueRow", -1);
        setIntField(term802, term802.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term822, term822.getClass(), "lower", 0.0);
        setDoubleField(term822, term822.getClass(), "upper", 0.0);
        setField(term802, term802.getClass(), "rangeBounds", term822);
        setField(term825, term825.getClass(), "id", "NOID");
        setField(term802, term802.getClass(), "group", term825);
        setField(term832, term832.getClass(), "listenerList", term833);
        setField(term802, term802.getClass(), "listenerList", term832);
        term834 = new Boolean(false);
        ArrayList term6701 = new ArrayList();
        ArrayList term6703 = new ArrayList();
        ArrayList term6705 = new ArrayList();
        term6699 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6700 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6707 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6708 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6711 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6712 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6700, term6700.getClass(), "rowKeys", term6701);
        setField(term6700, term6700.getClass(), "columnKeys", term6703);
        setField(term6700, term6700.getClass(), "rows", term6705);
        setField(term6699, term6699.getClass(), "data", term6700);
        setDoubleField(term6699, term6699.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6699, term6699.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6699, term6699.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6699, term6699.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6699, term6699.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6699, term6699.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6707, term6707.getClass(), "lower", 0.0);
        setDoubleField(term6707, term6707.getClass(), "upper", 0.0);
        setField(term6699, term6699.getClass(), "rangeBounds", term6707);
        setField(term6708, term6708.getClass(), "id", "NOID");
        setField(term6699, term6699.getClass(), "group", term6708);
        setField(term6711, term6711.getClass(), "listenerList", term6712);
        setField(term6699, term6699.getClass(), "listenerList", term6711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term834;
        Object retValue = callMethod(klass, "getRangeLowerBound", argTypes, term802, args);
        assertTrue(recursiveEquals(term802, term6699));
        assertTrue(recursiveEquals(term834, false));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};



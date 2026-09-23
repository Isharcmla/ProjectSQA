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

public class DefaultBoxAndWhiskerCategoryDataset_getColumnCount_50772492560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766;
     Object term6768;

    public DefaultBoxAndWhiskerCategoryDataset_getColumnCount_50772492560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term768 = new ArrayList();
        ArrayList term772 = new ArrayList();
        ArrayList term776 = new ArrayList();
        term766 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term767 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term786 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term789 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term796 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term797 = (Object[]) newArray("java.lang.Object", 0);
        setField(term767, term767.getClass(), "rowKeys", term768);
        setField(term767, term767.getClass(), "columnKeys", term772);
        setField(term767, term767.getClass(), "rows", term776);
        setField(term766, term766.getClass(), "data", term767);
        setDoubleField(term766, term766.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term766, term766.getClass(), "minimumRangeValueRow", -1);
        setIntField(term766, term766.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term766, term766.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term766, term766.getClass(), "maximumRangeValueRow", -1);
        setIntField(term766, term766.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term786, term786.getClass(), "lower", 0.0);
        setDoubleField(term786, term786.getClass(), "upper", 0.0);
        setField(term766, term766.getClass(), "rangeBounds", term786);
        setField(term789, term789.getClass(), "id", "NOID");
        setField(term766, term766.getClass(), "group", term789);
        setField(term796, term796.getClass(), "listenerList", term797);
        setField(term766, term766.getClass(), "listenerList", term796);
        ArrayList term6770 = new ArrayList();
        ArrayList term6772 = new ArrayList();
        ArrayList term6774 = new ArrayList();
        term6768 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6769 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6776 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6777 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6780 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6781 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6769, term6769.getClass(), "rowKeys", term6770);
        setField(term6769, term6769.getClass(), "columnKeys", term6772);
        setField(term6769, term6769.getClass(), "rows", term6774);
        setField(term6768, term6768.getClass(), "data", term6769);
        setDoubleField(term6768, term6768.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6768, term6768.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6768, term6768.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6768, term6768.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6768, term6768.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6768, term6768.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6776, term6776.getClass(), "lower", 0.0);
        setDoubleField(term6776, term6776.getClass(), "upper", 0.0);
        setField(term6768, term6768.getClass(), "rangeBounds", term6776);
        setField(term6777, term6777.getClass(), "id", "NOID");
        setField(term6768, term6768.getClass(), "group", term6777);
        setField(term6780, term6780.getClass(), "listenerList", term6781);
        setField(term6768, term6768.getClass(), "listenerList", term6780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnCount", argTypes, term766, args);
        assertTrue(recursiveEquals(term766, term6768));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



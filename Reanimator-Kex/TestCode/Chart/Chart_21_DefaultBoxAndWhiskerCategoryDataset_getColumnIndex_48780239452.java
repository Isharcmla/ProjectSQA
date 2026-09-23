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

public class DefaultBoxAndWhiskerCategoryDataset_getColumnIndex_48780239452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510;
     Object term5757;

    public DefaultBoxAndWhiskerCategoryDataset_getColumnIndex_48780239452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term512 = new ArrayList();
        ArrayList term516 = new ArrayList();
        ArrayList term520 = new ArrayList();
        term510 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term511 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term530 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term533 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term540 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term541 = (Object[]) newArray("java.lang.Object", 0);
        setField(term511, term511.getClass(), "rowKeys", term512);
        setField(term511, term511.getClass(), "columnKeys", term516);
        setField(term511, term511.getClass(), "rows", term520);
        setField(term510, term510.getClass(), "data", term511);
        setDoubleField(term510, term510.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term510, term510.getClass(), "minimumRangeValueRow", -1);
        setIntField(term510, term510.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term510, term510.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term510, term510.getClass(), "maximumRangeValueRow", -1);
        setIntField(term510, term510.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term530, term530.getClass(), "lower", 0.0);
        setDoubleField(term530, term530.getClass(), "upper", 0.0);
        setField(term510, term510.getClass(), "rangeBounds", term530);
        setField(term533, term533.getClass(), "id", "NOID");
        setField(term510, term510.getClass(), "group", term533);
        setField(term540, term540.getClass(), "listenerList", term541);
        setField(term510, term510.getClass(), "listenerList", term540);
        ArrayList term5759 = new ArrayList();
        ArrayList term5761 = new ArrayList();
        ArrayList term5763 = new ArrayList();
        term5757 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term5758 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term5765 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term5766 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term5769 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5770 = (Object[]) newArray("java.lang.Object", 0);
        setField(term5758, term5758.getClass(), "rowKeys", term5759);
        setField(term5758, term5758.getClass(), "columnKeys", term5761);
        setField(term5758, term5758.getClass(), "rows", term5763);
        setField(term5757, term5757.getClass(), "data", term5758);
        setDoubleField(term5757, term5757.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term5757, term5757.getClass(), "minimumRangeValueRow", -1);
        setIntField(term5757, term5757.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term5757, term5757.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term5757, term5757.getClass(), "maximumRangeValueRow", -1);
        setIntField(term5757, term5757.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term5765, term5765.getClass(), "lower", 0.0);
        setDoubleField(term5765, term5765.getClass(), "upper", 0.0);
        setField(term5757, term5757.getClass(), "rangeBounds", term5765);
        setField(term5766, term5766.getClass(), "id", "NOID");
        setField(term5757, term5757.getClass(), "group", term5766);
        setField(term5769, term5769.getClass(), "listenerList", term5770);
        setField(term5757, term5757.getClass(), "listenerList", term5769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getColumnIndex", argTypes, term510, args);
        assertTrue(recursiveEquals(term510, term5757));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



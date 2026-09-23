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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.util.LinkedList;

public class DefaultBoxAndWhiskerCategoryDataset_add_12003374471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term33;

    public DefaultBoxAndWhiskerCategoryDataset_add_12003374471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3 = new ArrayList();
        ArrayList term7 = new ArrayList();
        ArrayList term11 = new ArrayList();
        term1 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term2 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term21 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term24 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term31 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term32 = (Object[]) newArray("java.lang.Object", 0);
        setField(term2, term2.getClass(), "rowKeys", term3);
        setField(term2, term2.getClass(), "columnKeys", term7);
        setField(term2, term2.getClass(), "rows", term11);
        setField(term1, term1.getClass(), "data", term2);
        setDoubleField(term1, term1.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1, term1.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1, term1.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1, term1.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1, term1.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1, term1.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term21, term21.getClass(), "lower", 0.0);
        setDoubleField(term21, term21.getClass(), "upper", 0.0);
        setField(term1, term1.getClass(), "rangeBounds", term21);
        setField(term24, term24.getClass(), "id", "NOID");
        setField(term1, term1.getClass(), "group", term24);
        setField(term31, term31.getClass(), "listenerList", term32);
        setField(term1, term1.getClass(), "listenerList", term31);
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        Object term38 = newInstance(Class.forName("java.lang.Object"));
        Object term40 = newInstance(Class.forName("java.lang.Object"));
        term33 = new LinkedList();
        ((LinkedList) term33).add(term36);
        ((LinkedList) term33).add(term38);
        ((LinkedList) term33).add(term40);
        ((LinkedList) term33).add((Object)null);
        ((LinkedList) term33).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = term33;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "add", argTypes, term1, args);
    }

};



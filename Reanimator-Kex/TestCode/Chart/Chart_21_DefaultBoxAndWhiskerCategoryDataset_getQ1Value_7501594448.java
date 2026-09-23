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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Integer;

public class DefaultBoxAndWhiskerCategoryDataset_getQ1Value_7501594448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;
     Object term390;
     Object term392;

    public DefaultBoxAndWhiskerCategoryDataset_getQ1Value_7501594448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term360 = new ArrayList();
        ArrayList term364 = new ArrayList();
        ArrayList term368 = new ArrayList();
        term358 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term359 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term378 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term381 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term388 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term389 = (Object[]) newArray("java.lang.Object", 0);
        setField(term359, term359.getClass(), "rowKeys", term360);
        setField(term359, term359.getClass(), "columnKeys", term364);
        setField(term359, term359.getClass(), "rows", term368);
        setField(term358, term358.getClass(), "data", term359);
        setDoubleField(term358, term358.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term358, term358.getClass(), "minimumRangeValueRow", -1);
        setIntField(term358, term358.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term358, term358.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term358, term358.getClass(), "maximumRangeValueRow", -1);
        setIntField(term358, term358.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term378, term378.getClass(), "lower", 0.0);
        setDoubleField(term378, term378.getClass(), "upper", 0.0);
        setField(term358, term358.getClass(), "rangeBounds", term378);
        setField(term381, term381.getClass(), "id", "NOID");
        setField(term358, term358.getClass(), "group", term381);
        setField(term388, term388.getClass(), "listenerList", term389);
        setField(term358, term358.getClass(), "listenerList", term388);
        term390 = new Integer(1227103734);
        term392 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term390;
        args[1] = term392;
        try {
            callMethod(klass, "getQ1Value", argTypes, term358, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



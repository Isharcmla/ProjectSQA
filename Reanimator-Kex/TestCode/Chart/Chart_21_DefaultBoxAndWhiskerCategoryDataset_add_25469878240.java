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
import java.lang.IllegalArgumentException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public class DefaultBoxAndWhiskerCategoryDataset_add_25469878240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term81;

    public DefaultBoxAndWhiskerCategoryDataset_add_25469878240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term51 = new ArrayList();
        ArrayList term55 = new ArrayList();
        ArrayList term59 = new ArrayList();
        term49 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term50 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term69 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term72 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term79 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term80 = (Object[]) newArray("java.lang.Object", 0);
        setField(term50, term50.getClass(), "rowKeys", term51);
        setField(term50, term50.getClass(), "columnKeys", term55);
        setField(term50, term50.getClass(), "rows", term59);
        setField(term49, term49.getClass(), "data", term50);
        setDoubleField(term49, term49.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term49, term49.getClass(), "minimumRangeValueRow", -1);
        setIntField(term49, term49.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term49, term49.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term49, term49.getClass(), "maximumRangeValueRow", -1);
        setIntField(term49, term49.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term69, term69.getClass(), "lower", 0.0);
        setDoubleField(term69, term69.getClass(), "upper", 0.0);
        setField(term49, term49.getClass(), "rangeBounds", term69);
        setField(term72, term72.getClass(), "id", "NOID");
        setField(term49, term49.getClass(), "group", term72);
        setField(term79, term79.getClass(), "listenerList", term80);
        setField(term49, term49.getClass(), "listenerList", term79);
        ArrayList term82 = new ArrayList();
        term81 = newInstance(Class.forName("org.jfree.data.statistics.BoxAndWhiskerItem"));
        setField(term81, term81.getClass(), "mean", null);
        setField(term81, term81.getClass(), "median", null);
        setField(term81, term81.getClass(), "q1", null);
        setField(term81, term81.getClass(), "q3", null);
        setField(term81, term81.getClass(), "minRegularValue", null);
        setField(term81, term81.getClass(), "maxRegularValue", null);
        setField(term81, term81.getClass(), "minOutlier", null);
        setField(term81, term81.getClass(), "maxOutlier", null);
        setField(term81, term81.getClass(), "outliers", term82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.statistics.BoxAndWhiskerItem");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = term81;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "add", argTypes, term49, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class DefaultBoxAndWhiskerCategoryDataset_getOutliers_214148481772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1260;

    public DefaultBoxAndWhiskerCategoryDataset_getOutliers_214148481772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1262 = new ArrayList();
        ArrayList term1266 = new ArrayList();
        ArrayList term1270 = new ArrayList();
        term1260 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1261 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1280 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1283 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1290 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1291 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1261, term1261.getClass(), "rowKeys", term1262);
        setField(term1261, term1261.getClass(), "columnKeys", term1266);
        setField(term1261, term1261.getClass(), "rows", term1270);
        setField(term1260, term1260.getClass(), "data", term1261);
        setDoubleField(term1260, term1260.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1260, term1260.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1260, term1260.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1260, term1260.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1260, term1260.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1260, term1260.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1280, term1280.getClass(), "lower", 0.0);
        setDoubleField(term1280, term1280.getClass(), "upper", 0.0);
        setField(term1260, term1260.getClass(), "rangeBounds", term1280);
        setField(term1283, term1283.getClass(), "id", "NOID");
        setField(term1260, term1260.getClass(), "group", term1283);
        setField(term1290, term1290.getClass(), "listenerList", term1291);
        setField(term1260, term1260.getClass(), "listenerList", term1290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getOutliers", argTypes, term1260, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



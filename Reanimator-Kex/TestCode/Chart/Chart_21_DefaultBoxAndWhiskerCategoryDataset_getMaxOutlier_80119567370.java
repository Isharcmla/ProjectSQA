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

public class DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_80119567370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1184;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_80119567370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1186 = new ArrayList();
        ArrayList term1190 = new ArrayList();
        ArrayList term1194 = new ArrayList();
        term1184 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1185 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1204 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1207 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1214 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1215 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1185, term1185.getClass(), "rowKeys", term1186);
        setField(term1185, term1185.getClass(), "columnKeys", term1190);
        setField(term1185, term1185.getClass(), "rows", term1194);
        setField(term1184, term1184.getClass(), "data", term1185);
        setDoubleField(term1184, term1184.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1184, term1184.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1184, term1184.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1184, term1184.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1184, term1184.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1184, term1184.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1204, term1204.getClass(), "lower", 0.0);
        setDoubleField(term1204, term1204.getClass(), "upper", 0.0);
        setField(term1184, term1184.getClass(), "rangeBounds", term1204);
        setField(term1207, term1207.getClass(), "id", "NOID");
        setField(term1184, term1184.getClass(), "group", term1207);
        setField(term1214, term1214.getClass(), "listenerList", term1215);
        setField(term1184, term1184.getClass(), "listenerList", term1214);
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
            callMethod(klass, "getMaxOutlier", argTypes, term1184, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



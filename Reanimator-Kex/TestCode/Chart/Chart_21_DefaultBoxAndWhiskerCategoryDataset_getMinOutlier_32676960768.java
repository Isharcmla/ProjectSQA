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

public class DefaultBoxAndWhiskerCategoryDataset_getMinOutlier_32676960768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1108;

    public DefaultBoxAndWhiskerCategoryDataset_getMinOutlier_32676960768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1110 = new ArrayList();
        ArrayList term1114 = new ArrayList();
        ArrayList term1118 = new ArrayList();
        term1108 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1109 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1128 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1131 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1138 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1139 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1109, term1109.getClass(), "rowKeys", term1110);
        setField(term1109, term1109.getClass(), "columnKeys", term1114);
        setField(term1109, term1109.getClass(), "rows", term1118);
        setField(term1108, term1108.getClass(), "data", term1109);
        setDoubleField(term1108, term1108.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1108, term1108.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1108, term1108.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1108, term1108.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1108, term1108.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1108, term1108.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1128, term1128.getClass(), "lower", 0.0);
        setDoubleField(term1128, term1128.getClass(), "upper", 0.0);
        setField(term1108, term1108.getClass(), "rangeBounds", term1128);
        setField(term1131, term1131.getClass(), "id", "NOID");
        setField(term1108, term1108.getClass(), "group", term1131);
        setField(term1138, term1138.getClass(), "listenerList", term1139);
        setField(term1108, term1108.getClass(), "listenerList", term1138);
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
            callMethod(klass, "getMinOutlier", argTypes, term1108, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



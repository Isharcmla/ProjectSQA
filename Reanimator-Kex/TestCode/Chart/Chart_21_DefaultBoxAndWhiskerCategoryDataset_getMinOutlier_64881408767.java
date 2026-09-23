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

public class DefaultBoxAndWhiskerCategoryDataset_getMinOutlier_64881408767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1068;
     Object term1100;
     Object term1102;

    public DefaultBoxAndWhiskerCategoryDataset_getMinOutlier_64881408767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1070 = new ArrayList();
        ArrayList term1074 = new ArrayList();
        ArrayList term1078 = new ArrayList();
        term1068 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1069 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1088 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1091 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1098 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1099 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1069, term1069.getClass(), "rowKeys", term1070);
        setField(term1069, term1069.getClass(), "columnKeys", term1074);
        setField(term1069, term1069.getClass(), "rows", term1078);
        setField(term1068, term1068.getClass(), "data", term1069);
        setDoubleField(term1068, term1068.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1068, term1068.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1068, term1068.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1068, term1068.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1068, term1068.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1068, term1068.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1088, term1088.getClass(), "lower", 0.0);
        setDoubleField(term1088, term1088.getClass(), "upper", 0.0);
        setField(term1068, term1068.getClass(), "rangeBounds", term1088);
        setField(term1091, term1091.getClass(), "id", "NOID");
        setField(term1068, term1068.getClass(), "group", term1091);
        setField(term1098, term1098.getClass(), "listenerList", term1099);
        setField(term1068, term1068.getClass(), "listenerList", term1098);
        term1100 = new Integer(1622346318);
        term1102 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1100;
        args[1] = term1102;
        try {
            callMethod(klass, "getMinOutlier", argTypes, term1068, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



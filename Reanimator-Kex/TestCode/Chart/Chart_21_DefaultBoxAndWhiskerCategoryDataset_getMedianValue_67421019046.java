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

public class DefaultBoxAndWhiskerCategoryDataset_getMedianValue_67421019046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;
     Object term314;
     Object term316;

    public DefaultBoxAndWhiskerCategoryDataset_getMedianValue_67421019046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term284 = new ArrayList();
        ArrayList term288 = new ArrayList();
        ArrayList term292 = new ArrayList();
        term282 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term283 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term302 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term305 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term312 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term313 = (Object[]) newArray("java.lang.Object", 0);
        setField(term283, term283.getClass(), "rowKeys", term284);
        setField(term283, term283.getClass(), "columnKeys", term288);
        setField(term283, term283.getClass(), "rows", term292);
        setField(term282, term282.getClass(), "data", term283);
        setDoubleField(term282, term282.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term282, term282.getClass(), "minimumRangeValueRow", -1);
        setIntField(term282, term282.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term282, term282.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term282, term282.getClass(), "maximumRangeValueRow", -1);
        setIntField(term282, term282.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term302, term302.getClass(), "lower", 0.0);
        setDoubleField(term302, term302.getClass(), "upper", 0.0);
        setField(term282, term282.getClass(), "rangeBounds", term302);
        setField(term305, term305.getClass(), "id", "NOID");
        setField(term282, term282.getClass(), "group", term305);
        setField(term312, term312.getClass(), "listenerList", term313);
        setField(term282, term282.getClass(), "listenerList", term312);
        term314 = new Integer(-1955890973);
        term316 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term314;
        args[1] = term316;
        try {
            callMethod(klass, "getMedianValue", argTypes, term282, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



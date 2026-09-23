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

public class DefaultBoxAndWhiskerCategoryDataset_updateBounds_190280113835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1296;

    public DefaultBoxAndWhiskerCategoryDataset_updateBounds_190280113835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1298 = new ArrayList();
        ArrayList term1302 = new ArrayList();
        ArrayList term1306 = new ArrayList();
        term1296 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1297 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1316 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1319 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1326 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1327 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1297, term1297.getClass(), "rowKeys", term1298);
        setField(term1297, term1297.getClass(), "columnKeys", term1302);
        setField(term1297, term1297.getClass(), "rows", term1306);
        setField(term1296, term1296.getClass(), "data", term1297);
        setDoubleField(term1296, term1296.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1296, term1296.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1296, term1296.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1296, term1296.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1296, term1296.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1296, term1296.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1316, term1316.getClass(), "lower", 0.0);
        setDoubleField(term1316, term1316.getClass(), "upper", 0.0);
        setField(term1296, term1296.getClass(), "rangeBounds", term1316);
        setField(term1319, term1319.getClass(), "id", "NOID");
        setField(term1296, term1296.getClass(), "group", term1319);
        setField(term1326, term1326.getClass(), "listenerList", term1327);
        setField(term1296, term1296.getClass(), "listenerList", term1326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateBounds", argTypes, term1296, args);
    }

};



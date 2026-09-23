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

public class DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_112324015369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1144;
     Object term1176;
     Object term1178;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_112324015369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1146 = new ArrayList();
        ArrayList term1150 = new ArrayList();
        ArrayList term1154 = new ArrayList();
        term1144 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1145 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1164 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1167 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1174 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1175 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1145, term1145.getClass(), "rowKeys", term1146);
        setField(term1145, term1145.getClass(), "columnKeys", term1150);
        setField(term1145, term1145.getClass(), "rows", term1154);
        setField(term1144, term1144.getClass(), "data", term1145);
        setDoubleField(term1144, term1144.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1144, term1144.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1144, term1144.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1144, term1144.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1144, term1144.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1144, term1144.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1164, term1164.getClass(), "lower", 0.0);
        setDoubleField(term1164, term1164.getClass(), "upper", 0.0);
        setField(term1144, term1144.getClass(), "rangeBounds", term1164);
        setField(term1167, term1167.getClass(), "id", "NOID");
        setField(term1144, term1144.getClass(), "group", term1167);
        setField(term1174, term1174.getClass(), "listenerList", term1175);
        setField(term1144, term1144.getClass(), "listenerList", term1174);
        term1176 = new Integer(-655067527);
        term1178 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1176;
        args[1] = term1178;
        try {
            callMethod(klass, "getMaxOutlier", argTypes, term1144, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



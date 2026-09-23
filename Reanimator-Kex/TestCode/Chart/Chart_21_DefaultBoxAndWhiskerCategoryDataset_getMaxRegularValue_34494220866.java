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

public class DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_34494220866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1032;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_34494220866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1034 = new ArrayList();
        ArrayList term1038 = new ArrayList();
        ArrayList term1042 = new ArrayList();
        term1032 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1033 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1052 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1055 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1062 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1063 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1033, term1033.getClass(), "rowKeys", term1034);
        setField(term1033, term1033.getClass(), "columnKeys", term1038);
        setField(term1033, term1033.getClass(), "rows", term1042);
        setField(term1032, term1032.getClass(), "data", term1033);
        setDoubleField(term1032, term1032.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1032, term1032.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1032, term1032.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1032, term1032.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1032, term1032.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1032, term1032.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1052, term1052.getClass(), "lower", 0.0);
        setDoubleField(term1052, term1052.getClass(), "upper", 0.0);
        setField(term1032, term1032.getClass(), "rangeBounds", term1052);
        setField(term1055, term1055.getClass(), "id", "NOID");
        setField(term1032, term1032.getClass(), "group", term1055);
        setField(term1062, term1062.getClass(), "listenerList", term1063);
        setField(term1032, term1032.getClass(), "listenerList", term1062);
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
            callMethod(klass, "getMaxRegularValue", argTypes, term1032, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_195702459463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;
     Object term948;
     Object term950;

    public DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_195702459463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term918 = new ArrayList();
        ArrayList term922 = new ArrayList();
        ArrayList term926 = new ArrayList();
        term916 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term917 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term936 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term939 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term946 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term947 = (Object[]) newArray("java.lang.Object", 0);
        setField(term917, term917.getClass(), "rowKeys", term918);
        setField(term917, term917.getClass(), "columnKeys", term922);
        setField(term917, term917.getClass(), "rows", term926);
        setField(term916, term916.getClass(), "data", term917);
        setDoubleField(term916, term916.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term916, term916.getClass(), "minimumRangeValueRow", -1);
        setIntField(term916, term916.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term916, term916.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term916, term916.getClass(), "maximumRangeValueRow", -1);
        setIntField(term916, term916.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term936, term936.getClass(), "lower", 0.0);
        setDoubleField(term936, term936.getClass(), "upper", 0.0);
        setField(term916, term916.getClass(), "rangeBounds", term936);
        setField(term939, term939.getClass(), "id", "NOID");
        setField(term916, term916.getClass(), "group", term939);
        setField(term946, term946.getClass(), "listenerList", term947);
        setField(term916, term916.getClass(), "listenerList", term946);
        term948 = new Integer(1585847225);
        term950 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term948;
        args[1] = term950;
        try {
            callMethod(klass, "getMinRegularValue", argTypes, term916, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



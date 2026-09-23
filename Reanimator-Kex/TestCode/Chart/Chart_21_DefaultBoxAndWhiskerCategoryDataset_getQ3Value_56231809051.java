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

public class DefaultBoxAndWhiskerCategoryDataset_getQ3Value_56231809051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;

    public DefaultBoxAndWhiskerCategoryDataset_getQ3Value_56231809051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term476 = new ArrayList();
        ArrayList term480 = new ArrayList();
        ArrayList term484 = new ArrayList();
        term474 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term475 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term494 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term497 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term504 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term505 = (Object[]) newArray("java.lang.Object", 0);
        setField(term475, term475.getClass(), "rowKeys", term476);
        setField(term475, term475.getClass(), "columnKeys", term480);
        setField(term475, term475.getClass(), "rows", term484);
        setField(term474, term474.getClass(), "data", term475);
        setDoubleField(term474, term474.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term474, term474.getClass(), "minimumRangeValueRow", -1);
        setIntField(term474, term474.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term474, term474.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term474, term474.getClass(), "maximumRangeValueRow", -1);
        setIntField(term474, term474.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term494, term494.getClass(), "lower", 0.0);
        setDoubleField(term494, term494.getClass(), "upper", 0.0);
        setField(term474, term474.getClass(), "rangeBounds", term494);
        setField(term497, term497.getClass(), "id", "NOID");
        setField(term474, term474.getClass(), "group", term497);
        setField(term504, term504.getClass(), "listenerList", term505);
        setField(term474, term474.getClass(), "listenerList", term504);
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
            callMethod(klass, "getQ3Value", argTypes, term474, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class DefaultBoxAndWhiskerCategoryDataset_getRowKey_136803780356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656;
     Object term688;

    public DefaultBoxAndWhiskerCategoryDataset_getRowKey_136803780356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term658 = new ArrayList();
        ArrayList term662 = new ArrayList();
        ArrayList term666 = new ArrayList();
        term656 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term657 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term676 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term679 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term686 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term687 = (Object[]) newArray("java.lang.Object", 0);
        setField(term657, term657.getClass(), "rowKeys", term658);
        setField(term657, term657.getClass(), "columnKeys", term662);
        setField(term657, term657.getClass(), "rows", term666);
        setField(term656, term656.getClass(), "data", term657);
        setDoubleField(term656, term656.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term656, term656.getClass(), "minimumRangeValueRow", -1);
        setIntField(term656, term656.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term656, term656.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term656, term656.getClass(), "maximumRangeValueRow", -1);
        setIntField(term656, term656.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term676, term676.getClass(), "lower", 0.0);
        setDoubleField(term676, term676.getClass(), "upper", 0.0);
        setField(term656, term656.getClass(), "rangeBounds", term676);
        setField(term679, term679.getClass(), "id", "NOID");
        setField(term656, term656.getClass(), "group", term679);
        setField(term686, term686.getClass(), "listenerList", term687);
        setField(term656, term656.getClass(), "listenerList", term686);
        term688 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term688;
        try {
            callMethod(klass, "getRowKey", argTypes, term656, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



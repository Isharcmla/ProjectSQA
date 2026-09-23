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

public class DefaultBoxAndWhiskerCategoryDataset_getQ3Value_88436257050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434;
     Object term466;
     Object term468;

    public DefaultBoxAndWhiskerCategoryDataset_getQ3Value_88436257050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term436 = new ArrayList();
        ArrayList term440 = new ArrayList();
        ArrayList term444 = new ArrayList();
        term434 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term435 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term454 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term457 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term464 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term465 = (Object[]) newArray("java.lang.Object", 0);
        setField(term435, term435.getClass(), "rowKeys", term436);
        setField(term435, term435.getClass(), "columnKeys", term440);
        setField(term435, term435.getClass(), "rows", term444);
        setField(term434, term434.getClass(), "data", term435);
        setDoubleField(term434, term434.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term434, term434.getClass(), "minimumRangeValueRow", -1);
        setIntField(term434, term434.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term434, term434.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term434, term434.getClass(), "maximumRangeValueRow", -1);
        setIntField(term434, term434.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term454, term454.getClass(), "lower", 0.0);
        setDoubleField(term454, term454.getClass(), "upper", 0.0);
        setField(term434, term434.getClass(), "rangeBounds", term454);
        setField(term457, term457.getClass(), "id", "NOID");
        setField(term434, term434.getClass(), "group", term457);
        setField(term464, term464.getClass(), "listenerList", term465);
        setField(term434, term434.getClass(), "listenerList", term464);
        term466 = new Integer(1725571209);
        term468 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term466;
        args[1] = term468;
        try {
            callMethod(klass, "getQ3Value", argTypes, term434, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



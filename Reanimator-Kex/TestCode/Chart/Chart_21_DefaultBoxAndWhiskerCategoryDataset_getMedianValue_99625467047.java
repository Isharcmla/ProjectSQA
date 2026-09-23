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

public class DefaultBoxAndWhiskerCategoryDataset_getMedianValue_99625467047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;

    public DefaultBoxAndWhiskerCategoryDataset_getMedianValue_99625467047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term324 = new ArrayList();
        ArrayList term328 = new ArrayList();
        ArrayList term332 = new ArrayList();
        term322 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term323 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term342 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term345 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term352 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term353 = (Object[]) newArray("java.lang.Object", 0);
        setField(term323, term323.getClass(), "rowKeys", term324);
        setField(term323, term323.getClass(), "columnKeys", term328);
        setField(term323, term323.getClass(), "rows", term332);
        setField(term322, term322.getClass(), "data", term323);
        setDoubleField(term322, term322.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term322, term322.getClass(), "minimumRangeValueRow", -1);
        setIntField(term322, term322.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term322, term322.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term322, term322.getClass(), "maximumRangeValueRow", -1);
        setIntField(term322, term322.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term342, term342.getClass(), "lower", 0.0);
        setDoubleField(term342, term342.getClass(), "upper", 0.0);
        setField(term322, term322.getClass(), "rangeBounds", term342);
        setField(term345, term345.getClass(), "id", "NOID");
        setField(term322, term322.getClass(), "group", term345);
        setField(term352, term352.getClass(), "listenerList", term353);
        setField(term322, term322.getClass(), "listenerList", term352);
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
            callMethod(klass, "getMedianValue", argTypes, term322, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class DefaultBoxAndWhiskerCategoryDataset_getQ1Value_24702853649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;

    public DefaultBoxAndWhiskerCategoryDataset_getQ1Value_24702853649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term400 = new ArrayList();
        ArrayList term404 = new ArrayList();
        ArrayList term408 = new ArrayList();
        term398 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term399 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term418 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term421 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term428 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term429 = (Object[]) newArray("java.lang.Object", 0);
        setField(term399, term399.getClass(), "rowKeys", term400);
        setField(term399, term399.getClass(), "columnKeys", term404);
        setField(term399, term399.getClass(), "rows", term408);
        setField(term398, term398.getClass(), "data", term399);
        setDoubleField(term398, term398.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term398, term398.getClass(), "minimumRangeValueRow", -1);
        setIntField(term398, term398.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term398, term398.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term398, term398.getClass(), "maximumRangeValueRow", -1);
        setIntField(term398, term398.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term418, term418.getClass(), "lower", 0.0);
        setDoubleField(term418, term418.getClass(), "upper", 0.0);
        setField(term398, term398.getClass(), "rangeBounds", term418);
        setField(term421, term421.getClass(), "id", "NOID");
        setField(term398, term398.getClass(), "group", term421);
        setField(term428, term428.getClass(), "listenerList", term429);
        setField(term398, term398.getClass(), "listenerList", term428);
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
            callMethod(klass, "getQ1Value", argTypes, term398, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



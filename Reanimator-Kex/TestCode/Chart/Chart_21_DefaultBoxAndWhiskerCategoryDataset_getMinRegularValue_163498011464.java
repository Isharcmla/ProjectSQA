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

public class DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_163498011464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term956;

    public DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_163498011464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term958 = new ArrayList();
        ArrayList term962 = new ArrayList();
        ArrayList term966 = new ArrayList();
        term956 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term957 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term976 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term979 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term986 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term987 = (Object[]) newArray("java.lang.Object", 0);
        setField(term957, term957.getClass(), "rowKeys", term958);
        setField(term957, term957.getClass(), "columnKeys", term962);
        setField(term957, term957.getClass(), "rows", term966);
        setField(term956, term956.getClass(), "data", term957);
        setDoubleField(term956, term956.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term956, term956.getClass(), "minimumRangeValueRow", -1);
        setIntField(term956, term956.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term956, term956.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term956, term956.getClass(), "maximumRangeValueRow", -1);
        setIntField(term956, term956.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term976, term976.getClass(), "lower", 0.0);
        setDoubleField(term976, term976.getClass(), "upper", 0.0);
        setField(term956, term956.getClass(), "rangeBounds", term976);
        setField(term979, term979.getClass(), "id", "NOID");
        setField(term956, term956.getClass(), "group", term979);
        setField(term986, term986.getClass(), "listenerList", term987);
        setField(term956, term956.getClass(), "listenerList", term986);
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
            callMethod(klass, "getMinRegularValue", argTypes, term956, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



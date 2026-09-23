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
import static org.jfree.data.statistics.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Boolean;

public class DefaultBoxAndWhiskerCategoryDataset_getRangeBounds_45462933862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878;
     Object term910;
     Object term6879;
     Object term6824;

    public DefaultBoxAndWhiskerCategoryDataset_getRangeBounds_45462933862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term880 = new ArrayList();
        ArrayList term884 = new ArrayList();
        ArrayList term888 = new ArrayList();
        term878 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term879 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term898 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term901 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term908 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term909 = (Object[]) newArray("java.lang.Object", 0);
        setField(term879, term879.getClass(), "rowKeys", term880);
        setField(term879, term879.getClass(), "columnKeys", term884);
        setField(term879, term879.getClass(), "rows", term888);
        setField(term878, term878.getClass(), "data", term879);
        setDoubleField(term878, term878.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term878, term878.getClass(), "minimumRangeValueRow", -1);
        setIntField(term878, term878.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term878, term878.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term878, term878.getClass(), "maximumRangeValueRow", -1);
        setIntField(term878, term878.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term898, term898.getClass(), "lower", 0.0);
        setDoubleField(term898, term898.getClass(), "upper", 0.0);
        setField(term878, term878.getClass(), "rangeBounds", term898);
        setField(term901, term901.getClass(), "id", "NOID");
        setField(term878, term878.getClass(), "group", term901);
        setField(term908, term908.getClass(), "listenerList", term909);
        setField(term878, term878.getClass(), "listenerList", term908);
        term910 = new Boolean(false);
        ArrayList term6881 = new ArrayList();
        ArrayList term6883 = new ArrayList();
        ArrayList term6885 = new ArrayList();
        term6879 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6880 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6887 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6888 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6891 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6892 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6880, term6880.getClass(), "rowKeys", term6881);
        setField(term6880, term6880.getClass(), "columnKeys", term6883);
        setField(term6880, term6880.getClass(), "rows", term6885);
        setField(term6879, term6879.getClass(), "data", term6880);
        setDoubleField(term6879, term6879.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6879, term6879.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6879, term6879.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6879, term6879.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6879, term6879.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6879, term6879.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6887, term6887.getClass(), "lower", 0.0);
        setDoubleField(term6887, term6887.getClass(), "upper", 0.0);
        setField(term6879, term6879.getClass(), "rangeBounds", term6887);
        setField(term6888, term6888.getClass(), "id", "NOID");
        setField(term6879, term6879.getClass(), "group", term6888);
        setField(term6891, term6891.getClass(), "listenerList", term6892);
        setField(term6879, term6879.getClass(), "listenerList", term6891);
        term6824 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term6824, term6824.getClass(), "lower", 0.0);
        setDoubleField(term6824, term6824.getClass(), "upper", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term910;
        Object retValue = callMethod(klass, "getRangeBounds", argTypes, term878, args);
        assertTrue(recursiveEquals(term878, term6879));
        assertTrue(recursiveEquals(term910, false));
        assertTrue(recursiveEquals(retValue, term6824));
    }

};



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

public class DefaultBoxAndWhiskerCategoryDataset_getRangeUpperBound_195561615061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840;
     Object term872;
     Object term6857;

    public DefaultBoxAndWhiskerCategoryDataset_getRangeUpperBound_195561615061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term842 = new ArrayList();
        ArrayList term846 = new ArrayList();
        ArrayList term850 = new ArrayList();
        term840 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term841 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term860 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term863 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term870 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term871 = (Object[]) newArray("java.lang.Object", 0);
        setField(term841, term841.getClass(), "rowKeys", term842);
        setField(term841, term841.getClass(), "columnKeys", term846);
        setField(term841, term841.getClass(), "rows", term850);
        setField(term840, term840.getClass(), "data", term841);
        setDoubleField(term840, term840.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term840, term840.getClass(), "minimumRangeValueRow", -1);
        setIntField(term840, term840.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term840, term840.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term840, term840.getClass(), "maximumRangeValueRow", -1);
        setIntField(term840, term840.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term860, term860.getClass(), "lower", 0.0);
        setDoubleField(term860, term860.getClass(), "upper", 0.0);
        setField(term840, term840.getClass(), "rangeBounds", term860);
        setField(term863, term863.getClass(), "id", "NOID");
        setField(term840, term840.getClass(), "group", term863);
        setField(term870, term870.getClass(), "listenerList", term871);
        setField(term840, term840.getClass(), "listenerList", term870);
        term872 = new Boolean(false);
        ArrayList term6859 = new ArrayList();
        ArrayList term6861 = new ArrayList();
        ArrayList term6863 = new ArrayList();
        term6857 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6858 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6865 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6866 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6869 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6870 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6858, term6858.getClass(), "rowKeys", term6859);
        setField(term6858, term6858.getClass(), "columnKeys", term6861);
        setField(term6858, term6858.getClass(), "rows", term6863);
        setField(term6857, term6857.getClass(), "data", term6858);
        setDoubleField(term6857, term6857.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6857, term6857.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6857, term6857.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6857, term6857.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6857, term6857.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6857, term6857.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6865, term6865.getClass(), "lower", 0.0);
        setDoubleField(term6865, term6865.getClass(), "upper", 0.0);
        setField(term6857, term6857.getClass(), "rangeBounds", term6865);
        setField(term6866, term6866.getClass(), "id", "NOID");
        setField(term6857, term6857.getClass(), "group", term6866);
        setField(term6869, term6869.getClass(), "listenerList", term6870);
        setField(term6857, term6857.getClass(), "listenerList", term6869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term872;
        Object retValue = callMethod(klass, "getRangeUpperBound", argTypes, term840, args);
        assertTrue(recursiveEquals(term840, term6857));
        assertTrue(recursiveEquals(term872, false));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};



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

public class DefaultBoxAndWhiskerCategoryDataset_getColumnKeys_34703888254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584;
     Object term6131;
     Object term6098;

    public DefaultBoxAndWhiskerCategoryDataset_getColumnKeys_34703888254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term586 = new ArrayList();
        ArrayList term590 = new ArrayList();
        ArrayList term594 = new ArrayList();
        term584 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term585 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term604 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term607 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term614 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term615 = (Object[]) newArray("java.lang.Object", 0);
        setField(term585, term585.getClass(), "rowKeys", term586);
        setField(term585, term585.getClass(), "columnKeys", term590);
        setField(term585, term585.getClass(), "rows", term594);
        setField(term584, term584.getClass(), "data", term585);
        setDoubleField(term584, term584.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term584, term584.getClass(), "minimumRangeValueRow", -1);
        setIntField(term584, term584.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term584, term584.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term584, term584.getClass(), "maximumRangeValueRow", -1);
        setIntField(term584, term584.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term604, term604.getClass(), "lower", 0.0);
        setDoubleField(term604, term604.getClass(), "upper", 0.0);
        setField(term584, term584.getClass(), "rangeBounds", term604);
        setField(term607, term607.getClass(), "id", "NOID");
        setField(term584, term584.getClass(), "group", term607);
        setField(term614, term614.getClass(), "listenerList", term615);
        setField(term584, term584.getClass(), "listenerList", term614);
        ArrayList term6133 = new ArrayList();
        ArrayList term6135 = new ArrayList();
        ArrayList term6137 = new ArrayList();
        term6131 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6132 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6139 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6140 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6143 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6144 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6132, term6132.getClass(), "rowKeys", term6133);
        setField(term6132, term6132.getClass(), "columnKeys", term6135);
        setField(term6132, term6132.getClass(), "rows", term6137);
        setField(term6131, term6131.getClass(), "data", term6132);
        setDoubleField(term6131, term6131.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6131, term6131.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6131, term6131.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6131, term6131.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6131, term6131.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6131, term6131.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6139, term6139.getClass(), "lower", 0.0);
        setDoubleField(term6139, term6139.getClass(), "upper", 0.0);
        setField(term6131, term6131.getClass(), "rangeBounds", term6139);
        setField(term6140, term6140.getClass(), "id", "NOID");
        setField(term6131, term6131.getClass(), "group", term6140);
        setField(term6143, term6143.getClass(), "listenerList", term6144);
        setField(term6131, term6131.getClass(), "listenerList", term6143);
        ArrayList term6099 = new ArrayList();
        term6098 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term6098, term6098.getClass(), "list", term6099);
        setField(term6098, term6098.getClass(), "c", term6099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnKeys", argTypes, term584, args);
        assertTrue(recursiveEquals(term584, term6131));
        assertTrue(recursiveEquals(retValue, term6098));
    }

};



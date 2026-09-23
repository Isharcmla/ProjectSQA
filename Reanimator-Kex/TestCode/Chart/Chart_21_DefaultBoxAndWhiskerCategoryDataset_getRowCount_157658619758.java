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

public class DefaultBoxAndWhiskerCategoryDataset_getRowCount_157658619758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730;
     Object term6643;

    public DefaultBoxAndWhiskerCategoryDataset_getRowCount_157658619758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term732 = new ArrayList();
        ArrayList term736 = new ArrayList();
        ArrayList term740 = new ArrayList();
        term730 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term731 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term750 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term753 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term760 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term761 = (Object[]) newArray("java.lang.Object", 0);
        setField(term731, term731.getClass(), "rowKeys", term732);
        setField(term731, term731.getClass(), "columnKeys", term736);
        setField(term731, term731.getClass(), "rows", term740);
        setField(term730, term730.getClass(), "data", term731);
        setDoubleField(term730, term730.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term730, term730.getClass(), "minimumRangeValueRow", -1);
        setIntField(term730, term730.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term730, term730.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term730, term730.getClass(), "maximumRangeValueRow", -1);
        setIntField(term730, term730.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term750, term750.getClass(), "lower", 0.0);
        setDoubleField(term750, term750.getClass(), "upper", 0.0);
        setField(term730, term730.getClass(), "rangeBounds", term750);
        setField(term753, term753.getClass(), "id", "NOID");
        setField(term730, term730.getClass(), "group", term753);
        setField(term760, term760.getClass(), "listenerList", term761);
        setField(term730, term730.getClass(), "listenerList", term760);
        ArrayList term6645 = new ArrayList();
        ArrayList term6647 = new ArrayList();
        ArrayList term6649 = new ArrayList();
        term6643 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term6644 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term6651 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term6652 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term6655 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6656 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6644, term6644.getClass(), "rowKeys", term6645);
        setField(term6644, term6644.getClass(), "columnKeys", term6647);
        setField(term6644, term6644.getClass(), "rows", term6649);
        setField(term6643, term6643.getClass(), "data", term6644);
        setDoubleField(term6643, term6643.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term6643, term6643.getClass(), "minimumRangeValueRow", -1);
        setIntField(term6643, term6643.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term6643, term6643.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term6643, term6643.getClass(), "maximumRangeValueRow", -1);
        setIntField(term6643, term6643.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term6651, term6651.getClass(), "lower", 0.0);
        setDoubleField(term6651, term6651.getClass(), "upper", 0.0);
        setField(term6643, term6643.getClass(), "rangeBounds", term6651);
        setField(term6652, term6652.getClass(), "id", "NOID");
        setField(term6643, term6643.getClass(), "group", term6652);
        setField(term6655, term6655.getClass(), "listenerList", term6656);
        setField(term6643, term6643.getClass(), "listenerList", term6655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowCount", argTypes, term730, args);
        assertTrue(recursiveEquals(term730, term6643));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



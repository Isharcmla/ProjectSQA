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

public class DefaultBoxAndWhiskerCategoryDataset_getColumnKey_206635597153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;
     Object term578;

    public DefaultBoxAndWhiskerCategoryDataset_getColumnKey_206635597153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term548 = new ArrayList();
        ArrayList term552 = new ArrayList();
        ArrayList term556 = new ArrayList();
        term546 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term547 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term566 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term569 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term576 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term577 = (Object[]) newArray("java.lang.Object", 0);
        setField(term547, term547.getClass(), "rowKeys", term548);
        setField(term547, term547.getClass(), "columnKeys", term552);
        setField(term547, term547.getClass(), "rows", term556);
        setField(term546, term546.getClass(), "data", term547);
        setDoubleField(term546, term546.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term546, term546.getClass(), "minimumRangeValueRow", -1);
        setIntField(term546, term546.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term546, term546.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term546, term546.getClass(), "maximumRangeValueRow", -1);
        setIntField(term546, term546.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term566, term566.getClass(), "lower", 0.0);
        setDoubleField(term566, term566.getClass(), "upper", 0.0);
        setField(term546, term546.getClass(), "rangeBounds", term566);
        setField(term569, term569.getClass(), "id", "NOID");
        setField(term546, term546.getClass(), "group", term569);
        setField(term576, term576.getClass(), "listenerList", term577);
        setField(term546, term546.getClass(), "listenerList", term576);
        term578 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term578;
        try {
            callMethod(klass, "getColumnKey", argTypes, term546, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



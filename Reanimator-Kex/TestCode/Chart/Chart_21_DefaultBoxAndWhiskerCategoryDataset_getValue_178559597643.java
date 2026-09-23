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

public class DefaultBoxAndWhiskerCategoryDataset_getValue_178559597643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;

    public DefaultBoxAndWhiskerCategoryDataset_getValue_178559597643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term172 = new ArrayList();
        ArrayList term176 = new ArrayList();
        ArrayList term180 = new ArrayList();
        term170 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term171 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term190 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term193 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term200 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term201 = (Object[]) newArray("java.lang.Object", 0);
        setField(term171, term171.getClass(), "rowKeys", term172);
        setField(term171, term171.getClass(), "columnKeys", term176);
        setField(term171, term171.getClass(), "rows", term180);
        setField(term170, term170.getClass(), "data", term171);
        setDoubleField(term170, term170.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term170, term170.getClass(), "minimumRangeValueRow", -1);
        setIntField(term170, term170.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term170, term170.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term170, term170.getClass(), "maximumRangeValueRow", -1);
        setIntField(term170, term170.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term190, term190.getClass(), "lower", 0.0);
        setDoubleField(term190, term190.getClass(), "upper", 0.0);
        setField(term170, term170.getClass(), "rangeBounds", term190);
        setField(term193, term193.getClass(), "id", "NOID");
        setField(term170, term170.getClass(), "group", term193);
        setField(term200, term200.getClass(), "listenerList", term201);
        setField(term170, term170.getClass(), "listenerList", term200);
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
            callMethod(klass, "getValue", argTypes, term170, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



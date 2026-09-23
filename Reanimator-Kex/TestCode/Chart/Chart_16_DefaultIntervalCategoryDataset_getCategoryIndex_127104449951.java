package org.jfree.data.category;

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
import java.lang.NullPointerException;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_getCategoryIndex_127104449951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;

    public DefaultIntervalCategoryDataset_getCategoryIndex_127104449951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term598 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term599 = (Object[]) newArray("java.lang.Comparable", 9);
        Object[] term600 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object[] term601 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 4);
        Object[] term602 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term603 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term604 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term605 = (Object[]) newArray("java.lang.Number", 1);
        Object term606 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term613 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term614 = (Object[]) newArray("java.lang.Object", 0);
        setField(term597, term597.getClass(), "seriesKeys", term598);
        setField(term597, term597.getClass(), "categoryKeys", term599);
        setField(term597, term597.getClass(), "startData", term600);
        setElement(term601, 0, term602);
        setElement(term601, 1, term603);
        setElement(term601, 2, term604);
        setElement(term601, 3, term605);
        setField(term597, term597.getClass(), "endData", term601);
        setField(term606, term606.getClass(), "id", "NOID");
        setField(term597, term597.getClass(), "group", term606);
        setField(term613, term613.getClass(), "listenerList", term614);
        setField(term597, term597.getClass(), "listenerList", term613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getCategoryIndex", argTypes, term597, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.lang.IllegalArgumentException;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_getColumnIndex_18861885954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694;

    public DefaultIntervalCategoryDataset_getColumnIndex_18861885954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term695 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term696 = (Object[]) newArray("java.lang.Comparable", 2);
        Object[] term697 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 7);
        Object[] term698 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term699 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term700 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term701 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term702 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term703 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term704 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term705 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object term706 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term713 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term714 = (Object[]) newArray("java.lang.Object", 0);
        setField(term694, term694.getClass(), "seriesKeys", term695);
        setField(term694, term694.getClass(), "categoryKeys", term696);
        setElement(term697, 0, term698);
        setElement(term697, 1, term699);
        setElement(term697, 2, term700);
        setElement(term697, 3, term701);
        setElement(term697, 4, term702);
        setElement(term697, 5, term703);
        setElement(term697, 6, term704);
        setField(term694, term694.getClass(), "startData", term697);
        setField(term694, term694.getClass(), "endData", term705);
        setField(term706, term706.getClass(), "id", "NOID");
        setField(term694, term694.getClass(), "group", term706);
        setField(term713, term713.getClass(), "listenerList", term714);
        setField(term694, term694.getClass(), "listenerList", term713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getColumnIndex", argTypes, term694, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



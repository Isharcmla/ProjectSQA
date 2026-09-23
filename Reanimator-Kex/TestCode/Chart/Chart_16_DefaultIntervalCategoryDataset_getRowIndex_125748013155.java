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

public class DefaultIntervalCategoryDataset_getRowIndex_125748013155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719;

    public DefaultIntervalCategoryDataset_getRowIndex_125748013155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term720 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term721 = (Object[]) newArray("java.lang.Comparable", 4);
        Object[] term722 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term723 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term724 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term725 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term726 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term727 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term728 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term729 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term730 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term731 = (Object[]) newArray("java.lang.Number", 7);
        Object term732 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term739 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term740 = (Object[]) newArray("java.lang.Object", 0);
        setField(term719, term719.getClass(), "seriesKeys", term720);
        setField(term719, term719.getClass(), "categoryKeys", term721);
        setElement(term722, 0, term723);
        setElement(term722, 1, term724);
        setElement(term722, 2, term725);
        setField(term719, term719.getClass(), "startData", term722);
        setElement(term726, 0, term727);
        setElement(term726, 1, term728);
        setElement(term726, 2, term729);
        setElement(term726, 3, term730);
        setElement(term726, 4, term731);
        setField(term719, term719.getClass(), "endData", term726);
        setField(term732, term732.getClass(), "id", "NOID");
        setField(term719, term719.getClass(), "group", term732);
        setField(term739, term739.getClass(), "listenerList", term740);
        setField(term719, term719.getClass(), "listenerList", term739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getRowIndex", argTypes, term719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



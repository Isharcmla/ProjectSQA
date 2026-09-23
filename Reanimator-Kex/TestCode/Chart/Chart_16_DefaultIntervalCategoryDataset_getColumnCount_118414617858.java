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
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.category.EqualityUtils.*;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_getColumnCount_118414617858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798;
     Object term9129;

    public DefaultIntervalCategoryDataset_getColumnCount_118414617858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term799 = (Object[]) newArray("java.lang.Comparable", 3);
        Object[] term800 = (Object[]) newArray("java.lang.Comparable", 7);
        Object[] term801 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term802 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term803 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term804 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term805 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term806 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term807 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term808 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term809 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term810 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 1);
        Object[] term811 = (Object[]) newArray("java.lang.Number", 6);
        Object term812 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term819 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term820 = (Object[]) newArray("java.lang.Object", 0);
        setField(term798, term798.getClass(), "seriesKeys", term799);
        setField(term798, term798.getClass(), "categoryKeys", term800);
        setElement(term801, 0, term802);
        setElement(term801, 1, term803);
        setElement(term801, 2, term804);
        setElement(term801, 3, term805);
        setElement(term801, 4, term806);
        setElement(term801, 5, term807);
        setElement(term801, 6, term808);
        setElement(term801, 7, term809);
        setField(term798, term798.getClass(), "startData", term801);
        setElement(term810, 0, term811);
        setField(term798, term798.getClass(), "endData", term810);
        setField(term812, term812.getClass(), "id", "NOID");
        setField(term798, term798.getClass(), "group", term812);
        setField(term819, term819.getClass(), "listenerList", term820);
        setField(term798, term798.getClass(), "listenerList", term819);
        term9129 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term9130 = (Object[]) newArray("java.lang.Comparable", 3);
        Object[] term9131 = (Object[]) newArray("java.lang.Comparable", 7);
        Object[] term9132 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term9133 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term9134 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term9135 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term9136 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9137 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9138 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term9139 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term9140 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term9141 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 1);
        Object[] term9142 = (Object[]) newArray("java.lang.Number", 6);
        Object term9143 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term9146 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9147 = (Object[]) newArray("java.lang.Object", 0);
        setField(term9129, term9129.getClass(), "seriesKeys", term9130);
        setField(term9129, term9129.getClass(), "categoryKeys", term9131);
        setElement(term9132, 0, term9133);
        setElement(term9132, 1, term9134);
        setElement(term9132, 2, term9135);
        setElement(term9132, 3, term9136);
        setElement(term9132, 4, term9137);
        setElement(term9132, 5, term9138);
        setElement(term9132, 6, term9139);
        setElement(term9132, 7, term9140);
        setField(term9129, term9129.getClass(), "startData", term9132);
        setElement(term9141, 0, term9142);
        setField(term9129, term9129.getClass(), "endData", term9141);
        setField(term9143, term9143.getClass(), "id", "NOID");
        setField(term9129, term9129.getClass(), "group", term9143);
        setField(term9146, term9146.getClass(), "listenerList", term9147);
        setField(term9129, term9129.getClass(), "listenerList", term9146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnCount", argTypes, term798, args);
        assertTrue(recursiveEquals(term798, term9129));
        assertTrue(recursiveEquals(retValue, 7));
    }

};



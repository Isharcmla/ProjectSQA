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
import java.lang.Integer;

public class DefaultIntervalCategoryDataset_getRowKey_69161655057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771;
     Object term792;

    public DefaultIntervalCategoryDataset_getRowKey_69161655057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term772 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term773 = (Object[]) newArray("java.lang.Comparable", 4);
        Object[] term774 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term775 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term776 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term777 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term778 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term779 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term780 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term781 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term782 = (Object[]) newArray("java.lang.Number", 7);
        Object term783 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term790 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term791 = (Object[]) newArray("java.lang.Object", 0);
        setField(term771, term771.getClass(), "seriesKeys", term772);
        setField(term771, term771.getClass(), "categoryKeys", term773);
        setElement(term774, 0, term775);
        setElement(term774, 1, term776);
        setElement(term774, 2, term777);
        setElement(term774, 3, term778);
        setElement(term774, 4, term779);
        setField(term771, term771.getClass(), "startData", term774);
        setElement(term780, 0, term781);
        setElement(term780, 1, term782);
        setField(term771, term771.getClass(), "endData", term780);
        setField(term783, term783.getClass(), "id", "NOID");
        setField(term771, term771.getClass(), "group", term783);
        setField(term790, term790.getClass(), "listenerList", term791);
        setField(term771, term771.getClass(), "listenerList", term790);
        term792 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term792;
        try {
            callMethod(klass, "getRowKey", argTypes, term771, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



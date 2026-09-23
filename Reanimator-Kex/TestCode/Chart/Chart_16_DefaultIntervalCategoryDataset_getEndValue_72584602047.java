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

public class DefaultIntervalCategoryDataset_getEndValue_72584602047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;

    public DefaultIntervalCategoryDataset_getEndValue_72584602047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term467 = (Object[]) newArray("java.lang.Comparable", 9);
        Object[] term468 = (Object[]) newArray("java.lang.Comparable", 9);
        Object[] term469 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term470 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term471 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term472 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term473 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term474 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term475 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term476 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term477 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term478 = (Object[]) newArray("java.lang.Number", 8);
        Object term479 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term486 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term487 = (Object[]) newArray("java.lang.Object", 0);
        setField(term466, term466.getClass(), "seriesKeys", term467);
        setField(term466, term466.getClass(), "categoryKeys", term468);
        setElement(term469, 0, term470);
        setElement(term469, 1, term471);
        setElement(term469, 2, term472);
        setElement(term469, 3, term473);
        setElement(term469, 4, term474);
        setElement(term469, 5, term475);
        setField(term466, term466.getClass(), "startData", term469);
        setElement(term476, 0, term477);
        setElement(term476, 1, term478);
        setField(term466, term466.getClass(), "endData", term476);
        setField(term479, term479.getClass(), "id", "NOID");
        setField(term466, term466.getClass(), "group", term479);
        setField(term486, term486.getClass(), "listenerList", term487);
        setField(term466, term466.getClass(), "listenerList", term486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getEndValue", argTypes, term466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



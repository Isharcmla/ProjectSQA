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

public class DefaultIntervalCategoryDataset_setEndValue_84509341450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;
     Object term591;

    public DefaultIntervalCategoryDataset_setEndValue_84509341450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term561 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term562 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term563 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term564 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term565 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term566 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term567 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term568 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term569 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term570 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term571 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term572 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term573 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term574 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term575 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term576 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term577 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term578 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term579 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term580 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term581 = (Object[]) newArray("java.lang.Number", 8);
        Object term582 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term589 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term590 = (Object[]) newArray("java.lang.Object", 0);
        setField(term560, term560.getClass(), "seriesKeys", term561);
        setField(term560, term560.getClass(), "categoryKeys", term562);
        setElement(term563, 0, term564);
        setElement(term563, 1, term565);
        setElement(term563, 2, term566);
        setElement(term563, 3, term567);
        setElement(term563, 4, term568);
        setElement(term563, 5, term569);
        setElement(term563, 6, term570);
        setElement(term563, 7, term571);
        setField(term560, term560.getClass(), "startData", term563);
        setElement(term572, 0, term573);
        setElement(term572, 1, term574);
        setElement(term572, 2, term575);
        setElement(term572, 3, term576);
        setElement(term572, 4, term577);
        setElement(term572, 5, term578);
        setElement(term572, 6, term579);
        setElement(term572, 7, term580);
        setElement(term572, 8, term581);
        setField(term560, term560.getClass(), "endData", term572);
        setField(term582, term582.getClass(), "id", "NOID");
        setField(term560, term560.getClass(), "group", term582);
        setField(term589, term589.getClass(), "listenerList", term590);
        setField(term560, term560.getClass(), "listenerList", term589);
        term591 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Number");
        Object[] args = new Object[3];
        args[0] = term591;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "setEndValue", argTypes, term560, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



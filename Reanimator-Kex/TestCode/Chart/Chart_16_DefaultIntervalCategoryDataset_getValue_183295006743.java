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

public class DefaultIntervalCategoryDataset_getValue_183295006743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;

    public DefaultIntervalCategoryDataset_getValue_183295006743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term353 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term354 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term355 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term356 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term357 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term358 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term359 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term360 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term361 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term362 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term363 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term364 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term365 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term366 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term367 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term368 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term369 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term370 = (Object[]) newArray("java.lang.Number", 3);
        Object term371 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term378 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term379 = (Object[]) newArray("java.lang.Object", 0);
        setField(term352, term352.getClass(), "seriesKeys", term353);
        setField(term352, term352.getClass(), "categoryKeys", term354);
        setElement(term355, 0, term356);
        setElement(term355, 1, term357);
        setElement(term355, 2, term358);
        setElement(term355, 3, term359);
        setElement(term355, 4, term360);
        setElement(term355, 5, term361);
        setField(term352, term352.getClass(), "startData", term355);
        setElement(term362, 0, term363);
        setElement(term362, 1, term364);
        setElement(term362, 2, term365);
        setElement(term362, 3, term366);
        setElement(term362, 4, term367);
        setElement(term362, 5, term368);
        setElement(term362, 6, term369);
        setElement(term362, 7, term370);
        setField(term352, term352.getClass(), "endData", term362);
        setField(term371, term371.getClass(), "id", "NOID");
        setField(term352, term352.getClass(), "group", term371);
        setField(term378, term378.getClass(), "listenerList", term379);
        setField(term352, term352.getClass(), "listenerList", term378);
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
            callMethod(klass, "getValue", argTypes, term352, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



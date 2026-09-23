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

public class DefaultIntervalCategoryDataset_getStartValue_196610838146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;
     Object term458;
     Object term460;

    public DefaultIntervalCategoryDataset_getStartValue_196610838146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term436 = (Object[]) newArray("java.lang.Comparable", 9);
        Object[] term437 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term438 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 1);
        Object[] term439 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term440 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term441 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term442 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term443 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term444 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term445 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term446 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term447 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term448 = (Object[]) newArray("java.lang.Number", 5);
        Object term449 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term456 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term457 = (Object[]) newArray("java.lang.Object", 0);
        setField(term435, term435.getClass(), "seriesKeys", term436);
        setField(term435, term435.getClass(), "categoryKeys", term437);
        setElement(term438, 0, term439);
        setField(term435, term435.getClass(), "startData", term438);
        setElement(term440, 0, term441);
        setElement(term440, 1, term442);
        setElement(term440, 2, term443);
        setElement(term440, 3, term444);
        setElement(term440, 4, term445);
        setElement(term440, 5, term446);
        setElement(term440, 6, term447);
        setElement(term440, 7, term448);
        setField(term435, term435.getClass(), "endData", term440);
        setField(term449, term449.getClass(), "id", "NOID");
        setField(term435, term435.getClass(), "group", term449);
        setField(term456, term456.getClass(), "listenerList", term457);
        setField(term435, term435.getClass(), "listenerList", term456);
        term458 = new Integer(391863371);
        term460 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term458;
        args[1] = term460;
        try {
            callMethod(klass, "getStartValue", argTypes, term435, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



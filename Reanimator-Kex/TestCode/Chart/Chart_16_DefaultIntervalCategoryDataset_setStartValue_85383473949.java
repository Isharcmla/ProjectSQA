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

public class DefaultIntervalCategoryDataset_setStartValue_85383473949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525;
     Object term554;

    public DefaultIntervalCategoryDataset_setStartValue_85383473949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term526 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term527 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term528 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 7);
        Object[] term529 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term530 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term531 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term532 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term533 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term534 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term535 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term536 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term537 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term538 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term539 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term540 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term541 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term542 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term543 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term544 = (Object[]) newArray("java.lang.Number", 0);
        Object term545 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term552 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term553 = (Object[]) newArray("java.lang.Object", 0);
        setField(term525, term525.getClass(), "seriesKeys", term526);
        setField(term525, term525.getClass(), "categoryKeys", term527);
        setElement(term528, 0, term529);
        setElement(term528, 1, term530);
        setElement(term528, 2, term531);
        setElement(term528, 3, term532);
        setElement(term528, 4, term533);
        setElement(term528, 5, term534);
        setElement(term528, 6, term535);
        setField(term525, term525.getClass(), "startData", term528);
        setElement(term536, 0, term537);
        setElement(term536, 1, term538);
        setElement(term536, 2, term539);
        setElement(term536, 3, term540);
        setElement(term536, 4, term541);
        setElement(term536, 5, term542);
        setElement(term536, 6, term543);
        setElement(term536, 7, term544);
        setField(term525, term525.getClass(), "endData", term536);
        setField(term545, term545.getClass(), "id", "NOID");
        setField(term525, term525.getClass(), "group", term545);
        setField(term552, term552.getClass(), "listenerList", term553);
        setField(term525, term525.getClass(), "listenerList", term552);
        term554 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Number");
        Object[] args = new Object[3];
        args[0] = term554;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "setStartValue", argTypes, term525, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



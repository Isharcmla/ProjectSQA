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

public class DefaultIntervalCategoryDataset_getEndValue_40380154048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;
     Object term517;
     Object term519;

    public DefaultIntervalCategoryDataset_getEndValue_40380154048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term493 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term494 = (Object[]) newArray("java.lang.Comparable", 7);
        Object[] term495 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term496 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term497 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term498 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term499 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term500 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term501 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term502 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term503 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term504 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term505 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term506 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term507 = (Object[]) newArray("java.lang.Number", 7);
        Object term508 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term515 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term516 = (Object[]) newArray("java.lang.Object", 0);
        setField(term492, term492.getClass(), "seriesKeys", term493);
        setField(term492, term492.getClass(), "categoryKeys", term494);
        setElement(term495, 0, term496);
        setElement(term495, 1, term497);
        setElement(term495, 2, term498);
        setElement(term495, 3, term499);
        setElement(term495, 4, term500);
        setElement(term495, 5, term501);
        setElement(term495, 6, term502);
        setElement(term495, 7, term503);
        setElement(term495, 8, term504);
        setField(term492, term492.getClass(), "startData", term495);
        setElement(term505, 0, term506);
        setElement(term505, 1, term507);
        setField(term492, term492.getClass(), "endData", term505);
        setField(term508, term508.getClass(), "id", "NOID");
        setField(term492, term492.getClass(), "group", term508);
        setField(term515, term515.getClass(), "listenerList", term516);
        setField(term492, term492.getClass(), "listenerList", term515);
        term517 = new Integer(-616727354);
        term519 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term517;
        args[1] = term519;
        try {
            callMethod(klass, "getEndValue", argTypes, term492, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



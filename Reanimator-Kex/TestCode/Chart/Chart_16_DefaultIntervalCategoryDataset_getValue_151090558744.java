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

public class DefaultIntervalCategoryDataset_getValue_151090558744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384;
     Object term399;
     Object term401;

    public DefaultIntervalCategoryDataset_getValue_151090558744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term385 = (Object[]) newArray("java.lang.Comparable", 4);
        Object[] term386 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term387 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 1);
        Object[] term388 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term389 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object term390 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term397 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term398 = (Object[]) newArray("java.lang.Object", 0);
        setField(term384, term384.getClass(), "seriesKeys", term385);
        setField(term384, term384.getClass(), "categoryKeys", term386);
        setElement(term387, 0, term388);
        setField(term384, term384.getClass(), "startData", term387);
        setField(term384, term384.getClass(), "endData", term389);
        setField(term390, term390.getClass(), "id", "NOID");
        setField(term384, term384.getClass(), "group", term390);
        setField(term397, term397.getClass(), "listenerList", term398);
        setField(term384, term384.getClass(), "listenerList", term397);
        term399 = new Integer(1162663216);
        term401 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term399;
        args[1] = term401;
        try {
            callMethod(klass, "getValue", argTypes, term384, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



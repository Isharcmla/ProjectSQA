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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DefaultIntervalCategoryDataset_getColumnKey_138993471853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;
     Object term688;

    public DefaultIntervalCategoryDataset_getColumnKey_138993471853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term673 = (Object[]) newArray("java.lang.Comparable", 2);
        Object[] term674 = (Object[]) newArray("java.lang.Comparable", 3);
        Object[] term675 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object[] term676 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term677 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term678 = (Object[]) newArray("java.lang.Number", 0);
        Object term679 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term686 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term687 = (Object[]) newArray("java.lang.Object", 0);
        setField(term672, term672.getClass(), "seriesKeys", term673);
        setField(term672, term672.getClass(), "categoryKeys", term674);
        setField(term672, term672.getClass(), "startData", term675);
        setElement(term676, 0, term677);
        setElement(term676, 1, term678);
        setField(term672, term672.getClass(), "endData", term676);
        setField(term679, term679.getClass(), "id", "NOID");
        setField(term672, term672.getClass(), "group", term679);
        setField(term686, term686.getClass(), "listenerList", term687);
        setField(term672, term672.getClass(), "listenerList", term686);
        term688 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term688;
        try {
            callMethod(klass, "getColumnKey", argTypes, term672, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



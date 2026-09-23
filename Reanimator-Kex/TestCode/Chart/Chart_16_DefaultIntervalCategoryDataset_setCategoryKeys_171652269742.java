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

public class DefaultIntervalCategoryDataset_setCategoryKeys_171652269742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term347;

    public DefaultIntervalCategoryDataset_setCategoryKeys_171652269742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term327 = (Object[]) newArray("java.lang.Comparable", 1);
        Object[] term328 = (Object[]) newArray("java.lang.Comparable", 9);
        Object[] term329 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term330 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term331 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term332 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term333 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term334 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term335 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term336 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term337 = (Object[]) newArray("java.lang.Number", 2);
        Object term338 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term345 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term346 = (Object[]) newArray("java.lang.Object", 0);
        setField(term326, term326.getClass(), "seriesKeys", term327);
        setField(term326, term326.getClass(), "categoryKeys", term328);
        setElement(term329, 0, term330);
        setElement(term329, 1, term331);
        setField(term326, term326.getClass(), "startData", term329);
        setElement(term332, 0, term333);
        setElement(term332, 1, term334);
        setElement(term332, 2, term335);
        setElement(term332, 3, term336);
        setElement(term332, 4, term337);
        setField(term326, term326.getClass(), "endData", term332);
        setField(term338, term338.getClass(), "id", "NOID");
        setField(term326, term326.getClass(), "group", term338);
        setField(term345, term345.getClass(), "listenerList", term346);
        setField(term326, term326.getClass(), "listenerList", term345);
        term347 = (Object[]) newArray("java.lang.Comparable", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term347;
        try {
            callMethod(klass, "setCategoryKeys", argTypes, term326, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



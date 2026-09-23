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

public class DefaultIntervalCategoryDataset_getStartValue_200681443545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407;

    public DefaultIntervalCategoryDataset_getStartValue_200681443545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term408 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term409 = (Object[]) newArray("java.lang.Comparable", 1);
        Object[] term410 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term411 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term412 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term413 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term414 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term415 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term416 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term417 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term418 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term419 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term420 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term421 = (Object[]) newArray("java.lang.Number", 0);
        Object term422 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term429 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term430 = (Object[]) newArray("java.lang.Object", 0);
        setField(term407, term407.getClass(), "seriesKeys", term408);
        setField(term407, term407.getClass(), "categoryKeys", term409);
        setElement(term410, 0, term411);
        setElement(term410, 1, term412);
        setField(term407, term407.getClass(), "startData", term410);
        setElement(term413, 0, term414);
        setElement(term413, 1, term415);
        setElement(term413, 2, term416);
        setElement(term413, 3, term417);
        setElement(term413, 4, term418);
        setElement(term413, 5, term419);
        setElement(term413, 6, term420);
        setElement(term413, 7, term421);
        setField(term407, term407.getClass(), "endData", term413);
        setField(term422, term422.getClass(), "id", "NOID");
        setField(term407, term407.getClass(), "group", term422);
        setField(term429, term429.getClass(), "listenerList", term430);
        setField(term407, term407.getClass(), "listenerList", term429);
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
            callMethod(klass, "getStartValue", argTypes, term407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



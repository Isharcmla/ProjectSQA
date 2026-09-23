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
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.category.EqualityUtils.*;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_getSeriesCount_100921478736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term3442;

    public DefaultIntervalCategoryDataset_getSeriesCount_100921478736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term157 = (Object[]) newArray("java.lang.Comparable", 7);
        Object[] term158 = (Object[]) newArray("java.lang.Comparable", 3);
        Object[] term159 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 4);
        Object[] term160 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term161 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term162 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term163 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term164 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 7);
        Object[] term165 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term166 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term167 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term168 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term169 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term170 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term171 = (Object[]) newArray("java.lang.Number", 7);
        Object term172 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term179 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term180 = (Object[]) newArray("java.lang.Object", 0);
        setField(term156, term156.getClass(), "seriesKeys", term157);
        setField(term156, term156.getClass(), "categoryKeys", term158);
        setElement(term159, 0, term160);
        setElement(term159, 1, term161);
        setElement(term159, 2, term162);
        setElement(term159, 3, term163);
        setField(term156, term156.getClass(), "startData", term159);
        setElement(term164, 0, term165);
        setElement(term164, 1, term166);
        setElement(term164, 2, term167);
        setElement(term164, 3, term168);
        setElement(term164, 4, term169);
        setElement(term164, 5, term170);
        setElement(term164, 6, term171);
        setField(term156, term156.getClass(), "endData", term164);
        setField(term172, term172.getClass(), "id", "NOID");
        setField(term156, term156.getClass(), "group", term172);
        setField(term179, term179.getClass(), "listenerList", term180);
        setField(term156, term156.getClass(), "listenerList", term179);
        term3442 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term3443 = (Object[]) newArray("java.lang.Comparable", 7);
        Object[] term3444 = (Object[]) newArray("java.lang.Comparable", 3);
        Object[] term3445 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 4);
        Object[] term3446 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term3447 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term3448 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term3449 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term3450 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 7);
        Object[] term3451 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term3452 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term3453 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term3454 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term3455 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term3456 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term3457 = (Object[]) newArray("java.lang.Number", 7);
        Object term3458 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term3461 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3462 = (Object[]) newArray("java.lang.Object", 0);
        setField(term3442, term3442.getClass(), "seriesKeys", term3443);
        setField(term3442, term3442.getClass(), "categoryKeys", term3444);
        setElement(term3445, 0, term3446);
        setElement(term3445, 1, term3447);
        setElement(term3445, 2, term3448);
        setElement(term3445, 3, term3449);
        setField(term3442, term3442.getClass(), "startData", term3445);
        setElement(term3450, 0, term3451);
        setElement(term3450, 1, term3452);
        setElement(term3450, 2, term3453);
        setElement(term3450, 3, term3454);
        setElement(term3450, 4, term3455);
        setElement(term3450, 5, term3456);
        setElement(term3450, 6, term3457);
        setField(term3442, term3442.getClass(), "endData", term3450);
        setField(term3458, term3458.getClass(), "id", "NOID");
        setField(term3442, term3442.getClass(), "group", term3458);
        setField(term3461, term3461.getClass(), "listenerList", term3462);
        setField(term3442, term3442.getClass(), "listenerList", term3461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSeriesCount", argTypes, term156, args);
        assertTrue(recursiveEquals(term156, term3442));
        assertTrue(recursiveEquals(retValue, 4));
    }

};



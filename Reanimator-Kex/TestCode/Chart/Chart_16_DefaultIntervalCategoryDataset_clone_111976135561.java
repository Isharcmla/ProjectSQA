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

public class DefaultIntervalCategoryDataset_clone_111976135561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895;
     Object term9384;
     Object term9369;

    public DefaultIntervalCategoryDataset_clone_111976135561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term896 = (Object[]) newArray("java.lang.Comparable", 2);
        Object[] term897 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term898 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term899 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term900 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term901 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term902 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term903 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term904 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term905 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term906 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term907 = (Object[]) newArray("java.lang.Number", 5);
        Object term908 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term915 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term916 = (Object[]) newArray("java.lang.Object", 0);
        setField(term895, term895.getClass(), "seriesKeys", term896);
        setField(term895, term895.getClass(), "categoryKeys", term897);
        setElement(term898, 0, term899);
        setElement(term898, 1, term900);
        setElement(term898, 2, term901);
        setField(term895, term895.getClass(), "startData", term898);
        setElement(term902, 0, term903);
        setElement(term902, 1, term904);
        setElement(term902, 2, term905);
        setElement(term902, 3, term906);
        setElement(term902, 4, term907);
        setField(term895, term895.getClass(), "endData", term902);
        setField(term908, term908.getClass(), "id", "NOID");
        setField(term895, term895.getClass(), "group", term908);
        setField(term915, term915.getClass(), "listenerList", term916);
        setField(term895, term895.getClass(), "listenerList", term915);
        term9384 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term9385 = (Object[]) newArray("java.lang.Comparable", 2);
        Object[] term9386 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term9387 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term9388 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9389 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9390 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9391 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term9392 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9393 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term9394 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9395 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9396 = (Object[]) newArray("java.lang.Number", 5);
        Object term9397 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term9400 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9401 = (Object[]) newArray("java.lang.Object", 0);
        setField(term9384, term9384.getClass(), "seriesKeys", term9385);
        setField(term9384, term9384.getClass(), "categoryKeys", term9386);
        setElement(term9387, 0, term9388);
        setElement(term9387, 1, term9389);
        setElement(term9387, 2, term9390);
        setField(term9384, term9384.getClass(), "startData", term9387);
        setElement(term9391, 0, term9392);
        setElement(term9391, 1, term9393);
        setElement(term9391, 2, term9394);
        setElement(term9391, 3, term9395);
        setElement(term9391, 4, term9396);
        setField(term9384, term9384.getClass(), "endData", term9391);
        setField(term9397, term9397.getClass(), "id", "NOID");
        setField(term9384, term9384.getClass(), "group", term9397);
        setField(term9400, term9400.getClass(), "listenerList", term9401);
        setField(term9384, term9384.getClass(), "listenerList", term9400);
        term9369 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term9370 = (Object[]) newArray("java.lang.Comparable", 2);
        Object[] term9371 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term9372 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term9373 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9374 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9375 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9376 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term9377 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9378 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term9379 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9380 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9381 = (Object[]) newArray("java.lang.Number", 5);
        Object term9328 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term9382 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9383 = (Object[]) newArray("java.lang.Object", 0);
        setField(term9369, term9369.getClass(), "seriesKeys", term9370);
        setField(term9369, term9369.getClass(), "categoryKeys", term9371);
        setElement(term9372, 0, term9373);
        setElement(term9372, 1, term9374);
        setElement(term9372, 2, term9375);
        setField(term9369, term9369.getClass(), "startData", term9372);
        setElement(term9376, 0, term9377);
        setElement(term9376, 1, term9378);
        setElement(term9376, 2, term9379);
        setElement(term9376, 3, term9380);
        setElement(term9376, 4, term9381);
        setField(term9369, term9369.getClass(), "endData", term9376);
        setField(term9328, term9328.getClass(), "id", "NOID");
        setField(term9369, term9369.getClass(), "group", term9328);
        setField(term9382, term9382.getClass(), "listenerList", term9383);
        setField(term9369, term9369.getClass(), "listenerList", term9382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term895, args);
        assertTrue(recursiveEquals(term895, term9384));
        assertTrue(recursiveEquals(retValue, term9369));
    }

};



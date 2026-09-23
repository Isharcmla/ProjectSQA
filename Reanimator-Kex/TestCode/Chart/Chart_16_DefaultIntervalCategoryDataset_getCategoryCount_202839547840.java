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

public class DefaultIntervalCategoryDataset_getCategoryCount_202839547840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term4443;

    public DefaultIntervalCategoryDataset_getCategoryCount_202839547840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term272 = (Object[]) newArray("java.lang.Comparable", 1);
        Object[] term273 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term274 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term275 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term276 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term277 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term278 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 4);
        Object[] term279 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term280 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term281 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term282 = (Object[]) newArray("java.lang.Number", 4);
        Object term283 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term290 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term291 = (Object[]) newArray("java.lang.Object", 0);
        setField(term271, term271.getClass(), "seriesKeys", term272);
        setField(term271, term271.getClass(), "categoryKeys", term273);
        setElement(term274, 0, term275);
        setElement(term274, 1, term276);
        setElement(term274, 2, term277);
        setField(term271, term271.getClass(), "startData", term274);
        setElement(term278, 0, term279);
        setElement(term278, 1, term280);
        setElement(term278, 2, term281);
        setElement(term278, 3, term282);
        setField(term271, term271.getClass(), "endData", term278);
        setField(term283, term283.getClass(), "id", "NOID");
        setField(term271, term271.getClass(), "group", term283);
        setField(term290, term290.getClass(), "listenerList", term291);
        setField(term271, term271.getClass(), "listenerList", term290);
        term4443 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term4444 = (Object[]) newArray("java.lang.Comparable", 1);
        Object[] term4445 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term4446 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term4447 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term4448 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term4449 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term4450 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 4);
        Object[] term4451 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term4452 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term4453 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term4454 = (Object[]) newArray("java.lang.Number", 4);
        Object term4455 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term4458 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4459 = (Object[]) newArray("java.lang.Object", 0);
        setField(term4443, term4443.getClass(), "seriesKeys", term4444);
        setField(term4443, term4443.getClass(), "categoryKeys", term4445);
        setElement(term4446, 0, term4447);
        setElement(term4446, 1, term4448);
        setElement(term4446, 2, term4449);
        setField(term4443, term4443.getClass(), "startData", term4446);
        setElement(term4450, 0, term4451);
        setElement(term4450, 1, term4452);
        setElement(term4450, 2, term4453);
        setElement(term4450, 3, term4454);
        setField(term4443, term4443.getClass(), "endData", term4450);
        setField(term4455, term4455.getClass(), "id", "NOID");
        setField(term4443, term4443.getClass(), "group", term4455);
        setField(term4458, term4458.getClass(), "listenerList", term4459);
        setField(term4443, term4443.getClass(), "listenerList", term4458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCategoryCount", argTypes, term271, args);
        assertTrue(recursiveEquals(term271, term4443));
        assertTrue(recursiveEquals(retValue, 2));
    }

};



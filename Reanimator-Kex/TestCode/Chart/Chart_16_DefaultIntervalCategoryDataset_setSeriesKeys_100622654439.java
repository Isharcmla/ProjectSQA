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

public class DefaultIntervalCategoryDataset_setSeriesKeys_100622654439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;
     Object term266;

    public DefaultIntervalCategoryDataset_setSeriesKeys_100622654439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term238 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term239 = (Object[]) newArray("java.lang.Comparable", 9);
        Object[] term240 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term241 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term242 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term243 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term244 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term245 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term246 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term247 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term248 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term249 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term250 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term251 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term252 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term253 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term254 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term255 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term256 = (Object[]) newArray("java.lang.Number", 1);
        Object term257 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term264 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term265 = (Object[]) newArray("java.lang.Object", 0);
        setField(term237, term237.getClass(), "seriesKeys", term238);
        setField(term237, term237.getClass(), "categoryKeys", term239);
        setElement(term240, 0, term241);
        setElement(term240, 1, term242);
        setElement(term240, 2, term243);
        setElement(term240, 3, term244);
        setElement(term240, 4, term245);
        setElement(term240, 5, term246);
        setField(term237, term237.getClass(), "startData", term240);
        setElement(term247, 0, term248);
        setElement(term247, 1, term249);
        setElement(term247, 2, term250);
        setElement(term247, 3, term251);
        setElement(term247, 4, term252);
        setElement(term247, 5, term253);
        setElement(term247, 6, term254);
        setElement(term247, 7, term255);
        setElement(term247, 8, term256);
        setField(term237, term237.getClass(), "endData", term247);
        setField(term257, term257.getClass(), "id", "NOID");
        setField(term237, term237.getClass(), "group", term257);
        setField(term264, term264.getClass(), "listenerList", term265);
        setField(term237, term237.getClass(), "listenerList", term264);
        term266 = (Object[]) newArray("java.lang.Comparable", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term266;
        try {
            callMethod(klass, "setSeriesKeys", argTypes, term237, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



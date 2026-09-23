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

public class DefaultIntervalCategoryDataset_getSeriesIndex_1368746837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;

    public DefaultIntervalCategoryDataset_getSeriesIndex_1368746837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term186 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term187 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term188 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object[] term189 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term190 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term191 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term192 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term193 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term194 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term195 = (Object[]) newArray("java.lang.Number", 1);
        Object term196 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term203 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term204 = (Object[]) newArray("java.lang.Object", 0);
        setField(term185, term185.getClass(), "seriesKeys", term186);
        setField(term185, term185.getClass(), "categoryKeys", term187);
        setField(term185, term185.getClass(), "startData", term188);
        setElement(term189, 0, term190);
        setElement(term189, 1, term191);
        setElement(term189, 2, term192);
        setElement(term189, 3, term193);
        setElement(term189, 4, term194);
        setElement(term189, 5, term195);
        setField(term185, term185.getClass(), "endData", term189);
        setField(term196, term196.getClass(), "id", "NOID");
        setField(term185, term185.getClass(), "group", term196);
        setField(term203, term203.getClass(), "listenerList", term204);
        setField(term185, term185.getClass(), "listenerList", term203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getSeriesIndex", argTypes, term185, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



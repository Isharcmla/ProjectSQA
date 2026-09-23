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

public class DefaultIntervalCategoryDataset_getSeriesKey_31302297338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;
     Object term231;

    public DefaultIntervalCategoryDataset_getSeriesKey_31302297338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term210 = (Object[]) newArray("java.lang.Comparable", 4);
        Object[] term211 = (Object[]) newArray("java.lang.Comparable", 1);
        Object[] term212 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 1);
        Object[] term213 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term214 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 7);
        Object[] term215 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term216 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term217 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term218 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term219 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term220 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term221 = (Object[]) newArray("java.lang.Number", 7);
        Object term222 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term229 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term230 = (Object[]) newArray("java.lang.Object", 0);
        setField(term209, term209.getClass(), "seriesKeys", term210);
        setField(term209, term209.getClass(), "categoryKeys", term211);
        setElement(term212, 0, term213);
        setField(term209, term209.getClass(), "startData", term212);
        setElement(term214, 0, term215);
        setElement(term214, 1, term216);
        setElement(term214, 2, term217);
        setElement(term214, 3, term218);
        setElement(term214, 4, term219);
        setElement(term214, 5, term220);
        setElement(term214, 6, term221);
        setField(term209, term209.getClass(), "endData", term214);
        setField(term222, term222.getClass(), "id", "NOID");
        setField(term209, term209.getClass(), "group", term222);
        setField(term229, term229.getClass(), "listenerList", term230);
        setField(term209, term209.getClass(), "listenerList", term229);
        term231 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term231;
        try {
            callMethod(klass, "getSeriesKey", argTypes, term209, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



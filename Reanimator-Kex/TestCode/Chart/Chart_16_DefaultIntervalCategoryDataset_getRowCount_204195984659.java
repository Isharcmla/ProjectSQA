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

public class DefaultIntervalCategoryDataset_getRowCount_204195984659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825;
     Object term9187;

    public DefaultIntervalCategoryDataset_getRowCount_204195984659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term825 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term826 = (Object[]) newArray("java.lang.Comparable", 8);
        Object[] term827 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term828 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term829 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term830 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term831 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term832 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term833 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term834 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term835 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term836 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term837 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term838 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term839 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term840 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term841 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term842 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term843 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term844 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term845 = (Object[]) newArray("java.lang.Number", 6);
        Object term846 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term853 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term854 = (Object[]) newArray("java.lang.Object", 0);
        setField(term825, term825.getClass(), "seriesKeys", term826);
        setField(term825, term825.getClass(), "categoryKeys", term827);
        setElement(term828, 0, term829);
        setElement(term828, 1, term830);
        setElement(term828, 2, term831);
        setElement(term828, 3, term832);
        setElement(term828, 4, term833);
        setElement(term828, 5, term834);
        setElement(term828, 6, term835);
        setElement(term828, 7, term836);
        setField(term825, term825.getClass(), "startData", term828);
        setElement(term837, 0, term838);
        setElement(term837, 1, term839);
        setElement(term837, 2, term840);
        setElement(term837, 3, term841);
        setElement(term837, 4, term842);
        setElement(term837, 5, term843);
        setElement(term837, 6, term844);
        setElement(term837, 7, term845);
        setField(term825, term825.getClass(), "endData", term837);
        setField(term846, term846.getClass(), "id", "NOID");
        setField(term825, term825.getClass(), "group", term846);
        setField(term853, term853.getClass(), "listenerList", term854);
        setField(term825, term825.getClass(), "listenerList", term853);
        term9187 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term9188 = (Object[]) newArray("java.lang.Comparable", 8);
        Object[] term9189 = (Object[]) newArray("java.lang.Comparable", 6);
        Object[] term9190 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term9191 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term9192 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9193 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term9194 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term9195 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term9196 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term9197 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9198 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9199 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term9200 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term9201 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term9202 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9203 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9204 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term9205 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term9206 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9207 = (Object[]) newArray("java.lang.Number", 6);
        Object term9208 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term9211 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9212 = (Object[]) newArray("java.lang.Object", 0);
        setField(term9187, term9187.getClass(), "seriesKeys", term9188);
        setField(term9187, term9187.getClass(), "categoryKeys", term9189);
        setElement(term9190, 0, term9191);
        setElement(term9190, 1, term9192);
        setElement(term9190, 2, term9193);
        setElement(term9190, 3, term9194);
        setElement(term9190, 4, term9195);
        setElement(term9190, 5, term9196);
        setElement(term9190, 6, term9197);
        setElement(term9190, 7, term9198);
        setField(term9187, term9187.getClass(), "startData", term9190);
        setElement(term9199, 0, term9200);
        setElement(term9199, 1, term9201);
        setElement(term9199, 2, term9202);
        setElement(term9199, 3, term9203);
        setElement(term9199, 4, term9204);
        setElement(term9199, 5, term9205);
        setElement(term9199, 6, term9206);
        setElement(term9199, 7, term9207);
        setField(term9187, term9187.getClass(), "endData", term9199);
        setField(term9208, term9208.getClass(), "id", "NOID");
        setField(term9187, term9187.getClass(), "group", term9208);
        setField(term9211, term9211.getClass(), "listenerList", term9212);
        setField(term9187, term9187.getClass(), "listenerList", term9211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowCount", argTypes, term825, args);
        assertTrue(recursiveEquals(term825, term9187));
        assertTrue(recursiveEquals(retValue, 8));
    }

};



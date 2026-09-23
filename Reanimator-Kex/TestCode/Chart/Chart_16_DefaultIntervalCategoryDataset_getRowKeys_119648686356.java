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

public class DefaultIntervalCategoryDataset_getRowKeys_119648686356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745;
     Object term8744;
     Object term8718;

    public DefaultIntervalCategoryDataset_getRowKeys_119648686356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term746 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term747 = (Object[]) newArray("java.lang.Comparable", 8);
        Object[] term748 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term749 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term750 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term751 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term752 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term753 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term754 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term755 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term756 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term757 = (Object[]) newArray("java.lang.Number", 4);
        Object term758 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term765 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term766 = (Object[]) newArray("java.lang.Object", 0);
        setField(term745, term745.getClass(), "seriesKeys", term746);
        setField(term745, term745.getClass(), "categoryKeys", term747);
        setElement(term748, 0, term749);
        setElement(term748, 1, term750);
        setField(term745, term745.getClass(), "startData", term748);
        setElement(term751, 0, term752);
        setElement(term751, 1, term753);
        setElement(term751, 2, term754);
        setElement(term751, 3, term755);
        setElement(term751, 4, term756);
        setElement(term751, 5, term757);
        setField(term745, term745.getClass(), "endData", term751);
        setField(term758, term758.getClass(), "id", "NOID");
        setField(term745, term745.getClass(), "group", term758);
        setField(term765, term765.getClass(), "listenerList", term766);
        setField(term745, term745.getClass(), "listenerList", term765);
        term8744 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term8745 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term8746 = (Object[]) newArray("java.lang.Comparable", 8);
        Object[] term8747 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term8748 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term8749 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term8750 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term8751 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term8752 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term8753 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term8754 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term8755 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term8756 = (Object[]) newArray("java.lang.Number", 4);
        Object term8757 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term8760 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term8761 = (Object[]) newArray("java.lang.Object", 0);
        setField(term8744, term8744.getClass(), "seriesKeys", term8745);
        setField(term8744, term8744.getClass(), "categoryKeys", term8746);
        setElement(term8747, 0, term8748);
        setElement(term8747, 1, term8749);
        setField(term8744, term8744.getClass(), "startData", term8747);
        setElement(term8750, 0, term8751);
        setElement(term8750, 1, term8752);
        setElement(term8750, 2, term8753);
        setElement(term8750, 3, term8754);
        setElement(term8750, 4, term8755);
        setElement(term8750, 5, term8756);
        setField(term8744, term8744.getClass(), "endData", term8750);
        setField(term8757, term8757.getClass(), "id", "NOID");
        setField(term8744, term8744.getClass(), "group", term8757);
        setField(term8760, term8760.getClass(), "listenerList", term8761);
        setField(term8744, term8744.getClass(), "listenerList", term8760);
        term8718 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        Object term8719 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term8720 = (Object[]) newArray("java.lang.Comparable", 5);
        setField(term8719, term8719.getClass(), "a", term8720);
        setIntField(term8719, term8719.getClass(), "modCount", 0);
        setField(term8718, term8718.getClass(), "list", term8719);
        setField(term8718, term8718.getClass(), "c", term8719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowKeys", argTypes, term745, args);
        assertTrue(recursiveEquals(term745, term8744));
        assertTrue(recursiveEquals(retValue, term8718));
    }

};



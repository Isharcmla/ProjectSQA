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
import java.lang.NegativeArraySizeException;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DefaultIntervalCategoryDataset_generateKeys_37870439752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;
     Object term644;

    public DefaultIntervalCategoryDataset_generateKeys_37870439752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term619 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term620 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term621 = (Object[]) newArray("java.lang.Comparable", 5);
        Object[] term622 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term623 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term624 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term625 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term626 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term627 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term628 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term629 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term630 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term631 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term632 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term633 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term634 = (Object[]) newArray("java.lang.Number", 3);
        Object term635 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term642 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term643 = (Object[]) newArray("java.lang.Object", 0);
        setField(term619, term619.getClass(), "seriesKeys", term620);
        setField(term619, term619.getClass(), "categoryKeys", term621);
        setElement(term622, 0, term623);
        setElement(term622, 1, term624);
        setElement(term622, 2, term625);
        setElement(term622, 3, term626);
        setElement(term622, 4, term627);
        setElement(term622, 5, term628);
        setElement(term622, 6, term629);
        setElement(term622, 7, term630);
        setField(term619, term619.getClass(), "startData", term622);
        setElement(term631, 0, term632);
        setElement(term631, 1, term633);
        setElement(term631, 2, term634);
        setField(term619, term619.getClass(), "endData", term631);
        setField(term635, term635.getClass(), "id", "NOID");
        setField(term619, term619.getClass(), "group", term635);
        setField(term642, term642.getClass(), "listenerList", term643);
        setField(term619, term619.getClass(), "listenerList", term642);
        term644 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term644;
        args[1] = "MuLcgQHgqz";
        try {
            callMethod(klass, "generateKeys", argTypes, term619, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};



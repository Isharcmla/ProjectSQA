package org.jfree.data.statistics;

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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Integer;

public class DefaultBoxAndWhiskerCategoryDataset_getValue_210764045642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term162;
     Object term164;

    public DefaultBoxAndWhiskerCategoryDataset_getValue_210764045642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term132 = new ArrayList();
        ArrayList term136 = new ArrayList();
        ArrayList term140 = new ArrayList();
        term130 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term131 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term150 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term153 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term160 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term161 = (Object[]) newArray("java.lang.Object", 0);
        setField(term131, term131.getClass(), "rowKeys", term132);
        setField(term131, term131.getClass(), "columnKeys", term136);
        setField(term131, term131.getClass(), "rows", term140);
        setField(term130, term130.getClass(), "data", term131);
        setDoubleField(term130, term130.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term130, term130.getClass(), "minimumRangeValueRow", -1);
        setIntField(term130, term130.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term130, term130.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term130, term130.getClass(), "maximumRangeValueRow", -1);
        setIntField(term130, term130.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term150, term150.getClass(), "lower", 0.0);
        setDoubleField(term150, term150.getClass(), "upper", 0.0);
        setField(term130, term130.getClass(), "rangeBounds", term150);
        setField(term153, term153.getClass(), "id", "NOID");
        setField(term130, term130.getClass(), "group", term153);
        setField(term160, term160.getClass(), "listenerList", term161);
        setField(term130, term130.getClass(), "listenerList", term160);
        term162 = new Integer(1484323161);
        term164 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term162;
        args[1] = term164;
        try {
            callMethod(klass, "getValue", argTypes, term130, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



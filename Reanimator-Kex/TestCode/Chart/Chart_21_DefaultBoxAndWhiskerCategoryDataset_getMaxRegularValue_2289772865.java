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

public class DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_2289772865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term992;
     Object term1024;
     Object term1026;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_2289772865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term994 = new ArrayList();
        ArrayList term998 = new ArrayList();
        ArrayList term1002 = new ArrayList();
        term992 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term993 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1012 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1015 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1022 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1023 = (Object[]) newArray("java.lang.Object", 0);
        setField(term993, term993.getClass(), "rowKeys", term994);
        setField(term993, term993.getClass(), "columnKeys", term998);
        setField(term993, term993.getClass(), "rows", term1002);
        setField(term992, term992.getClass(), "data", term993);
        setDoubleField(term992, term992.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term992, term992.getClass(), "minimumRangeValueRow", -1);
        setIntField(term992, term992.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term992, term992.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term992, term992.getClass(), "maximumRangeValueRow", -1);
        setIntField(term992, term992.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1012, term1012.getClass(), "lower", 0.0);
        setDoubleField(term1012, term1012.getClass(), "upper", 0.0);
        setField(term992, term992.getClass(), "rangeBounds", term1012);
        setField(term1015, term1015.getClass(), "id", "NOID");
        setField(term992, term992.getClass(), "group", term1015);
        setField(term1022, term1022.getClass(), "listenerList", term1023);
        setField(term992, term992.getClass(), "listenerList", term1022);
        term1024 = new Integer(-1685132342);
        term1026 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1024;
        args[1] = term1026;
        try {
            callMethod(klass, "getMaxRegularValue", argTypes, term992, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



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
import java.lang.IllegalArgumentException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public class DefaultBoxAndWhiskerCategoryDataset_getMeanValue_73588305945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;

    public DefaultBoxAndWhiskerCategoryDataset_getMeanValue_73588305945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term248 = new ArrayList();
        ArrayList term252 = new ArrayList();
        ArrayList term256 = new ArrayList();
        term246 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term247 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term266 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term269 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term276 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term277 = (Object[]) newArray("java.lang.Object", 0);
        setField(term247, term247.getClass(), "rowKeys", term248);
        setField(term247, term247.getClass(), "columnKeys", term252);
        setField(term247, term247.getClass(), "rows", term256);
        setField(term246, term246.getClass(), "data", term247);
        setDoubleField(term246, term246.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term246, term246.getClass(), "minimumRangeValueRow", -1);
        setIntField(term246, term246.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term246, term246.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term246, term246.getClass(), "maximumRangeValueRow", -1);
        setIntField(term246, term246.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term266, term266.getClass(), "lower", 0.0);
        setDoubleField(term266, term266.getClass(), "upper", 0.0);
        setField(term246, term246.getClass(), "rangeBounds", term266);
        setField(term269, term269.getClass(), "id", "NOID");
        setField(term246, term246.getClass(), "group", term269);
        setField(term276, term276.getClass(), "listenerList", term277);
        setField(term246, term246.getClass(), "listenerList", term276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getMeanValue", argTypes, term246, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



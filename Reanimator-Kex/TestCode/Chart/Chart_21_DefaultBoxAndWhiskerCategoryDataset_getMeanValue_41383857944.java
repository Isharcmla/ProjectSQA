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

public class DefaultBoxAndWhiskerCategoryDataset_getMeanValue_41383857944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term238;
     Object term240;

    public DefaultBoxAndWhiskerCategoryDataset_getMeanValue_41383857944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term208 = new ArrayList();
        ArrayList term212 = new ArrayList();
        ArrayList term216 = new ArrayList();
        term206 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term207 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term226 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term229 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term236 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term237 = (Object[]) newArray("java.lang.Object", 0);
        setField(term207, term207.getClass(), "rowKeys", term208);
        setField(term207, term207.getClass(), "columnKeys", term212);
        setField(term207, term207.getClass(), "rows", term216);
        setField(term206, term206.getClass(), "data", term207);
        setDoubleField(term206, term206.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term206, term206.getClass(), "minimumRangeValueRow", -1);
        setIntField(term206, term206.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term206, term206.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term206, term206.getClass(), "maximumRangeValueRow", -1);
        setIntField(term206, term206.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term226, term226.getClass(), "lower", 0.0);
        setDoubleField(term226, term226.getClass(), "upper", 0.0);
        setField(term206, term206.getClass(), "rangeBounds", term226);
        setField(term229, term229.getClass(), "id", "NOID");
        setField(term206, term206.getClass(), "group", term229);
        setField(term236, term236.getClass(), "listenerList", term237);
        setField(term206, term206.getClass(), "listenerList", term236);
        term238 = new Integer(-1922583790);
        term240 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term238;
        args[1] = term240;
        try {
            callMethod(klass, "getMeanValue", argTypes, term206, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



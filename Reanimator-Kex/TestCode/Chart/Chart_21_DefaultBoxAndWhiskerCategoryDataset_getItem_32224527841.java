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

public class DefaultBoxAndWhiskerCategoryDataset_getItem_32224527841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term122;
     Object term124;

    public DefaultBoxAndWhiskerCategoryDataset_getItem_32224527841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term92 = new ArrayList();
        ArrayList term96 = new ArrayList();
        ArrayList term100 = new ArrayList();
        term90 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term91 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term110 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term113 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term120 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term121 = (Object[]) newArray("java.lang.Object", 0);
        setField(term91, term91.getClass(), "rowKeys", term92);
        setField(term91, term91.getClass(), "columnKeys", term96);
        setField(term91, term91.getClass(), "rows", term100);
        setField(term90, term90.getClass(), "data", term91);
        setDoubleField(term90, term90.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term90, term90.getClass(), "minimumRangeValueRow", -1);
        setIntField(term90, term90.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term90, term90.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term90, term90.getClass(), "maximumRangeValueRow", -1);
        setIntField(term90, term90.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term110, term110.getClass(), "lower", 0.0);
        setDoubleField(term110, term110.getClass(), "upper", 0.0);
        setField(term90, term90.getClass(), "rangeBounds", term110);
        setField(term113, term113.getClass(), "id", "NOID");
        setField(term90, term90.getClass(), "group", term113);
        setField(term120, term120.getClass(), "listenerList", term121);
        setField(term90, term90.getClass(), "listenerList", term120);
        term122 = new Integer(568599855);
        term124 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term122;
        args[1] = term124;
        try {
            callMethod(klass, "getItem", argTypes, term90, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



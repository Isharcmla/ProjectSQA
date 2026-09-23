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

public class DefaultBoxAndWhiskerCategoryDataset_getOutliers_183143799971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1220;
     Object term1252;
     Object term1254;

    public DefaultBoxAndWhiskerCategoryDataset_getOutliers_183143799971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1222 = new ArrayList();
        ArrayList term1226 = new ArrayList();
        ArrayList term1230 = new ArrayList();
        term1220 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term1221 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term1240 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term1243 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term1250 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1251 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1221, term1221.getClass(), "rowKeys", term1222);
        setField(term1221, term1221.getClass(), "columnKeys", term1226);
        setField(term1221, term1221.getClass(), "rows", term1230);
        setField(term1220, term1220.getClass(), "data", term1221);
        setDoubleField(term1220, term1220.getClass(), "minimumRangeValue", Double.NaN);
        setIntField(term1220, term1220.getClass(), "minimumRangeValueRow", -1);
        setIntField(term1220, term1220.getClass(), "minimumRangeValueColumn", -1);
        setDoubleField(term1220, term1220.getClass(), "maximumRangeValue", Double.NaN);
        setIntField(term1220, term1220.getClass(), "maximumRangeValueRow", -1);
        setIntField(term1220, term1220.getClass(), "maximumRangeValueColumn", -1);
        setDoubleField(term1240, term1240.getClass(), "lower", 0.0);
        setDoubleField(term1240, term1240.getClass(), "upper", 0.0);
        setField(term1220, term1220.getClass(), "rangeBounds", term1240);
        setField(term1243, term1243.getClass(), "id", "NOID");
        setField(term1220, term1220.getClass(), "group", term1243);
        setField(term1250, term1250.getClass(), "listenerList", term1251);
        setField(term1220, term1220.getClass(), "listenerList", term1250);
        term1252 = new Integer(-2068769794);
        term1254 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1252;
        args[1] = term1254;
        try {
            callMethod(klass, "getOutliers", argTypes, term1220, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



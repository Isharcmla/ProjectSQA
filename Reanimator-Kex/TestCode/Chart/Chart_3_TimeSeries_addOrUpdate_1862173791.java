package org.jfree.data.time;

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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_addOrUpdate_1862173791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116;
     Object term3167;

    public TimeSeries_addOrUpdate_1862173791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3141 = new ArrayList();
        term3116 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3161 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3162 = (Object[]) newArray("java.lang.Object", 0);
        Object term3163 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3164 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3165 = newInstance(Class.forName("java.lang.Object"));
        setField(term3116, term3116.getClass(), "domain", "MwwjNtdOFT");
        setField(term3116, term3116.getClass(), "range", "VYkqXKVlAJ");
        setField(term3116, term3116.getClass(), "timePeriodClass", null);
        setField(term3116, term3116.getClass(), "data", term3141);
        setIntField(term3116, term3116.getClass(), "maximumItemCount", -157887805);
        setLongField(term3116, term3116.getClass(), "maximumItemAge", -8708192233349544946L);
        setDoubleField(term3116, term3116.getClass(), "minY", 0.48862955528902696);
        setDoubleField(term3116, term3116.getClass(), "maxY", 0.426231085465289);
        setField(term3116, term3116.getClass(), "key", null);
        setField(term3116, term3116.getClass(), "description", "XkIoWJRNwN");
        setField(term3161, term3161.getClass(), "listenerList", term3162);
        setField(term3116, term3116.getClass(), "listeners", term3161);
        setField(term3164, term3164.getClass(), "map", null);
        setField(term3163, term3163.getClass(), "map", term3164);
        setField(term3163, term3163.getClass(), "source", term3165);
        setField(term3116, term3116.getClass(), "propertyChangeSupport", term3163);
        setBooleanField(term3116, term3116.getClass(), "notify", true);
        term3167 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term3167, term3167.getClass(), "period", null);
        setField(term3167, term3167.getClass(), "value", null);
        setBooleanField(term3167, term3167.getClass(), "selected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term3167;
        try {
            callMethod(klass, "addOrUpdate", argTypes, term3116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.lang.Boolean;

public class TimeSeries_add_129829156981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2209;
     Object term2260;
     Object term2262;

    public TimeSeries_add_129829156981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2234 = new ArrayList();
        term2209 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2254 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2255 = (Object[]) newArray("java.lang.Object", 0);
        Object term2256 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2257 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2258 = newInstance(Class.forName("java.lang.Object"));
        setField(term2209, term2209.getClass(), "domain", "ZVecLZMLHF");
        setField(term2209, term2209.getClass(), "range", "fztQhjqwdP");
        setField(term2209, term2209.getClass(), "timePeriodClass", null);
        setField(term2209, term2209.getClass(), "data", term2234);
        setIntField(term2209, term2209.getClass(), "maximumItemCount", -1179120542);
        setLongField(term2209, term2209.getClass(), "maximumItemAge", -4502405999831680926L);
        setDoubleField(term2209, term2209.getClass(), "minY", 0.9374115574082594);
        setDoubleField(term2209, term2209.getClass(), "maxY", 0.8454723071922143);
        setField(term2209, term2209.getClass(), "key", null);
        setField(term2209, term2209.getClass(), "description", "eVpkWxjuki");
        setField(term2254, term2254.getClass(), "listenerList", term2255);
        setField(term2209, term2209.getClass(), "listeners", term2254);
        setField(term2257, term2257.getClass(), "map", null);
        setField(term2256, term2256.getClass(), "map", term2257);
        setField(term2256, term2256.getClass(), "source", term2258);
        setField(term2209, term2209.getClass(), "propertyChangeSupport", term2256);
        setBooleanField(term2209, term2209.getClass(), "notify", false);
        term2260 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term2260, term2260.getClass(), "period", null);
        setField(term2260, term2260.getClass(), "value", null);
        setBooleanField(term2260, term2260.getClass(), "selected", true);
        term2262 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2260;
        args[1] = term2262;
        try {
            callMethod(klass, "add", argTypes, term2209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



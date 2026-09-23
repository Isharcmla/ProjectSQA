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
import java.lang.IllegalArgumentException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class TimeSeries_setMaximumItemAge_108203555056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802;
     Object term851;

    public TimeSeries_setMaximumItemAge_108203555056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term827 = new ArrayList();
        term802 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term845 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term846 = (Object[]) newArray("java.lang.Object", 0);
        Object term847 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term848 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term849 = newInstance(Class.forName("java.lang.Object"));
        setField(term802, term802.getClass(), "domain", "wSQxaModmm");
        setField(term802, term802.getClass(), "range", "UlajhuVLaP");
        setField(term802, term802.getClass(), "timePeriodClass", null);
        setField(term802, term802.getClass(), "data", term827);
        setIntField(term802, term802.getClass(), "maximumItemCount", 1725571209);
        setLongField(term802, term802.getClass(), "maximumItemAge", 6967924379644551255L);
        setField(term802, term802.getClass(), "key", null);
        setField(term802, term802.getClass(), "description", "gGSMzuGICf");
        setField(term845, term845.getClass(), "listenerList", term846);
        setField(term802, term802.getClass(), "listeners", term845);
        setField(term848, term848.getClass(), "map", null);
        setField(term847, term847.getClass(), "map", term848);
        setField(term847, term847.getClass(), "source", term849);
        setField(term802, term802.getClass(), "propertyChangeSupport", term847);
        setBooleanField(term802, term802.getClass(), "notify", true);
        term851 = new Long(-2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term851;
        try {
            callMethod(klass, "setMaximumItemAge", argTypes, term802, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



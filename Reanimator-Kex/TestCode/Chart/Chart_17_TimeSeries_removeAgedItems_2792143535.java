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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class TimeSeries_removeAgedItems_2792143535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2803;
     Object term2852;
     Object term2854;

    public TimeSeries_removeAgedItems_2792143535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2828 = new ArrayList();
        term2803 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2846 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2847 = (Object[]) newArray("java.lang.Object", 0);
        Object term2848 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2849 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2850 = newInstance(Class.forName("java.lang.Object"));
        setField(term2803, term2803.getClass(), "domain", "LWyEaeIyAo");
        setField(term2803, term2803.getClass(), "range", "yVMkkQhvmN");
        setField(term2803, term2803.getClass(), "timePeriodClass", null);
        setField(term2803, term2803.getClass(), "data", term2828);
        setIntField(term2803, term2803.getClass(), "maximumItemCount", 679763016);
        setLongField(term2803, term2803.getClass(), "maximumItemAge", 1233889271256172047L);
        setField(term2803, term2803.getClass(), "key", null);
        setField(term2803, term2803.getClass(), "description", "mvrkADEgpp");
        setField(term2846, term2846.getClass(), "listenerList", term2847);
        setField(term2803, term2803.getClass(), "listeners", term2846);
        setField(term2849, term2849.getClass(), "map", null);
        setField(term2848, term2848.getClass(), "map", term2849);
        setField(term2848, term2848.getClass(), "source", term2850);
        setField(term2803, term2803.getClass(), "propertyChangeSupport", term2848);
        setBooleanField(term2803, term2803.getClass(), "notify", true);
        term2852 = new Long(6617340557564669657L);
        term2854 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2852;
        args[1] = term2854;
        callMethod(klass, "removeAgedItems", argTypes, term2803, args);
    }

};



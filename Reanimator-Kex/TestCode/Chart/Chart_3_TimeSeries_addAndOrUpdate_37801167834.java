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

public class TimeSeries_addAndOrUpdate_37801167834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;
     Object term2841;

    public TimeSeries_addAndOrUpdate_37801167834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2815 = new ArrayList();
        term2790 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2835 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2836 = (Object[]) newArray("java.lang.Object", 0);
        Object term2837 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2838 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2839 = newInstance(Class.forName("java.lang.Object"));
        setField(term2790, term2790.getClass(), "domain", "wfaXBpWAUH");
        setField(term2790, term2790.getClass(), "range", "VMeAzAHwZj");
        setField(term2790, term2790.getClass(), "timePeriodClass", null);
        setField(term2790, term2790.getClass(), "data", term2815);
        setIntField(term2790, term2790.getClass(), "maximumItemCount", 679763016);
        setLongField(term2790, term2790.getClass(), "maximumItemAge", -484994522244390100L);
        setDoubleField(term2790, term2790.getClass(), "minY", 0.016575281023182953);
        setDoubleField(term2790, term2790.getClass(), "maxY", 0.5308350402051779);
        setField(term2790, term2790.getClass(), "key", null);
        setField(term2790, term2790.getClass(), "description", "PznxWXsZME");
        setField(term2835, term2835.getClass(), "listenerList", term2836);
        setField(term2790, term2790.getClass(), "listeners", term2835);
        setField(term2838, term2838.getClass(), "map", null);
        setField(term2837, term2837.getClass(), "map", term2838);
        setField(term2837, term2837.getClass(), "source", term2839);
        setField(term2790, term2790.getClass(), "propertyChangeSupport", term2837);
        setBooleanField(term2790, term2790.getClass(), "notify", true);
        ArrayList term2866 = new ArrayList();
        term2841 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2886 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2887 = (Object[]) newArray("java.lang.Object", 0);
        Object term2888 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2889 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2890 = newInstance(Class.forName("java.lang.Object"));
        setField(term2841, term2841.getClass(), "domain", "LWyEaeIyAo");
        setField(term2841, term2841.getClass(), "range", "yVMkkQhvmN");
        setField(term2841, term2841.getClass(), "timePeriodClass", null);
        setField(term2841, term2841.getClass(), "data", term2866);
        setIntField(term2841, term2841.getClass(), "maximumItemCount", 1962444399);
        setLongField(term2841, term2841.getClass(), "maximumItemAge", 1233889271256172047L);
        setDoubleField(term2841, term2841.getClass(), "minY", 0.7154795600170818);
        setDoubleField(term2841, term2841.getClass(), "maxY", 0.6355029654528058);
        setField(term2841, term2841.getClass(), "key", null);
        setField(term2841, term2841.getClass(), "description", "mvrkADEgpp");
        setField(term2886, term2886.getClass(), "listenerList", term2887);
        setField(term2841, term2841.getClass(), "listeners", term2886);
        setField(term2889, term2889.getClass(), "map", null);
        setField(term2888, term2888.getClass(), "map", term2889);
        setField(term2888, term2888.getClass(), "source", term2890);
        setField(term2841, term2841.getClass(), "propertyChangeSupport", term2888);
        setBooleanField(term2841, term2841.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeries");
        Object[] args = new Object[1];
        args[0] = term2841;
        callMethod(klass, "addAndOrUpdate", argTypes, term2790, args);
    }

};



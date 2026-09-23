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

public class TimeSeries_clone_193668799083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3127;

    public TimeSeries_clone_193668799083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3152 = new ArrayList();
        term3127 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3170 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3171 = (Object[]) newArray("java.lang.Object", 0);
        Object term3172 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3173 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3174 = newInstance(Class.forName("java.lang.Object"));
        setField(term3127, term3127.getClass(), "domain", "HHmNoYxIGj");
        setField(term3127, term3127.getClass(), "range", "PtirvZmsGt");
        setField(term3127, term3127.getClass(), "timePeriodClass", null);
        setField(term3127, term3127.getClass(), "data", term3152);
        setIntField(term3127, term3127.getClass(), "maximumItemCount", -817164822);
        setLongField(term3127, term3127.getClass(), "maximumItemAge", 4178434741742309755L);
        setField(term3127, term3127.getClass(), "key", null);
        setField(term3127, term3127.getClass(), "description", "HWkpTmtlrc");
        setField(term3170, term3170.getClass(), "listenerList", term3171);
        setField(term3127, term3127.getClass(), "listeners", term3170);
        setField(term3173, term3173.getClass(), "map", null);
        setField(term3172, term3172.getClass(), "map", term3173);
        setField(term3172, term3172.getClass(), "source", term3174);
        setField(term3127, term3127.getClass(), "propertyChangeSupport", term3172);
        setBooleanField(term3127, term3127.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clone", argTypes, term3127, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



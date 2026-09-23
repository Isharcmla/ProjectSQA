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
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_clone_193668799083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3127;
     Object term14105;
     Object term14057;

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
        ArrayList term14110 = new ArrayList();
        term14105 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term14114 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term14115 = (Object[]) newArray("java.lang.Object", 0);
        Object term14116 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term14117 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term14118 = newInstance(Class.forName("java.lang.Object"));
        setField(term14105, term14105.getClass(), "domain", "HHmNoYxIGj");
        setField(term14105, term14105.getClass(), "range", "PtirvZmsGt");
        setField(term14105, term14105.getClass(), "timePeriodClass", null);
        setField(term14105, term14105.getClass(), "data", term14110);
        setIntField(term14105, term14105.getClass(), "maximumItemCount", -817164822);
        setLongField(term14105, term14105.getClass(), "maximumItemAge", 4178434741742309755L);
        setField(term14105, term14105.getClass(), "key", null);
        setField(term14105, term14105.getClass(), "description", "HWkpTmtlrc");
        setField(term14114, term14114.getClass(), "listenerList", term14115);
        setField(term14105, term14105.getClass(), "listeners", term14114);
        setField(term14117, term14117.getClass(), "map", null);
        setField(term14116, term14116.getClass(), "map", term14117);
        setField(term14116, term14116.getClass(), "source", term14118);
        setField(term14105, term14105.getClass(), "propertyChangeSupport", term14116);
        setBooleanField(term14105, term14105.getClass(), "notify", true);
        ArrayList term14082 = new ArrayList();
        term14057 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term14100 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term14101 = (Object[]) newArray("java.lang.Object", 0);
        Object term14102 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term14103 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term14057, term14057.getClass(), "domain", "HHmNoYxIGj");
        setField(term14057, term14057.getClass(), "range", "PtirvZmsGt");
        setField(term14057, term14057.getClass(), "timePeriodClass", null);
        setField(term14057, term14057.getClass(), "data", term14082);
        setIntField(term14057, term14057.getClass(), "maximumItemCount", -817164822);
        setLongField(term14057, term14057.getClass(), "maximumItemAge", 4178434741742309755L);
        setField(term14057, term14057.getClass(), "key", null);
        setField(term14057, term14057.getClass(), "description", "HWkpTmtlrc");
        setField(term14100, term14100.getClass(), "listenerList", term14101);
        setField(term14057, term14057.getClass(), "listeners", term14100);
        setField(term14103, term14103.getClass(), "map", null);
        setField(term14102, term14102.getClass(), "map", term14103);
        setField(term14102, term14102.getClass(), "source", term14057);
        setField(term14057, term14057.getClass(), "propertyChangeSupport", term14102);
        setBooleanField(term14057, term14057.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term3127, args);
        assertTrue(recursiveEquals(term3127, term14105));
        assertTrue(recursiveEquals(retValue, term14057));
    }

};



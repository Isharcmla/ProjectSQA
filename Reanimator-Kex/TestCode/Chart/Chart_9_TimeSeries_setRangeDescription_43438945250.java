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

public class TimeSeries_setRangeDescription_43438945250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;
     Object term5231;

    public TimeSeries_setRangeDescription_43438945250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term329 = new ArrayList();
        term304 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term347 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term348 = (Object[]) newArray("java.lang.Object", 0);
        Object term349 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term350 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term351 = newInstance(Class.forName("java.lang.Object"));
        setField(term304, term304.getClass(), "domain", "aJlieCFVtF");
        setField(term304, term304.getClass(), "range", "ZiaGIbnzTs");
        setField(term304, term304.getClass(), "timePeriodClass", null);
        setField(term304, term304.getClass(), "data", term329);
        setIntField(term304, term304.getClass(), "maximumItemCount", 391863371);
        setLongField(term304, term304.getClass(), "maximumItemAge", -8400487765614892086L);
        setField(term304, term304.getClass(), "key", null);
        setField(term304, term304.getClass(), "description", "tbcdzjIfER");
        setField(term347, term347.getClass(), "listenerList", term348);
        setField(term304, term304.getClass(), "listeners", term347);
        setField(term350, term350.getClass(), "map", null);
        setField(term349, term349.getClass(), "map", term350);
        setField(term349, term349.getClass(), "source", term351);
        setField(term304, term304.getClass(), "propertyChangeSupport", term349);
        setBooleanField(term304, term304.getClass(), "notify", false);
        ArrayList term5236 = new ArrayList();
        term5231 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5240 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5241 = (Object[]) newArray("java.lang.Object", 0);
        Object term5242 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5243 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5244 = newInstance(Class.forName("java.lang.Object"));
        setField(term5231, term5231.getClass(), "domain", "aJlieCFVtF");
        setField(term5231, term5231.getClass(), "range", "pCTimMblYc");
        setField(term5231, term5231.getClass(), "timePeriodClass", null);
        setField(term5231, term5231.getClass(), "data", term5236);
        setIntField(term5231, term5231.getClass(), "maximumItemCount", 391863371);
        setLongField(term5231, term5231.getClass(), "maximumItemAge", -8400487765614892086L);
        setField(term5231, term5231.getClass(), "key", null);
        setField(term5231, term5231.getClass(), "description", "tbcdzjIfER");
        setField(term5240, term5240.getClass(), "listenerList", term5241);
        setField(term5231, term5231.getClass(), "listeners", term5240);
        setField(term5243, term5243.getClass(), "map", null);
        setField(term5242, term5242.getClass(), "map", term5243);
        setField(term5242, term5242.getClass(), "source", term5244);
        setField(term5231, term5231.getClass(), "propertyChangeSupport", term5242);
        setBooleanField(term5231, term5231.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "setRangeDescription", argTypes, term304, args);
        assertTrue(recursiveEquals(term304, term5231));
    }

};



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

public class TimeSeries_getTimePeriodClass_165176724657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883;
     Object term6308;

    public TimeSeries_getTimePeriodClass_165176724657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term908 = new ArrayList();
        term883 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term926 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term927 = (Object[]) newArray("java.lang.Object", 0);
        Object term928 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term929 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term930 = newInstance(Class.forName("java.lang.Object"));
        setField(term883, term883.getClass(), "domain", "BndsHwAFMv");
        setField(term883, term883.getClass(), "range", "GzFkzHGYFt");
        setField(term883, term883.getClass(), "timePeriodClass", null);
        setField(term883, term883.getClass(), "data", term908);
        setIntField(term883, term883.getClass(), "maximumItemCount", -522618178);
        setLongField(term883, term883.getClass(), "maximumItemAge", -8885298608300233488L);
        setField(term883, term883.getClass(), "key", null);
        setField(term883, term883.getClass(), "description", "tShwQLRGNe");
        setField(term926, term926.getClass(), "listenerList", term927);
        setField(term883, term883.getClass(), "listeners", term926);
        setField(term929, term929.getClass(), "map", null);
        setField(term928, term928.getClass(), "map", term929);
        setField(term928, term928.getClass(), "source", term930);
        setField(term883, term883.getClass(), "propertyChangeSupport", term928);
        setBooleanField(term883, term883.getClass(), "notify", false);
        ArrayList term6313 = new ArrayList();
        term6308 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term6317 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6318 = (Object[]) newArray("java.lang.Object", 0);
        Object term6319 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6320 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6321 = newInstance(Class.forName("java.lang.Object"));
        setField(term6308, term6308.getClass(), "domain", "BndsHwAFMv");
        setField(term6308, term6308.getClass(), "range", "GzFkzHGYFt");
        setField(term6308, term6308.getClass(), "timePeriodClass", null);
        setField(term6308, term6308.getClass(), "data", term6313);
        setIntField(term6308, term6308.getClass(), "maximumItemCount", -522618178);
        setLongField(term6308, term6308.getClass(), "maximumItemAge", -8885298608300233488L);
        setField(term6308, term6308.getClass(), "key", null);
        setField(term6308, term6308.getClass(), "description", "tShwQLRGNe");
        setField(term6317, term6317.getClass(), "listenerList", term6318);
        setField(term6308, term6308.getClass(), "listeners", term6317);
        setField(term6320, term6320.getClass(), "map", null);
        setField(term6319, term6319.getClass(), "map", term6320);
        setField(term6319, term6319.getClass(), "source", term6321);
        setField(term6308, term6308.getClass(), "propertyChangeSupport", term6319);
        setBooleanField(term6308, term6308.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTimePeriodClass", argTypes, term883, args);
        assertTrue(recursiveEquals(term883, term6308));
        assertTrue(recursiveEquals(retValue, null));
    }

};



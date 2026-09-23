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
import java.lang.Boolean;

public class TimeSeries_removeAgedItems_2801176992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3199;
     Object term3250;
     Object term14526;

    public TimeSeries_removeAgedItems_2801176992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3224 = new ArrayList();
        term3199 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3244 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3245 = (Object[]) newArray("java.lang.Object", 0);
        Object term3246 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3247 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3248 = newInstance(Class.forName("java.lang.Object"));
        setField(term3199, term3199.getClass(), "domain", "HHmNoYxIGj");
        setField(term3199, term3199.getClass(), "range", "PtirvZmsGt");
        setField(term3199, term3199.getClass(), "timePeriodClass", null);
        setField(term3199, term3199.getClass(), "data", term3224);
        setIntField(term3199, term3199.getClass(), "maximumItemCount", 1876565163);
        setLongField(term3199, term3199.getClass(), "maximumItemAge", 5907001541142728739L);
        setDoubleField(term3199, term3199.getClass(), "minY", 0.0027299293098262956);
        setDoubleField(term3199, term3199.getClass(), "maxY", 0.29874017652881824);
        setField(term3199, term3199.getClass(), "key", null);
        setField(term3199, term3199.getClass(), "description", "HWkpTmtlrc");
        setField(term3244, term3244.getClass(), "listenerList", term3245);
        setField(term3199, term3199.getClass(), "listeners", term3244);
        setField(term3247, term3247.getClass(), "map", null);
        setField(term3246, term3246.getClass(), "map", term3247);
        setField(term3246, term3246.getClass(), "source", term3248);
        setField(term3199, term3199.getClass(), "propertyChangeSupport", term3246);
        setBooleanField(term3199, term3199.getClass(), "notify", false);
        term3250 = new Boolean(true);
        ArrayList term14531 = new ArrayList();
        term14526 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term14535 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term14536 = (Object[]) newArray("java.lang.Object", 0);
        Object term14537 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term14538 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term14539 = newInstance(Class.forName("java.lang.Object"));
        setField(term14526, term14526.getClass(), "domain", "HHmNoYxIGj");
        setField(term14526, term14526.getClass(), "range", "PtirvZmsGt");
        setField(term14526, term14526.getClass(), "timePeriodClass", null);
        setField(term14526, term14526.getClass(), "data", term14531);
        setIntField(term14526, term14526.getClass(), "maximumItemCount", 1876565163);
        setLongField(term14526, term14526.getClass(), "maximumItemAge", 5907001541142728739L);
        setDoubleField(term14526, term14526.getClass(), "minY", 0.0027299293098262956);
        setDoubleField(term14526, term14526.getClass(), "maxY", 0.29874017652881824);
        setField(term14526, term14526.getClass(), "key", null);
        setField(term14526, term14526.getClass(), "description", "HWkpTmtlrc");
        setField(term14535, term14535.getClass(), "listenerList", term14536);
        setField(term14526, term14526.getClass(), "listeners", term14535);
        setField(term14538, term14538.getClass(), "map", null);
        setField(term14537, term14537.getClass(), "map", term14538);
        setField(term14537, term14537.getClass(), "source", term14539);
        setField(term14526, term14526.getClass(), "propertyChangeSupport", term14537);
        setBooleanField(term14526, term14526.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3250;
        callMethod(klass, "removeAgedItems", argTypes, term3199, args);
        assertTrue(recursiveEquals(term3199, term14526));
        assertTrue(recursiveEquals(term3250, true));
    }

};



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

public class TimeSeries_clone_1936687990168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34115;
     Object term34191;
     Object term34179;

    public TimeSeries_clone_1936687990168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34141 = new ArrayList();
        term34115 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term34115, term34115.getClass(), "data", term34141);
        ArrayList term34192 = new ArrayList();
        term34191 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term34191, term34191.getClass(), "domain", null);
        setField(term34191, term34191.getClass(), "range", null);
        setField(term34191, term34191.getClass(), "timePeriodClass", null);
        setField(term34191, term34191.getClass(), "data", term34192);
        setIntField(term34191, term34191.getClass(), "maximumItemCount", 0);
        setLongField(term34191, term34191.getClass(), "maximumItemAge", 0L);
        setField(term34191, term34191.getClass(), "key", null);
        setField(term34191, term34191.getClass(), "description", null);
        setField(term34191, term34191.getClass(), "listeners", null);
        setField(term34191, term34191.getClass(), "propertyChangeSupport", null);
        setBooleanField(term34191, term34191.getClass(), "notify", false);
        ArrayList term34180 = new ArrayList();
        term34179 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term34186 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term34187 = (Object[]) newArray("java.lang.Object", 0);
        Object term34188 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term34189 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term34179, term34179.getClass(), "domain", null);
        setField(term34179, term34179.getClass(), "range", null);
        setField(term34179, term34179.getClass(), "timePeriodClass", null);
        setField(term34179, term34179.getClass(), "data", term34180);
        setIntField(term34179, term34179.getClass(), "maximumItemCount", 0);
        setLongField(term34179, term34179.getClass(), "maximumItemAge", 0L);
        setField(term34179, term34179.getClass(), "key", null);
        setField(term34179, term34179.getClass(), "description", null);
        setField(term34186, term34186.getClass(), "listenerList", term34187);
        setField(term34179, term34179.getClass(), "listeners", term34186);
        setField(term34189, term34189.getClass(), "map", null);
        setField(term34188, term34188.getClass(), "map", term34189);
        setField(term34188, term34188.getClass(), "source", term34179);
        setField(term34179, term34179.getClass(), "propertyChangeSupport", term34188);
        setBooleanField(term34179, term34179.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term34115, args);
        assertTrue(recursiveEquals(term34115, term34191));
        assertTrue(recursiveEquals(retValue, term34179));
    }

};



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

public class TimeSeries_clone_1936687990166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33031;
     Object term33107;
     Object term33095;

    public TimeSeries_clone_1936687990166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term33057 = new ArrayList();
        term33031 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term33031, term33031.getClass(), "data", term33057);
        ArrayList term33108 = new ArrayList();
        term33107 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term33107, term33107.getClass(), "domain", null);
        setField(term33107, term33107.getClass(), "range", null);
        setField(term33107, term33107.getClass(), "timePeriodClass", null);
        setField(term33107, term33107.getClass(), "data", term33108);
        setIntField(term33107, term33107.getClass(), "maximumItemCount", 0);
        setLongField(term33107, term33107.getClass(), "maximumItemAge", 0L);
        setField(term33107, term33107.getClass(), "key", null);
        setField(term33107, term33107.getClass(), "description", null);
        setField(term33107, term33107.getClass(), "listeners", null);
        setField(term33107, term33107.getClass(), "propertyChangeSupport", null);
        setBooleanField(term33107, term33107.getClass(), "notify", false);
        ArrayList term33096 = new ArrayList();
        term33095 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term33102 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term33103 = (Object[]) newArray("java.lang.Object", 0);
        Object term33104 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term33105 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term33095, term33095.getClass(), "domain", null);
        setField(term33095, term33095.getClass(), "range", null);
        setField(term33095, term33095.getClass(), "timePeriodClass", null);
        setField(term33095, term33095.getClass(), "data", term33096);
        setIntField(term33095, term33095.getClass(), "maximumItemCount", 0);
        setLongField(term33095, term33095.getClass(), "maximumItemAge", 0L);
        setField(term33095, term33095.getClass(), "key", null);
        setField(term33095, term33095.getClass(), "description", null);
        setField(term33102, term33102.getClass(), "listenerList", term33103);
        setField(term33095, term33095.getClass(), "listeners", term33102);
        setField(term33105, term33105.getClass(), "map", null);
        setField(term33104, term33104.getClass(), "map", term33105);
        setField(term33104, term33104.getClass(), "source", term33095);
        setField(term33095, term33095.getClass(), "propertyChangeSupport", term33104);
        setBooleanField(term33095, term33095.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term33031, args);
        assertTrue(recursiveEquals(term33031, term33107));
        assertTrue(recursiveEquals(retValue, term33095));
    }

};



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

public class TimeSeries_getMinY_129256920866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903;
     Object term6951;

    public TimeSeries_getMinY_129256920866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term928 = new ArrayList();
        term903 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term948 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term949 = (Object[]) newArray("java.lang.Object", 0);
        Object term950 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term951 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term952 = newInstance(Class.forName("java.lang.Object"));
        setField(term903, term903.getClass(), "domain", "BndsHwAFMv");
        setField(term903, term903.getClass(), "range", "GzFkzHGYFt");
        setField(term903, term903.getClass(), "timePeriodClass", null);
        setField(term903, term903.getClass(), "data", term928);
        setIntField(term903, term903.getClass(), "maximumItemCount", -522618178);
        setLongField(term903, term903.getClass(), "maximumItemAge", -8885298608300233488L);
        setDoubleField(term903, term903.getClass(), "minY", 0.4569171842750229);
        setDoubleField(term903, term903.getClass(), "maxY", 0.8598297828918529);
        setField(term903, term903.getClass(), "key", null);
        setField(term903, term903.getClass(), "description", "tShwQLRGNe");
        setField(term948, term948.getClass(), "listenerList", term949);
        setField(term903, term903.getClass(), "listeners", term948);
        setField(term951, term951.getClass(), "map", null);
        setField(term950, term950.getClass(), "map", term951);
        setField(term950, term950.getClass(), "source", term952);
        setField(term903, term903.getClass(), "propertyChangeSupport", term950);
        setBooleanField(term903, term903.getClass(), "notify", false);
        ArrayList term6956 = new ArrayList();
        term6951 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term6960 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6961 = (Object[]) newArray("java.lang.Object", 0);
        Object term6962 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6963 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6964 = newInstance(Class.forName("java.lang.Object"));
        setField(term6951, term6951.getClass(), "domain", "BndsHwAFMv");
        setField(term6951, term6951.getClass(), "range", "GzFkzHGYFt");
        setField(term6951, term6951.getClass(), "timePeriodClass", null);
        setField(term6951, term6951.getClass(), "data", term6956);
        setIntField(term6951, term6951.getClass(), "maximumItemCount", -522618178);
        setLongField(term6951, term6951.getClass(), "maximumItemAge", -8885298608300233488L);
        setDoubleField(term6951, term6951.getClass(), "minY", 0.4569171842750229);
        setDoubleField(term6951, term6951.getClass(), "maxY", 0.8598297828918529);
        setField(term6951, term6951.getClass(), "key", null);
        setField(term6951, term6951.getClass(), "description", "tShwQLRGNe");
        setField(term6960, term6960.getClass(), "listenerList", term6961);
        setField(term6951, term6951.getClass(), "listeners", term6960);
        setField(term6963, term6963.getClass(), "map", null);
        setField(term6962, term6962.getClass(), "map", term6963);
        setField(term6962, term6962.getClass(), "source", term6964);
        setField(term6951, term6951.getClass(), "propertyChangeSupport", term6962);
        setBooleanField(term6951, term6951.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinY", argTypes, term903, args);
        assertTrue(recursiveEquals(term903, term6951));
        assertTrue(recursiveEquals(retValue, 0.4569171842750229));
    }

};



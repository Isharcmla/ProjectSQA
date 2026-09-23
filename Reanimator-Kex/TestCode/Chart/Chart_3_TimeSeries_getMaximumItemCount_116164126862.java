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

public class TimeSeries_getMaximumItemCount_116164126862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575;
     Object term6261;

    public TimeSeries_getMaximumItemCount_116164126862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term600 = new ArrayList();
        term575 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term620 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term621 = (Object[]) newArray("java.lang.Object", 0);
        Object term622 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term623 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term624 = newInstance(Class.forName("java.lang.Object"));
        setField(term575, term575.getClass(), "domain", "IoAlmYsBwc");
        setField(term575, term575.getClass(), "range", "TEParAifyi");
        setField(term575, term575.getClass(), "timePeriodClass", null);
        setField(term575, term575.getClass(), "data", term600);
        setIntField(term575, term575.getClass(), "maximumItemCount", -1955890973);
        setLongField(term575, term575.getClass(), "maximumItemAge", 4872422362414183754L);
        setDoubleField(term575, term575.getClass(), "minY", 0.7655020693602768);
        setDoubleField(term575, term575.getClass(), "maxY", 0.1374549299694151);
        setField(term575, term575.getClass(), "key", null);
        setField(term575, term575.getClass(), "description", "OWDIEULEFu");
        setField(term620, term620.getClass(), "listenerList", term621);
        setField(term575, term575.getClass(), "listeners", term620);
        setField(term623, term623.getClass(), "map", null);
        setField(term622, term622.getClass(), "map", term623);
        setField(term622, term622.getClass(), "source", term624);
        setField(term575, term575.getClass(), "propertyChangeSupport", term622);
        setBooleanField(term575, term575.getClass(), "notify", true);
        ArrayList term6266 = new ArrayList();
        term6261 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term6270 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6271 = (Object[]) newArray("java.lang.Object", 0);
        Object term6272 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6273 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6274 = newInstance(Class.forName("java.lang.Object"));
        setField(term6261, term6261.getClass(), "domain", "IoAlmYsBwc");
        setField(term6261, term6261.getClass(), "range", "TEParAifyi");
        setField(term6261, term6261.getClass(), "timePeriodClass", null);
        setField(term6261, term6261.getClass(), "data", term6266);
        setIntField(term6261, term6261.getClass(), "maximumItemCount", -1955890973);
        setLongField(term6261, term6261.getClass(), "maximumItemAge", 4872422362414183754L);
        setDoubleField(term6261, term6261.getClass(), "minY", 0.7655020693602768);
        setDoubleField(term6261, term6261.getClass(), "maxY", 0.1374549299694151);
        setField(term6261, term6261.getClass(), "key", null);
        setField(term6261, term6261.getClass(), "description", "OWDIEULEFu");
        setField(term6270, term6270.getClass(), "listenerList", term6271);
        setField(term6261, term6261.getClass(), "listeners", term6270);
        setField(term6273, term6273.getClass(), "map", null);
        setField(term6272, term6272.getClass(), "map", term6273);
        setField(term6272, term6272.getClass(), "source", term6274);
        setField(term6261, term6261.getClass(), "propertyChangeSupport", term6272);
        setBooleanField(term6261, term6261.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximumItemCount", argTypes, term575, args);
        assertTrue(recursiveEquals(term575, term6261));
        assertTrue(recursiveEquals(retValue, -1955890973));
    }

};



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

public class TimeSeries_getItemCount_80492700860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;
     Object term6009;

    public TimeSeries_getItemCount_80492700860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term438 = new ArrayList();
        term413 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term458 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term459 = (Object[]) newArray("java.lang.Object", 0);
        Object term460 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term461 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term462 = newInstance(Class.forName("java.lang.Object"));
        setField(term413, term413.getClass(), "domain", "hNxWaHcfhY");
        setField(term413, term413.getClass(), "range", "RkybSrpybU");
        setField(term413, term413.getClass(), "timePeriodClass", null);
        setField(term413, term413.getClass(), "data", term438);
        setIntField(term413, term413.getClass(), "maximumItemCount", -1922583790);
        setLongField(term413, term413.getClass(), "maximumItemAge", 5270370404989704783L);
        setDoubleField(term413, term413.getClass(), "minY", 0.6076495596892013);
        setDoubleField(term413, term413.getClass(), "maxY", 0.37773193782763337);
        setField(term413, term413.getClass(), "key", null);
        setField(term413, term413.getClass(), "description", "xOEqzGAmDU");
        setField(term458, term458.getClass(), "listenerList", term459);
        setField(term413, term413.getClass(), "listeners", term458);
        setField(term461, term461.getClass(), "map", null);
        setField(term460, term460.getClass(), "map", term461);
        setField(term460, term460.getClass(), "source", term462);
        setField(term413, term413.getClass(), "propertyChangeSupport", term460);
        setBooleanField(term413, term413.getClass(), "notify", true);
        ArrayList term6014 = new ArrayList();
        term6009 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term6018 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6019 = (Object[]) newArray("java.lang.Object", 0);
        Object term6020 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6021 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6022 = newInstance(Class.forName("java.lang.Object"));
        setField(term6009, term6009.getClass(), "domain", "hNxWaHcfhY");
        setField(term6009, term6009.getClass(), "range", "RkybSrpybU");
        setField(term6009, term6009.getClass(), "timePeriodClass", null);
        setField(term6009, term6009.getClass(), "data", term6014);
        setIntField(term6009, term6009.getClass(), "maximumItemCount", -1922583790);
        setLongField(term6009, term6009.getClass(), "maximumItemAge", 5270370404989704783L);
        setDoubleField(term6009, term6009.getClass(), "minY", 0.6076495596892013);
        setDoubleField(term6009, term6009.getClass(), "maxY", 0.37773193782763337);
        setField(term6009, term6009.getClass(), "key", null);
        setField(term6009, term6009.getClass(), "description", "xOEqzGAmDU");
        setField(term6018, term6018.getClass(), "listenerList", term6019);
        setField(term6009, term6009.getClass(), "listeners", term6018);
        setField(term6021, term6021.getClass(), "map", null);
        setField(term6020, term6020.getClass(), "map", term6021);
        setField(term6020, term6020.getClass(), "source", term6022);
        setField(term6009, term6009.getClass(), "propertyChangeSupport", term6020);
        setBooleanField(term6009, term6009.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItemCount", argTypes, term413, args);
        assertTrue(recursiveEquals(term413, term6009));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



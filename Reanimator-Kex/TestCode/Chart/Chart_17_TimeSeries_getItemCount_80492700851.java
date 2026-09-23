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

public class TimeSeries_getItemCount_80492700851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;
     Object term5377;

    public TimeSeries_getItemCount_80492700851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term430 = new ArrayList();
        term405 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term448 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term449 = (Object[]) newArray("java.lang.Object", 0);
        Object term450 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term451 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term452 = newInstance(Class.forName("java.lang.Object"));
        setField(term405, term405.getClass(), "domain", "hNxWaHcfhY");
        setField(term405, term405.getClass(), "range", "RkybSrpybU");
        setField(term405, term405.getClass(), "timePeriodClass", null);
        setField(term405, term405.getClass(), "data", term430);
        setIntField(term405, term405.getClass(), "maximumItemCount", -1922583790);
        setLongField(term405, term405.getClass(), "maximumItemAge", 5270370404989704783L);
        setField(term405, term405.getClass(), "key", null);
        setField(term405, term405.getClass(), "description", "xOEqzGAmDU");
        setField(term448, term448.getClass(), "listenerList", term449);
        setField(term405, term405.getClass(), "listeners", term448);
        setField(term451, term451.getClass(), "map", null);
        setField(term450, term450.getClass(), "map", term451);
        setField(term450, term450.getClass(), "source", term452);
        setField(term405, term405.getClass(), "propertyChangeSupport", term450);
        setBooleanField(term405, term405.getClass(), "notify", true);
        ArrayList term5382 = new ArrayList();
        term5377 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5386 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5387 = (Object[]) newArray("java.lang.Object", 0);
        Object term5388 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5389 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5390 = newInstance(Class.forName("java.lang.Object"));
        setField(term5377, term5377.getClass(), "domain", "hNxWaHcfhY");
        setField(term5377, term5377.getClass(), "range", "RkybSrpybU");
        setField(term5377, term5377.getClass(), "timePeriodClass", null);
        setField(term5377, term5377.getClass(), "data", term5382);
        setIntField(term5377, term5377.getClass(), "maximumItemCount", -1922583790);
        setLongField(term5377, term5377.getClass(), "maximumItemAge", 5270370404989704783L);
        setField(term5377, term5377.getClass(), "key", null);
        setField(term5377, term5377.getClass(), "description", "xOEqzGAmDU");
        setField(term5386, term5386.getClass(), "listenerList", term5387);
        setField(term5377, term5377.getClass(), "listeners", term5386);
        setField(term5389, term5389.getClass(), "map", null);
        setField(term5388, term5388.getClass(), "map", term5389);
        setField(term5388, term5388.getClass(), "source", term5390);
        setField(term5377, term5377.getClass(), "propertyChangeSupport", term5388);
        setBooleanField(term5377, term5377.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItemCount", argTypes, term405, args);
        assertTrue(recursiveEquals(term405, term5377));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



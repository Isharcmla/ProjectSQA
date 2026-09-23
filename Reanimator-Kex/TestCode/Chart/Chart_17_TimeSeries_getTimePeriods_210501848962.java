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

public class TimeSeries_getTimePeriods_210501848962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1282;
     Object term7815;
     Object term7811;

    public TimeSeries_getTimePeriods_210501848962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1307 = new ArrayList();
        term1282 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1325 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1326 = (Object[]) newArray("java.lang.Object", 0);
        Object term1327 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1328 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1329 = newInstance(Class.forName("java.lang.Object"));
        setField(term1282, term1282.getClass(), "domain", "fhkbdRViHi");
        setField(term1282, term1282.getClass(), "range", "uWHnvSvaPl");
        setField(term1282, term1282.getClass(), "timePeriodClass", null);
        setField(term1282, term1282.getClass(), "data", term1307);
        setIntField(term1282, term1282.getClass(), "maximumItemCount", 1622346318);
        setLongField(term1282, term1282.getClass(), "maximumItemAge", -316468845751588286L);
        setField(term1282, term1282.getClass(), "key", null);
        setField(term1282, term1282.getClass(), "description", "kBdSllIBVz");
        setField(term1325, term1325.getClass(), "listenerList", term1326);
        setField(term1282, term1282.getClass(), "listeners", term1325);
        setField(term1328, term1328.getClass(), "map", null);
        setField(term1327, term1327.getClass(), "map", term1328);
        setField(term1327, term1327.getClass(), "source", term1329);
        setField(term1282, term1282.getClass(), "propertyChangeSupport", term1327);
        setBooleanField(term1282, term1282.getClass(), "notify", false);
        ArrayList term7820 = new ArrayList();
        term7815 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term7824 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7825 = (Object[]) newArray("java.lang.Object", 0);
        Object term7826 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7827 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7828 = newInstance(Class.forName("java.lang.Object"));
        setField(term7815, term7815.getClass(), "domain", "fhkbdRViHi");
        setField(term7815, term7815.getClass(), "range", "uWHnvSvaPl");
        setField(term7815, term7815.getClass(), "timePeriodClass", null);
        setField(term7815, term7815.getClass(), "data", term7820);
        setIntField(term7815, term7815.getClass(), "maximumItemCount", 1622346318);
        setLongField(term7815, term7815.getClass(), "maximumItemAge", -316468845751588286L);
        setField(term7815, term7815.getClass(), "key", null);
        setField(term7815, term7815.getClass(), "description", "kBdSllIBVz");
        setField(term7824, term7824.getClass(), "listenerList", term7825);
        setField(term7815, term7815.getClass(), "listeners", term7824);
        setField(term7827, term7827.getClass(), "map", null);
        setField(term7826, term7826.getClass(), "map", term7827);
        setField(term7826, term7826.getClass(), "source", term7828);
        setField(term7815, term7815.getClass(), "propertyChangeSupport", term7826);
        setBooleanField(term7815, term7815.getClass(), "notify", false);
        term7811 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTimePeriods", argTypes, term1282, args);
        assertTrue(recursiveEquals(term1282, term7815));
        assertTrue(recursiveEquals(retValue, term7811));
    }

};



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

public class TimeSeries_getItems_186022329461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;
     Object term6135;
     Object term6083;

    public TimeSeries_getItems_186022329461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term519 = new ArrayList();
        term494 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term539 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term540 = (Object[]) newArray("java.lang.Object", 0);
        Object term541 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term542 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term543 = newInstance(Class.forName("java.lang.Object"));
        setField(term494, term494.getClass(), "domain", "BYqFIqCKAV");
        setField(term494, term494.getClass(), "range", "vrQLuWIDJX");
        setField(term494, term494.getClass(), "timePeriodClass", null);
        setField(term494, term494.getClass(), "data", term519);
        setIntField(term494, term494.getClass(), "maximumItemCount", -616727354);
        setLongField(term494, term494.getClass(), "maximumItemAge", 7411271909051562686L);
        setDoubleField(term494, term494.getClass(), "minY", 0.8474802076607362);
        setDoubleField(term494, term494.getClass(), "maxY", 0.5183269973490326);
        setField(term494, term494.getClass(), "key", null);
        setField(term494, term494.getClass(), "description", "flxyYxBRtu");
        setField(term539, term539.getClass(), "listenerList", term540);
        setField(term494, term494.getClass(), "listeners", term539);
        setField(term542, term542.getClass(), "map", null);
        setField(term541, term541.getClass(), "map", term542);
        setField(term541, term541.getClass(), "source", term543);
        setField(term494, term494.getClass(), "propertyChangeSupport", term541);
        setBooleanField(term494, term494.getClass(), "notify", true);
        ArrayList term6140 = new ArrayList();
        term6135 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term6144 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6145 = (Object[]) newArray("java.lang.Object", 0);
        Object term6146 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6147 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6148 = newInstance(Class.forName("java.lang.Object"));
        setField(term6135, term6135.getClass(), "domain", "BYqFIqCKAV");
        setField(term6135, term6135.getClass(), "range", "vrQLuWIDJX");
        setField(term6135, term6135.getClass(), "timePeriodClass", null);
        setField(term6135, term6135.getClass(), "data", term6140);
        setIntField(term6135, term6135.getClass(), "maximumItemCount", -616727354);
        setLongField(term6135, term6135.getClass(), "maximumItemAge", 7411271909051562686L);
        setDoubleField(term6135, term6135.getClass(), "minY", 0.8474802076607362);
        setDoubleField(term6135, term6135.getClass(), "maxY", 0.5183269973490326);
        setField(term6135, term6135.getClass(), "key", null);
        setField(term6135, term6135.getClass(), "description", "flxyYxBRtu");
        setField(term6144, term6144.getClass(), "listenerList", term6145);
        setField(term6135, term6135.getClass(), "listeners", term6144);
        setField(term6147, term6147.getClass(), "map", null);
        setField(term6146, term6146.getClass(), "map", term6147);
        setField(term6146, term6146.getClass(), "source", term6148);
        setField(term6135, term6135.getClass(), "propertyChangeSupport", term6146);
        setBooleanField(term6135, term6135.getClass(), "notify", true);
        ArrayList term6084 = new ArrayList();
        term6083 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term6083, term6083.getClass(), "list", term6084);
        setField(term6083, term6083.getClass(), "c", term6084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItems", argTypes, term494, args);
        assertTrue(recursiveEquals(term494, term6135));
        assertTrue(recursiveEquals(retValue, term6083));
    }

};



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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimeSeries_getRawDataItem_16851518171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310;
     Object term1361;

    public TimeSeries_getRawDataItem_16851518171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1335 = new ArrayList();
        term1310 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1355 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1356 = (Object[]) newArray("java.lang.Object", 0);
        Object term1357 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1358 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1359 = newInstance(Class.forName("java.lang.Object"));
        setField(term1310, term1310.getClass(), "domain", "fhkbdRViHi");
        setField(term1310, term1310.getClass(), "range", "uWHnvSvaPl");
        setField(term1310, term1310.getClass(), "timePeriodClass", null);
        setField(term1310, term1310.getClass(), "data", term1335);
        setIntField(term1310, term1310.getClass(), "maximumItemCount", -1456670397);
        setLongField(term1310, term1310.getClass(), "maximumItemAge", -316468845751588286L);
        setDoubleField(term1310, term1310.getClass(), "minY", 0.37161417339133307);
        setDoubleField(term1310, term1310.getClass(), "maxY", 0.6805867182029153);
        setField(term1310, term1310.getClass(), "key", null);
        setField(term1310, term1310.getClass(), "description", "kBdSllIBVz");
        setField(term1355, term1355.getClass(), "listenerList", term1356);
        setField(term1310, term1310.getClass(), "listeners", term1355);
        setField(term1358, term1358.getClass(), "map", null);
        setField(term1357, term1357.getClass(), "map", term1358);
        setField(term1357, term1357.getClass(), "source", term1359);
        setField(term1310, term1310.getClass(), "propertyChangeSupport", term1357);
        setBooleanField(term1310, term1310.getClass(), "notify", false);
        term1361 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1361;
        try {
            callMethod(klass, "getRawDataItem", argTypes, term1310, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



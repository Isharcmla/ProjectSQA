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

public class TimeSeries_getTimePeriod_204053368773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474;
     Object term1525;

    public TimeSeries_getTimePeriod_204053368773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1499 = new ArrayList();
        term1474 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1519 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1520 = (Object[]) newArray("java.lang.Object", 0);
        Object term1521 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1522 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1523 = newInstance(Class.forName("java.lang.Object"));
        setField(term1474, term1474.getClass(), "domain", "JUmudUmaaV");
        setField(term1474, term1474.getClass(), "range", "KoyGrUJeJW");
        setField(term1474, term1474.getClass(), "timePeriodClass", null);
        setField(term1474, term1474.getClass(), "data", term1499);
        setIntField(term1474, term1474.getClass(), "maximumItemCount", -655067527);
        setLongField(term1474, term1474.getClass(), "maximumItemAge", -6573104506744284592L);
        setDoubleField(term1474, term1474.getClass(), "minY", 0.9737083944266686);
        setDoubleField(term1474, term1474.getClass(), "maxY", 0.0668892744806211);
        setField(term1474, term1474.getClass(), "key", null);
        setField(term1474, term1474.getClass(), "description", "HqBOwkVqjD");
        setField(term1519, term1519.getClass(), "listenerList", term1520);
        setField(term1474, term1474.getClass(), "listeners", term1519);
        setField(term1522, term1522.getClass(), "map", null);
        setField(term1521, term1521.getClass(), "map", term1522);
        setField(term1521, term1521.getClass(), "source", term1523);
        setField(term1474, term1474.getClass(), "propertyChangeSupport", term1521);
        setBooleanField(term1474, term1474.getClass(), "notify", true);
        term1525 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1525;
        try {
            callMethod(klass, "getTimePeriod", argTypes, term1474, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



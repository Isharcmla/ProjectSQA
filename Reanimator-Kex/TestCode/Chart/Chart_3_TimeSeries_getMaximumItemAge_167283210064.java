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

public class TimeSeries_getMaximumItemAge_167283210064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739;
     Object term6515;

    public TimeSeries_getMaximumItemAge_167283210064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term764 = new ArrayList();
        term739 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term784 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term785 = (Object[]) newArray("java.lang.Object", 0);
        Object term786 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term787 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term788 = newInstance(Class.forName("java.lang.Object"));
        setField(term739, term739.getClass(), "domain", "xrwlQZdwCp");
        setField(term739, term739.getClass(), "range", "IDCWpPLRkE");
        setField(term739, term739.getClass(), "timePeriodClass", null);
        setField(term739, term739.getClass(), "data", term764);
        setIntField(term739, term739.getClass(), "maximumItemCount", -1339778481);
        setLongField(term739, term739.getClass(), "maximumItemAge", -7237588299778557629L);
        setDoubleField(term739, term739.getClass(), "minY", 0.9828442029246764);
        setDoubleField(term739, term739.getClass(), "maxY", 0.2779719046761513);
        setField(term739, term739.getClass(), "key", null);
        setField(term739, term739.getClass(), "description", "nyiiPDVjAc");
        setField(term784, term784.getClass(), "listenerList", term785);
        setField(term739, term739.getClass(), "listeners", term784);
        setField(term787, term787.getClass(), "map", null);
        setField(term786, term786.getClass(), "map", term787);
        setField(term786, term786.getClass(), "source", term788);
        setField(term739, term739.getClass(), "propertyChangeSupport", term786);
        setBooleanField(term739, term739.getClass(), "notify", false);
        ArrayList term6520 = new ArrayList();
        term6515 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term6524 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6525 = (Object[]) newArray("java.lang.Object", 0);
        Object term6526 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6527 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6528 = newInstance(Class.forName("java.lang.Object"));
        setField(term6515, term6515.getClass(), "domain", "xrwlQZdwCp");
        setField(term6515, term6515.getClass(), "range", "IDCWpPLRkE");
        setField(term6515, term6515.getClass(), "timePeriodClass", null);
        setField(term6515, term6515.getClass(), "data", term6520);
        setIntField(term6515, term6515.getClass(), "maximumItemCount", -1339778481);
        setLongField(term6515, term6515.getClass(), "maximumItemAge", -7237588299778557629L);
        setDoubleField(term6515, term6515.getClass(), "minY", 0.9828442029246764);
        setDoubleField(term6515, term6515.getClass(), "maxY", 0.2779719046761513);
        setField(term6515, term6515.getClass(), "key", null);
        setField(term6515, term6515.getClass(), "description", "nyiiPDVjAc");
        setField(term6524, term6524.getClass(), "listenerList", term6525);
        setField(term6515, term6515.getClass(), "listeners", term6524);
        setField(term6527, term6527.getClass(), "map", null);
        setField(term6526, term6526.getClass(), "map", term6527);
        setField(term6526, term6526.getClass(), "source", term6528);
        setField(term6515, term6515.getClass(), "propertyChangeSupport", term6526);
        setBooleanField(term6515, term6515.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximumItemAge", argTypes, term739, args);
        assertTrue(recursiveEquals(term739, term6515));
        assertTrue(recursiveEquals(retValue, -7237588299778557629L));
    }

};



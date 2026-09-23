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

public class TimeSeries_getDataItem_183099796958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;
     Object term1011;

    public TimeSeries_getDataItem_183099796958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term987 = new ArrayList();
        term962 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1005 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1006 = (Object[]) newArray("java.lang.Object", 0);
        Object term1007 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1008 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1009 = newInstance(Class.forName("java.lang.Object"));
        setField(term962, term962.getClass(), "domain", "xLbjWUgOIL");
        setField(term962, term962.getClass(), "range", "jDtqGUpnZN");
        setField(term962, term962.getClass(), "timePeriodClass", null);
        setField(term962, term962.getClass(), "data", term987);
        setIntField(term962, term962.getClass(), "maximumItemCount", 1134449235);
        setLongField(term962, term962.getClass(), "maximumItemAge", -4325723315152823407L);
        setField(term962, term962.getClass(), "key", null);
        setField(term962, term962.getClass(), "description", "nGKItKLYNC");
        setField(term1005, term1005.getClass(), "listenerList", term1006);
        setField(term962, term962.getClass(), "listeners", term1005);
        setField(term1008, term1008.getClass(), "map", null);
        setField(term1007, term1007.getClass(), "map", term1008);
        setField(term1007, term1007.getClass(), "source", term1009);
        setField(term962, term962.getClass(), "propertyChangeSupport", term1007);
        setBooleanField(term962, term962.getClass(), "notify", true);
        term1011 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1011;
        try {
            callMethod(klass, "getDataItem", argTypes, term962, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



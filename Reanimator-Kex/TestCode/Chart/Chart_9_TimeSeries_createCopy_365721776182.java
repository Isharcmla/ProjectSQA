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

public class TimeSeries_createCopy_365721776182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39394;
     Object term39484;
     Object term39470;

    public TimeSeries_createCopy_365721776182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39446 = new ArrayList();
        term39394 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term39394, term39394.getClass(), "data", term39446);
        ArrayList term39485 = new ArrayList();
        term39484 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term39484, term39484.getClass(), "domain", null);
        setField(term39484, term39484.getClass(), "range", null);
        setField(term39484, term39484.getClass(), "timePeriodClass", null);
        setField(term39484, term39484.getClass(), "data", term39485);
        setIntField(term39484, term39484.getClass(), "maximumItemCount", 0);
        setLongField(term39484, term39484.getClass(), "maximumItemAge", 0L);
        setField(term39484, term39484.getClass(), "key", null);
        setField(term39484, term39484.getClass(), "description", null);
        setField(term39484, term39484.getClass(), "listeners", null);
        setField(term39484, term39484.getClass(), "propertyChangeSupport", null);
        setBooleanField(term39484, term39484.getClass(), "notify", false);
        ArrayList term39471 = new ArrayList();
        term39470 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term39477 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term39478 = (Object[]) newArray("java.lang.Object", 0);
        Object term39479 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term39480 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term39470, term39470.getClass(), "domain", null);
        setField(term39470, term39470.getClass(), "range", null);
        setField(term39470, term39470.getClass(), "timePeriodClass", null);
        setField(term39470, term39470.getClass(), "data", term39471);
        setIntField(term39470, term39470.getClass(), "maximumItemCount", 0);
        setLongField(term39470, term39470.getClass(), "maximumItemAge", 0L);
        setField(term39470, term39470.getClass(), "key", null);
        setField(term39470, term39470.getClass(), "description", null);
        setField(term39477, term39477.getClass(), "listenerList", term39478);
        setField(term39470, term39470.getClass(), "listeners", term39477);
        setField(term39480, term39480.getClass(), "map", null);
        setField(term39479, term39479.getClass(), "map", term39480);
        setField(term39479, term39479.getClass(), "source", term39470);
        setField(term39470, term39470.getClass(), "propertyChangeSupport", term39479);
        setBooleanField(term39470, term39470.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        Object retValue = callMethod(klass, "createCopy", argTypes, term39394, args);
        assertTrue(recursiveEquals(term39394, term39484));
        assertTrue(recursiveEquals(retValue, term39470));
    }

};



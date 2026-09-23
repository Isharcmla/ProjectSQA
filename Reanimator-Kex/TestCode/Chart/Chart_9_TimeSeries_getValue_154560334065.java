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

public class TimeSeries_getValue_154560334065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1598;
     Object term1647;

    public TimeSeries_getValue_154560334065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1623 = new ArrayList();
        term1598 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1641 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1642 = (Object[]) newArray("java.lang.Object", 0);
        Object term1643 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1644 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1645 = newInstance(Class.forName("java.lang.Object"));
        setField(term1598, term1598.getClass(), "domain", "idgaQsnJpQ");
        setField(term1598, term1598.getClass(), "range", "VgZnGoIFwQ");
        setField(term1598, term1598.getClass(), "timePeriodClass", null);
        setField(term1598, term1598.getClass(), "data", term1623);
        setIntField(term1598, term1598.getClass(), "maximumItemCount", -2068769794);
        setLongField(term1598, term1598.getClass(), "maximumItemAge", 8428634514691209827L);
        setField(term1598, term1598.getClass(), "key", null);
        setField(term1598, term1598.getClass(), "description", "jUbSRrkrYZ");
        setField(term1641, term1641.getClass(), "listenerList", term1642);
        setField(term1598, term1598.getClass(), "listeners", term1641);
        setField(term1644, term1644.getClass(), "map", null);
        setField(term1643, term1643.getClass(), "map", term1644);
        setField(term1643, term1643.getClass(), "source", term1645);
        setField(term1598, term1598.getClass(), "propertyChangeSupport", term1643);
        setBooleanField(term1598, term1598.getClass(), "notify", false);
        term1647 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1647;
        try {
            callMethod(klass, "getValue", argTypes, term1598, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_hashCode_38599226787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3448;

    public TimeSeries_hashCode_38599226787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3473 = new ArrayList();
        term3448 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3491 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3492 = (Object[]) newArray("java.lang.Object", 0);
        Object term3493 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3494 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3495 = newInstance(Class.forName("java.lang.Object"));
        setField(term3448, term3448.getClass(), "domain", "zUlRdimJtU");
        setField(term3448, term3448.getClass(), "range", "vwbEQQNQrx");
        setField(term3448, term3448.getClass(), "timePeriodClass", null);
        setField(term3448, term3448.getClass(), "data", term3473);
        setIntField(term3448, term3448.getClass(), "maximumItemCount", 454281060);
        setLongField(term3448, term3448.getClass(), "maximumItemAge", 4784595517102746672L);
        setField(term3448, term3448.getClass(), "key", null);
        setField(term3448, term3448.getClass(), "description", "xtftXXMbem");
        setField(term3491, term3491.getClass(), "listenerList", term3492);
        setField(term3448, term3448.getClass(), "listeners", term3491);
        setField(term3494, term3494.getClass(), "map", null);
        setField(term3493, term3493.getClass(), "map", term3494);
        setField(term3493, term3493.getClass(), "source", term3495);
        setField(term3448, term3448.getClass(), "propertyChangeSupport", term3493);
        setBooleanField(term3448, term3448.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term3448, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



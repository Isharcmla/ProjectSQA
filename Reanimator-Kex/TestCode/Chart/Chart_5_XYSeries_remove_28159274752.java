package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class XYSeries_remove_28159274752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575;
     Object term601;

    public XYSeries_remove_28159274752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term576 = new ArrayList();
        term575 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term595 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term596 = (Object[]) newArray("java.lang.Object", 0);
        Object term597 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term598 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term599 = newInstance(Class.forName("java.lang.Object"));
        setField(term575, term575.getClass(), "data", term576);
        setIntField(term575, term575.getClass(), "maximumItemCount", 1622346318);
        setBooleanField(term575, term575.getClass(), "autoSort", true);
        setBooleanField(term575, term575.getClass(), "allowDuplicateXValues", false);
        setField(term575, term575.getClass(), "key", null);
        setField(term575, term575.getClass(), "description", "OWDIEULEFu");
        setField(term595, term595.getClass(), "listenerList", term596);
        setField(term575, term575.getClass(), "listeners", term595);
        setField(term598, term598.getClass(), "map", null);
        setField(term597, term597.getClass(), "map", term598);
        setField(term597, term597.getClass(), "source", term599);
        setField(term575, term575.getClass(), "propertyChangeSupport", term597);
        setBooleanField(term575, term575.getClass(), "notify", true);
        term601 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term601;
        try {
            callMethod(klass, "remove", argTypes, term575, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



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

public class XYSeries_setMaximumItemCount_16906894642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;
     Object term213;

    public XYSeries_setMaximumItemCount_16906894642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term188 = new ArrayList();
        term187 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term207 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term208 = (Object[]) newArray("java.lang.Object", 0);
        Object term209 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term210 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term211 = newInstance(Class.forName("java.lang.Object"));
        setField(term187, term187.getClass(), "data", term188);
        setIntField(term187, term187.getClass(), "maximumItemCount", -616727354);
        setBooleanField(term187, term187.getClass(), "autoSort", false);
        setBooleanField(term187, term187.getClass(), "allowDuplicateXValues", false);
        setField(term187, term187.getClass(), "key", null);
        setField(term187, term187.getClass(), "description", "NRdvgJlhkX");
        setField(term207, term207.getClass(), "listenerList", term208);
        setField(term187, term187.getClass(), "listeners", term207);
        setField(term210, term210.getClass(), "map", null);
        setField(term209, term209.getClass(), "map", term210);
        setField(term209, term209.getClass(), "source", term211);
        setField(term187, term187.getClass(), "propertyChangeSupport", term209);
        setBooleanField(term187, term187.getClass(), "notify", true);
        term213 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term213;
        try {
            callMethod(klass, "setMaximumItemCount", argTypes, term187, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



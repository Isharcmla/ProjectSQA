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

public class XYSeries_delete_131243786351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535;
     Object term561;
     Object term563;

    public XYSeries_delete_131243786351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term536 = new ArrayList();
        term535 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term555 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term556 = (Object[]) newArray("java.lang.Object", 0);
        Object term557 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term558 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term559 = newInstance(Class.forName("java.lang.Object"));
        setField(term535, term535.getClass(), "data", term536);
        setIntField(term535, term535.getClass(), "maximumItemCount", 597278769);
        setBooleanField(term535, term535.getClass(), "autoSort", true);
        setBooleanField(term535, term535.getClass(), "allowDuplicateXValues", false);
        setField(term535, term535.getClass(), "key", null);
        setField(term535, term535.getClass(), "description", "IoAlmYsBwc");
        setField(term555, term555.getClass(), "listenerList", term556);
        setField(term535, term535.getClass(), "listeners", term555);
        setField(term558, term558.getClass(), "map", null);
        setField(term557, term557.getClass(), "map", term558);
        setField(term557, term557.getClass(), "source", term559);
        setField(term535, term535.getClass(), "propertyChangeSupport", term557);
        setBooleanField(term535, term535.getClass(), "notify", false);
        term561 = new Integer(-1685132342);
        term563 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term561;
        args[1] = term563;
        try {
            callMethod(klass, "delete", argTypes, term535, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



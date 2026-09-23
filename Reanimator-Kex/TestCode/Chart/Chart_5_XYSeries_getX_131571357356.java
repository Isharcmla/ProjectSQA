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

public class XYSeries_getX_131571357356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;
     Object term749;

    public XYSeries_getX_131571357356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term724 = new ArrayList();
        term723 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term743 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term744 = (Object[]) newArray("java.lang.Object", 0);
        Object term745 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term746 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term747 = newInstance(Class.forName("java.lang.Object"));
        setField(term723, term723.getClass(), "data", term724);
        setIntField(term723, term723.getClass(), "maximumItemCount", -1007160944);
        setBooleanField(term723, term723.getClass(), "autoSort", false);
        setBooleanField(term723, term723.getClass(), "allowDuplicateXValues", false);
        setField(term723, term723.getClass(), "key", null);
        setField(term723, term723.getClass(), "description", "nyiiPDVjAc");
        setField(term743, term743.getClass(), "listenerList", term744);
        setField(term723, term723.getClass(), "listeners", term743);
        setField(term746, term746.getClass(), "map", null);
        setField(term745, term745.getClass(), "map", term746);
        setField(term745, term745.getClass(), "source", term747);
        setField(term723, term723.getClass(), "propertyChangeSupport", term745);
        setBooleanField(term723, term723.getClass(), "notify", true);
        term749 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term749;
        try {
            callMethod(klass, "getX", argTypes, term723, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



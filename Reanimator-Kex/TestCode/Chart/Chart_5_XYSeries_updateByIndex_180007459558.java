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

public class XYSeries_updateByIndex_180007459558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;
     Object term825;

    public XYSeries_updateByIndex_180007459558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term800 = new ArrayList();
        term799 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term819 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term820 = (Object[]) newArray("java.lang.Object", 0);
        Object term821 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term822 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term823 = newInstance(Class.forName("java.lang.Object"));
        setField(term799, term799.getClass(), "data", term800);
        setIntField(term799, term799.getClass(), "maximumItemCount", -1275173084);
        setBooleanField(term799, term799.getClass(), "autoSort", false);
        setBooleanField(term799, term799.getClass(), "allowDuplicateXValues", false);
        setField(term799, term799.getClass(), "key", null);
        setField(term799, term799.getClass(), "description", "gGSMzuGICf");
        setField(term819, term819.getClass(), "listenerList", term820);
        setField(term799, term799.getClass(), "listeners", term819);
        setField(term822, term822.getClass(), "map", null);
        setField(term821, term821.getClass(), "map", term822);
        setField(term821, term821.getClass(), "source", term823);
        setField(term799, term799.getClass(), "propertyChangeSupport", term821);
        setBooleanField(term799, term799.getClass(), "notify", false);
        term825 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term825;
        args[1] = null;
        try {
            callMethod(klass, "updateByIndex", argTypes, term799, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



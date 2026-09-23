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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.xy.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Double;
import java.lang.Boolean;

public class XYSeries_add_163870201347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;
     Object term408;
     Object term410;
     Object term3351;

    public XYSeries_add_163870201347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term383 = new ArrayList();
        term382 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term402 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term403 = (Object[]) newArray("java.lang.Object", 0);
        Object term404 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term405 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term406 = newInstance(Class.forName("java.lang.Object"));
        setField(term382, term382.getClass(), "data", term383);
        setIntField(term382, term382.getClass(), "maximumItemCount", -522618178);
        setBooleanField(term382, term382.getClass(), "autoSort", false);
        setBooleanField(term382, term382.getClass(), "allowDuplicateXValues", true);
        setField(term382, term382.getClass(), "key", null);
        setField(term382, term382.getClass(), "description", "hNxWaHcfhY");
        setField(term402, term402.getClass(), "listenerList", term403);
        setField(term382, term382.getClass(), "listeners", term402);
        setField(term405, term405.getClass(), "map", null);
        setField(term404, term404.getClass(), "map", term405);
        setField(term404, term404.getClass(), "source", term406);
        setField(term382, term382.getClass(), "propertyChangeSupport", term404);
        setBooleanField(term382, term382.getClass(), "notify", true);
        term408 = new Double(0.40176586625454525);
        term410 = new Boolean(true);
        ArrayList term3352 = new ArrayList();
        term3351 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term3356 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3357 = (Object[]) newArray("java.lang.Object", 0);
        Object term3358 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3359 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3360 = newInstance(Class.forName("java.lang.Object"));
        setField(term3351, term3351.getClass(), "data", term3352);
        setIntField(term3351, term3351.getClass(), "maximumItemCount", -522618178);
        setBooleanField(term3351, term3351.getClass(), "autoSort", false);
        setBooleanField(term3351, term3351.getClass(), "allowDuplicateXValues", true);
        setField(term3351, term3351.getClass(), "key", null);
        setField(term3351, term3351.getClass(), "description", "hNxWaHcfhY");
        setField(term3356, term3356.getClass(), "listenerList", term3357);
        setField(term3351, term3351.getClass(), "listeners", term3356);
        setField(term3359, term3359.getClass(), "map", null);
        setField(term3358, term3358.getClass(), "map", term3359);
        setField(term3358, term3358.getClass(), "source", term3360);
        setField(term3351, term3351.getClass(), "propertyChangeSupport", term3358);
        setBooleanField(term3351, term3351.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("java.lang.Number");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term408;
        args[1] = null;
        args[2] = term410;
        callMethod(klass, "add", argTypes, term382, args);
        assertTrue(recursiveEquals(term382, term3351));
        assertTrue(recursiveEquals(term408, null));
        assertTrue(recursiveEquals(term410, 0.40176586625454525));
    }

};



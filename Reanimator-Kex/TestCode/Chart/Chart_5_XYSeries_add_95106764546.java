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

public class XYSeries_add_95106764546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;
     Object term370;
     Object term3250;

    public XYSeries_add_95106764546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term345 = new ArrayList();
        term344 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term364 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term365 = (Object[]) newArray("java.lang.Object", 0);
        Object term366 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term367 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term368 = newInstance(Class.forName("java.lang.Object"));
        setField(term344, term344.getClass(), "data", term345);
        setIntField(term344, term344.getClass(), "maximumItemCount", 1725571209);
        setBooleanField(term344, term344.getClass(), "autoSort", true);
        setBooleanField(term344, term344.getClass(), "allowDuplicateXValues", true);
        setField(term344, term344.getClass(), "key", null);
        setField(term344, term344.getClass(), "description", "HyxfbSQYBe");
        setField(term364, term364.getClass(), "listenerList", term365);
        setField(term344, term344.getClass(), "listeners", term364);
        setField(term367, term367.getClass(), "map", null);
        setField(term366, term366.getClass(), "map", term367);
        setField(term366, term366.getClass(), "source", term368);
        setField(term344, term344.getClass(), "propertyChangeSupport", term366);
        setBooleanField(term344, term344.getClass(), "notify", true);
        term370 = new Double(0.28570734989730284);
        Double term3254 = new Double(0.28570734989730284);
        Object term3253 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        setField(term3253, term3253.getClass(), "x", term3254);
        setField(term3253, term3253.getClass(), "y", null);
        ArrayList term3251 = new ArrayList();
        ((ArrayList) term3251).add(term3253);
        term3250 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term3257 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3258 = (Object[]) newArray("java.lang.Object", 0);
        Object term3259 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3260 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3261 = newInstance(Class.forName("java.lang.Object"));
        setField(term3250, term3250.getClass(), "data", term3251);
        setIntField(term3250, term3250.getClass(), "maximumItemCount", 1725571209);
        setBooleanField(term3250, term3250.getClass(), "autoSort", true);
        setBooleanField(term3250, term3250.getClass(), "allowDuplicateXValues", true);
        setField(term3250, term3250.getClass(), "key", null);
        setField(term3250, term3250.getClass(), "description", "HyxfbSQYBe");
        setField(term3257, term3257.getClass(), "listenerList", term3258);
        setField(term3250, term3250.getClass(), "listeners", term3257);
        setField(term3260, term3260.getClass(), "map", null);
        setField(term3259, term3259.getClass(), "map", term3260);
        setField(term3259, term3259.getClass(), "source", term3261);
        setField(term3250, term3250.getClass(), "propertyChangeSupport", term3259);
        setBooleanField(term3250, term3250.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term370;
        args[1] = null;
        callMethod(klass, "add", argTypes, term344, args);
        assertTrue(recursiveEquals(term344, term3250));
        assertTrue(recursiveEquals(term370, null));
    }

};



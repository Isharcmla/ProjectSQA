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
import java.lang.IllegalArgumentException;
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_indexOf_108044749662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;

    public XYSeries_indexOf_108044749662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term950 = new ArrayList();
        term949 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term969 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term970 = (Object[]) newArray("java.lang.Object", 0);
        Object term971 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term972 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term973 = newInstance(Class.forName("java.lang.Object"));
        setField(term949, term949.getClass(), "data", term950);
        setIntField(term949, term949.getClass(), "maximumItemCount", -226514366);
        setBooleanField(term949, term949.getClass(), "autoSort", true);
        setBooleanField(term949, term949.getClass(), "allowDuplicateXValues", false);
        setField(term949, term949.getClass(), "key", null);
        setField(term949, term949.getClass(), "description", "nGKItKLYNC");
        setField(term969, term969.getClass(), "listenerList", term970);
        setField(term949, term949.getClass(), "listeners", term969);
        setField(term972, term972.getClass(), "map", null);
        setField(term971, term971.getClass(), "map", term972);
        setField(term971, term971.getClass(), "source", term973);
        setField(term949, term949.getClass(), "propertyChangeSupport", term971);
        setBooleanField(term949, term949.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "indexOf", argTypes, term949, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



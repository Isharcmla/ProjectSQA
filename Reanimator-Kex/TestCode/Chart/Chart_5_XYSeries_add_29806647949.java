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
import java.lang.Boolean;

public class XYSeries_add_29806647949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458;
     Object term484;

    public XYSeries_add_29806647949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term459 = new ArrayList();
        term458 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term478 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term479 = (Object[]) newArray("java.lang.Object", 0);
        Object term480 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term481 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term482 = newInstance(Class.forName("java.lang.Object"));
        setField(term458, term458.getClass(), "data", term459);
        setIntField(term458, term458.getClass(), "maximumItemCount", -883034806);
        setBooleanField(term458, term458.getClass(), "autoSort", false);
        setBooleanField(term458, term458.getClass(), "allowDuplicateXValues", true);
        setField(term458, term458.getClass(), "key", null);
        setField(term458, term458.getClass(), "description", "BYqFIqCKAV");
        setField(term478, term478.getClass(), "listenerList", term479);
        setField(term458, term458.getClass(), "listeners", term478);
        setField(term481, term481.getClass(), "map", null);
        setField(term480, term480.getClass(), "map", term481);
        setField(term480, term480.getClass(), "source", term482);
        setField(term458, term458.getClass(), "propertyChangeSupport", term480);
        setBooleanField(term458, term458.getClass(), "notify", true);
        term484 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Number");
        argTypes[1] = Class.forName("java.lang.Number");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term484;
        try {
            callMethod(klass, "add", argTypes, term458, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



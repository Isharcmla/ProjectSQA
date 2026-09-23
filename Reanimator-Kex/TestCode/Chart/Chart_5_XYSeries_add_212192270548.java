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

public class XYSeries_add_212192270548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422;

    public XYSeries_add_212192270548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term423 = new ArrayList();
        term422 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term442 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term443 = (Object[]) newArray("java.lang.Object", 0);
        Object term444 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term445 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term446 = newInstance(Class.forName("java.lang.Object"));
        setField(term422, term422.getClass(), "data", term423);
        setIntField(term422, term422.getClass(), "maximumItemCount", 1134449235);
        setBooleanField(term422, term422.getClass(), "autoSort", true);
        setBooleanField(term422, term422.getClass(), "allowDuplicateXValues", false);
        setField(term422, term422.getClass(), "key", null);
        setField(term422, term422.getClass(), "description", "xOEqzGAmDU");
        setField(term442, term442.getClass(), "listenerList", term443);
        setField(term422, term422.getClass(), "listeners", term442);
        setField(term445, term445.getClass(), "map", null);
        setField(term444, term444.getClass(), "map", term445);
        setField(term444, term444.getClass(), "source", term446);
        setField(term422, term422.getClass(), "propertyChangeSupport", term444);
        setBooleanField(term422, term422.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Number");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "add", argTypes, term422, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



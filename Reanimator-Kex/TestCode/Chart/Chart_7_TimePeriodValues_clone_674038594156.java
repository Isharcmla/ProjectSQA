package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class TimePeriodValues_clone_674038594156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36138;
     Object term36255;
     Object term36239;

    public TimePeriodValues_clone_674038594156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36190 = new ArrayList();
        term36138 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term36138, term36138.getClass(), "data", term36190);
        setField(term36138, term36138.getClass(), "listeners", null);
        setField(term36138, term36138.getClass(), "propertyChangeSupport", null);
        ArrayList term36256 = new ArrayList();
        term36255 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term36255, term36255.getClass(), "domain", null);
        setField(term36255, term36255.getClass(), "range", null);
        setField(term36255, term36255.getClass(), "data", term36256);
        setIntField(term36255, term36255.getClass(), "minStartIndex", 0);
        setIntField(term36255, term36255.getClass(), "maxStartIndex", 0);
        setIntField(term36255, term36255.getClass(), "minMiddleIndex", 0);
        setIntField(term36255, term36255.getClass(), "maxMiddleIndex", 0);
        setIntField(term36255, term36255.getClass(), "minEndIndex", 0);
        setIntField(term36255, term36255.getClass(), "maxEndIndex", 0);
        setField(term36255, term36255.getClass(), "key", null);
        setField(term36255, term36255.getClass(), "description", null);
        setField(term36255, term36255.getClass(), "listeners", null);
        setField(term36255, term36255.getClass(), "propertyChangeSupport", null);
        setBooleanField(term36255, term36255.getClass(), "notify", false);
        ArrayList term36240 = new ArrayList();
        term36239 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term36250 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term36251 = (Object[]) newArray("java.lang.Object", 0);
        Object term36252 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term36253 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term36239, term36239.getClass(), "domain", null);
        setField(term36239, term36239.getClass(), "range", null);
        setField(term36239, term36239.getClass(), "data", term36240);
        setIntField(term36239, term36239.getClass(), "minStartIndex", 0);
        setIntField(term36239, term36239.getClass(), "maxStartIndex", 0);
        setIntField(term36239, term36239.getClass(), "minMiddleIndex", 0);
        setIntField(term36239, term36239.getClass(), "maxMiddleIndex", 0);
        setIntField(term36239, term36239.getClass(), "minEndIndex", 0);
        setIntField(term36239, term36239.getClass(), "maxEndIndex", 0);
        setField(term36239, term36239.getClass(), "key", null);
        setField(term36239, term36239.getClass(), "description", null);
        setField(term36250, term36250.getClass(), "listenerList", term36251);
        setField(term36239, term36239.getClass(), "listeners", term36250);
        setField(term36253, term36253.getClass(), "map", null);
        setField(term36252, term36252.getClass(), "map", term36253);
        setField(term36252, term36252.getClass(), "source", term36239);
        setField(term36239, term36239.getClass(), "propertyChangeSupport", term36252);
        setBooleanField(term36239, term36239.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term36138, args);
        assertTrue(recursiveEquals(term36138, term36255));
        assertTrue(recursiveEquals(retValue, term36239));
    }

};



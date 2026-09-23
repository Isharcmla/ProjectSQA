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

public class XYSeries_addOrUpdate_188977928261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913;

    public XYSeries_addOrUpdate_188977928261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term914 = new ArrayList();
        term913 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term933 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term934 = (Object[]) newArray("java.lang.Object", 0);
        Object term935 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term936 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term937 = newInstance(Class.forName("java.lang.Object"));
        setField(term913, term913.getClass(), "data", term914);
        setIntField(term913, term913.getClass(), "maximumItemCount", -73683645);
        setBooleanField(term913, term913.getClass(), "autoSort", true);
        setBooleanField(term913, term913.getClass(), "allowDuplicateXValues", false);
        setField(term913, term913.getClass(), "key", null);
        setField(term913, term913.getClass(), "description", "xLbjWUgOIL");
        setField(term933, term933.getClass(), "listenerList", term934);
        setField(term913, term913.getClass(), "listeners", term933);
        setField(term936, term936.getClass(), "map", null);
        setField(term935, term935.getClass(), "map", term936);
        setField(term935, term935.getClass(), "source", term937);
        setField(term913, term913.getClass(), "propertyChangeSupport", term935);
        setBooleanField(term913, term913.getClass(), "notify", false);
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
            callMethod(klass, "addOrUpdate", argTypes, term913, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



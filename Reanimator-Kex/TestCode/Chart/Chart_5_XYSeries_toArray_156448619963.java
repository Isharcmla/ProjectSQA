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

public class XYSeries_toArray_156448619963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term985;
     Object term7529;
     Object term7528;

    public XYSeries_toArray_156448619963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term986 = new ArrayList();
        term985 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term1005 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1006 = (Object[]) newArray("java.lang.Object", 0);
        Object term1007 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1008 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1009 = newInstance(Class.forName("java.lang.Object"));
        setField(term985, term985.getClass(), "data", term986);
        setIntField(term985, term985.getClass(), "maximumItemCount", 1193880199);
        setBooleanField(term985, term985.getClass(), "autoSort", false);
        setBooleanField(term985, term985.getClass(), "allowDuplicateXValues", true);
        setField(term985, term985.getClass(), "key", null);
        setField(term985, term985.getClass(), "description", "UoYtihxVaS");
        setField(term1005, term1005.getClass(), "listenerList", term1006);
        setField(term985, term985.getClass(), "listeners", term1005);
        setField(term1008, term1008.getClass(), "map", null);
        setField(term1007, term1007.getClass(), "map", term1008);
        setField(term1007, term1007.getClass(), "source", term1009);
        setField(term985, term985.getClass(), "propertyChangeSupport", term1007);
        setBooleanField(term985, term985.getClass(), "notify", false);
        ArrayList term7530 = new ArrayList();
        term7529 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term7534 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7535 = (Object[]) newArray("java.lang.Object", 0);
        Object term7536 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7537 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7538 = newInstance(Class.forName("java.lang.Object"));
        setField(term7529, term7529.getClass(), "data", term7530);
        setIntField(term7529, term7529.getClass(), "maximumItemCount", 1193880199);
        setBooleanField(term7529, term7529.getClass(), "autoSort", false);
        setBooleanField(term7529, term7529.getClass(), "allowDuplicateXValues", true);
        setField(term7529, term7529.getClass(), "key", null);
        setField(term7529, term7529.getClass(), "description", "UoYtihxVaS");
        setField(term7534, term7534.getClass(), "listenerList", term7535);
        setField(term7529, term7529.getClass(), "listeners", term7534);
        setField(term7537, term7537.getClass(), "map", null);
        setField(term7536, term7536.getClass(), "map", term7537);
        setField(term7536, term7536.getClass(), "source", term7538);
        setField(term7529, term7529.getClass(), "propertyChangeSupport", term7536);
        setBooleanField(term7529, term7529.getClass(), "notify", false);
        term7528 = (Object[]) newArray("[D", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toArray", argTypes, term985, args);
        assertTrue(recursiveEquals(term985, term7529));
        assertTrue(recursiveEquals(retValue, term7528));
    }

};



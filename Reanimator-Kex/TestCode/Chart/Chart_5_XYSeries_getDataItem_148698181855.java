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

public class XYSeries_getDataItem_148698181855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;
     Object term711;

    public XYSeries_getDataItem_148698181855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term686 = new ArrayList();
        term685 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term705 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term706 = (Object[]) newArray("java.lang.Object", 0);
        Object term707 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term708 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term709 = newInstance(Class.forName("java.lang.Object"));
        setField(term685, term685.getClass(), "data", term686);
        setIntField(term685, term685.getClass(), "maximumItemCount", -2068769794);
        setBooleanField(term685, term685.getClass(), "autoSort", false);
        setBooleanField(term685, term685.getClass(), "allowDuplicateXValues", true);
        setField(term685, term685.getClass(), "key", null);
        setField(term685, term685.getClass(), "description", "xrwlQZdwCp");
        setField(term705, term705.getClass(), "listenerList", term706);
        setField(term685, term685.getClass(), "listeners", term705);
        setField(term708, term708.getClass(), "map", null);
        setField(term707, term707.getClass(), "map", term708);
        setField(term707, term707.getClass(), "source", term709);
        setField(term685, term685.getClass(), "propertyChangeSupport", term707);
        setBooleanField(term685, term685.getClass(), "notify", true);
        term711 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term711;
        try {
            callMethod(klass, "getDataItem", argTypes, term685, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



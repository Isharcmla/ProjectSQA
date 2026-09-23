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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimeSeries_getValue_154560334078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1962;
     Object term2013;

    public TimeSeries_getValue_154560334078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1987 = new ArrayList();
        term1962 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2007 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2008 = (Object[]) newArray("java.lang.Object", 0);
        Object term2009 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2010 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2011 = newInstance(Class.forName("java.lang.Object"));
        setField(term1962, term1962.getClass(), "domain", "XqgfKFvPSD");
        setField(term1962, term1962.getClass(), "range", "JiVRgTZvKc");
        setField(term1962, term1962.getClass(), "timePeriodClass", null);
        setField(term1962, term1962.getClass(), "data", term1987);
        setIntField(term1962, term1962.getClass(), "maximumItemCount", 865208305);
        setLongField(term1962, term1962.getClass(), "maximumItemAge", 2486810210675247493L);
        setDoubleField(term1962, term1962.getClass(), "minY", 0.8823181080774973);
        setDoubleField(term1962, term1962.getClass(), "maxY", 0.2192450926212024);
        setField(term1962, term1962.getClass(), "key", null);
        setField(term1962, term1962.getClass(), "description", "XPKmummaqg");
        setField(term2007, term2007.getClass(), "listenerList", term2008);
        setField(term1962, term1962.getClass(), "listeners", term2007);
        setField(term2010, term2010.getClass(), "map", null);
        setField(term2009, term2009.getClass(), "map", term2010);
        setField(term2009, term2009.getClass(), "source", term2011);
        setField(term1962, term1962.getClass(), "propertyChangeSupport", term2009);
        setBooleanField(term1962, term1962.getClass(), "notify", true);
        term2013 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2013;
        try {
            callMethod(klass, "getValue", argTypes, term1962, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



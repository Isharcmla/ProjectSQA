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
import java.lang.IllegalArgumentException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_add_114869689171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2084;

    public TimeSeries_add_114869689171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2109 = new ArrayList();
        term2084 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2127 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2128 = (Object[]) newArray("java.lang.Object", 0);
        Object term2129 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2130 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2131 = newInstance(Class.forName("java.lang.Object"));
        setField(term2084, term2084.getClass(), "domain", "QXzGXbEXMu");
        setField(term2084, term2084.getClass(), "range", "qxSDVejjiY");
        setField(term2084, term2084.getClass(), "timePeriodClass", null);
        setField(term2084, term2084.getClass(), "data", term2109);
        setIntField(term2084, term2084.getClass(), "maximumItemCount", -244121226);
        setLongField(term2084, term2084.getClass(), "maximumItemAge", -7672528020740371001L);
        setField(term2084, term2084.getClass(), "key", null);
        setField(term2084, term2084.getClass(), "description", "xBsXSDjXYK");
        setField(term2127, term2127.getClass(), "listenerList", term2128);
        setField(term2084, term2084.getClass(), "listeners", term2127);
        setField(term2130, term2130.getClass(), "map", null);
        setField(term2129, term2129.getClass(), "map", term2130);
        setField(term2129, term2129.getClass(), "source", term2131);
        setField(term2084, term2084.getClass(), "propertyChangeSupport", term2129);
        setBooleanField(term2084, term2084.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "add", argTypes, term2084, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



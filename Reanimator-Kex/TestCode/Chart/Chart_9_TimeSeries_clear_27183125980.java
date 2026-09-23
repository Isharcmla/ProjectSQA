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

public class TimeSeries_clear_27183125980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2886;
     Object term13234;

    public TimeSeries_clear_27183125980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2911 = new ArrayList();
        term2886 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2929 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2930 = (Object[]) newArray("java.lang.Object", 0);
        Object term2931 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2932 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2933 = newInstance(Class.forName("java.lang.Object"));
        setField(term2886, term2886.getClass(), "domain", "GgZWSjxjyE");
        setField(term2886, term2886.getClass(), "range", "EeBVbzjcCI");
        setField(term2886, term2886.getClass(), "timePeriodClass", null);
        setField(term2886, term2886.getClass(), "data", term2911);
        setIntField(term2886, term2886.getClass(), "maximumItemCount", 1962444399);
        setLongField(term2886, term2886.getClass(), "maximumItemAge", 1439298019805881866L);
        setField(term2886, term2886.getClass(), "key", null);
        setField(term2886, term2886.getClass(), "description", "UfQtPRyWRC");
        setField(term2929, term2929.getClass(), "listenerList", term2930);
        setField(term2886, term2886.getClass(), "listeners", term2929);
        setField(term2932, term2932.getClass(), "map", null);
        setField(term2931, term2931.getClass(), "map", term2932);
        setField(term2931, term2931.getClass(), "source", term2933);
        setField(term2886, term2886.getClass(), "propertyChangeSupport", term2931);
        setBooleanField(term2886, term2886.getClass(), "notify", false);
        ArrayList term13239 = new ArrayList();
        term13234 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term13243 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term13244 = (Object[]) newArray("java.lang.Object", 0);
        Object term13245 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term13246 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term13247 = newInstance(Class.forName("java.lang.Object"));
        setField(term13234, term13234.getClass(), "domain", "GgZWSjxjyE");
        setField(term13234, term13234.getClass(), "range", "EeBVbzjcCI");
        setField(term13234, term13234.getClass(), "timePeriodClass", null);
        setField(term13234, term13234.getClass(), "data", term13239);
        setIntField(term13234, term13234.getClass(), "maximumItemCount", 1962444399);
        setLongField(term13234, term13234.getClass(), "maximumItemAge", 1439298019805881866L);
        setField(term13234, term13234.getClass(), "key", null);
        setField(term13234, term13234.getClass(), "description", "UfQtPRyWRC");
        setField(term13243, term13243.getClass(), "listenerList", term13244);
        setField(term13234, term13234.getClass(), "listeners", term13243);
        setField(term13246, term13246.getClass(), "map", null);
        setField(term13245, term13245.getClass(), "map", term13246);
        setField(term13245, term13245.getClass(), "source", term13247);
        setField(term13234, term13234.getClass(), "propertyChangeSupport", term13245);
        setBooleanField(term13234, term13234.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term2886, args);
        assertTrue(recursiveEquals(term2886, term13234));
    }

};



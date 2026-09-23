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

public class TimeSeries_clear_27183125994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3367;
     Object term14780;

    public TimeSeries_clear_27183125994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3392 = new ArrayList();
        term3367 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3412 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3413 = (Object[]) newArray("java.lang.Object", 0);
        Object term3414 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3415 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3416 = newInstance(Class.forName("java.lang.Object"));
        setField(term3367, term3367.getClass(), "domain", "WzFopsaDuG");
        setField(term3367, term3367.getClass(), "range", "PapWxkhEWe");
        setField(term3367, term3367.getClass(), "timePeriodClass", null);
        setField(term3367, term3367.getClass(), "data", term3392);
        setIntField(term3367, term3367.getClass(), "maximumItemCount", -1016503459);
        setLongField(term3367, term3367.getClass(), "maximumItemAge", -6292278961887936280L);
        setDoubleField(term3367, term3367.getClass(), "minY", 0.32237559209193944);
        setDoubleField(term3367, term3367.getClass(), "maxY", 0.53094494792755);
        setField(term3367, term3367.getClass(), "key", null);
        setField(term3367, term3367.getClass(), "description", "smnHEqRFRx");
        setField(term3412, term3412.getClass(), "listenerList", term3413);
        setField(term3367, term3367.getClass(), "listeners", term3412);
        setField(term3415, term3415.getClass(), "map", null);
        setField(term3414, term3414.getClass(), "map", term3415);
        setField(term3414, term3414.getClass(), "source", term3416);
        setField(term3367, term3367.getClass(), "propertyChangeSupport", term3414);
        setBooleanField(term3367, term3367.getClass(), "notify", false);
        ArrayList term14785 = new ArrayList();
        term14780 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term14789 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term14790 = (Object[]) newArray("java.lang.Object", 0);
        Object term14791 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term14792 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term14793 = newInstance(Class.forName("java.lang.Object"));
        setField(term14780, term14780.getClass(), "domain", "WzFopsaDuG");
        setField(term14780, term14780.getClass(), "range", "PapWxkhEWe");
        setField(term14780, term14780.getClass(), "timePeriodClass", null);
        setField(term14780, term14780.getClass(), "data", term14785);
        setIntField(term14780, term14780.getClass(), "maximumItemCount", -1016503459);
        setLongField(term14780, term14780.getClass(), "maximumItemAge", -6292278961887936280L);
        setDoubleField(term14780, term14780.getClass(), "minY", 0.32237559209193944);
        setDoubleField(term14780, term14780.getClass(), "maxY", 0.53094494792755);
        setField(term14780, term14780.getClass(), "key", null);
        setField(term14780, term14780.getClass(), "description", "smnHEqRFRx");
        setField(term14789, term14789.getClass(), "listenerList", term14790);
        setField(term14780, term14780.getClass(), "listeners", term14789);
        setField(term14792, term14792.getClass(), "map", null);
        setField(term14791, term14791.getClass(), "map", term14792);
        setField(term14791, term14791.getClass(), "source", term14793);
        setField(term14780, term14780.getClass(), "propertyChangeSupport", term14791);
        setBooleanField(term14780, term14780.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term3367, args);
        assertTrue(recursiveEquals(term3367, term14780));
    }

};



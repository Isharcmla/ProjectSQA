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
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_findBoundsByIteration_9734722651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4277;

    public TimeSeries_findBoundsByIteration_9734722651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4302 = new ArrayList();
        term4277 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4322 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4323 = (Object[]) newArray("java.lang.Object", 0);
        Object term4324 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4325 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4326 = newInstance(Class.forName("java.lang.Object"));
        setField(term4277, term4277.getClass(), "domain", "RMsXuyzKJV");
        setField(term4277, term4277.getClass(), "range", "FwPbDZcHmB");
        setField(term4277, term4277.getClass(), "timePeriodClass", null);
        setField(term4277, term4277.getClass(), "data", term4302);
        setIntField(term4277, term4277.getClass(), "maximumItemCount", -2095575670);
        setLongField(term4277, term4277.getClass(), "maximumItemAge", -2850532706972744550L);
        setDoubleField(term4277, term4277.getClass(), "minY", 0.686293604788188);
        setDoubleField(term4277, term4277.getClass(), "maxY", 0.12764449157430724);
        setField(term4277, term4277.getClass(), "key", null);
        setField(term4277, term4277.getClass(), "description", "hOncybyCAH");
        setField(term4322, term4322.getClass(), "listenerList", term4323);
        setField(term4277, term4277.getClass(), "listeners", term4322);
        setField(term4325, term4325.getClass(), "map", null);
        setField(term4324, term4324.getClass(), "map", term4325);
        setField(term4324, term4324.getClass(), "source", term4326);
        setField(term4277, term4277.getClass(), "propertyChangeSupport", term4324);
        setBooleanField(term4277, term4277.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findBoundsByIteration", argTypes, term4277, args);
    }

};



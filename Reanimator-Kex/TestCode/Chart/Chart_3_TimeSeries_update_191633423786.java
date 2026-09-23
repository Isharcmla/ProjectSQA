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

public class TimeSeries_update_191633423786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2626;

    public TimeSeries_update_191633423786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2651 = new ArrayList();
        term2626 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2671 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2672 = (Object[]) newArray("java.lang.Object", 0);
        Object term2673 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2674 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2675 = newInstance(Class.forName("java.lang.Object"));
        setField(term2626, term2626.getClass(), "domain", "xIeFjkHkOe");
        setField(term2626, term2626.getClass(), "range", "SdCKLMIYnX");
        setField(term2626, term2626.getClass(), "timePeriodClass", null);
        setField(term2626, term2626.getClass(), "data", term2651);
        setIntField(term2626, term2626.getClass(), "maximumItemCount", -1530420153);
        setLongField(term2626, term2626.getClass(), "maximumItemAge", 5262507301787091109L);
        setDoubleField(term2626, term2626.getClass(), "minY", 0.11179067076100713);
        setDoubleField(term2626, term2626.getClass(), "maxY", 0.5306473989087822);
        setField(term2626, term2626.getClass(), "key", null);
        setField(term2626, term2626.getClass(), "description", "OJJtVNPyKZ");
        setField(term2671, term2671.getClass(), "listenerList", term2672);
        setField(term2626, term2626.getClass(), "listeners", term2671);
        setField(term2674, term2674.getClass(), "map", null);
        setField(term2673, term2673.getClass(), "map", term2674);
        setField(term2673, term2673.getClass(), "source", term2675);
        setField(term2626, term2626.getClass(), "propertyChangeSupport", term2673);
        setBooleanField(term2626, term2626.getClass(), "notify", true);
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
            callMethod(klass, "update", argTypes, term2626, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class TimePeriodValues_recalculateBounds_173392098239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928;
     Object term5352;

    public TimePeriodValues_recalculateBounds_173392098239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term953 = new ArrayList();
        term928 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term975 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term976 = (Object[]) newArray("java.lang.Object", 0);
        Object term977 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term978 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term979 = newInstance(Class.forName("java.lang.Object"));
        setField(term928, term928.getClass(), "domain", "BndsHwAFMv");
        setField(term928, term928.getClass(), "range", "GzFkzHGYFt");
        setField(term928, term928.getClass(), "data", term953);
        setIntField(term928, term928.getClass(), "minStartIndex", 1225272962);
        setIntField(term928, term928.getClass(), "maxStartIndex", 1324040357);
        setIntField(term928, term928.getClass(), "minMiddleIndex", -1588772968);
        setIntField(term928, term928.getClass(), "maxMiddleIndex", -93135961);
        setIntField(term928, term928.getClass(), "minEndIndex", -112921587);
        setIntField(term928, term928.getClass(), "maxEndIndex", 933028652);
        setField(term928, term928.getClass(), "key", null);
        setField(term928, term928.getClass(), "description", "tShwQLRGNe");
        setField(term975, term975.getClass(), "listenerList", term976);
        setField(term928, term928.getClass(), "listeners", term975);
        setField(term978, term978.getClass(), "map", null);
        setField(term977, term977.getClass(), "map", term978);
        setField(term977, term977.getClass(), "source", term979);
        setField(term928, term928.getClass(), "propertyChangeSupport", term977);
        setBooleanField(term928, term928.getClass(), "notify", false);
        ArrayList term5357 = new ArrayList();
        term5352 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term5361 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5362 = (Object[]) newArray("java.lang.Object", 0);
        Object term5363 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5364 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5365 = newInstance(Class.forName("java.lang.Object"));
        setField(term5352, term5352.getClass(), "domain", "BndsHwAFMv");
        setField(term5352, term5352.getClass(), "range", "GzFkzHGYFt");
        setField(term5352, term5352.getClass(), "data", term5357);
        setIntField(term5352, term5352.getClass(), "minStartIndex", -1);
        setIntField(term5352, term5352.getClass(), "maxStartIndex", -1);
        setIntField(term5352, term5352.getClass(), "minMiddleIndex", -1);
        setIntField(term5352, term5352.getClass(), "maxMiddleIndex", -1);
        setIntField(term5352, term5352.getClass(), "minEndIndex", -1);
        setIntField(term5352, term5352.getClass(), "maxEndIndex", -1);
        setField(term5352, term5352.getClass(), "key", null);
        setField(term5352, term5352.getClass(), "description", "tShwQLRGNe");
        setField(term5361, term5361.getClass(), "listenerList", term5362);
        setField(term5352, term5352.getClass(), "listeners", term5361);
        setField(term5364, term5364.getClass(), "map", null);
        setField(term5363, term5363.getClass(), "map", term5364);
        setField(term5363, term5363.getClass(), "source", term5365);
        setField(term5352, term5352.getClass(), "propertyChangeSupport", term5363);
        setBooleanField(term5352, term5352.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recalculateBounds", argTypes, term928, args);
        assertTrue(recursiveEquals(term928, term5352));
    }

};



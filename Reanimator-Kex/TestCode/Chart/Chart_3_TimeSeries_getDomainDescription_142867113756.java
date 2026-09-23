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

public class TimeSeries_getDomainDescription_142867113756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term5369;

    public TimeSeries_getDomainDescription_142867113756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70 = new ArrayList();
        term45 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term90 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term91 = (Object[]) newArray("java.lang.Object", 0);
        Object term92 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term93 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term94 = newInstance(Class.forName("java.lang.Object"));
        setField(term45, term45.getClass(), "domain", "MuLcgQHgqz");
        setField(term45, term45.getClass(), "range", "xxtlPwDYFs");
        setField(term45, term45.getClass(), "timePeriodClass", null);
        setField(term45, term45.getClass(), "data", term70);
        setIntField(term45, term45.getClass(), "maximumItemCount", 568599855);
        setLongField(term45, term45.getClass(), "maximumItemAge", 2442117782898005296L);
        setDoubleField(term45, term45.getClass(), "minY", 0.13238746331190498);
        setDoubleField(term45, term45.getClass(), "maxY", 0.3455959125047594);
        setField(term45, term45.getClass(), "key", null);
        setField(term45, term45.getClass(), "description", "jJCZpVmanW");
        setField(term90, term90.getClass(), "listenerList", term91);
        setField(term45, term45.getClass(), "listeners", term90);
        setField(term93, term93.getClass(), "map", null);
        setField(term92, term92.getClass(), "map", term93);
        setField(term92, term92.getClass(), "source", term94);
        setField(term45, term45.getClass(), "propertyChangeSupport", term92);
        setBooleanField(term45, term45.getClass(), "notify", false);
        ArrayList term5374 = new ArrayList();
        term5369 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5378 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5379 = (Object[]) newArray("java.lang.Object", 0);
        Object term5380 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5381 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5382 = newInstance(Class.forName("java.lang.Object"));
        setField(term5369, term5369.getClass(), "domain", "MuLcgQHgqz");
        setField(term5369, term5369.getClass(), "range", "xxtlPwDYFs");
        setField(term5369, term5369.getClass(), "timePeriodClass", null);
        setField(term5369, term5369.getClass(), "data", term5374);
        setIntField(term5369, term5369.getClass(), "maximumItemCount", 568599855);
        setLongField(term5369, term5369.getClass(), "maximumItemAge", 2442117782898005296L);
        setDoubleField(term5369, term5369.getClass(), "minY", 0.13238746331190498);
        setDoubleField(term5369, term5369.getClass(), "maxY", 0.3455959125047594);
        setField(term5369, term5369.getClass(), "key", null);
        setField(term5369, term5369.getClass(), "description", "jJCZpVmanW");
        setField(term5378, term5378.getClass(), "listenerList", term5379);
        setField(term5369, term5369.getClass(), "listeners", term5378);
        setField(term5381, term5381.getClass(), "map", null);
        setField(term5380, term5380.getClass(), "map", term5381);
        setField(term5380, term5380.getClass(), "source", term5382);
        setField(term5369, term5369.getClass(), "propertyChangeSupport", term5380);
        setBooleanField(term5369, term5369.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDomainDescription", argTypes, term45, args);
        assertTrue(recursiveEquals(term45, term5369));
        assertTrue(recursiveEquals(retValue, "MuLcgQHgqz"));
    }

};



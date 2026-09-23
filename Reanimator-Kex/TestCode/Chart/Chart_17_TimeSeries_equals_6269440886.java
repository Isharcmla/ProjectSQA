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

public class TimeSeries_equals_6269440886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3368;
     Object term3417;
     Object term14998;
     Object term15012;

    public TimeSeries_equals_6269440886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3393 = new ArrayList();
        term3368 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3411 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3412 = (Object[]) newArray("java.lang.Object", 0);
        Object term3413 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3414 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3415 = newInstance(Class.forName("java.lang.Object"));
        setField(term3368, term3368.getClass(), "domain", "OYbzXylRWW");
        setField(term3368, term3368.getClass(), "range", "DSNsTGYXDF");
        setField(term3368, term3368.getClass(), "timePeriodClass", null);
        setField(term3368, term3368.getClass(), "data", term3393);
        setIntField(term3368, term3368.getClass(), "maximumItemCount", 1632125673);
        setLongField(term3368, term3368.getClass(), "maximumItemAge", -6645965768855543712L);
        setField(term3368, term3368.getClass(), "key", null);
        setField(term3368, term3368.getClass(), "description", "sQvGcVjdEx");
        setField(term3411, term3411.getClass(), "listenerList", term3412);
        setField(term3368, term3368.getClass(), "listeners", term3411);
        setField(term3414, term3414.getClass(), "map", null);
        setField(term3413, term3413.getClass(), "map", term3414);
        setField(term3413, term3413.getClass(), "source", term3415);
        setField(term3368, term3368.getClass(), "propertyChangeSupport", term3413);
        setBooleanField(term3368, term3368.getClass(), "notify", true);
        term3417 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term15003 = new ArrayList();
        term14998 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term15007 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term15008 = (Object[]) newArray("java.lang.Object", 0);
        Object term15009 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term15010 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term15011 = newInstance(Class.forName("java.lang.Object"));
        setField(term14998, term14998.getClass(), "domain", "OYbzXylRWW");
        setField(term14998, term14998.getClass(), "range", "DSNsTGYXDF");
        setField(term14998, term14998.getClass(), "timePeriodClass", null);
        setField(term14998, term14998.getClass(), "data", term15003);
        setIntField(term14998, term14998.getClass(), "maximumItemCount", 1632125673);
        setLongField(term14998, term14998.getClass(), "maximumItemAge", -6645965768855543712L);
        setField(term14998, term14998.getClass(), "key", null);
        setField(term14998, term14998.getClass(), "description", "sQvGcVjdEx");
        setField(term15007, term15007.getClass(), "listenerList", term15008);
        setField(term14998, term14998.getClass(), "listeners", term15007);
        setField(term15010, term15010.getClass(), "map", null);
        setField(term15009, term15009.getClass(), "map", term15010);
        setField(term15009, term15009.getClass(), "source", term15011);
        setField(term14998, term14998.getClass(), "propertyChangeSupport", term15009);
        setBooleanField(term14998, term14998.getClass(), "notify", true);
        term15012 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3417;
        Object retValue = callMethod(klass, "equals", argTypes, term3368, args);
        assertTrue(recursiveEquals(term3368, term14998));
        assertTrue(recursiveEquals(term3417, term15012));
        assertTrue(recursiveEquals(retValue, false));
    }

};



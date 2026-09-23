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

public class TimeSeries_getDomainDescription_142867113747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term4745;

    public TimeSeries_getDomainDescription_142867113747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70 = new ArrayList();
        term45 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term88 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term89 = (Object[]) newArray("java.lang.Object", 0);
        Object term90 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term91 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term92 = newInstance(Class.forName("java.lang.Object"));
        setField(term45, term45.getClass(), "domain", "MuLcgQHgqz");
        setField(term45, term45.getClass(), "range", "xxtlPwDYFs");
        setField(term45, term45.getClass(), "timePeriodClass", null);
        setField(term45, term45.getClass(), "data", term70);
        setIntField(term45, term45.getClass(), "maximumItemCount", 568599855);
        setLongField(term45, term45.getClass(), "maximumItemAge", 2442117782898005296L);
        setField(term45, term45.getClass(), "key", null);
        setField(term45, term45.getClass(), "description", "jJCZpVmanW");
        setField(term88, term88.getClass(), "listenerList", term89);
        setField(term45, term45.getClass(), "listeners", term88);
        setField(term91, term91.getClass(), "map", null);
        setField(term90, term90.getClass(), "map", term91);
        setField(term90, term90.getClass(), "source", term92);
        setField(term45, term45.getClass(), "propertyChangeSupport", term90);
        setBooleanField(term45, term45.getClass(), "notify", false);
        ArrayList term4750 = new ArrayList();
        term4745 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4754 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4755 = (Object[]) newArray("java.lang.Object", 0);
        Object term4756 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4757 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4758 = newInstance(Class.forName("java.lang.Object"));
        setField(term4745, term4745.getClass(), "domain", "MuLcgQHgqz");
        setField(term4745, term4745.getClass(), "range", "xxtlPwDYFs");
        setField(term4745, term4745.getClass(), "timePeriodClass", null);
        setField(term4745, term4745.getClass(), "data", term4750);
        setIntField(term4745, term4745.getClass(), "maximumItemCount", 568599855);
        setLongField(term4745, term4745.getClass(), "maximumItemAge", 2442117782898005296L);
        setField(term4745, term4745.getClass(), "key", null);
        setField(term4745, term4745.getClass(), "description", "jJCZpVmanW");
        setField(term4754, term4754.getClass(), "listenerList", term4755);
        setField(term4745, term4745.getClass(), "listeners", term4754);
        setField(term4757, term4757.getClass(), "map", null);
        setField(term4756, term4756.getClass(), "map", term4757);
        setField(term4756, term4756.getClass(), "source", term4758);
        setField(term4745, term4745.getClass(), "propertyChangeSupport", term4756);
        setBooleanField(term4745, term4745.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDomainDescription", argTypes, term45, args);
        assertTrue(recursiveEquals(term45, term4745));
        assertTrue(recursiveEquals(retValue, "MuLcgQHgqz"));
    }

};



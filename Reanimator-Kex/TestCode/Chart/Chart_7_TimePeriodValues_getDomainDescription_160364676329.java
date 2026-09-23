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

public class TimePeriodValues_getDomainDescription_160364676329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term3029;

    public TimePeriodValues_getDomainDescription_160364676329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70 = new ArrayList();
        term45 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term92 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term93 = (Object[]) newArray("java.lang.Object", 0);
        Object term94 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term95 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term96 = newInstance(Class.forName("java.lang.Object"));
        setField(term45, term45.getClass(), "domain", "MuLcgQHgqz");
        setField(term45, term45.getClass(), "range", "xxtlPwDYFs");
        setField(term45, term45.getClass(), "data", term70);
        setIntField(term45, term45.getClass(), "minStartIndex", 568599855);
        setIntField(term45, term45.getClass(), "maxStartIndex", 1162663216);
        setIntField(term45, term45.getClass(), "minMiddleIndex", 1484323161);
        setIntField(term45, term45.getClass(), "maxMiddleIndex", 391863371);
        setIntField(term45, term45.getClass(), "minEndIndex", -1922583790);
        setIntField(term45, term45.getClass(), "maxEndIndex", -616727354);
        setField(term45, term45.getClass(), "key", null);
        setField(term45, term45.getClass(), "description", "jJCZpVmanW");
        setField(term92, term92.getClass(), "listenerList", term93);
        setField(term45, term45.getClass(), "listeners", term92);
        setField(term95, term95.getClass(), "map", null);
        setField(term94, term94.getClass(), "map", term95);
        setField(term94, term94.getClass(), "source", term96);
        setField(term45, term45.getClass(), "propertyChangeSupport", term94);
        setBooleanField(term45, term45.getClass(), "notify", false);
        ArrayList term3034 = new ArrayList();
        term3029 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term3038 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3039 = (Object[]) newArray("java.lang.Object", 0);
        Object term3040 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3041 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3042 = newInstance(Class.forName("java.lang.Object"));
        setField(term3029, term3029.getClass(), "domain", "MuLcgQHgqz");
        setField(term3029, term3029.getClass(), "range", "xxtlPwDYFs");
        setField(term3029, term3029.getClass(), "data", term3034);
        setIntField(term3029, term3029.getClass(), "minStartIndex", 568599855);
        setIntField(term3029, term3029.getClass(), "maxStartIndex", 1162663216);
        setIntField(term3029, term3029.getClass(), "minMiddleIndex", 1484323161);
        setIntField(term3029, term3029.getClass(), "maxMiddleIndex", 391863371);
        setIntField(term3029, term3029.getClass(), "minEndIndex", -1922583790);
        setIntField(term3029, term3029.getClass(), "maxEndIndex", -616727354);
        setField(term3029, term3029.getClass(), "key", null);
        setField(term3029, term3029.getClass(), "description", "jJCZpVmanW");
        setField(term3038, term3038.getClass(), "listenerList", term3039);
        setField(term3029, term3029.getClass(), "listeners", term3038);
        setField(term3041, term3041.getClass(), "map", null);
        setField(term3040, term3040.getClass(), "map", term3041);
        setField(term3040, term3040.getClass(), "source", term3042);
        setField(term3029, term3029.getClass(), "propertyChangeSupport", term3040);
        setBooleanField(term3029, term3029.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDomainDescription", argTypes, term45, args);
        assertTrue(recursiveEquals(term45, term3029));
        assertTrue(recursiveEquals(retValue, "MuLcgQHgqz"));
    }

};



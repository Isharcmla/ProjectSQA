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

public class TimePeriodValues_getMaxEndIndex_55470702752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2103;
     Object term7963;

    public TimePeriodValues_getMaxEndIndex_55470702752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2128 = new ArrayList();
        term2103 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term2150 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2151 = (Object[]) newArray("java.lang.Object", 0);
        Object term2152 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2153 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2154 = newInstance(Class.forName("java.lang.Object"));
        setField(term2103, term2103.getClass(), "domain", "SPpkrGcPRr");
        setField(term2103, term2103.getClass(), "range", "sEccwbJKYE");
        setField(term2103, term2103.getClass(), "data", term2128);
        setIntField(term2103, term2103.getClass(), "minStartIndex", -1498296052);
        setIntField(term2103, term2103.getClass(), "maxStartIndex", 2098647989);
        setIntField(term2103, term2103.getClass(), "minMiddleIndex", 1598895173);
        setIntField(term2103, term2103.getClass(), "maxMiddleIndex", 1830648570);
        setIntField(term2103, term2103.getClass(), "minEndIndex", -227365013);
        setIntField(term2103, term2103.getClass(), "maxEndIndex", 11724947);
        setField(term2103, term2103.getClass(), "key", null);
        setField(term2103, term2103.getClass(), "description", "AWRooQKkdW");
        setField(term2150, term2150.getClass(), "listenerList", term2151);
        setField(term2103, term2103.getClass(), "listeners", term2150);
        setField(term2153, term2153.getClass(), "map", null);
        setField(term2152, term2152.getClass(), "map", term2153);
        setField(term2152, term2152.getClass(), "source", term2154);
        setField(term2103, term2103.getClass(), "propertyChangeSupport", term2152);
        setBooleanField(term2103, term2103.getClass(), "notify", true);
        ArrayList term7968 = new ArrayList();
        term7963 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term7972 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7973 = (Object[]) newArray("java.lang.Object", 0);
        Object term7974 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7975 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7976 = newInstance(Class.forName("java.lang.Object"));
        setField(term7963, term7963.getClass(), "domain", "SPpkrGcPRr");
        setField(term7963, term7963.getClass(), "range", "sEccwbJKYE");
        setField(term7963, term7963.getClass(), "data", term7968);
        setIntField(term7963, term7963.getClass(), "minStartIndex", -1498296052);
        setIntField(term7963, term7963.getClass(), "maxStartIndex", 2098647989);
        setIntField(term7963, term7963.getClass(), "minMiddleIndex", 1598895173);
        setIntField(term7963, term7963.getClass(), "maxMiddleIndex", 1830648570);
        setIntField(term7963, term7963.getClass(), "minEndIndex", -227365013);
        setIntField(term7963, term7963.getClass(), "maxEndIndex", 11724947);
        setField(term7963, term7963.getClass(), "key", null);
        setField(term7963, term7963.getClass(), "description", "AWRooQKkdW");
        setField(term7972, term7972.getClass(), "listenerList", term7973);
        setField(term7963, term7963.getClass(), "listeners", term7972);
        setField(term7975, term7975.getClass(), "map", null);
        setField(term7974, term7974.getClass(), "map", term7975);
        setField(term7974, term7974.getClass(), "source", term7976);
        setField(term7963, term7963.getClass(), "propertyChangeSupport", term7974);
        setBooleanField(term7963, term7963.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxEndIndex", argTypes, term2103, args);
        assertTrue(recursiveEquals(term2103, term7963));
        assertTrue(recursiveEquals(retValue, 11724947));
    }

};



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

public class TimePeriodValues_getMinStartIndex_45532586248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1688;
     Object term7397;

    public TimePeriodValues_getMinStartIndex_45532586248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1713 = new ArrayList();
        term1688 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1735 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1736 = (Object[]) newArray("java.lang.Object", 0);
        Object term1737 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1738 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1739 = newInstance(Class.forName("java.lang.Object"));
        setField(term1688, term1688.getClass(), "domain", "idgaQsnJpQ");
        setField(term1688, term1688.getClass(), "range", "VgZnGoIFwQ");
        setField(term1688, term1688.getClass(), "data", term1713);
        setIntField(term1688, term1688.getClass(), "minStartIndex", 1474524152);
        setIntField(term1688, term1688.getClass(), "maxStartIndex", 568954359);
        setIntField(term1688, term1688.getClass(), "minMiddleIndex", 53410913);
        setIntField(term1688, term1688.getClass(), "maxMiddleIndex", -375014958);
        setIntField(term1688, term1688.getClass(), "minEndIndex", 1107176718);
        setIntField(term1688, term1688.getClass(), "maxEndIndex", 480137250);
        setField(term1688, term1688.getClass(), "key", null);
        setField(term1688, term1688.getClass(), "description", "jUbSRrkrYZ");
        setField(term1735, term1735.getClass(), "listenerList", term1736);
        setField(term1688, term1688.getClass(), "listeners", term1735);
        setField(term1738, term1738.getClass(), "map", null);
        setField(term1737, term1737.getClass(), "map", term1738);
        setField(term1737, term1737.getClass(), "source", term1739);
        setField(term1688, term1688.getClass(), "propertyChangeSupport", term1737);
        setBooleanField(term1688, term1688.getClass(), "notify", false);
        ArrayList term7402 = new ArrayList();
        term7397 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term7406 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7407 = (Object[]) newArray("java.lang.Object", 0);
        Object term7408 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7409 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7410 = newInstance(Class.forName("java.lang.Object"));
        setField(term7397, term7397.getClass(), "domain", "idgaQsnJpQ");
        setField(term7397, term7397.getClass(), "range", "VgZnGoIFwQ");
        setField(term7397, term7397.getClass(), "data", term7402);
        setIntField(term7397, term7397.getClass(), "minStartIndex", 1474524152);
        setIntField(term7397, term7397.getClass(), "maxStartIndex", 568954359);
        setIntField(term7397, term7397.getClass(), "minMiddleIndex", 53410913);
        setIntField(term7397, term7397.getClass(), "maxMiddleIndex", -375014958);
        setIntField(term7397, term7397.getClass(), "minEndIndex", 1107176718);
        setIntField(term7397, term7397.getClass(), "maxEndIndex", 480137250);
        setField(term7397, term7397.getClass(), "key", null);
        setField(term7397, term7397.getClass(), "description", "jUbSRrkrYZ");
        setField(term7406, term7406.getClass(), "listenerList", term7407);
        setField(term7397, term7397.getClass(), "listeners", term7406);
        setField(term7409, term7409.getClass(), "map", null);
        setField(term7408, term7408.getClass(), "map", term7409);
        setField(term7408, term7408.getClass(), "source", term7410);
        setField(term7397, term7397.getClass(), "propertyChangeSupport", term7408);
        setBooleanField(term7397, term7397.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinStartIndex", argTypes, term1688, args);
        assertTrue(recursiveEquals(term1688, term7397));
        assertTrue(recursiveEquals(retValue, 1474524152));
    }

};



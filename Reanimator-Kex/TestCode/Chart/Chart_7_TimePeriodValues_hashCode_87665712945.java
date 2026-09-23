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

public class TimePeriodValues_hashCode_87665712945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1435;
     Object term6688;

    public TimePeriodValues_hashCode_87665712945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1460 = new ArrayList();
        term1435 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1482 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1483 = (Object[]) newArray("java.lang.Object", 0);
        Object term1484 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1485 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1486 = newInstance(Class.forName("java.lang.Object"));
        setField(term1435, term1435.getClass(), "domain", "tPlsykYBqO");
        setField(term1435, term1435.getClass(), "range", "bLPjGVBhlX");
        setField(term1435, term1435.getClass(), "data", term1460);
        setIntField(term1435, term1435.getClass(), "minStartIndex", 1596213415);
        setIntField(term1435, term1435.getClass(), "maxStartIndex", -268815336);
        setIntField(term1435, term1435.getClass(), "minMiddleIndex", -1210583429);
        setIntField(term1435, term1435.getClass(), "maxMiddleIndex", -663691365);
        setIntField(term1435, term1435.getClass(), "minEndIndex", 339854490);
        setIntField(term1435, term1435.getClass(), "maxEndIndex", -615654495);
        setField(term1435, term1435.getClass(), "key", null);
        setField(term1435, term1435.getClass(), "description", "whBvTVIIlC");
        setField(term1482, term1482.getClass(), "listenerList", term1483);
        setField(term1435, term1435.getClass(), "listeners", term1482);
        setField(term1485, term1485.getClass(), "map", null);
        setField(term1484, term1484.getClass(), "map", term1485);
        setField(term1484, term1484.getClass(), "source", term1486);
        setField(term1435, term1435.getClass(), "propertyChangeSupport", term1484);
        setBooleanField(term1435, term1435.getClass(), "notify", true);
        ArrayList term6693 = new ArrayList();
        term6688 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term6697 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6698 = (Object[]) newArray("java.lang.Object", 0);
        Object term6699 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6700 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6701 = newInstance(Class.forName("java.lang.Object"));
        setField(term6688, term6688.getClass(), "domain", "tPlsykYBqO");
        setField(term6688, term6688.getClass(), "range", "bLPjGVBhlX");
        setField(term6688, term6688.getClass(), "data", term6693);
        setIntField(term6688, term6688.getClass(), "minStartIndex", 1596213415);
        setIntField(term6688, term6688.getClass(), "maxStartIndex", -268815336);
        setIntField(term6688, term6688.getClass(), "minMiddleIndex", -1210583429);
        setIntField(term6688, term6688.getClass(), "maxMiddleIndex", -663691365);
        setIntField(term6688, term6688.getClass(), "minEndIndex", 339854490);
        setIntField(term6688, term6688.getClass(), "maxEndIndex", -615654495);
        setField(term6688, term6688.getClass(), "key", null);
        setField(term6688, term6688.getClass(), "description", "whBvTVIIlC");
        setField(term6697, term6697.getClass(), "listenerList", term6698);
        setField(term6688, term6688.getClass(), "listeners", term6697);
        setField(term6700, term6700.getClass(), "map", null);
        setField(term6699, term6699.getClass(), "map", term6700);
        setField(term6699, term6699.getClass(), "source", term6701);
        setField(term6688, term6688.getClass(), "propertyChangeSupport", term6699);
        setBooleanField(term6688, term6688.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term1435, args);
        assertTrue(recursiveEquals(term1435, term6688));
        assertTrue(recursiveEquals(retValue, 31782302));
    }

};



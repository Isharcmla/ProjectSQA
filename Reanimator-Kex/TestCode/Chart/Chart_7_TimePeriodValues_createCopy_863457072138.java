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

public class TimePeriodValues_createCopy_863457072138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28151;
     Object term28647;
     Object term28629;

    public TimePeriodValues_createCopy_863457072138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28241 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term28203 = new ArrayList();
        ((ArrayList) term28203).add(term28241);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        ((ArrayList) term28203).add((Object)null);
        term28151 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term28151, term28151.getClass(), "data", term28203);
        Object term28650 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term28648 = new ArrayList();
        ((ArrayList) term28648).add(term28650);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        ((ArrayList) term28648).add((Object)null);
        term28647 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term28647, term28647.getClass(), "domain", null);
        setField(term28647, term28647.getClass(), "range", null);
        setField(term28647, term28647.getClass(), "data", term28648);
        setIntField(term28647, term28647.getClass(), "minStartIndex", 0);
        setIntField(term28647, term28647.getClass(), "maxStartIndex", 0);
        setIntField(term28647, term28647.getClass(), "minMiddleIndex", 0);
        setIntField(term28647, term28647.getClass(), "maxMiddleIndex", 0);
        setIntField(term28647, term28647.getClass(), "minEndIndex", 0);
        setIntField(term28647, term28647.getClass(), "maxEndIndex", 0);
        setField(term28647, term28647.getClass(), "key", null);
        setField(term28647, term28647.getClass(), "description", null);
        setField(term28647, term28647.getClass(), "listeners", null);
        setField(term28647, term28647.getClass(), "propertyChangeSupport", null);
        setBooleanField(term28647, term28647.getClass(), "notify", false);
        ArrayList term28630 = new ArrayList();
        term28629 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term28640 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term28641 = (Object[]) newArray("java.lang.Object", 0);
        Object term28642 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term28643 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term28629, term28629.getClass(), "domain", null);
        setField(term28629, term28629.getClass(), "range", null);
        setField(term28629, term28629.getClass(), "data", term28630);
        setIntField(term28629, term28629.getClass(), "minStartIndex", 0);
        setIntField(term28629, term28629.getClass(), "maxStartIndex", 0);
        setIntField(term28629, term28629.getClass(), "minMiddleIndex", 0);
        setIntField(term28629, term28629.getClass(), "maxMiddleIndex", 0);
        setIntField(term28629, term28629.getClass(), "minEndIndex", 0);
        setIntField(term28629, term28629.getClass(), "maxEndIndex", 0);
        setField(term28629, term28629.getClass(), "key", null);
        setField(term28629, term28629.getClass(), "description", null);
        setField(term28640, term28640.getClass(), "listenerList", term28641);
        setField(term28629, term28629.getClass(), "listeners", term28640);
        setField(term28643, term28643.getClass(), "map", null);
        setField(term28642, term28642.getClass(), "map", term28643);
        setField(term28642, term28642.getClass(), "source", term28629);
        setField(term28629, term28629.getClass(), "propertyChangeSupport", term28642);
        setBooleanField(term28629, term28629.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -2147483647;
        args[1] = -2147483648;
        Object retValue = callMethod(klass, "createCopy", argTypes, term28151, args);
        assertTrue(recursiveEquals(term28151, term28647));
        assertTrue(recursiveEquals(retValue, term28629));
    }

};



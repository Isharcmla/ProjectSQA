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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimePeriodValues_getDataItem_86678973334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504;
     Object term557;

    public TimePeriodValues_getDataItem_86678973334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term529 = new ArrayList();
        term504 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term551 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term552 = (Object[]) newArray("java.lang.Object", 0);
        Object term553 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term554 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term555 = newInstance(Class.forName("java.lang.Object"));
        setField(term504, term504.getClass(), "domain", "BYqFIqCKAV");
        setField(term504, term504.getClass(), "range", "vrQLuWIDJX");
        setField(term504, term504.getClass(), "data", term529);
        setIntField(term504, term504.getClass(), "minStartIndex", -203030934);
        setIntField(term504, term504.getClass(), "maxStartIndex", -1179120542);
        setIntField(term504, term504.getClass(), "minMiddleIndex", -73683645);
        setIntField(term504, term504.getClass(), "maxMiddleIndex", -226514366);
        setIntField(term504, term504.getClass(), "minEndIndex", 1193880199);
        setIntField(term504, term504.getClass(), "maxEndIndex", -1087774327);
        setField(term504, term504.getClass(), "key", null);
        setField(term504, term504.getClass(), "description", "flxyYxBRtu");
        setField(term551, term551.getClass(), "listenerList", term552);
        setField(term504, term504.getClass(), "listeners", term551);
        setField(term554, term554.getClass(), "map", null);
        setField(term553, term553.getClass(), "map", term554);
        setField(term553, term553.getClass(), "source", term555);
        setField(term504, term504.getClass(), "propertyChangeSupport", term553);
        setBooleanField(term504, term504.getClass(), "notify", true);
        term557 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term557;
        try {
            callMethod(klass, "getDataItem", argTypes, term504, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};



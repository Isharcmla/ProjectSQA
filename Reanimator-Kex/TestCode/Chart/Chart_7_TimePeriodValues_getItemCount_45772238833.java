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

public class TimePeriodValues_getItemCount_45772238833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;
     Object term3677;

    public TimePeriodValues_getItemCount_45772238833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term446 = new ArrayList();
        term421 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term468 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term469 = (Object[]) newArray("java.lang.Object", 0);
        Object term470 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term471 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term472 = newInstance(Class.forName("java.lang.Object"));
        setField(term421, term421.getClass(), "domain", "hNxWaHcfhY");
        setField(term421, term421.getClass(), "range", "RkybSrpybU");
        setField(term421, term421.getClass(), "data", term446);
        setIntField(term421, term421.getClass(), "minStartIndex", -1007160944);
        setIntField(term421, term421.getClass(), "maxStartIndex", 1135664017);
        setIntField(term421, term421.getClass(), "minMiddleIndex", 590364439);
        setIntField(term421, term421.getClass(), "maxMiddleIndex", 865208305);
        setIntField(term421, term421.getClass(), "minEndIndex", -1275173084);
        setIntField(term421, term421.getClass(), "maxEndIndex", -244121226);
        setField(term421, term421.getClass(), "key", null);
        setField(term421, term421.getClass(), "description", "xOEqzGAmDU");
        setField(term468, term468.getClass(), "listenerList", term469);
        setField(term421, term421.getClass(), "listeners", term468);
        setField(term471, term471.getClass(), "map", null);
        setField(term470, term470.getClass(), "map", term471);
        setField(term470, term470.getClass(), "source", term472);
        setField(term421, term421.getClass(), "propertyChangeSupport", term470);
        setBooleanField(term421, term421.getClass(), "notify", true);
        ArrayList term3682 = new ArrayList();
        term3677 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term3686 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3687 = (Object[]) newArray("java.lang.Object", 0);
        Object term3688 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3689 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3690 = newInstance(Class.forName("java.lang.Object"));
        setField(term3677, term3677.getClass(), "domain", "hNxWaHcfhY");
        setField(term3677, term3677.getClass(), "range", "RkybSrpybU");
        setField(term3677, term3677.getClass(), "data", term3682);
        setIntField(term3677, term3677.getClass(), "minStartIndex", -1007160944);
        setIntField(term3677, term3677.getClass(), "maxStartIndex", 1135664017);
        setIntField(term3677, term3677.getClass(), "minMiddleIndex", 590364439);
        setIntField(term3677, term3677.getClass(), "maxMiddleIndex", 865208305);
        setIntField(term3677, term3677.getClass(), "minEndIndex", -1275173084);
        setIntField(term3677, term3677.getClass(), "maxEndIndex", -244121226);
        setField(term3677, term3677.getClass(), "key", null);
        setField(term3677, term3677.getClass(), "description", "xOEqzGAmDU");
        setField(term3686, term3686.getClass(), "listenerList", term3687);
        setField(term3677, term3677.getClass(), "listeners", term3686);
        setField(term3689, term3689.getClass(), "map", null);
        setField(term3688, term3688.getClass(), "map", term3689);
        setField(term3688, term3688.getClass(), "source", term3690);
        setField(term3677, term3677.getClass(), "propertyChangeSupport", term3688);
        setBooleanField(term3677, term3677.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItemCount", argTypes, term421, args);
        assertTrue(recursiveEquals(term421, term3677));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



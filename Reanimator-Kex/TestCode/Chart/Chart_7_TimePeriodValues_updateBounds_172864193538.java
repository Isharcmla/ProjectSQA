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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimePeriodValues_updateBounds_172864193538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843;
     Object term896;

    public TimePeriodValues_updateBounds_172864193538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term868 = new ArrayList();
        term843 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term890 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term891 = (Object[]) newArray("java.lang.Object", 0);
        Object term892 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term893 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term894 = newInstance(Class.forName("java.lang.Object"));
        setField(term843, term843.getClass(), "domain", "wSQxaModmm");
        setField(term843, term843.getClass(), "range", "UlajhuVLaP");
        setField(term843, term843.getClass(), "data", term868);
        setIntField(term843, term843.getClass(), "minStartIndex", -184153539);
        setIntField(term843, term843.getClass(), "maxStartIndex", 493620644);
        setIntField(term843, term843.getClass(), "minMiddleIndex", 1328271830);
        setIntField(term843, term843.getClass(), "maxMiddleIndex", 1596070772);
        setIntField(term843, term843.getClass(), "minEndIndex", 97029295);
        setIntField(term843, term843.getClass(), "maxEndIndex", -1371869594);
        setField(term843, term843.getClass(), "key", null);
        setField(term843, term843.getClass(), "description", "gGSMzuGICf");
        setField(term890, term890.getClass(), "listenerList", term891);
        setField(term843, term843.getClass(), "listeners", term890);
        setField(term893, term893.getClass(), "map", null);
        setField(term892, term892.getClass(), "map", term893);
        setField(term892, term892.getClass(), "source", term894);
        setField(term843, term843.getClass(), "propertyChangeSupport", term892);
        setBooleanField(term843, term843.getClass(), "notify", true);
        term896 = new Integer(-2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term896;
        try {
            callMethod(klass, "updateBounds", argTypes, term843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



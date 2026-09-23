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
import java.lang.IllegalArgumentException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimePeriodValues_add_149955377141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1096;

    public TimePeriodValues_add_149955377141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1121 = new ArrayList();
        term1096 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1143 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1144 = (Object[]) newArray("java.lang.Object", 0);
        Object term1145 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1146 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1147 = newInstance(Class.forName("java.lang.Object"));
        setField(term1096, term1096.getClass(), "domain", "UoYtihxVaS");
        setField(term1096, term1096.getClass(), "range", "JDswTTCZHV");
        setField(term1096, term1096.getClass(), "data", term1121);
        setIntField(term1096, term1096.getClass(), "minStartIndex", -2027534003);
        setIntField(term1096, term1096.getClass(), "maxStartIndex", 1063420942);
        setIntField(term1096, term1096.getClass(), "minMiddleIndex", 1375330971);
        setIntField(term1096, term1096.getClass(), "maxMiddleIndex", -478195677);
        setIntField(term1096, term1096.getClass(), "minEndIndex", 972867650);
        setIntField(term1096, term1096.getClass(), "maxEndIndex", 1655935355);
        setField(term1096, term1096.getClass(), "key", null);
        setField(term1096, term1096.getClass(), "description", "onpbIeEKoi");
        setField(term1143, term1143.getClass(), "listenerList", term1144);
        setField(term1096, term1096.getClass(), "listeners", term1143);
        setField(term1146, term1146.getClass(), "map", null);
        setField(term1145, term1145.getClass(), "map", term1146);
        setField(term1145, term1145.getClass(), "source", term1147);
        setField(term1096, term1096.getClass(), "propertyChangeSupport", term1145);
        setBooleanField(term1096, term1096.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "add", argTypes, term1096, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class TimePeriodValues_setRangeDescription_169703884832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;
     Object term3527;

    public TimePeriodValues_setRangeDescription_169703884832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term341 = new ArrayList();
        term316 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term363 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term364 = (Object[]) newArray("java.lang.Object", 0);
        Object term365 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term366 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term367 = newInstance(Class.forName("java.lang.Object"));
        setField(term316, term316.getClass(), "domain", "aJlieCFVtF");
        setField(term316, term316.getClass(), "range", "ZiaGIbnzTs");
        setField(term316, term316.getClass(), "data", term341);
        setIntField(term316, term316.getClass(), "minStartIndex", 1622346318);
        setIntField(term316, term316.getClass(), "maxStartIndex", 1048535127);
        setIntField(term316, term316.getClass(), "minMiddleIndex", -655067527);
        setIntField(term316, term316.getClass(), "maxMiddleIndex", -6029667);
        setIntField(term316, term316.getClass(), "minEndIndex", -2068769794);
        setIntField(term316, term316.getClass(), "maxEndIndex", -117576464);
        setField(term316, term316.getClass(), "key", null);
        setField(term316, term316.getClass(), "description", "tbcdzjIfER");
        setField(term363, term363.getClass(), "listenerList", term364);
        setField(term316, term316.getClass(), "listeners", term363);
        setField(term366, term366.getClass(), "map", null);
        setField(term365, term365.getClass(), "map", term366);
        setField(term365, term365.getClass(), "source", term367);
        setField(term316, term316.getClass(), "propertyChangeSupport", term365);
        setBooleanField(term316, term316.getClass(), "notify", false);
        ArrayList term3532 = new ArrayList();
        term3527 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term3536 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3537 = (Object[]) newArray("java.lang.Object", 0);
        Object term3538 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3539 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3540 = newInstance(Class.forName("java.lang.Object"));
        setField(term3527, term3527.getClass(), "domain", "aJlieCFVtF");
        setField(term3527, term3527.getClass(), "range", "pCTimMblYc");
        setField(term3527, term3527.getClass(), "data", term3532);
        setIntField(term3527, term3527.getClass(), "minStartIndex", 1622346318);
        setIntField(term3527, term3527.getClass(), "maxStartIndex", 1048535127);
        setIntField(term3527, term3527.getClass(), "minMiddleIndex", -655067527);
        setIntField(term3527, term3527.getClass(), "maxMiddleIndex", -6029667);
        setIntField(term3527, term3527.getClass(), "minEndIndex", -2068769794);
        setIntField(term3527, term3527.getClass(), "maxEndIndex", -117576464);
        setField(term3527, term3527.getClass(), "key", null);
        setField(term3527, term3527.getClass(), "description", "tbcdzjIfER");
        setField(term3536, term3536.getClass(), "listenerList", term3537);
        setField(term3527, term3527.getClass(), "listeners", term3536);
        setField(term3539, term3539.getClass(), "map", null);
        setField(term3538, term3538.getClass(), "map", term3539);
        setField(term3538, term3538.getClass(), "source", term3540);
        setField(term3527, term3527.getClass(), "propertyChangeSupport", term3538);
        setBooleanField(term3527, term3527.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "setRangeDescription", argTypes, term316, args);
        assertTrue(recursiveEquals(term316, term3527));
    }

};



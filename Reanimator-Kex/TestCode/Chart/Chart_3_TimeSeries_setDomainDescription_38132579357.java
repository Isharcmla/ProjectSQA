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

public class TimeSeries_setDomainDescription_38132579357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term5536;

    public TimeSeries_setDomainDescription_38132579357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term151 = new ArrayList();
        term126 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term171 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term172 = (Object[]) newArray("java.lang.Object", 0);
        Object term173 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term174 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term175 = newInstance(Class.forName("java.lang.Object"));
        setField(term126, term126.getClass(), "domain", "SzjVpOQTyS");
        setField(term126, term126.getClass(), "range", "MjGYSRKTNF");
        setField(term126, term126.getClass(), "timePeriodClass", null);
        setField(term126, term126.getClass(), "data", term151);
        setIntField(term126, term126.getClass(), "maximumItemCount", 1162663216);
        setLongField(term126, term126.getClass(), "maximumItemAge", 6375119433582206027L);
        setDoubleField(term126, term126.getClass(), "minY", 0.5523635872663106);
        setDoubleField(term126, term126.getClass(), "maxY", 0.544608645520025);
        setField(term126, term126.getClass(), "key", null);
        setField(term126, term126.getClass(), "description", "hRNSzYYIrc");
        setField(term171, term171.getClass(), "listenerList", term172);
        setField(term126, term126.getClass(), "listeners", term171);
        setField(term174, term174.getClass(), "map", null);
        setField(term173, term173.getClass(), "map", term174);
        setField(term173, term173.getClass(), "source", term175);
        setField(term126, term126.getClass(), "propertyChangeSupport", term173);
        setBooleanField(term126, term126.getClass(), "notify", false);
        ArrayList term5541 = new ArrayList();
        term5536 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5545 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5546 = (Object[]) newArray("java.lang.Object", 0);
        Object term5547 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5548 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5549 = newInstance(Class.forName("java.lang.Object"));
        setField(term5536, term5536.getClass(), "domain", "NRdvgJlhkX");
        setField(term5536, term5536.getClass(), "range", "MjGYSRKTNF");
        setField(term5536, term5536.getClass(), "timePeriodClass", null);
        setField(term5536, term5536.getClass(), "data", term5541);
        setIntField(term5536, term5536.getClass(), "maximumItemCount", 1162663216);
        setLongField(term5536, term5536.getClass(), "maximumItemAge", 6375119433582206027L);
        setDoubleField(term5536, term5536.getClass(), "minY", 0.5523635872663106);
        setDoubleField(term5536, term5536.getClass(), "maxY", 0.544608645520025);
        setField(term5536, term5536.getClass(), "key", null);
        setField(term5536, term5536.getClass(), "description", "hRNSzYYIrc");
        setField(term5545, term5545.getClass(), "listenerList", term5546);
        setField(term5536, term5536.getClass(), "listeners", term5545);
        setField(term5548, term5548.getClass(), "map", null);
        setField(term5547, term5547.getClass(), "map", term5548);
        setField(term5547, term5547.getClass(), "source", term5549);
        setField(term5536, term5536.getClass(), "propertyChangeSupport", term5547);
        setBooleanField(term5536, term5536.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "setDomainDescription", argTypes, term126, args);
        assertTrue(recursiveEquals(term126, term5536));
    }

};



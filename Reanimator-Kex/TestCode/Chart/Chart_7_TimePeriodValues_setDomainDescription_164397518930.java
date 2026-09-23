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

public class TimePeriodValues_setDomainDescription_164397518930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;
     Object term3198;

    public TimePeriodValues_setDomainDescription_164397518930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term153 = new ArrayList();
        term128 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term175 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term176 = (Object[]) newArray("java.lang.Object", 0);
        Object term177 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term178 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term179 = newInstance(Class.forName("java.lang.Object"));
        setField(term128, term128.getClass(), "domain", "SzjVpOQTyS");
        setField(term128, term128.getClass(), "range", "MjGYSRKTNF");
        setField(term128, term128.getClass(), "data", term153);
        setIntField(term128, term128.getClass(), "minStartIndex", -1955890973);
        setIntField(term128, term128.getClass(), "maxStartIndex", -2038273078);
        setIntField(term128, term128.getClass(), "minMiddleIndex", 1227103734);
        setIntField(term128, term128.getClass(), "maxMiddleIndex", -1339778481);
        setIntField(term128, term128.getClass(), "minEndIndex", 1725571209);
        setIntField(term128, term128.getClass(), "maxEndIndex", -522618178);
        setField(term128, term128.getClass(), "key", null);
        setField(term128, term128.getClass(), "description", "hRNSzYYIrc");
        setField(term175, term175.getClass(), "listenerList", term176);
        setField(term128, term128.getClass(), "listeners", term175);
        setField(term178, term178.getClass(), "map", null);
        setField(term177, term177.getClass(), "map", term178);
        setField(term177, term177.getClass(), "source", term179);
        setField(term128, term128.getClass(), "propertyChangeSupport", term177);
        setBooleanField(term128, term128.getClass(), "notify", false);
        ArrayList term3203 = new ArrayList();
        term3198 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term3207 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3208 = (Object[]) newArray("java.lang.Object", 0);
        Object term3209 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3210 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3211 = newInstance(Class.forName("java.lang.Object"));
        setField(term3198, term3198.getClass(), "domain", "NRdvgJlhkX");
        setField(term3198, term3198.getClass(), "range", "MjGYSRKTNF");
        setField(term3198, term3198.getClass(), "data", term3203);
        setIntField(term3198, term3198.getClass(), "minStartIndex", -1955890973);
        setIntField(term3198, term3198.getClass(), "maxStartIndex", -2038273078);
        setIntField(term3198, term3198.getClass(), "minMiddleIndex", 1227103734);
        setIntField(term3198, term3198.getClass(), "maxMiddleIndex", -1339778481);
        setIntField(term3198, term3198.getClass(), "minEndIndex", 1725571209);
        setIntField(term3198, term3198.getClass(), "maxEndIndex", -522618178);
        setField(term3198, term3198.getClass(), "key", null);
        setField(term3198, term3198.getClass(), "description", "hRNSzYYIrc");
        setField(term3207, term3207.getClass(), "listenerList", term3208);
        setField(term3198, term3198.getClass(), "listeners", term3207);
        setField(term3210, term3210.getClass(), "map", null);
        setField(term3209, term3209.getClass(), "map", term3210);
        setField(term3209, term3209.getClass(), "source", term3211);
        setField(term3198, term3198.getClass(), "propertyChangeSupport", term3209);
        setBooleanField(term3198, term3198.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "setDomainDescription", argTypes, term128, args);
        assertTrue(recursiveEquals(term128, term3198));
    }

};



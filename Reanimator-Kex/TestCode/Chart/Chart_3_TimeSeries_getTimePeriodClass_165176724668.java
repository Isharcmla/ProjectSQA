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

public class TimeSeries_getTimePeriodClass_165176724668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;
     Object term7202;

    public TimeSeries_getTimePeriodClass_165176724668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1090 = new ArrayList();
        term1065 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1110 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1111 = (Object[]) newArray("java.lang.Object", 0);
        Object term1112 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1113 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1114 = newInstance(Class.forName("java.lang.Object"));
        setField(term1065, term1065.getClass(), "domain", "UoYtihxVaS");
        setField(term1065, term1065.getClass(), "range", "JDswTTCZHV");
        setField(term1065, term1065.getClass(), "timePeriodClass", null);
        setField(term1065, term1065.getClass(), "data", term1090);
        setIntField(term1065, term1065.getClass(), "maximumItemCount", -883034806);
        setLongField(term1065, term1065.getClass(), "maximumItemAge", 2535595959091595249L);
        setDoubleField(term1065, term1065.getClass(), "minY", 0.13481025392611334);
        setDoubleField(term1065, term1065.getClass(), "maxY", 0.3800088629986428);
        setField(term1065, term1065.getClass(), "key", null);
        setField(term1065, term1065.getClass(), "description", "onpbIeEKoi");
        setField(term1110, term1110.getClass(), "listenerList", term1111);
        setField(term1065, term1065.getClass(), "listeners", term1110);
        setField(term1113, term1113.getClass(), "map", null);
        setField(term1112, term1112.getClass(), "map", term1113);
        setField(term1112, term1112.getClass(), "source", term1114);
        setField(term1065, term1065.getClass(), "propertyChangeSupport", term1112);
        setBooleanField(term1065, term1065.getClass(), "notify", false);
        ArrayList term7207 = new ArrayList();
        term7202 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term7211 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7212 = (Object[]) newArray("java.lang.Object", 0);
        Object term7213 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7214 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7215 = newInstance(Class.forName("java.lang.Object"));
        setField(term7202, term7202.getClass(), "domain", "UoYtihxVaS");
        setField(term7202, term7202.getClass(), "range", "JDswTTCZHV");
        setField(term7202, term7202.getClass(), "timePeriodClass", null);
        setField(term7202, term7202.getClass(), "data", term7207);
        setIntField(term7202, term7202.getClass(), "maximumItemCount", -883034806);
        setLongField(term7202, term7202.getClass(), "maximumItemAge", 2535595959091595249L);
        setDoubleField(term7202, term7202.getClass(), "minY", 0.13481025392611334);
        setDoubleField(term7202, term7202.getClass(), "maxY", 0.3800088629986428);
        setField(term7202, term7202.getClass(), "key", null);
        setField(term7202, term7202.getClass(), "description", "onpbIeEKoi");
        setField(term7211, term7211.getClass(), "listenerList", term7212);
        setField(term7202, term7202.getClass(), "listeners", term7211);
        setField(term7214, term7214.getClass(), "map", null);
        setField(term7213, term7213.getClass(), "map", term7214);
        setField(term7213, term7213.getClass(), "source", term7215);
        setField(term7202, term7202.getClass(), "propertyChangeSupport", term7213);
        setBooleanField(term7202, term7202.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTimePeriodClass", argTypes, term1065, args);
        assertTrue(recursiveEquals(term1065, term7202));
        assertTrue(recursiveEquals(retValue, null));
    }

};



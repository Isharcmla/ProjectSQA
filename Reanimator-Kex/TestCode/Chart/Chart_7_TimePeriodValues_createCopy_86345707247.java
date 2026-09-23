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
import java.lang.Integer;

public class TimePeriodValues_createCopy_86345707247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1601;
     Object term1654;
     Object term1656;
     Object term7239;
     Object term7185;

    public TimePeriodValues_createCopy_86345707247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1626 = new ArrayList();
        term1601 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1648 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1649 = (Object[]) newArray("java.lang.Object", 0);
        Object term1650 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1651 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1652 = newInstance(Class.forName("java.lang.Object"));
        setField(term1601, term1601.getClass(), "domain", "oVgzLbrsFr");
        setField(term1601, term1601.getClass(), "range", "vQVyKLdtaz");
        setField(term1601, term1601.getClass(), "data", term1626);
        setIntField(term1601, term1601.getClass(), "minStartIndex", 691577392);
        setIntField(term1601, term1601.getClass(), "maxStartIndex", -893623680);
        setIntField(term1601, term1601.getClass(), "minMiddleIndex", -1963434938);
        setIntField(term1601, term1601.getClass(), "maxMiddleIndex", 906181092);
        setIntField(term1601, term1601.getClass(), "minEndIndex", 1045657203);
        setIntField(term1601, term1601.getClass(), "maxEndIndex", 1386130016);
        setField(term1601, term1601.getClass(), "key", null);
        setField(term1601, term1601.getClass(), "description", "OWKQODBLzb");
        setField(term1648, term1648.getClass(), "listenerList", term1649);
        setField(term1601, term1601.getClass(), "listeners", term1648);
        setField(term1651, term1651.getClass(), "map", null);
        setField(term1650, term1650.getClass(), "map", term1651);
        setField(term1650, term1650.getClass(), "source", term1652);
        setField(term1601, term1601.getClass(), "propertyChangeSupport", term1650);
        setBooleanField(term1601, term1601.getClass(), "notify", false);
        term1654 = new Integer(1072005683);
        term1656 = new Integer(1861318859);
        ArrayList term7244 = new ArrayList();
        term7239 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term7248 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7249 = (Object[]) newArray("java.lang.Object", 0);
        Object term7250 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7251 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7252 = newInstance(Class.forName("java.lang.Object"));
        setField(term7239, term7239.getClass(), "domain", "oVgzLbrsFr");
        setField(term7239, term7239.getClass(), "range", "vQVyKLdtaz");
        setField(term7239, term7239.getClass(), "data", term7244);
        setIntField(term7239, term7239.getClass(), "minStartIndex", 691577392);
        setIntField(term7239, term7239.getClass(), "maxStartIndex", -893623680);
        setIntField(term7239, term7239.getClass(), "minMiddleIndex", -1963434938);
        setIntField(term7239, term7239.getClass(), "maxMiddleIndex", 906181092);
        setIntField(term7239, term7239.getClass(), "minEndIndex", 1045657203);
        setIntField(term7239, term7239.getClass(), "maxEndIndex", 1386130016);
        setField(term7239, term7239.getClass(), "key", null);
        setField(term7239, term7239.getClass(), "description", "OWKQODBLzb");
        setField(term7248, term7248.getClass(), "listenerList", term7249);
        setField(term7239, term7239.getClass(), "listeners", term7248);
        setField(term7251, term7251.getClass(), "map", null);
        setField(term7250, term7250.getClass(), "map", term7251);
        setField(term7250, term7250.getClass(), "source", term7252);
        setField(term7239, term7239.getClass(), "propertyChangeSupport", term7250);
        setBooleanField(term7239, term7239.getClass(), "notify", false);
        ArrayList term7210 = new ArrayList();
        term7185 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term7232 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7233 = (Object[]) newArray("java.lang.Object", 0);
        Object term7234 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7235 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term7185, term7185.getClass(), "domain", "oVgzLbrsFr");
        setField(term7185, term7185.getClass(), "range", "vQVyKLdtaz");
        setField(term7185, term7185.getClass(), "data", term7210);
        setIntField(term7185, term7185.getClass(), "minStartIndex", 691577392);
        setIntField(term7185, term7185.getClass(), "maxStartIndex", -893623680);
        setIntField(term7185, term7185.getClass(), "minMiddleIndex", -1963434938);
        setIntField(term7185, term7185.getClass(), "maxMiddleIndex", 906181092);
        setIntField(term7185, term7185.getClass(), "minEndIndex", 1045657203);
        setIntField(term7185, term7185.getClass(), "maxEndIndex", 1386130016);
        setField(term7185, term7185.getClass(), "key", null);
        setField(term7185, term7185.getClass(), "description", "OWKQODBLzb");
        setField(term7232, term7232.getClass(), "listenerList", term7233);
        setField(term7185, term7185.getClass(), "listeners", term7232);
        setField(term7235, term7235.getClass(), "map", null);
        setField(term7234, term7234.getClass(), "map", term7235);
        setField(term7234, term7234.getClass(), "source", term7185);
        setField(term7185, term7185.getClass(), "propertyChangeSupport", term7234);
        setBooleanField(term7185, term7185.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1654;
        args[1] = term1656;
        Object retValue = callMethod(klass, "createCopy", argTypes, term1601, args);
        assertTrue(recursiveEquals(term1601, term7239));
        assertTrue(recursiveEquals(term1654, 1072005683));
        assertTrue(recursiveEquals(term1656, 1861318859));
        assertTrue(recursiveEquals(retValue, term7185));
    }

};



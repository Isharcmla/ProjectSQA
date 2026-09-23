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
import java.lang.Double;

public class TimeSeries_maxIgnoreNaN_828545456107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4443;
     Object term4494;
     Object term4496;
     Object term17954;

    public TimeSeries_maxIgnoreNaN_828545456107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4468 = new ArrayList();
        term4443 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4488 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4489 = (Object[]) newArray("java.lang.Object", 0);
        Object term4490 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4491 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4492 = newInstance(Class.forName("java.lang.Object"));
        setField(term4443, term4443.getClass(), "domain", "zcorEihhLK");
        setField(term4443, term4443.getClass(), "range", "GrqozDKFOk");
        setField(term4443, term4443.getClass(), "timePeriodClass", null);
        setField(term4443, term4443.getClass(), "data", term4468);
        setIntField(term4443, term4443.getClass(), "maximumItemCount", 1324040357);
        setLongField(term4443, term4443.getClass(), "maximumItemAge", -1468719814009985452L);
        setDoubleField(term4443, term4443.getClass(), "minY", 0.9628647861255637);
        setDoubleField(term4443, term4443.getClass(), "maxY", 0.623231822150205);
        setField(term4443, term4443.getClass(), "key", null);
        setField(term4443, term4443.getClass(), "description", "CFyoseFGLF");
        setField(term4488, term4488.getClass(), "listenerList", term4489);
        setField(term4443, term4443.getClass(), "listeners", term4488);
        setField(term4491, term4491.getClass(), "map", null);
        setField(term4490, term4490.getClass(), "map", term4491);
        setField(term4490, term4490.getClass(), "source", term4492);
        setField(term4443, term4443.getClass(), "propertyChangeSupport", term4490);
        setBooleanField(term4443, term4443.getClass(), "notify", false);
        term4494 = new Double(0.09037487793444521);
        term4496 = new Double(0.6561919196821765);
        ArrayList term17959 = new ArrayList();
        term17954 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term17963 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term17964 = (Object[]) newArray("java.lang.Object", 0);
        Object term17965 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term17966 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term17967 = newInstance(Class.forName("java.lang.Object"));
        setField(term17954, term17954.getClass(), "domain", "zcorEihhLK");
        setField(term17954, term17954.getClass(), "range", "GrqozDKFOk");
        setField(term17954, term17954.getClass(), "timePeriodClass", null);
        setField(term17954, term17954.getClass(), "data", term17959);
        setIntField(term17954, term17954.getClass(), "maximumItemCount", 1324040357);
        setLongField(term17954, term17954.getClass(), "maximumItemAge", -1468719814009985452L);
        setDoubleField(term17954, term17954.getClass(), "minY", 0.9628647861255637);
        setDoubleField(term17954, term17954.getClass(), "maxY", 0.623231822150205);
        setField(term17954, term17954.getClass(), "key", null);
        setField(term17954, term17954.getClass(), "description", "CFyoseFGLF");
        setField(term17963, term17963.getClass(), "listenerList", term17964);
        setField(term17954, term17954.getClass(), "listeners", term17963);
        setField(term17966, term17966.getClass(), "map", null);
        setField(term17965, term17965.getClass(), "map", term17966);
        setField(term17965, term17965.getClass(), "source", term17967);
        setField(term17954, term17954.getClass(), "propertyChangeSupport", term17965);
        setBooleanField(term17954, term17954.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term4494;
        args[1] = term4496;
        Object retValue = callMethod(klass, "maxIgnoreNaN", argTypes, term4443, args);
        assertTrue(recursiveEquals(term4443, term17954));
        assertTrue(recursiveEquals(term4494, 0.09037487793444521));
        assertTrue(recursiveEquals(term4496, 0.6561919196821765));
        assertTrue(recursiveEquals(retValue, 0.6561919196821765));
    }

};



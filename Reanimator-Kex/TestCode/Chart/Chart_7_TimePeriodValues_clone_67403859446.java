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

public class TimePeriodValues_clone_67403859446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518;
     Object term6975;
     Object term6923;

    public TimePeriodValues_clone_67403859446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1543 = new ArrayList();
        term1518 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1565 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1566 = (Object[]) newArray("java.lang.Object", 0);
        Object term1567 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1568 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1569 = newInstance(Class.forName("java.lang.Object"));
        setField(term1518, term1518.getClass(), "domain", "JUmudUmaaV");
        setField(term1518, term1518.getClass(), "range", "KoyGrUJeJW");
        setField(term1518, term1518.getClass(), "data", term1543);
        setIntField(term1518, term1518.getClass(), "minStartIndex", -1476117762);
        setIntField(term1518, term1518.getClass(), "maxStartIndex", -341962980);
        setIntField(term1518, term1518.getClass(), "minMiddleIndex", 1532716628);
        setIntField(term1518, term1518.getClass(), "maxMiddleIndex", -1801760683);
        setIntField(term1518, term1518.getClass(), "minEndIndex", 1141317871);
        setIntField(term1518, term1518.getClass(), "maxEndIndex", 890669485);
        setField(term1518, term1518.getClass(), "key", null);
        setField(term1518, term1518.getClass(), "description", "HqBOwkVqjD");
        setField(term1565, term1565.getClass(), "listenerList", term1566);
        setField(term1518, term1518.getClass(), "listeners", term1565);
        setField(term1568, term1568.getClass(), "map", null);
        setField(term1567, term1567.getClass(), "map", term1568);
        setField(term1567, term1567.getClass(), "source", term1569);
        setField(term1518, term1518.getClass(), "propertyChangeSupport", term1567);
        setBooleanField(term1518, term1518.getClass(), "notify", true);
        ArrayList term6980 = new ArrayList();
        term6975 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term6984 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6985 = (Object[]) newArray("java.lang.Object", 0);
        Object term6986 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6987 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6988 = newInstance(Class.forName("java.lang.Object"));
        setField(term6975, term6975.getClass(), "domain", "JUmudUmaaV");
        setField(term6975, term6975.getClass(), "range", "KoyGrUJeJW");
        setField(term6975, term6975.getClass(), "data", term6980);
        setIntField(term6975, term6975.getClass(), "minStartIndex", -1476117762);
        setIntField(term6975, term6975.getClass(), "maxStartIndex", -341962980);
        setIntField(term6975, term6975.getClass(), "minMiddleIndex", 1532716628);
        setIntField(term6975, term6975.getClass(), "maxMiddleIndex", -1801760683);
        setIntField(term6975, term6975.getClass(), "minEndIndex", 1141317871);
        setIntField(term6975, term6975.getClass(), "maxEndIndex", 890669485);
        setField(term6975, term6975.getClass(), "key", null);
        setField(term6975, term6975.getClass(), "description", "HqBOwkVqjD");
        setField(term6984, term6984.getClass(), "listenerList", term6985);
        setField(term6975, term6975.getClass(), "listeners", term6984);
        setField(term6987, term6987.getClass(), "map", null);
        setField(term6986, term6986.getClass(), "map", term6987);
        setField(term6986, term6986.getClass(), "source", term6988);
        setField(term6975, term6975.getClass(), "propertyChangeSupport", term6986);
        setBooleanField(term6975, term6975.getClass(), "notify", true);
        ArrayList term6948 = new ArrayList();
        term6923 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term6970 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6971 = (Object[]) newArray("java.lang.Object", 0);
        Object term6972 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6973 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term6923, term6923.getClass(), "domain", "JUmudUmaaV");
        setField(term6923, term6923.getClass(), "range", "KoyGrUJeJW");
        setField(term6923, term6923.getClass(), "data", term6948);
        setIntField(term6923, term6923.getClass(), "minStartIndex", -1476117762);
        setIntField(term6923, term6923.getClass(), "maxStartIndex", -341962980);
        setIntField(term6923, term6923.getClass(), "minMiddleIndex", 1532716628);
        setIntField(term6923, term6923.getClass(), "maxMiddleIndex", -1801760683);
        setIntField(term6923, term6923.getClass(), "minEndIndex", 1141317871);
        setIntField(term6923, term6923.getClass(), "maxEndIndex", 890669485);
        setField(term6923, term6923.getClass(), "key", null);
        setField(term6923, term6923.getClass(), "description", "HqBOwkVqjD");
        setField(term6970, term6970.getClass(), "listenerList", term6971);
        setField(term6923, term6923.getClass(), "listeners", term6970);
        setField(term6973, term6973.getClass(), "map", null);
        setField(term6972, term6972.getClass(), "map", term6973);
        setField(term6972, term6972.getClass(), "source", term6923);
        setField(term6923, term6923.getClass(), "propertyChangeSupport", term6972);
        setBooleanField(term6923, term6923.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term1518, args);
        assertTrue(recursiveEquals(term1518, term6975));
        assertTrue(recursiveEquals(retValue, term6923));
    }

};



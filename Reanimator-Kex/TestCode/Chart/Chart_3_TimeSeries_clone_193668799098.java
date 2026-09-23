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

public class TimeSeries_clone_193668799098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3701;
     Object term16023;
     Object term15973;

    public TimeSeries_clone_193668799098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3726 = new ArrayList();
        term3701 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3746 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3747 = (Object[]) newArray("java.lang.Object", 0);
        Object term3748 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3749 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3750 = newInstance(Class.forName("java.lang.Object"));
        setField(term3701, term3701.getClass(), "domain", "DyiXbeYIaN");
        setField(term3701, term3701.getClass(), "range", "VGizxZnyHX");
        setField(term3701, term3701.getClass(), "timePeriodClass", null);
        setField(term3701, term3701.getClass(), "data", term3726);
        setIntField(term3701, term3701.getClass(), "maximumItemCount", -1048298087);
        setLongField(term3701, term3701.getClass(), "maximumItemAge", -2170847986967241072L);
        setDoubleField(term3701, term3701.getClass(), "minY", 0.3163771663728089);
        setDoubleField(term3701, term3701.getClass(), "maxY", 0.8819646072665548);
        setField(term3701, term3701.getClass(), "key", null);
        setField(term3701, term3701.getClass(), "description", "kVEZMHmRtR");
        setField(term3746, term3746.getClass(), "listenerList", term3747);
        setField(term3701, term3701.getClass(), "listeners", term3746);
        setField(term3749, term3749.getClass(), "map", null);
        setField(term3748, term3748.getClass(), "map", term3749);
        setField(term3748, term3748.getClass(), "source", term3750);
        setField(term3701, term3701.getClass(), "propertyChangeSupport", term3748);
        setBooleanField(term3701, term3701.getClass(), "notify", false);
        ArrayList term16028 = new ArrayList();
        term16023 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term16032 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term16033 = (Object[]) newArray("java.lang.Object", 0);
        Object term16034 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term16035 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term16036 = newInstance(Class.forName("java.lang.Object"));
        setField(term16023, term16023.getClass(), "domain", "DyiXbeYIaN");
        setField(term16023, term16023.getClass(), "range", "VGizxZnyHX");
        setField(term16023, term16023.getClass(), "timePeriodClass", null);
        setField(term16023, term16023.getClass(), "data", term16028);
        setIntField(term16023, term16023.getClass(), "maximumItemCount", -1048298087);
        setLongField(term16023, term16023.getClass(), "maximumItemAge", -2170847986967241072L);
        setDoubleField(term16023, term16023.getClass(), "minY", 0.3163771663728089);
        setDoubleField(term16023, term16023.getClass(), "maxY", 0.8819646072665548);
        setField(term16023, term16023.getClass(), "key", null);
        setField(term16023, term16023.getClass(), "description", "kVEZMHmRtR");
        setField(term16032, term16032.getClass(), "listenerList", term16033);
        setField(term16023, term16023.getClass(), "listeners", term16032);
        setField(term16035, term16035.getClass(), "map", null);
        setField(term16034, term16034.getClass(), "map", term16035);
        setField(term16034, term16034.getClass(), "source", term16036);
        setField(term16023, term16023.getClass(), "propertyChangeSupport", term16034);
        setBooleanField(term16023, term16023.getClass(), "notify", false);
        ArrayList term15998 = new ArrayList();
        term15973 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term16018 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term16019 = (Object[]) newArray("java.lang.Object", 0);
        Object term16020 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term16021 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term15973, term15973.getClass(), "domain", "DyiXbeYIaN");
        setField(term15973, term15973.getClass(), "range", "VGizxZnyHX");
        setField(term15973, term15973.getClass(), "timePeriodClass", null);
        setField(term15973, term15973.getClass(), "data", term15998);
        setIntField(term15973, term15973.getClass(), "maximumItemCount", -1048298087);
        setLongField(term15973, term15973.getClass(), "maximumItemAge", -2170847986967241072L);
        setDoubleField(term15973, term15973.getClass(), "minY", 0.3163771663728089);
        setDoubleField(term15973, term15973.getClass(), "maxY", 0.8819646072665548);
        setField(term15973, term15973.getClass(), "key", null);
        setField(term15973, term15973.getClass(), "description", "kVEZMHmRtR");
        setField(term16018, term16018.getClass(), "listenerList", term16019);
        setField(term15973, term15973.getClass(), "listeners", term16018);
        setField(term16021, term16021.getClass(), "map", null);
        setField(term16020, term16020.getClass(), "map", term16021);
        setField(term16020, term16020.getClass(), "source", term15973);
        setField(term15973, term15973.getClass(), "propertyChangeSupport", term16020);
        setBooleanField(term15973, term15973.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term3701, args);
        assertTrue(recursiveEquals(term3701, term16023));
        assertTrue(recursiveEquals(retValue, term15973));
    }

};



package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.xy.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_add_139609292243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term251;
     Object term2956;
     Object term2966;

    public XYSeries_add_139609292243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term226 = new ArrayList();
        term225 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term245 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term246 = (Object[]) newArray("java.lang.Object", 0);
        Object term247 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term248 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term249 = newInstance(Class.forName("java.lang.Object"));
        setField(term225, term225.getClass(), "data", term226);
        setIntField(term225, term225.getClass(), "maximumItemCount", -2038273078);
        setBooleanField(term225, term225.getClass(), "autoSort", true);
        setBooleanField(term225, term225.getClass(), "allowDuplicateXValues", true);
        setField(term225, term225.getClass(), "key", null);
        setField(term225, term225.getClass(), "description", "MxlszYVzRf");
        setField(term245, term245.getClass(), "listenerList", term246);
        setField(term225, term225.getClass(), "listeners", term245);
        setField(term248, term248.getClass(), "map", null);
        setField(term247, term247.getClass(), "map", term248);
        setField(term247, term247.getClass(), "source", term249);
        setField(term225, term225.getClass(), "propertyChangeSupport", term247);
        setBooleanField(term225, term225.getClass(), "notify", true);
        term251 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        setField(term251, term251.getClass(), "x", null);
        setField(term251, term251.getClass(), "y", null);
        ArrayList term2957 = new ArrayList();
        term2956 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term2961 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2962 = (Object[]) newArray("java.lang.Object", 0);
        Object term2963 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2964 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2965 = newInstance(Class.forName("java.lang.Object"));
        setField(term2956, term2956.getClass(), "data", term2957);
        setIntField(term2956, term2956.getClass(), "maximumItemCount", -2038273078);
        setBooleanField(term2956, term2956.getClass(), "autoSort", true);
        setBooleanField(term2956, term2956.getClass(), "allowDuplicateXValues", true);
        setField(term2956, term2956.getClass(), "key", null);
        setField(term2956, term2956.getClass(), "description", "MxlszYVzRf");
        setField(term2961, term2961.getClass(), "listenerList", term2962);
        setField(term2956, term2956.getClass(), "listeners", term2961);
        setField(term2964, term2964.getClass(), "map", null);
        setField(term2963, term2963.getClass(), "map", term2964);
        setField(term2963, term2963.getClass(), "source", term2965);
        setField(term2956, term2956.getClass(), "propertyChangeSupport", term2963);
        setBooleanField(term2956, term2956.getClass(), "notify", true);
        term2966 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        setField(term2966, term2966.getClass(), "x", null);
        setField(term2966, term2966.getClass(), "y", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.xy.XYDataItem");
        Object[] args = new Object[1];
        args[0] = term251;
        callMethod(klass, "add", argTypes, term225, args);
        assertTrue(recursiveEquals(term225, term2956));
        assertTrue(recursiveEquals(term251, term2966));
    }

};



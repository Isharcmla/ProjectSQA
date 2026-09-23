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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class XYSeries_createCopy_108514184031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057;
     Object term1083;
     Object term1085;

    public XYSeries_createCopy_108514184031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1058 = new ArrayList();
        term1057 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term1077 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1078 = (Object[]) newArray("java.lang.Object", 0);
        Object term1079 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1080 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1081 = newInstance(Class.forName("java.lang.Object"));
        setField(term1057, term1057.getClass(), "data", term1058);
        setIntField(term1057, term1057.getClass(), "maximumItemCount", -1530420153);
        setBooleanField(term1057, term1057.getClass(), "autoSort", true);
        setBooleanField(term1057, term1057.getClass(), "allowDuplicateXValues", true);
        setField(term1057, term1057.getClass(), "key", null);
        setField(term1057, term1057.getClass(), "description", "ffYhPOzlUs");
        setField(term1077, term1077.getClass(), "listenerList", term1078);
        setField(term1057, term1057.getClass(), "listeners", term1077);
        setField(term1080, term1080.getClass(), "map", null);
        setField(term1079, term1079.getClass(), "map", term1080);
        setField(term1079, term1079.getClass(), "source", term1081);
        setField(term1057, term1057.getClass(), "propertyChangeSupport", term1079);
        setBooleanField(term1057, term1057.getClass(), "notify", true);
        term1083 = new Integer(-469968304);
        term1085 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1083;
        args[1] = term1085;
        callMethod(klass, "createCopy", argTypes, term1057, args);
    }

};



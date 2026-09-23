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

public class XYSeries_clone_81101341830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021;

    public XYSeries_clone_81101341830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1022 = new ArrayList();
        term1021 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term1041 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1042 = (Object[]) newArray("java.lang.Object", 0);
        Object term1043 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1044 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1045 = newInstance(Class.forName("java.lang.Object"));
        setField(term1021, term1021.getClass(), "data", term1022);
        setIntField(term1021, term1021.getClass(), "maximumItemCount", -1087774327);
        setBooleanField(term1021, term1021.getClass(), "autoSort", false);
        setBooleanField(term1021, term1021.getClass(), "allowDuplicateXValues", true);
        setField(term1021, term1021.getClass(), "key", null);
        setField(term1021, term1021.getClass(), "description", "onpbIeEKoi");
        setField(term1041, term1041.getClass(), "listenerList", term1042);
        setField(term1021, term1021.getClass(), "listeners", term1041);
        setField(term1044, term1044.getClass(), "map", null);
        setField(term1043, term1043.getClass(), "map", term1044);
        setField(term1043, term1043.getClass(), "source", term1045);
        setField(term1021, term1021.getClass(), "propertyChangeSupport", term1043);
        setBooleanField(term1021, term1021.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term1021, args);
    }

};



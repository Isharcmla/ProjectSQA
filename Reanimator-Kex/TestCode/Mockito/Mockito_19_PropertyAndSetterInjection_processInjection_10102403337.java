package org.mockito.internal.configuration.injection;

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
import org.mockito.exceptions.base.MockitoException;
import static org.mockito.internal.configuration.injection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PropertyAndSetterInjection_processInjection_10102403337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7;
     Object term135;
     Object term136;

    public PropertyAndSetterInjection_processInjection_10102403337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection"));
        Object term2 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter"));
        Object term3 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter"));
        Object term4 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter"));
        Object term5 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term6 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection$1"));
        setField(term3, term3.getClass(), "next", term4);
        setField(term3, term3.getClass(), "mockUtil", term5);
        setField(term2, term2.getClass(), "next", term3);
        setField(term1, term1.getClass(), "mockCandidateFilter", term2);
        setField(term6, term6.getClass(), "this$0", term1);
        setField(term1, term1.getClass(), "notFinalOrStatic", term6);
        setField(term1, term1.getClass(), "nextStrategy", null);
        Class<? extends Object> term2209 = Class.forName((String) "org.mockito.cglib.proxy.InterfaceMaker");
        term7 = ((Class) term2209).getDeclaredField((String) "SOURCE");
        ((Field) term7).setAccessible(true);
        term135 = newInstance(Class.forName("java.lang.Object"));
        HashMap term137 = new HashMap();
        Set<Object> term2389 =  ((Map) term137).keySet();
        term136 = new HashSet((Collection<? extends Object>) term2389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term7;
        args[1] = term135;
        args[2] = term136;
        try {
            callMethod(klass, "processInjection", argTypes, term1, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};



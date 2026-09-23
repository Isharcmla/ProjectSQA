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
import java.lang.NullPointerException;
import static org.mockito.internal.configuration.injection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PropertyAndSetterInjection_orderedInstanceFieldsFrom_167110525511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776;

    public PropertyAndSetterInjection_orderedInstanceFieldsFrom_167110525511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term776 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection"));
        Object term777 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter"));
        Object term778 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter"));
        Object term779 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter"));
        Object term780 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term781 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection$1"));
        setField(term778, term778.getClass(), "next", term779);
        setField(term778, term778.getClass(), "mockUtil", term780);
        setField(term777, term777.getClass(), "next", term778);
        setField(term776, term776.getClass(), "mockCandidateFilter", term777);
        setField(term781, term781.getClass(), "this$0", term776);
        setField(term776, term776.getClass(), "notFinalOrStatic", term781);
        setField(term776, term776.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "orderedInstanceFieldsFrom", argTypes, term776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



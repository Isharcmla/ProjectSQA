package org.mockito.internal.configuration;

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
import static org.mockito.internal.configuration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class DefaultInjectionEngine_injectMockCandidate_11174174356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term54;
     Object term60;

    public DefaultInjectionEngine_injectMockCandidate_11174174356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine"));
        Object term48 = newInstance(Class.forName("org.mockito.internal.configuration.injection.TypeBasedCandidateFilter"));
        Object term49 = newInstance(Class.forName("org.mockito.internal.configuration.injection.NameBasedCandidateFilter"));
        Object term50 = newInstance(Class.forName("org.mockito.internal.configuration.injection.FinalMockCandidateFilter"));
        Object term51 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term52 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term53 = newInstance(Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine$1"));
        setField(term49, term49.getClass(), "next", term50);
        setField(term51, term51.getClass(), "creationValidator", term52);
        setField(term49, term49.getClass(), "mockUtil", term51);
        setField(term48, term48.getClass(), "next", term49);
        setField(term47, term47.getClass(), "mockCandidateFilter", term48);
        setField(term53, term53.getClass(), "this$0", term47);
        setField(term47, term47.getClass(), "supertypesLast", term53);
        HashMap term55 = new HashMap();
        Set<Object> term319 =  ((Map) term55).keySet();
        term54 = new HashSet((Collection<? extends Object>) term319);
        term60 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term54;
        args[2] = term60;
        try {
            callMethod(klass, "injectMockCandidate", argTypes, term47, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



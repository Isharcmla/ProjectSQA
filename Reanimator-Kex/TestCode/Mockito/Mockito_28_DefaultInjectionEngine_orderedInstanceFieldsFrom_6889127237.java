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

public class DefaultInjectionEngine_orderedInstanceFieldsFrom_6889127237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;

    public DefaultInjectionEngine_orderedInstanceFieldsFrom_6889127237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine"));
        Object term63 = newInstance(Class.forName("org.mockito.internal.configuration.injection.TypeBasedCandidateFilter"));
        Object term64 = newInstance(Class.forName("org.mockito.internal.configuration.injection.NameBasedCandidateFilter"));
        Object term65 = newInstance(Class.forName("org.mockito.internal.configuration.injection.FinalMockCandidateFilter"));
        Object term66 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term67 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term68 = newInstance(Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine$1"));
        setField(term64, term64.getClass(), "next", term65);
        setField(term66, term66.getClass(), "creationValidator", term67);
        setField(term64, term64.getClass(), "mockUtil", term66);
        setField(term63, term63.getClass(), "next", term64);
        setField(term62, term62.getClass(), "mockCandidateFilter", term63);
        setField(term68, term68.getClass(), "this$0", term62);
        setField(term62, term62.getClass(), "supertypesLast", term68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "orderedInstanceFieldsFrom", argTypes, term62, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



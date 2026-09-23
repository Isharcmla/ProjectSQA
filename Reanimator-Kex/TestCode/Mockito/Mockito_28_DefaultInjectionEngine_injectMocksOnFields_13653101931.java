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
import static org.mockito.internal.configuration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class DefaultInjectionEngine_injectMocksOnFields_13653101931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term8;
     Object term14;
     Object term44;

    public DefaultInjectionEngine_injectMocksOnFields_13653101931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine"));
        Object term2 = newInstance(Class.forName("org.mockito.internal.configuration.injection.TypeBasedCandidateFilter"));
        Object term3 = newInstance(Class.forName("org.mockito.internal.configuration.injection.NameBasedCandidateFilter"));
        Object term4 = newInstance(Class.forName("org.mockito.internal.configuration.injection.FinalMockCandidateFilter"));
        Object term5 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term6 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term7 = newInstance(Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine$1"));
        setField(term3, term3.getClass(), "next", term4);
        setField(term5, term5.getClass(), "creationValidator", term6);
        setField(term3, term3.getClass(), "mockUtil", term5);
        setField(term2, term2.getClass(), "next", term3);
        setField(term1, term1.getClass(), "mockCandidateFilter", term2);
        setField(term7, term7.getClass(), "this$0", term1);
        setField(term1, term1.getClass(), "supertypesLast", term7);
        HashMap term9 = new HashMap();
        Set<Object> term45 =  ((Map) term9).keySet();
        term8 = new HashSet((Collection<? extends Object>) term45);
        HashMap term15 = new HashMap();
        Set<Object> term46 =  ((Map) term15).keySet();
        term14 = new HashSet((Collection<? extends Object>) term46);
        term44 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term8;
        args[1] = term14;
        args[2] = term44;
        callMethod(klass, "injectMocksOnFields", argTypes, term1, args);
    }

};



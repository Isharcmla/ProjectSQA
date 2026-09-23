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
import static org.mockito.internal.configuration.injection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;
import java.util.LinkedList;

public class PropertyAndSetterInjection_injectMockCandidatesOnFields_15104990024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757;
     Object term763;
     Object term769;
     Object term770;
     Object term772;

    public PropertyAndSetterInjection_injectMockCandidatesOnFields_15104990024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term757 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection"));
        Object term758 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter"));
        Object term759 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter"));
        Object term760 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter"));
        Object term761 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term762 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection$1"));
        setField(term759, term759.getClass(), "next", term760);
        setField(term759, term759.getClass(), "mockUtil", term761);
        setField(term758, term758.getClass(), "next", term759);
        setField(term757, term757.getClass(), "mockCandidateFilter", term758);
        setField(term762, term762.getClass(), "this$0", term757);
        setField(term757, term757.getClass(), "notFinalOrStatic", term762);
        setField(term757, term757.getClass(), "nextStrategy", null);
        HashMap term764 = new HashMap();
        Set<Object> term775 =  ((Map) term764).keySet();
        term763 = new HashSet((Collection<? extends Object>) term775);
        term769 = newInstance(Class.forName("java.lang.Object"));
        term770 = new Boolean(false);
        term772 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = term763;
        args[1] = term769;
        args[2] = term770;
        args[3] = term772;
        callMethod(klass, "injectMockCandidatesOnFields", argTypes, term757, args);
    }

};



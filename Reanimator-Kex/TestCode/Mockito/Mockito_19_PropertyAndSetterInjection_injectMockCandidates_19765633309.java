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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PropertyAndSetterInjection_injectMockCandidates_19765633309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743;
     Object term749;
     Object term755;

    public PropertyAndSetterInjection_injectMockCandidates_19765633309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term743 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection"));
        Object term744 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter"));
        Object term745 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter"));
        Object term746 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter"));
        Object term747 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term748 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection$1"));
        setField(term745, term745.getClass(), "next", term746);
        setField(term745, term745.getClass(), "mockUtil", term747);
        setField(term744, term744.getClass(), "next", term745);
        setField(term743, term743.getClass(), "mockCandidateFilter", term744);
        setField(term748, term748.getClass(), "this$0", term743);
        setField(term743, term743.getClass(), "notFinalOrStatic", term748);
        setField(term743, term743.getClass(), "nextStrategy", null);
        HashMap term750 = new HashMap();
        Set<Object> term2638 =  ((Map) term750).keySet();
        term749 = new HashSet((Collection<? extends Object>) term2638);
        term755 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term749;
        args[2] = term755;
        try {
            callMethod(klass, "injectMockCandidates", argTypes, term743, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



package org.mockito.internal.creation;

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
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.creation.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class DelegatingMethod_getParameterTypes_78263765615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1664;

    public DelegatingMethod_getParameterTypes_78263765615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5001 = Class.forName((String) "org.assertj.core.internal.cglib.core.NamingPolicy");
        Class<? extends Object> term5252 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term5271 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term5290 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term5339 = Class.forName((String) "org.assertj.core.internal.cglib.core.Predicate");
        Object[] term5340 = (Object[]) newArray("java.lang.Class", 4);
        setElement(term5340, 0, term5252);
        setElement(term5340, 1, term5271);
        setElement(term5340, 2, term5290);
        setElement(term5340, 3, term5339);
        Method term1665 = ((Class) term5001).getDeclaredMethod((String) "getClassName", (Class[]) term5340);
        ((Method) term1665).setAccessible(true);
        term1664 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term1664, term1664.getClass(), "method", term1665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParameterTypes", argTypes, term1664, args);
    }

};



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

public class DelegatingMethod_hashCode_171888060120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988;

    public DelegatingMethod_hashCode_171888060120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7333 = Class.forName((String) "org.mockito.internal.matchers.EqualsWithDelta");
        Class<? extends Object> term7572 = Class.forName((String) "org.hamcrest.Description");
        Object[] term7573 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term7573, 0, term7572);
        Method term3989 = ((Class) term7333).getDeclaredMethod((String) "describeTo", (Class[]) term7573);
        ((Method) term3989).setAccessible(false);
        term3988 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term3988, term3988.getClass(), "method", term3989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3988, args);
        assertTrue(recursiveEquals(retValue, 1));
    }

};



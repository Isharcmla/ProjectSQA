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

public class DelegatingMethod_isVarArgs_148293260017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2661;

    public DelegatingMethod_isVarArgs_148293260017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6512 = Class.forName((String) "org.objectweb.asm.tree.MultiANewArrayInsnNode");
        Class<? extends Object> term6730 = Class.forName((String) "java.util.Map");
        Object[] term6731 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term6731, 0, term6730);
        Method term2662 = ((Class) term6512).getDeclaredMethod((String) "clone", (Class[]) term6731);
        ((Method) term2662).setAccessible(false);
        term2661 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term2661, term2661.getClass(), "method", term2662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isVarArgs", argTypes, term2661, args);
    }

};



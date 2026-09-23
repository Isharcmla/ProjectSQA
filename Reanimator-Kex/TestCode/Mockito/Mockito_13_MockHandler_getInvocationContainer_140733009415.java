package org.mockito.internal;

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
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;

public class MockHandler_getInvocationContainer_140733009415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;

    public MockHandler_getInvocationContainer_140733009415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term334 = new LinkedList();
        ArrayList term338 = new ArrayList();
        LinkedList term344 = new LinkedList();
        term332 = newInstance(Class.forName("org.mockito.internal.MockHandler"));
        Object term333 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        Object term337 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term342 = newInstance(Class.forName("org.mockito.internal.verification.RegisteredInvocations"));
        Object term343 = newInstance(Class.forName("java.util.Collections$SynchronizedList"));
        Object term347 = newInstance(Class.forName("org.mockito.internal.invocation.MatchersBinder"));
        Object term348 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        setField(term333, term333.getClass(), "stubbed", term334);
        setField(term333, term333.getClass(), "mockingProgress", term337);
        setField(term333, term333.getClass(), "answersForStubbing", term338);
        setField(term343, term343.getClass(), "list", term344);
        setField(term343, term343.getClass(), "c", term344);
        setField(term343, term343.getClass(), "mutex", term343);
        setField(term342, term342.getClass(), "invocations", term343);
        setField(term333, term333.getClass(), "registeredInvocations", term342);
        setField(term333, term333.getClass(), "invocationForStubbing", null);
        setField(term332, term332.getClass(), "invocationContainerImpl", term333);
        setField(term332, term332.getClass(), "matchersBinder", term347);
        setField(term332, term332.getClass(), "mockingProgress", term337);
        setField(term348, term348.getClass(), "extraInterfaces", null);
        setField(term348, term348.getClass(), "name", null);
        setField(term348, term348.getClass(), "spiedInstance", null);
        setField(term348, term348.getClass(), "defaultAnswer", null);
        setField(term348, term348.getClass(), "mockName", null);
        setBooleanField(term348, term348.getClass(), "serializable", false);
        setField(term332, term332.getClass(), "mockSettings", term348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInvocationContainer", argTypes, term332, args);
    }

};



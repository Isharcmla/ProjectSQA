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

public class MockHandler_getMockSettings_130168870313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public MockHandler_getMockSettings_130168870313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term295 = new LinkedList();
        ArrayList term299 = new ArrayList();
        LinkedList term305 = new LinkedList();
        term293 = newInstance(Class.forName("org.mockito.internal.MockHandler"));
        Object term294 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        Object term298 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term303 = newInstance(Class.forName("org.mockito.internal.verification.RegisteredInvocations"));
        Object term304 = newInstance(Class.forName("java.util.Collections$SynchronizedList"));
        Object term308 = newInstance(Class.forName("org.mockito.internal.invocation.MatchersBinder"));
        Object term309 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        setField(term294, term294.getClass(), "stubbed", term295);
        setField(term294, term294.getClass(), "mockingProgress", term298);
        setField(term294, term294.getClass(), "answersForStubbing", term299);
        setField(term304, term304.getClass(), "list", term305);
        setField(term304, term304.getClass(), "c", term305);
        setField(term304, term304.getClass(), "mutex", term304);
        setField(term303, term303.getClass(), "invocations", term304);
        setField(term294, term294.getClass(), "registeredInvocations", term303);
        setField(term294, term294.getClass(), "invocationForStubbing", null);
        setField(term293, term293.getClass(), "invocationContainerImpl", term294);
        setField(term293, term293.getClass(), "matchersBinder", term308);
        setField(term293, term293.getClass(), "mockingProgress", term298);
        setField(term309, term309.getClass(), "extraInterfaces", null);
        setField(term309, term309.getClass(), "name", null);
        setField(term309, term309.getClass(), "spiedInstance", null);
        setField(term309, term309.getClass(), "defaultAnswer", null);
        setField(term309, term309.getClass(), "mockName", null);
        setBooleanField(term309, term309.getClass(), "serializable", false);
        setField(term293, term293.getClass(), "mockSettings", term309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMockSettings", argTypes, term293, args);
    }

};



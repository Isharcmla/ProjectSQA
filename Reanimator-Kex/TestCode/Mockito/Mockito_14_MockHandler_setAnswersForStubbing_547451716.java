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
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;

public class MockHandler_setAnswersForStubbing_547451716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311;
     Object term329;

    public MockHandler_setAnswersForStubbing_547451716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term313 = new LinkedList();
        ArrayList term317 = new ArrayList();
        LinkedList term323 = new LinkedList();
        term311 = newInstance(Class.forName("org.mockito.internal.MockHandler"));
        Object term312 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        Object term316 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term321 = newInstance(Class.forName("org.mockito.internal.verification.RegisteredInvocations"));
        Object term322 = newInstance(Class.forName("java.util.Collections$SynchronizedList"));
        Object term326 = newInstance(Class.forName("org.mockito.internal.invocation.MatchersBinder"));
        Object term327 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        setField(term312, term312.getClass(), "stubbed", term313);
        setField(term312, term312.getClass(), "mockingProgress", term316);
        setField(term312, term312.getClass(), "answersForStubbing", term317);
        setField(term322, term322.getClass(), "list", term323);
        setField(term322, term322.getClass(), "c", term323);
        setField(term322, term322.getClass(), "mutex", term322);
        setField(term321, term321.getClass(), "invocations", term322);
        setField(term312, term312.getClass(), "registeredInvocations", term321);
        setField(term312, term312.getClass(), "invocationForStubbing", null);
        setField(term311, term311.getClass(), "invocationContainerImpl", term312);
        setField(term311, term311.getClass(), "matchersBinder", term326);
        setField(term311, term311.getClass(), "mockingProgress", term316);
        setField(term327, term327.getClass(), "extraInterfaces", null);
        setField(term327, term327.getClass(), "name", null);
        setField(term327, term327.getClass(), "spiedInstance", null);
        setField(term327, term327.getClass(), "defaultAnswer", null);
        setField(term327, term327.getClass(), "mockName", null);
        setBooleanField(term327, term327.getClass(), "serializable", false);
        setField(term311, term311.getClass(), "mockSettings", term327);
        term329 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term329;
        callMethod(klass, "setAnswersForStubbing", argTypes, term311, args);
    }

};



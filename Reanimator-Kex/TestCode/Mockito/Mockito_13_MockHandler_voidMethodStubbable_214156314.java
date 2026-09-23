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

public class MockHandler_voidMethodStubbable_214156314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;
     Object term292;

    public MockHandler_voidMethodStubbable_214156314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term276 = new LinkedList();
        ArrayList term280 = new ArrayList();
        LinkedList term286 = new LinkedList();
        term274 = newInstance(Class.forName("org.mockito.internal.MockHandler"));
        Object term275 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        Object term279 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term284 = newInstance(Class.forName("org.mockito.internal.verification.RegisteredInvocations"));
        Object term285 = newInstance(Class.forName("java.util.Collections$SynchronizedList"));
        Object term289 = newInstance(Class.forName("org.mockito.internal.invocation.MatchersBinder"));
        Object term290 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        setField(term275, term275.getClass(), "stubbed", term276);
        setField(term275, term275.getClass(), "mockingProgress", term279);
        setField(term275, term275.getClass(), "answersForStubbing", term280);
        setField(term285, term285.getClass(), "list", term286);
        setField(term285, term285.getClass(), "c", term286);
        setField(term285, term285.getClass(), "mutex", term285);
        setField(term284, term284.getClass(), "invocations", term285);
        setField(term275, term275.getClass(), "registeredInvocations", term284);
        setField(term275, term275.getClass(), "invocationForStubbing", null);
        setField(term274, term274.getClass(), "invocationContainerImpl", term275);
        setField(term274, term274.getClass(), "matchersBinder", term289);
        setField(term274, term274.getClass(), "mockingProgress", term279);
        setField(term290, term290.getClass(), "extraInterfaces", null);
        setField(term290, term290.getClass(), "name", null);
        setField(term290, term290.getClass(), "spiedInstance", null);
        setField(term290, term290.getClass(), "defaultAnswer", null);
        setField(term290, term290.getClass(), "mockName", null);
        setBooleanField(term290, term290.getClass(), "serializable", false);
        setField(term274, term274.getClass(), "mockSettings", term290);
        term292 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term292;
        callMethod(klass, "voidMethodStubbable", argTypes, term274, args);
    }

};



package org.mockito.internal.stubbing.defaultanswers;

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
import static org.mockito.internal.stubbing.defaultanswers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;

public class ReturnsDeepStubs_recordDeepStubMock_192997393014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term49;
     Object term50;

    public ReturnsDeepStubs_recordDeepStubMock_192997393014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term42 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term43 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term44 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term45 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term46 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term47 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term48 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term42, term42.getClass(), "reporter", term43);
        setField(term42, term42.getClass(), "mockUtil", term44);
        setField(term42, term42.getClass(), "mockingProgress", term45);
        setField(term41, term41.getClass(), "mockitoCore", term42);
        setField(term46, term46.getClass(), "methodsGuru", term47);
        setField(term46, term46.getClass(), "mockUtil", term48);
        setField(term41, term41.getClass(), "delegate", term46);
        term49 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term55 = new LinkedList();
        ((LinkedList) term55).add((Object)null);
        ((LinkedList) term55).add((Object)null);
        ((LinkedList) term55).add((Object)null);
        ((LinkedList) term55).add((Object)null);
        ArrayList term58 = new ArrayList();
        ((ArrayList) term58).add((Object)null);
        ((ArrayList) term58).add((Object)null);
        ((ArrayList) term58).add((Object)null);
        Object term54 = newInstance(Class.forName("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        setField(term54, term54.getClass(), "answers", term55);
        setField(term54, term54.getClass(), "usedAt", null);
        setField(term54, term54.getClass(), "invocation", null);
        setField(term54, term54.getClass(), "matchers", term58);
        Object term62 = newInstance(Class.forName("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        setField(term62, term62.getClass(), "answers", null);
        setField(term62, term62.getClass(), "usedAt", null);
        setField(term62, term62.getClass(), "invocation", null);
        setField(term62, term62.getClass(), "matchers", null);
        LinkedList term51 = new LinkedList();
        ((LinkedList) term51).add(term54);
        ((LinkedList) term51).add(term62);
        ((LinkedList) term51).add((Object)null);
        ((LinkedList) term51).add((Object)null);
        ((LinkedList) term51).add((Object)null);
        term50 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        setField(term50, term50.getClass(), "stubbed", term51);
        setField(term50, term50.getClass(), "mockingProgress", null);
        setField(term50, term50.getClass(), "answersForStubbing", null);
        setField(term50, term50.getClass(), "registeredInvocations", null);
        setField(term50, term50.getClass(), "invocationForStubbing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
        Object[] args = new Object[2];
        args[0] = term49;
        args[1] = term50;
        try {
            callMethod(klass, "recordDeepStubMock", argTypes, term41, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



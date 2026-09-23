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

public class ReturnsDeepStubs_recordDeepStubMock_7026490938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term10;

    public ReturnsDeepStubs_recordDeepStubMock_7026490938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term8 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term9 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        setField(term8, term8.getClass(), "methodsGuru", term9);
        setField(term7, term7.getClass(), "delegate", term8);
        LinkedList term15 = new LinkedList();
        ((LinkedList) term15).add((Object)null);
        ((LinkedList) term15).add((Object)null);
        ((LinkedList) term15).add((Object)null);
        ((LinkedList) term15).add((Object)null);
        ArrayList term18 = new ArrayList();
        ((ArrayList) term18).add((Object)null);
        ((ArrayList) term18).add((Object)null);
        ((ArrayList) term18).add((Object)null);
        Object term14 = newInstance(Class.forName("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        setField(term14, term14.getClass(), "answers", term15);
        setField(term14, term14.getClass(), "usedAt", null);
        setField(term14, term14.getClass(), "invocation", null);
        setField(term14, term14.getClass(), "matchers", term18);
        Object term22 = newInstance(Class.forName("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        setField(term22, term22.getClass(), "answers", null);
        setField(term22, term22.getClass(), "usedAt", null);
        setField(term22, term22.getClass(), "invocation", null);
        setField(term22, term22.getClass(), "matchers", null);
        LinkedList term11 = new LinkedList();
        ((LinkedList) term11).add(term14);
        ((LinkedList) term11).add(term22);
        ((LinkedList) term11).add((Object)null);
        ((LinkedList) term11).add((Object)null);
        ((LinkedList) term11).add((Object)null);
        term10 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        setField(term10, term10.getClass(), "stubbed", term11);
        setField(term10, term10.getClass(), "mockingProgress", null);
        setField(term10, term10.getClass(), "answersForStubbing", null);
        setField(term10, term10.getClass(), "registeredInvocations", null);
        setField(term10, term10.getClass(), "invocationForStubbing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.invocation.InvocationOnMock");
        argTypes[1] = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10;
        try {
            callMethod(klass, "recordDeepStubMock", argTypes, term7, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



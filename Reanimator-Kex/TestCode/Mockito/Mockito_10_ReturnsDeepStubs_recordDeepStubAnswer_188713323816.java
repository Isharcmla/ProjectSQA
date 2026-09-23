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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class ReturnsDeepStubs_recordDeepStubAnswer_188713323816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object term7;
     Object term8;

    public ReturnsDeepStubs_recordDeepStubAnswer_188713323816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        term7 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term13 = new LinkedList();
        ((LinkedList) term13).add((Object)null);
        ((LinkedList) term13).add((Object)null);
        ((LinkedList) term13).add((Object)null);
        ((LinkedList) term13).add((Object)null);
        ArrayList term16 = new ArrayList();
        ((ArrayList) term16).add((Object)null);
        ((ArrayList) term16).add((Object)null);
        ((ArrayList) term16).add((Object)null);
        Object term12 = newInstance(Class.forName("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        setField(term12, term12.getClass(), "answers", term13);
        setField(term12, term12.getClass(), "usedAt", null);
        setField(term12, term12.getClass(), "invocation", null);
        setField(term12, term12.getClass(), "matchers", term16);
        Object term20 = newInstance(Class.forName("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        setField(term20, term20.getClass(), "answers", null);
        setField(term20, term20.getClass(), "usedAt", null);
        setField(term20, term20.getClass(), "invocation", null);
        setField(term20, term20.getClass(), "matchers", null);
        LinkedList term9 = new LinkedList();
        ((LinkedList) term9).add(term12);
        ((LinkedList) term9).add(term20);
        ((LinkedList) term9).add((Object)null);
        ((LinkedList) term9).add((Object)null);
        ((LinkedList) term9).add((Object)null);
        term8 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        setField(term8, term8.getClass(), "stubbed", term9);
        setField(term8, term8.getClass(), "mockingProgress", null);
        setField(term8, term8.getClass(), "answersForStubbing", null);
        setField(term8, term8.getClass(), "registeredInvocations", null);
        setField(term8, term8.getClass(), "invocationForStubbing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
        Object[] args = new Object[2];
        args[0] = term7;
        args[1] = term8;
        try {
            callMethod(klass, "recordDeepStubAnswer", argTypes, term6, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



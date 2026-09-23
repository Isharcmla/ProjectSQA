package org.mockito.internal.invocation;

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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.invocation.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_getInvocation_190995928316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;

    public InvocationMatcher_getInvocation_190995928316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term748 = new ArrayList();
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        term633 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term634 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term636 = newInstance(Class.forName("java.lang.Object"));
        Object[] term637 = (Object[]) newArray("java.lang.Object", 9);
        Object term638 = newInstance(Class.forName("java.lang.Object"));
        Object term639 = newInstance(Class.forName("java.lang.Object"));
        Object term640 = newInstance(Class.forName("java.lang.Object"));
        Object term641 = newInstance(Class.forName("java.lang.Object"));
        Object term642 = newInstance(Class.forName("java.lang.Object"));
        Object term643 = newInstance(Class.forName("java.lang.Object"));
        Object term644 = newInstance(Class.forName("java.lang.Object"));
        Object term645 = newInstance(Class.forName("java.lang.Object"));
        Object term646 = newInstance(Class.forName("java.lang.Object"));
        Object[] term647 = (Object[]) newArray("java.lang.Object", 9);
        Object term648 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term747 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term634, term634.getClass(), "sequenceNumber", 391863371);
        setField(term634, term634.getClass(), "mock", term636);
        setField(term634, term634.getClass(), "method", null);
        setElement(term637, 0, term638);
        setElement(term637, 1, term639);
        setElement(term637, 2, term640);
        setElement(term637, 3, term641);
        setElement(term637, 4, term642);
        setElement(term637, 5, term643);
        setElement(term637, 6, term644);
        setElement(term637, 7, term645);
        setElement(term637, 8, term646);
        setField(term634, term634.getClass(), "arguments", term637);
        setElement(term647, 0, term644);
        setElement(term647, 1, term645);
        setElement(term647, 2, term636);
        setElement(term647, 3, term642);
        setElement(term647, 4, term640);
        setElement(term647, 5, term638);
        setElement(term647, 6, term638);
        setElement(term647, 7, term646);
        setElement(term647, 8, term644);
        setField(term634, term634.getClass(), "rawArguments", term647);
        setField(term648, term648.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term634, term634.getClass(), "location", term648);
        setBooleanField(term634, term634.getClass(), "verified", true);
        setBooleanField(term634, term634.getClass(), "verifiedInOrder", true);
        setField(term634, term634.getClass(), "realMethod", null);
        setField(term747, term747.getClass(), "stubbedAt", null);
        setField(term634, term634.getClass(), "stubInfo", term747);
        setField(term633, term633.getClass(), "invocation", term634);
        setField(term633, term633.getClass(), "matchers", term748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInvocation", argTypes, term633, args);
    }

};



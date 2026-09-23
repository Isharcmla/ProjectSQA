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

public class InvocationMatcher_getInvocation_190995928317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;

    public InvocationMatcher_getInvocation_190995928317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term744 = new ArrayList();
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        term630 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term631 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term633 = newInstance(Class.forName("java.lang.Object"));
        Object[] term634 = (Object[]) newArray("java.lang.Object", 9);
        Object term635 = newInstance(Class.forName("java.lang.Object"));
        Object term636 = newInstance(Class.forName("java.lang.Object"));
        Object term637 = newInstance(Class.forName("java.lang.Object"));
        Object term638 = newInstance(Class.forName("java.lang.Object"));
        Object term639 = newInstance(Class.forName("java.lang.Object"));
        Object term640 = newInstance(Class.forName("java.lang.Object"));
        Object term641 = newInstance(Class.forName("java.lang.Object"));
        Object term642 = newInstance(Class.forName("java.lang.Object"));
        Object term643 = newInstance(Class.forName("java.lang.Object"));
        Object[] term644 = (Object[]) newArray("java.lang.Object", 9);
        Object term645 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term743 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term631, term631.getClass(), "sequenceNumber", 391863371);
        setField(term631, term631.getClass(), "mock", term633);
        setField(term631, term631.getClass(), "method", null);
        setElement(term634, 0, term635);
        setElement(term634, 1, term636);
        setElement(term634, 2, term637);
        setElement(term634, 3, term638);
        setElement(term634, 4, term639);
        setElement(term634, 5, term640);
        setElement(term634, 6, term641);
        setElement(term634, 7, term642);
        setElement(term634, 8, term643);
        setField(term631, term631.getClass(), "arguments", term634);
        setElement(term644, 0, term641);
        setElement(term644, 1, term642);
        setElement(term644, 2, term633);
        setElement(term644, 3, term639);
        setElement(term644, 4, term637);
        setElement(term644, 5, term635);
        setElement(term644, 6, term635);
        setElement(term644, 7, term643);
        setElement(term644, 8, term641);
        setField(term631, term631.getClass(), "rawArguments", term644);
        setField(term645, term645.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term631, term631.getClass(), "location", term645);
        setBooleanField(term631, term631.getClass(), "verified", false);
        setField(term631, term631.getClass(), "realMethod", null);
        setField(term743, term743.getClass(), "stubbedAt", null);
        setField(term631, term631.getClass(), "stubInfo", term743);
        setField(term630, term630.getClass(), "invocation", term631);
        setField(term630, term630.getClass(), "matchers", term744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInvocation", argTypes, term630, args);
    }

};



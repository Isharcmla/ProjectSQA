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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class InvocationMatcher_toString_189783926425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2921;
     Object term3038;

    public InvocationMatcher_toString_189783926425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3034 = new ArrayList();
        term2921 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term2922 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2924 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2925 = (Object[]) newArray("java.lang.Object", 8);
        Object term2926 = newInstance(Class.forName("java.lang.Object"));
        Object term2927 = newInstance(Class.forName("java.lang.Object"));
        Object term2928 = newInstance(Class.forName("java.lang.Object"));
        Object term2929 = newInstance(Class.forName("java.lang.Object"));
        Object term2930 = newInstance(Class.forName("java.lang.Object"));
        Object term2931 = newInstance(Class.forName("java.lang.Object"));
        Object term2932 = newInstance(Class.forName("java.lang.Object"));
        Object term2933 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2934 = (Object[]) newArray("java.lang.Object", 0);
        Object term2935 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term3033 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2922, term2922.getClass(), "sequenceNumber", 1585847225);
        setField(term2922, term2922.getClass(), "mock", term2924);
        setField(term2922, term2922.getClass(), "method", null);
        setElement(term2925, 0, term2926);
        setElement(term2925, 1, term2927);
        setElement(term2925, 2, term2928);
        setElement(term2925, 3, term2929);
        setElement(term2925, 4, term2930);
        setElement(term2925, 5, term2931);
        setElement(term2925, 6, term2932);
        setElement(term2925, 7, term2933);
        setField(term2922, term2922.getClass(), "arguments", term2925);
        setField(term2922, term2922.getClass(), "rawArguments", term2934);
        setField(term2935, term2935.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2922, term2922.getClass(), "location", term2935);
        setBooleanField(term2922, term2922.getClass(), "verified", false);
        setField(term2922, term2922.getClass(), "realMethod", null);
        setField(term3033, term3033.getClass(), "stubbedAt", null);
        setField(term2922, term2922.getClass(), "stubInfo", term3033);
        setField(term2921, term2921.getClass(), "invocation", term2922);
        setField(term2921, term2921.getClass(), "matchers", term3034);
        LinkedList term3040 = new LinkedList();
        term3038 = newInstance(Class.forName("org.mockito.internal.reporting.PrintSettings"));
        setBooleanField(term3038, term3038.getClass(), "multiline", false);
        setField(term3038, term3038.getClass(), "withTypeInfo", term3040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.reporting.PrintSettings");
        Object[] args = new Object[1];
        args[0] = term3038;
        try {
            callMethod(klass, "toString", argTypes, term2921, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};



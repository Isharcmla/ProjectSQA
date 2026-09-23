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
import java.lang.NullPointerException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;

public class MockHandler_handle_98616087911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term69;

    public MockHandler_handle_98616087911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term53 = new LinkedList();
        ArrayList term57 = new ArrayList();
        LinkedList term63 = new LinkedList();
        term51 = newInstance(Class.forName("org.mockito.internal.MockHandler"));
        Object term52 = newInstance(Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl"));
        Object term56 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term61 = newInstance(Class.forName("org.mockito.internal.verification.RegisteredInvocations"));
        Object term62 = newInstance(Class.forName("java.util.Collections$SynchronizedList"));
        Object term66 = newInstance(Class.forName("org.mockito.internal.invocation.MatchersBinder"));
        Object term67 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        setField(term52, term52.getClass(), "stubbed", term53);
        setField(term52, term52.getClass(), "mockingProgress", term56);
        setField(term52, term52.getClass(), "answersForStubbing", term57);
        setField(term62, term62.getClass(), "list", term63);
        setField(term62, term62.getClass(), "c", term63);
        setField(term62, term62.getClass(), "mutex", term62);
        setField(term61, term61.getClass(), "invocations", term62);
        setField(term52, term52.getClass(), "registeredInvocations", term61);
        setField(term52, term52.getClass(), "invocationForStubbing", null);
        setField(term51, term51.getClass(), "invocationContainerImpl", term52);
        setField(term51, term51.getClass(), "matchersBinder", term66);
        setField(term51, term51.getClass(), "mockingProgress", term56);
        setField(term67, term67.getClass(), "extraInterfaces", null);
        setField(term67, term67.getClass(), "name", null);
        setField(term67, term67.getClass(), "spiedInstance", null);
        setField(term67, term67.getClass(), "defaultAnswer", null);
        setField(term67, term67.getClass(), "mockName", null);
        setBooleanField(term67, term67.getClass(), "serializable", false);
        setField(term51, term51.getClass(), "mockSettings", term67);
        term69 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term71 = newInstance(Class.forName("java.lang.Object"));
        Object[] term72 = (Object[]) newArray("java.lang.Object", 4);
        Object term73 = newInstance(Class.forName("java.lang.Object"));
        Object term74 = newInstance(Class.forName("java.lang.Object"));
        Object term75 = newInstance(Class.forName("java.lang.Object"));
        Object term76 = newInstance(Class.forName("java.lang.Object"));
        Object[] term77 = (Object[]) newArray("java.lang.Object", 3);
        Object term78 = newInstance(Class.forName("java.lang.Object"));
        Object term79 = newInstance(Class.forName("java.lang.Object"));
        Object term80 = newInstance(Class.forName("java.lang.Object"));
        Object term81 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term179 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term69, term69.getClass(), "sequenceNumber", 568599855);
        setField(term69, term69.getClass(), "mock", term71);
        setField(term69, term69.getClass(), "method", null);
        setElement(term72, 0, term73);
        setElement(term72, 1, term74);
        setElement(term72, 2, term75);
        setElement(term72, 3, term76);
        setField(term69, term69.getClass(), "arguments", term72);
        setElement(term77, 0, term78);
        setElement(term77, 1, term79);
        setElement(term77, 2, term80);
        setField(term69, term69.getClass(), "rawArguments", term77);
        setField(term81, term81.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term69, term69.getClass(), "location", term81);
        setBooleanField(term69, term69.getClass(), "verified", false);
        setField(term69, term69.getClass(), "realMethod", null);
        setField(term179, term179.getClass(), "stubbedAt", null);
        setField(term69, term69.getClass(), "stubInfo", term179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term69;
        try {
            callMethod(klass, "handle", argTypes, term51, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



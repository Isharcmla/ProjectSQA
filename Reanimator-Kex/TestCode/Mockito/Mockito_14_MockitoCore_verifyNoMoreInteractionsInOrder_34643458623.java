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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class MockitoCore_verifyNoMoreInteractionsInOrder_34643458623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term60;

    public MockitoCore_verifyNoMoreInteractionsInOrder_34643458623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term56 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term57 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term58 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term59 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term55, term55.getClass(), "reporter", term56);
        setField(term57, term57.getClass(), "creationValidator", term58);
        setField(term55, term55.getClass(), "mockUtil", term57);
        setField(term55, term55.getClass(), "mockingProgress", term59);
        Object term63 = newInstance(Class.forName("java.lang.Object"));
        term60 = new LinkedList();
        ((LinkedList) term60).add(term63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("org.mockito.internal.verification.api.InOrderContext");
        Object[] args = new Object[2];
        args[0] = term60;
        args[1] = null;
        try {
            callMethod(klass, "verifyNoMoreInteractionsInOrder", argTypes, term55, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};



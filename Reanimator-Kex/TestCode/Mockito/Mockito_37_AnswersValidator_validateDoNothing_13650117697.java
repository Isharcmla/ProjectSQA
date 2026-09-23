package org.mockito.internal.stubbing.answers;

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
import static org.mockito.internal.stubbing.answers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AnswersValidator_validateDoNothing_13650117697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term212;
     Object term213;

    public AnswersValidator_validateDoNothing_13650117697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator"));
        Object term211 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        setField(term210, term210.getClass(), "reporter", term211);
        term212 = newInstance(Class.forName("org.mockito.internal.stubbing.answers.DoesNothing"));
        term213 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term215 = newInstance(Class.forName("java.lang.Object"));
        Object[] term216 = (Object[]) newArray("java.lang.Object", 3);
        Object term217 = newInstance(Class.forName("java.lang.Object"));
        Object term218 = newInstance(Class.forName("java.lang.Object"));
        Object term219 = newInstance(Class.forName("java.lang.Object"));
        Object[] term220 = (Object[]) newArray("java.lang.Object", 4);
        Object term221 = newInstance(Class.forName("java.lang.Object"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        Object term225 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term213, term213.getClass(), "sequenceNumber", 1162663216);
        setField(term213, term213.getClass(), "mock", term215);
        setField(term213, term213.getClass(), "method", null);
        setElement(term216, 0, term217);
        setElement(term216, 1, term218);
        setElement(term216, 2, term219);
        setField(term213, term213.getClass(), "arguments", term216);
        setElement(term220, 0, term221);
        setElement(term220, 1, term222);
        setElement(term220, 2, term223);
        setElement(term220, 3, term224);
        setField(term213, term213.getClass(), "rawArguments", term220);
        setField(term225, term225.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term213, term213.getClass(), "location", term225);
        setBooleanField(term213, term213.getClass(), "verified", false);
        setBooleanField(term213, term213.getClass(), "verifiedInOrder", false);
        setField(term213, term213.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.internal.stubbing.answers.DoesNothing");
        argTypes[1] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[2];
        args[0] = term212;
        args[1] = term213;
        try {
            callMethod(klass, "validateDoNothing", argTypes, term210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class AnswersValidator_validateReturnValue_18845920858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418;
     Object term420;
     Object term422;

    public AnswersValidator_validateReturnValue_18845920858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418 = newInstance(Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator"));
        Object term419 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        setField(term418, term418.getClass(), "reporter", term419);
        term420 = newInstance(Class.forName("org.mockito.internal.stubbing.answers.Returns"));
        Object term421 = newInstance(Class.forName("java.lang.Object"));
        setField(term420, term420.getClass(), "value", term421);
        term422 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term424 = newInstance(Class.forName("java.lang.Object"));
        Object[] term425 = (Object[]) newArray("java.lang.Object", 1);
        Object term426 = newInstance(Class.forName("java.lang.Object"));
        Object[] term427 = (Object[]) newArray("java.lang.Object", 6);
        Object term428 = newInstance(Class.forName("java.lang.Object"));
        Object term429 = newInstance(Class.forName("java.lang.Object"));
        Object term430 = newInstance(Class.forName("java.lang.Object"));
        Object term431 = newInstance(Class.forName("java.lang.Object"));
        Object term432 = newInstance(Class.forName("java.lang.Object"));
        Object term433 = newInstance(Class.forName("java.lang.Object"));
        Object term434 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term422, term422.getClass(), "sequenceNumber", 1484323161);
        setField(term422, term422.getClass(), "mock", term424);
        setField(term422, term422.getClass(), "method", null);
        setElement(term425, 0, term426);
        setField(term422, term422.getClass(), "arguments", term425);
        setElement(term427, 0, term428);
        setElement(term427, 1, term429);
        setElement(term427, 2, term430);
        setElement(term427, 3, term431);
        setElement(term427, 4, term432);
        setElement(term427, 5, term433);
        setField(term422, term422.getClass(), "rawArguments", term427);
        setField(term434, term434.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term422, term422.getClass(), "location", term434);
        setBooleanField(term422, term422.getClass(), "verified", true);
        setBooleanField(term422, term422.getClass(), "verifiedInOrder", true);
        setField(term422, term422.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.internal.stubbing.answers.Returns");
        argTypes[1] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[2];
        args[0] = term420;
        args[1] = term422;
        try {
            callMethod(klass, "validateReturnValue", argTypes, term418, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



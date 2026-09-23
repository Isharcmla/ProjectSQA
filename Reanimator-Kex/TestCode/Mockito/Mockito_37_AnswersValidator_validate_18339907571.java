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
import static org.mockito.internal.stubbing.answers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AnswersValidator_validate_18339907571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public AnswersValidator_validate_18339907571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator"));
        Object term2 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        setField(term1, term1.getClass(), "reporter", term2);
        term3 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6 = (Object[]) newArray("java.lang.Object", 5);
        Object term7 = newInstance(Class.forName("java.lang.Object"));
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        Object term9 = newInstance(Class.forName("java.lang.Object"));
        Object term10 = newInstance(Class.forName("java.lang.Object"));
        Object term11 = newInstance(Class.forName("java.lang.Object"));
        Object[] term12 = (Object[]) newArray("java.lang.Object", 4);
        Object term13 = newInstance(Class.forName("java.lang.Object"));
        Object term14 = newInstance(Class.forName("java.lang.Object"));
        Object term15 = newInstance(Class.forName("java.lang.Object"));
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        Object term17 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term3, term3.getClass(), "sequenceNumber", 568599855);
        setField(term3, term3.getClass(), "mock", term5);
        setField(term3, term3.getClass(), "method", null);
        setElement(term6, 0, term7);
        setElement(term6, 1, term8);
        setElement(term6, 2, term9);
        setElement(term6, 3, term10);
        setElement(term6, 4, term11);
        setField(term3, term3.getClass(), "arguments", term6);
        setElement(term12, 0, term13);
        setElement(term12, 1, term14);
        setElement(term12, 2, term15);
        setElement(term12, 3, term16);
        setField(term3, term3.getClass(), "rawArguments", term12);
        setField(term17, term17.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term3, term3.getClass(), "location", term17);
        setBooleanField(term3, term3.getClass(), "verified", false);
        setBooleanField(term3, term3.getClass(), "verifiedInOrder", false);
        setField(term3, term3.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.answers.AnswersValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.stubbing.Answer");
        argTypes[1] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3;
        callMethod(klass, "validate", argTypes, term1, args);
    }

};



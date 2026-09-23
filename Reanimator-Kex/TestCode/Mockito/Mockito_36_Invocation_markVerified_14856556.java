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

public class Invocation_markVerified_14856556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7761;

    public Invocation_markVerified_14856556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7761 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term7763 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7764 = (Object[]) newArray("java.lang.Object", 4);
        Object term7765 = newInstance(Class.forName("java.lang.Object"));
        Object term7766 = newInstance(Class.forName("java.lang.Object"));
        Object term7767 = newInstance(Class.forName("java.lang.Object"));
        Object term7768 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7769 = (Object[]) newArray("java.lang.Object", 8);
        Object term7770 = newInstance(Class.forName("java.lang.Object"));
        Object term7771 = newInstance(Class.forName("java.lang.Object"));
        Object term7772 = newInstance(Class.forName("java.lang.Object"));
        Object term7773 = newInstance(Class.forName("java.lang.Object"));
        Object term7774 = newInstance(Class.forName("java.lang.Object"));
        Object term7775 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term7761, term7761.getClass(), "sequenceNumber", 1135664017);
        setField(term7761, term7761.getClass(), "mock", term7763);
        setField(term7761, term7761.getClass(), "method", null);
        setElement(term7764, 0, term7765);
        setElement(term7764, 1, term7766);
        setElement(term7764, 2, term7767);
        setElement(term7764, 3, term7768);
        setField(term7761, term7761.getClass(), "arguments", term7764);
        setElement(term7769, 0, term7770);
        setElement(term7769, 1, term7771);
        setElement(term7769, 2, term7772);
        setElement(term7769, 3, term7773);
        setElement(term7769, 4, term7774);
        setElement(term7769, 5, term7772);
        setElement(term7769, 6, term7773);
        setElement(term7769, 7, term7763);
        setField(term7761, term7761.getClass(), "rawArguments", term7769);
        setField(term7775, term7775.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term7761, term7761.getClass(), "location", term7775);
        setBooleanField(term7761, term7761.getClass(), "verified", false);
        setBooleanField(term7761, term7761.getClass(), "verifiedInOrder", true);
        setField(term7761, term7761.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markVerified", argTypes, term7761, args);
    }

};



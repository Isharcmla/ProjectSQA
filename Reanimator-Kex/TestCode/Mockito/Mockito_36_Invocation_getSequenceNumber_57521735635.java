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

public class Invocation_getSequenceNumber_57521735635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;

    public Invocation_getSequenceNumber_57521735635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term841 = newInstance(Class.forName("java.lang.Object"));
        Object[] term842 = (Object[]) newArray("java.lang.Object", 6);
        Object term843 = newInstance(Class.forName("java.lang.Object"));
        Object term844 = newInstance(Class.forName("java.lang.Object"));
        Object term845 = newInstance(Class.forName("java.lang.Object"));
        Object term846 = newInstance(Class.forName("java.lang.Object"));
        Object term847 = newInstance(Class.forName("java.lang.Object"));
        Object term848 = newInstance(Class.forName("java.lang.Object"));
        Object[] term849 = (Object[]) newArray("java.lang.Object", 5);
        Object term850 = newInstance(Class.forName("java.lang.Object"));
        Object term851 = newInstance(Class.forName("java.lang.Object"));
        Object term852 = newInstance(Class.forName("java.lang.Object"));
        Object term853 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term839, term839.getClass(), "sequenceNumber", -616727354);
        setField(term839, term839.getClass(), "mock", term841);
        setField(term839, term839.getClass(), "method", null);
        setElement(term842, 0, term843);
        setElement(term842, 1, term844);
        setElement(term842, 2, term845);
        setElement(term842, 3, term846);
        setElement(term842, 4, term847);
        setElement(term842, 5, term848);
        setField(term839, term839.getClass(), "arguments", term842);
        setElement(term849, 0, term850);
        setElement(term849, 1, term851);
        setElement(term849, 2, term852);
        setElement(term849, 3, term850);
        setElement(term849, 4, term851);
        setField(term839, term839.getClass(), "rawArguments", term849);
        setField(term853, term853.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term839, term839.getClass(), "location", term853);
        setBooleanField(term839, term839.getClass(), "verified", true);
        setBooleanField(term839, term839.getClass(), "verifiedInOrder", false);
        setField(term839, term839.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSequenceNumber", argTypes, term839, args);
    }

};



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

public class Invocation_isVerified_69462420434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;

    public Invocation_isVerified_69462420434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term635 = newInstance(Class.forName("java.lang.Object"));
        Object[] term636 = (Object[]) newArray("java.lang.Object", 7);
        Object term637 = newInstance(Class.forName("java.lang.Object"));
        Object term638 = newInstance(Class.forName("java.lang.Object"));
        Object term639 = newInstance(Class.forName("java.lang.Object"));
        Object term640 = newInstance(Class.forName("java.lang.Object"));
        Object term641 = newInstance(Class.forName("java.lang.Object"));
        Object term642 = newInstance(Class.forName("java.lang.Object"));
        Object term643 = newInstance(Class.forName("java.lang.Object"));
        Object[] term644 = (Object[]) newArray("java.lang.Object", 1);
        Object term645 = newInstance(Class.forName("java.lang.Object"));
        Object term646 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term633, term633.getClass(), "sequenceNumber", -1922583790);
        setField(term633, term633.getClass(), "mock", term635);
        setField(term633, term633.getClass(), "method", null);
        setElement(term636, 0, term637);
        setElement(term636, 1, term638);
        setElement(term636, 2, term639);
        setElement(term636, 3, term640);
        setElement(term636, 4, term641);
        setElement(term636, 5, term642);
        setElement(term636, 6, term643);
        setField(term633, term633.getClass(), "arguments", term636);
        setElement(term644, 0, term645);
        setField(term633, term633.getClass(), "rawArguments", term644);
        setField(term646, term646.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term633, term633.getClass(), "location", term646);
        setBooleanField(term633, term633.getClass(), "verified", true);
        setBooleanField(term633, term633.getClass(), "verifiedInOrder", false);
        setField(term633, term633.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isVerified", argTypes, term633, args);
    }

};



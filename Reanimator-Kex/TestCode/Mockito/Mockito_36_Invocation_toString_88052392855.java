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
import java.util.LinkedList;

public class Invocation_toString_88052392855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7569;
     Object term7671;

    public Invocation_toString_88052392855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7569 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term7571 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7572 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term7573 = (Object[]) newArray("java.lang.Object", 7);
        Object term7574 = newInstance(Class.forName("java.lang.Object"));
        Object term7575 = newInstance(Class.forName("java.lang.Object"));
        Object term7576 = newInstance(Class.forName("java.lang.Object"));
        Object term7577 = newInstance(Class.forName("java.lang.Object"));
        Object term7578 = newInstance(Class.forName("java.lang.Object"));
        Object term7579 = newInstance(Class.forName("java.lang.Object"));
        Object term7580 = newInstance(Class.forName("java.lang.Object"));
        Object term7581 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term7569, term7569.getClass(), "sequenceNumber", -1007160944);
        setField(term7569, term7569.getClass(), "mock", term7571);
        setField(term7569, term7569.getClass(), "method", null);
        setField(term7569, term7569.getClass(), "arguments", term7572);
        setElement(term7573, 0, term7574);
        setElement(term7573, 1, term7575);
        setElement(term7573, 2, term7576);
        setElement(term7573, 3, term7577);
        setElement(term7573, 4, term7578);
        setElement(term7573, 5, term7579);
        setElement(term7573, 6, term7580);
        setField(term7569, term7569.getClass(), "rawArguments", term7573);
        setField(term7581, term7581.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term7569, term7569.getClass(), "location", term7581);
        setBooleanField(term7569, term7569.getClass(), "verified", false);
        setBooleanField(term7569, term7569.getClass(), "verifiedInOrder", true);
        setField(term7569, term7569.getClass(), "realMethod", null);
        LinkedList term7673 = new LinkedList();
        term7671 = newInstance(Class.forName("org.mockito.internal.reporting.PrintSettings"));
        setBooleanField(term7671, term7671.getClass(), "multiline", false);
        setField(term7671, term7671.getClass(), "withTypeInfo", term7673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.reporting.PrintSettings");
        Object[] args = new Object[1];
        args[0] = term7671;
        try {
            callMethod(klass, "toString", argTypes, term7569, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};



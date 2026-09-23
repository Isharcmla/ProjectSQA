package org.mockito.exceptions;

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
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Reporter_delegatedMethodDoesNotExistOnDelegate_810817245147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23478;
     Object term23479;
     Object term23723;
     Object term23724;

    public Reporter_delegatedMethodDoesNotExistOnDelegate_810817245147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23478 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term81600 = Class.forName((String) "java.nio.file.LinkOption");
        Class<? extends Object> term81741 = Class.forName((String) "java.lang.String");
        Object[] term81742 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term81742, 0, term81741);
        term23479 = ((Class) term81600).getDeclaredMethod((String) "valueOf", (Class[]) term81742);
        ((Method) term23479).setAccessible(false);
        term23723 = newInstance(Class.forName("java.lang.Object"));
        term23724 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term23479;
        args[1] = term23723;
        args[2] = term23724;
        try {
            callMethod(klass, "delegatedMethodDoesNotExistOnDelegate", argTypes, term23478, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};



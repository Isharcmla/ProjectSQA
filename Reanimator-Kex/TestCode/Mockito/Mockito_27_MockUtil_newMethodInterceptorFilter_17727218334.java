package org.mockito.internal.util;

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
import static org.mockito.internal.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class MockUtil_newMethodInterceptorFilter_17727218334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term63;

    public MockUtil_newMethodInterceptorFilter_17727218334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term62 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        setField(term61, term61.getClass(), "creationValidator", term62);
        ArrayList term93 = new ArrayList();
        term63 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term64 = (Object[]) newArray("java.lang.Class", 4);
        Object term77 = newInstance(Class.forName("java.lang.Object"));
        Object term78 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term63, term63.getClass(), "extraInterfaces", term64);
        setField(term63, term63.getClass(), "name", "MuLcgQHgqz");
        setField(term63, term63.getClass(), "spiedInstance", term77);
        setField(term63, term63.getClass(), "defaultAnswer", null);
        setField(term78, term78.getClass(), "mockName", "xxtlPwDYFs");
        setBooleanField(term78, term78.getClass(), "surrogate", false);
        setField(term63, term63.getClass(), "mockName", term78);
        setBooleanField(term63, term63.getClass(), "serializable", false);
        setField(term63, term63.getClass(), "invocationListeners", term93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.util.MockUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Object[] args = new Object[1];
        args[0] = term63;
        callMethod(klass, "newMethodInterceptorFilter", argTypes, term61, args);
    }

};



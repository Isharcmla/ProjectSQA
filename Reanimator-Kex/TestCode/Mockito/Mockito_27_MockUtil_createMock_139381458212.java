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
import java.lang.NullPointerException;
import static org.mockito.internal.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class MockUtil_createMock_139381458212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term4;

    public MockUtil_createMock_139381458212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term3 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        setField(term2, term2.getClass(), "creationValidator", term3);
        ArrayList term34 = new ArrayList();
        term4 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term5 = (Object[]) newArray("java.lang.Class", 5);
        Object term18 = newInstance(Class.forName("java.lang.Object"));
        Object term19 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term4, term4.getClass(), "extraInterfaces", term5);
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "spiedInstance", term18);
        setField(term4, term4.getClass(), "defaultAnswer", null);
        setField(term19, term19.getClass(), "mockName", "sjlJAEtRrb");
        setBooleanField(term19, term19.getClass(), "surrogate", false);
        setField(term4, term4.getClass(), "mockName", term19);
        setBooleanField(term4, term4.getClass(), "serializable", false);
        setField(term4, term4.getClass(), "invocationListeners", term34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.util.MockUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4;
        try {
            callMethod(klass, "createMock", argTypes, term2, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



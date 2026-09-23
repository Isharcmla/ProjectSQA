package org.mockito.internal.creation;

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
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.creation.EqualityUtils.*;
import java.lang.Object;

public class MockSettingsImpl_initiateMockName_119736350823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515;

    public MockSettingsImpl_initiateMockName_119736350823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term516 = (Object[]) newArray("java.lang.Class", 6);
        Object term529 = newInstance(Class.forName("java.lang.Object"));
        Object term530 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term515, term515.getClass(), "extraInterfaces", term516);
        setField(term515, term515.getClass(), "name", "RkybSrpybU");
        setField(term515, term515.getClass(), "spiedInstance", term529);
        setField(term515, term515.getClass(), "defaultAnswer", null);
        setField(term530, term530.getClass(), "mockName", "xOEqzGAmDU");
        setBooleanField(term530, term530.getClass(), "surrogate", false);
        setField(term515, term515.getClass(), "mockName", term530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "initiateMockName", argTypes, term515, args);
    }

};



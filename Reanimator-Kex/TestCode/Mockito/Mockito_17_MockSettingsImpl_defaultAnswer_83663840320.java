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

public class MockSettingsImpl_defaultAnswer_83663840320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;

    public MockSettingsImpl_defaultAnswer_83663840320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term369 = (Object[]) newArray("java.lang.Class", 6);
        Object term382 = newInstance(Class.forName("java.lang.Object"));
        Object term383 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term368, term368.getClass(), "extraInterfaces", term369);
        setField(term368, term368.getClass(), "name", "aJlieCFVtF");
        setField(term368, term368.getClass(), "spiedInstance", term382);
        setField(term368, term368.getClass(), "defaultAnswer", null);
        setField(term383, term383.getClass(), "mockName", "ZiaGIbnzTs");
        setBooleanField(term383, term383.getClass(), "surrogate", true);
        setField(term368, term368.getClass(), "mockName", term383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.stubbing.Answer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "defaultAnswer", argTypes, term368, args);
    }

};



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

public class MockSettingsImpl_getDefaultAnswer_69278790821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;

    public MockSettingsImpl_getDefaultAnswer_69278790821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term418 = (Object[]) newArray("java.lang.Class", 7);
        Object term431 = newInstance(Class.forName("java.lang.Object"));
        Object term432 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term417, term417.getClass(), "extraInterfaces", term418);
        setField(term417, term417.getClass(), "name", "tbcdzjIfER");
        setField(term417, term417.getClass(), "spiedInstance", term431);
        setField(term417, term417.getClass(), "defaultAnswer", null);
        setField(term432, term432.getClass(), "mockName", "HyxfbSQYBe");
        setBooleanField(term432, term432.getClass(), "surrogate", false);
        setField(term417, term417.getClass(), "mockName", term432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultAnswer", argTypes, term417, args);
    }

};



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

public class MockSettingsImpl_name_59421348118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;

    public MockSettingsImpl_name_59421348118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term248 = (Object[]) newArray("java.lang.Class", 6);
        Object term261 = newInstance(Class.forName("java.lang.Object"));
        Object term262 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term247, term247.getClass(), "extraInterfaces", term248);
        setField(term247, term247.getClass(), "name", "NRdvgJlhkX");
        setField(term247, term247.getClass(), "spiedInstance", term261);
        setField(term247, term247.getClass(), "defaultAnswer", null);
        setField(term262, term262.getClass(), "mockName", "uuaPigETmJ");
        setBooleanField(term262, term262.getClass(), "surrogate", true);
        setField(term247, term247.getClass(), "mockName", term262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "name", argTypes, term247, args);
    }

};



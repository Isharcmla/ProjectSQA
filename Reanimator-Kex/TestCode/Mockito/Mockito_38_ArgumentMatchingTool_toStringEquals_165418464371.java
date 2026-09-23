package org.mockito.internal.verification.argumentmatching;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Float;

public class ArgumentMatchingTool_toStringEquals_165418464371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38058;
     Object term38152;

    public ArgumentMatchingTool_toStringEquals_165418464371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38058 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class term38256 = int.class;
        Float term38338 = new Float(0.0F);
        term38152 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term38220 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        setField(term38152, term38152.getClass(), "featureDescription", null);
        setField(term38220, term38220.getClass(), "eventClass", term38256);
        setField(term38220, term38220.getClass(), "source", term38338);
        setField(term38152, term38152.getClass(), "subMatcher", term38220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term38152;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term38058, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



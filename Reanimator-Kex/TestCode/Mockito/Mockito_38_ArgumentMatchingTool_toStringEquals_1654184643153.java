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
import java.lang.NullPointerException;
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class ArgumentMatchingTool_toStringEquals_1654184643153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132707;
     Object term132801;

    public ArgumentMatchingTool_toStringEquals_1654184643153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132707 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Object term133047 = newInstance(Class.forName("org.hamcrest.text.IsEqualIgnoringWhiteSpace"));
        Object term133085 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term132955 = new ArrayList();
        ((ArrayList) term132955).add(term133047);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add(term133085);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        ((ArrayList) term132955).add((Object)null);
        term132801 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term132903 = newInstance(Class.forName("org.hamcrest.collection.IsArrayContainingInOrder"));
        setField(term132801, term132801.getClass(), "featureDescription", null);
        setField(term132903, term132903.getClass(), "matchers", term132955);
        setField(term132801, term132801.getClass(), "subMatcher", term132903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term132801;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term132707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



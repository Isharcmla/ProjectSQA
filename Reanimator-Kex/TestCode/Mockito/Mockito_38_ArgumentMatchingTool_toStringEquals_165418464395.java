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
import java.lang.String;
import java.lang.Long;

public class ArgumentMatchingTool_toStringEquals_165418464395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62409;
     Object term62503;

    public ArgumentMatchingTool_toStringEquals_165418464395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62409 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term62607 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Long term62687 = new Long(0L);
        term62503 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term62571 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        setField(term62503, term62503.getClass(), "featureDescription", null);
        setField(term62571, term62571.getClass(), "eventClass", term62607);
        setField(term62571, term62571.getClass(), "source", term62687);
        setField(term62503, term62503.getClass(), "subMatcher", term62571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term62503;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term62409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



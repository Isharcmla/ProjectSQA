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
import java.lang.String;

public class ArgumentMatchingTool_toStringEquals_165418464369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34904;
     Object term34998;

    public ArgumentMatchingTool_toStringEquals_165418464369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34904 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term35140 = Class.forName((String) "kex.java.lang.Short");
        Class<? extends Object> term35196 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.CharGenerator");
        term34998 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term35104 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        setField(term34998, term34998.getClass(), "featureDescription", "");
        setField(term35104, term35104.getClass(), "eventClass", term35140);
        setField(term35104, term35104.getClass(), "source", term35196);
        setField(term34998, term34998.getClass(), "subMatcher", term35104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term34998;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term34904, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};



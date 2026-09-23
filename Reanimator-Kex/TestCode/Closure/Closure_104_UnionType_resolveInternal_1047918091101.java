package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;

public class UnionType_resolveInternal_1047918091101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26993;

    public UnionType_resolveInternal_1047918091101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term27135 = new HashSet();
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        ((HashSet) term27135).add((Object)null);
        term26993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term27087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term26993, term26993.getClass(), "resolveResult", term27087);
        setBooleanField(term26993, term26993.getClass(), "resolved", false);
        setField(term26993, term26993.getClass(), "alternates", term27135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term26993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



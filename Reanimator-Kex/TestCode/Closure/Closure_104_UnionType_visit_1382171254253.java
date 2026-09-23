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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class UnionType_visit_1382171254253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89146;
     Object term89328;
     Object term89346;
     Object term89350;

    public UnionType_visit_1382171254253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term89194 = new HashSet();
        term89146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term89146, term89146.getClass(), "alternates", term89194);
        term89328 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$2"));
        HashMap term89348 = new HashMap();
        Set<Object> term89351 =  ((Map) term89348).keySet();
        HashSet term89347 = new HashSet((Collection<? extends Object>) term89351);
        term89346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term89346, term89346.getClass(), "alternates", term89347);
        setBooleanField(term89346, term89346.getClass(), "resolved", false);
        setField(term89346, term89346.getClass(), "resolveResult", null);
        setField(term89346, term89346.getClass(), "registry", null);
        term89350 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$2"));
        setField(term89350, term89350.getClass(), "this$0", null);
        setField(term89350, term89350.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = term89328;
        Object retValue = callMethod(klass, "visit", argTypes, term89146, args);
        assertTrue(recursiveEquals(term89146, term89346));
        assertTrue(recursiveEquals(term89328, term89350));
        assertTrue(recursiveEquals(retValue, null));
    }

};



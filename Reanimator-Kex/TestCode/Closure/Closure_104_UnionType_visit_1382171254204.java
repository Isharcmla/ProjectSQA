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

public class UnionType_visit_1382171254204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68752;
     Object term68934;
     Object term68952;
     Object term68956;

    public UnionType_visit_1382171254204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term68800 = new HashSet();
        term68752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term68752, term68752.getClass(), "alternates", term68800);
        term68934 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$4"));
        HashMap term68954 = new HashMap();
        Set<Object> term68957 =  ((Map) term68954).keySet();
        HashSet term68953 = new HashSet((Collection<? extends Object>) term68957);
        term68952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term68952, term68952.getClass(), "alternates", term68953);
        setBooleanField(term68952, term68952.getClass(), "resolved", false);
        setField(term68952, term68952.getClass(), "resolveResult", null);
        setField(term68952, term68952.getClass(), "registry", null);
        term68956 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$4"));
        setField(term68956, term68956.getClass(), "this$0", null);
        setField(term68956, term68956.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = term68934;
        Object retValue = callMethod(klass, "visit", argTypes, term68752, args);
        assertTrue(recursiveEquals(term68752, term68952));
        assertTrue(recursiveEquals(term68934, term68956));
        assertTrue(recursiveEquals(retValue, null));
    }

};



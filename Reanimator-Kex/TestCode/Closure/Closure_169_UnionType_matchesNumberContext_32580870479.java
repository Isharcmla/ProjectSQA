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
import java.util.ArrayList;

public class UnionType_matchesNumberContext_32580870479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12617;
     Object term12680;

    public UnionType_matchesNumberContext_32580870479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12669 = new ArrayList();
        term12617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term12617, term12617.getClass(), "alternates", term12669);
        ArrayList term12681 = new ArrayList();
        term12680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term12680, term12680.getClass(), "alternates", term12681);
        setIntField(term12680, term12680.getClass(), "hashcode", 0);
        setBooleanField(term12680, term12680.getClass(), "resolved", false);
        setField(term12680, term12680.getClass(), "resolveResult", null);
        setBooleanField(term12680, term12680.getClass(), "inTemplatedCheckVisit", false);
        setField(term12680, term12680.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesNumberContext", argTypes, term12617, args);
        assertTrue(recursiveEquals(term12617, term12680));
        assertTrue(recursiveEquals(retValue, false));
    }

};



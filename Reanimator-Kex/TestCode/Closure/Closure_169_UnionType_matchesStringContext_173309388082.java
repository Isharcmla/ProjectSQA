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

public class UnionType_matchesStringContext_173309388082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12805;
     Object term13040;

    public UnionType_matchesStringContext_173309388082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12857 = new ArrayList();
        term12805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term12805, term12805.getClass(), "alternates", term12857);
        ArrayList term13041 = new ArrayList();
        term13040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term13040, term13040.getClass(), "alternates", term13041);
        setIntField(term13040, term13040.getClass(), "hashcode", 0);
        setBooleanField(term13040, term13040.getClass(), "resolved", false);
        setField(term13040, term13040.getClass(), "resolveResult", null);
        setBooleanField(term13040, term13040.getClass(), "inTemplatedCheckVisit", false);
        setField(term13040, term13040.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesStringContext", argTypes, term12805, args);
        assertTrue(recursiveEquals(term12805, term13040));
        assertTrue(recursiveEquals(retValue, false));
    }

};



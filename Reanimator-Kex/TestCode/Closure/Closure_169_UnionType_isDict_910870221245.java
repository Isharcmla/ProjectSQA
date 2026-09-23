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

public class UnionType_isDict_910870221245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97922;
     Object term97989;

    public UnionType_isDict_910870221245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term97974 = new ArrayList();
        term97922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term97922, term97922.getClass(), "alternates", term97974);
        ArrayList term97990 = new ArrayList();
        term97989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term97989, term97989.getClass(), "alternates", term97990);
        setIntField(term97989, term97989.getClass(), "hashcode", 0);
        setBooleanField(term97989, term97989.getClass(), "resolved", false);
        setField(term97989, term97989.getClass(), "resolveResult", null);
        setBooleanField(term97989, term97989.getClass(), "inTemplatedCheckVisit", false);
        setField(term97989, term97989.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isDict", argTypes, term97922, args);
        assertTrue(recursiveEquals(term97922, term97989));
        assertTrue(recursiveEquals(retValue, false));
    }

};



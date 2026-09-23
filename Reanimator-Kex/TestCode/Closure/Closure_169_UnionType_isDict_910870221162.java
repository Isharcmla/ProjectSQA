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

public class UnionType_isDict_910870221162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32395;
     Object term32679;

    public UnionType_isDict_910870221162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32447 = new ArrayList();
        term32395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term32395, term32395.getClass(), "alternates", term32447);
        ArrayList term32680 = new ArrayList();
        term32679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term32679, term32679.getClass(), "alternates", term32680);
        setIntField(term32679, term32679.getClass(), "hashcode", 0);
        setBooleanField(term32679, term32679.getClass(), "resolved", false);
        setField(term32679, term32679.getClass(), "resolveResult", null);
        setBooleanField(term32679, term32679.getClass(), "inTemplatedCheckVisit", false);
        setField(term32679, term32679.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isDict", argTypes, term32395, args);
        assertTrue(recursiveEquals(term32395, term32679));
        assertTrue(recursiveEquals(retValue, false));
    }

};



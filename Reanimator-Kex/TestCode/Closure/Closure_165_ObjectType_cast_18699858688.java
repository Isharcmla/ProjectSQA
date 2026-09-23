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

public class ObjectType_cast_18699858688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12034;
     Object term12160;
     Object term12155;

    public ObjectType_cast_18699858688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term12160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term12160, term12160.getClass(), "typeExpr", null);
        setField(term12160, term12160.getClass(), "sourceName", null);
        setBooleanField(term12160, term12160.getClass(), "isChecked", false);
        setBooleanField(term12160, term12160.getClass(), "visited", false);
        setField(term12160, term12160.getClass(), "docInfo", null);
        setBooleanField(term12160, term12160.getClass(), "unknown", false);
        setBooleanField(term12160, term12160.getClass(), "resolved", false);
        setField(term12160, term12160.getClass(), "resolveResult", null);
        setField(term12160, term12160.getClass(), "registry", null);
        term12155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term12155, term12155.getClass(), "typeExpr", null);
        setField(term12155, term12155.getClass(), "sourceName", null);
        setBooleanField(term12155, term12155.getClass(), "isChecked", false);
        setBooleanField(term12155, term12155.getClass(), "visited", false);
        setField(term12155, term12155.getClass(), "docInfo", null);
        setBooleanField(term12155, term12155.getClass(), "unknown", false);
        setBooleanField(term12155, term12155.getClass(), "resolved", false);
        setField(term12155, term12155.getClass(), "resolveResult", null);
        setField(term12155, term12155.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term12034;
        Object retValue = callMethod(klass, "cast", argTypes, null, args);
        assertTrue(recursiveEquals(term12034, term12160));
        assertTrue(recursiveEquals(retValue, term12155));
    }

};



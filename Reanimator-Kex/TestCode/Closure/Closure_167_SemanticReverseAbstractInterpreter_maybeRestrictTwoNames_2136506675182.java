package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;

public class SemanticReverseAbstractInterpreter_maybeRestrictTwoNames_2136506675182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41618;
     Object term42067;

    public SemanticReverseAbstractInterpreter_maybeRestrictTwoNames_2136506675182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41618 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term42067 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term42067, term42067.getClass(), "INEQ", null);
        setField(term42067, term42067.getClass(), "convention", null);
        setField(term42067, term42067.getClass(), "typeRegistry", null);
        setField(term42067, term42067.getClass(), "firstLink", null);
        setField(term42067, term42067.getClass(), "nextLink", null);
        setField(term42067, term42067.getClass(), "restrictUndefinedVisitor", null);
        setField(term42067, term42067.getClass(), "restrictNullVisitor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = null;
        Object retValue = callMethod(klass, "maybeRestrictTwoNames", argTypes, term41618, args);
        assertTrue(recursiveEquals(term41618, term42067));
        assertTrue(recursiveEquals(retValue, null));
    }

};



package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_check_233062943295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129435;
     Object term129765;

    public TypeCheck_check_233062943295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129435 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term129515 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term129621 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term129695 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term129435, term129435.getClass(), "compiler", term129515);
        setField(term129435, term129435.getClass(), "scopeCreator", term129621);
        setBooleanField(term129435, term129435.getClass(), "inExterns", false);
        setField(term129695, term129695.getClass(), "parent", null);
        setField(term129435, term129435.getClass(), "topScope", term129695);
        term129765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129765, term129765.getClass(), "type", 0);
        setField(term129905, term129905.getClass(), "next", term129975);
        setIntField(term129905, term129905.getClass(), "type", 58);
        setField(term129905, term129905.getClass(), "first", null);
        setField(term129835, term129835.getClass(), "next", term129905);
        setIntField(term129835, term129835.getClass(), "type", 130);
        setField(term129835, term129835.getClass(), "first", null);
        setField(term129765, term129765.getClass(), "first", term129835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term129765;
        args[1] = true;
        callMethod(klass, "check", argTypes, term129435, args);
    }

};



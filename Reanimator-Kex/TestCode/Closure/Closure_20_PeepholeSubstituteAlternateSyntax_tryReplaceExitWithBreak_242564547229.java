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

public class PeepholeSubstituteAlternateSyntax_tryReplaceExitWithBreak_242564547229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54857;
     Object term54927;

    public PeepholeSubstituteAlternateSyntax_tryReplaceExitWithBreak_242564547229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54857 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term54927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54927, term54927.getClass(), "first", term54997);
        setIntField(term54927, term54927.getClass(), "type", 13);
        setIntField(term55067, term55067.getClass(), "type", 13);
        setField(term55067, term55067.getClass(), "parent", term55137);
        setField(term54927, term54927.getClass(), "parent", term55067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54927;
        callMethod(klass, "tryReplaceExitWithBreak", argTypes, term54857, args);
    }

};



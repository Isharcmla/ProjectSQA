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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class InlineVariables_getFilterForMode_107297393583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85002;
     Object term85481;
     Object term85480;

    public InlineVariables_getFilterForMode_107297393583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85486 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term85485 = ((Class) term85486).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term85485).setAccessible(true);
        Object enum131 = ((Field) term85485).get((Object) null);
        term85002 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term85002, term85002.getClass(), "mode", enum131);
        Class<? extends Object> term85780 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term85779 = ((Class) term85780).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term85779).setAccessible(true);
        Object enum132 = ((Field) term85779).get((Object) null);
        term85481 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term85481, term85481.getClass(), "compiler", null);
        setField(term85481, term85481.getClass(), "mode", enum132);
        setBooleanField(term85481, term85481.getClass(), "inlineAllStrings", false);
        setField(term85481, term85481.getClass(), "identifyConstants", null);
        Class<? extends Object> term86074 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term86073 = ((Class) term86074).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term86073).setAccessible(true);
        Object enum133 = ((Field) term86073).get((Object) null);
        term85480 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        Object term85460 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term85460, term85460.getClass(), "compiler", null);
        setField(term85460, term85460.getClass(), "mode", enum133);
        setBooleanField(term85460, term85460.getClass(), "inlineAllStrings", false);
        setField(term85460, term85460.getClass(), "identifyConstants", null);
        setField(term85480, term85480.getClass(), "this$0", term85460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term85002, args);
        assertTrue(recursiveEquals(term85002, term85481));
        assertTrue(recursiveEquals(retValue, term85480));
    }

};



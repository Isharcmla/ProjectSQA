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

public class InlineVariables_getFilterForMode_107297393561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60514;
     Object term60993;
     Object term60992;

    public InlineVariables_getFilterForMode_107297393561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60998 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term60997 = ((Class) term60998).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term60997).setAccessible(true);
        Object enum99 = ((Field) term60997).get((Object) null);
        term60514 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term60514, term60514.getClass(), "mode", enum99);
        Class<? extends Object> term61292 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term61291 = ((Class) term61292).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term61291).setAccessible(true);
        Object enum100 = ((Field) term61291).get((Object) null);
        term60993 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term60993, term60993.getClass(), "compiler", null);
        setField(term60993, term60993.getClass(), "mode", enum100);
        setBooleanField(term60993, term60993.getClass(), "inlineAllStrings", false);
        setField(term60993, term60993.getClass(), "identifyConstants", null);
        Class<? extends Object> term61586 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term61585 = ((Class) term61586).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term61585).setAccessible(true);
        Object enum101 = ((Field) term61585).get((Object) null);
        term60992 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        Object term60972 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term60972, term60972.getClass(), "compiler", null);
        setField(term60972, term60972.getClass(), "mode", enum101);
        setBooleanField(term60972, term60972.getClass(), "inlineAllStrings", false);
        setField(term60972, term60972.getClass(), "identifyConstants", null);
        setField(term60992, term60992.getClass(), "this$0", term60972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term60514, args);
        assertTrue(recursiveEquals(term60514, term60993));
        assertTrue(recursiveEquals(retValue, term60992));
    }

};



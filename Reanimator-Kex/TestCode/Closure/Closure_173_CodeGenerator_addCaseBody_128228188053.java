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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_addCaseBody_128228188053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12561;
     Object term12589;

    public CodeGenerator_addCaseBody_128228188053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12562 = new HashMap();
        Class<? extends Object> term36164 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term36163 = ((Class) term36164).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term36163).setAccessible(true);
        Object enum94 = ((Field) term36163).get((Object) null);
        term12561 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term12561, term12561.getClass(), "escapedJsStrings", term12562);
        setField(term12561, term12561.getClass(), "cc", null);
        setField(term12561, term12561.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term12561, term12561.getClass(), "preferSingleQuotes", true);
        setBooleanField(term12561, term12561.getClass(), "trustedStrings", false);
        setField(term12561, term12561.getClass(), "languageMode", enum94);
        term12589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12589, term12589.getClass(), "type", 890669485);
        setIntField(term12591, term12591.getClass(), "type", 691577392);
        setIntField(term12593, term12593.getClass(), "type", -893623680);
        setIntField(term12595, term12595.getClass(), "type", -1963434938);
        setIntField(term12597, term12597.getClass(), "type", 906181092);
        setField(term12597, term12597.getClass(), "next", null);
        setField(term12597, term12597.getClass(), "first", null);
        setField(term12597, term12597.getClass(), "last", null);
        setField(term12597, term12597.getClass(), "propListHead", null);
        setIntField(term12597, term12597.getClass(), "sourcePosition", 0);
        setField(term12597, term12597.getClass(), "jsType", null);
        setField(term12597, term12597.getClass(), "parent", null);
        setField(term12595, term12595.getClass(), "next", term12597);
        setIntField(term12600, term12600.getClass(), "type", 1045657203);
        setField(term12600, term12600.getClass(), "next", null);
        setField(term12600, term12600.getClass(), "first", null);
        setField(term12600, term12600.getClass(), "last", term12597);
        setField(term12600, term12600.getClass(), "propListHead", null);
        setIntField(term12600, term12600.getClass(), "sourcePosition", 0);
        setField(term12600, term12600.getClass(), "jsType", null);
        setField(term12600, term12600.getClass(), "parent", null);
        setField(term12595, term12595.getClass(), "first", term12600);
        setField(term12595, term12595.getClass(), "last", term12593);
        setField(term12595, term12595.getClass(), "propListHead", null);
        setIntField(term12595, term12595.getClass(), "sourcePosition", 0);
        setField(term12595, term12595.getClass(), "jsType", null);
        setField(term12595, term12595.getClass(), "parent", null);
        setField(term12593, term12593.getClass(), "next", term12595);
        setField(term12593, term12593.getClass(), "first", term12597);
        setIntField(term12604, term12604.getClass(), "type", 1072005683);
        setIntField(term12606, term12606.getClass(), "type", 1861318859);
        setField(term12606, term12606.getClass(), "next", null);
        setField(term12606, term12606.getClass(), "first", term12600);
        setField(term12606, term12606.getClass(), "last", term12595);
        setField(term12606, term12606.getClass(), "propListHead", null);
        setIntField(term12606, term12606.getClass(), "sourcePosition", 0);
        setField(term12606, term12606.getClass(), "jsType", null);
        setField(term12606, term12606.getClass(), "parent", null);
        setField(term12604, term12604.getClass(), "next", term12606);
        setField(term12604, term12604.getClass(), "first", term12591);
        setField(term12604, term12604.getClass(), "last", term12591);
        setField(term12604, term12604.getClass(), "propListHead", null);
        setIntField(term12604, term12604.getClass(), "sourcePosition", 0);
        setField(term12604, term12604.getClass(), "jsType", null);
        setField(term12604, term12604.getClass(), "parent", null);
        setField(term12593, term12593.getClass(), "last", term12604);
        setField(term12593, term12593.getClass(), "propListHead", null);
        setIntField(term12593, term12593.getClass(), "sourcePosition", 0);
        setField(term12593, term12593.getClass(), "jsType", null);
        setField(term12593, term12593.getClass(), "parent", null);
        setField(term12591, term12591.getClass(), "next", term12593);
        setIntField(term12611, term12611.getClass(), "type", 1474524152);
        setField(term12611, term12611.getClass(), "next", term12604);
        setField(term12611, term12611.getClass(), "first", term12606);
        setField(term12611, term12611.getClass(), "last", term12589);
        setField(term12611, term12611.getClass(), "propListHead", null);
        setIntField(term12611, term12611.getClass(), "sourcePosition", 0);
        setField(term12611, term12611.getClass(), "jsType", null);
        setField(term12611, term12611.getClass(), "parent", null);
        setField(term12591, term12591.getClass(), "first", term12611);
        setField(term12591, term12591.getClass(), "last", term12611);
        setField(term12591, term12591.getClass(), "propListHead", null);
        setIntField(term12591, term12591.getClass(), "sourcePosition", 0);
        setField(term12591, term12591.getClass(), "jsType", null);
        setField(term12591, term12591.getClass(), "parent", null);
        setField(term12589, term12589.getClass(), "next", term12591);
        setField(term12589, term12589.getClass(), "first", term12595);
        setField(term12589, term12589.getClass(), "last", term12597);
        setField(term12589, term12589.getClass(), "propListHead", null);
        setIntField(term12589, term12589.getClass(), "sourcePosition", 0);
        setField(term12589, term12589.getClass(), "jsType", null);
        setField(term12589, term12589.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12589;
        try {
            callMethod(klass, "addCaseBody", argTypes, term12561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



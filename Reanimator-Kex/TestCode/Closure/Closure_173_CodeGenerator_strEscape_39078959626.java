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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Character;
import java.lang.Boolean;

public class CodeGenerator_strEscape_39078959626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15203;
     Object term15243;
     Object term15281;
     Object term15283;

    public CodeGenerator_strEscape_39078959626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15204 = new HashMap();
        Class<? extends Object> term15286 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term15285 = ((Class) term15286).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term15285).setAccessible(true);
        Object enum41 = ((Field) term15285).get((Object) null);
        term15203 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term15203, term15203.getClass(), "escapedJsStrings", term15204);
        setField(term15203, term15203.getClass(), "cc", null);
        setField(term15203, term15203.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term15203, term15203.getClass(), "preferSingleQuotes", false);
        setBooleanField(term15203, term15203.getClass(), "trustedStrings", true);
        setField(term15203, term15203.getClass(), "languageMode", enum41);
        term15243 = new Character('P');
        term15281 = new Boolean(false);
        term15283 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.nio.charset.CharsetEncoder");
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = "whBvTVIIlC";
        args[1] = term15243;
        args[2] = "IgRJUzaCwW";
        args[3] = "JUmudUmaaV";
        args[4] = "KoyGrUJeJW";
        args[5] = null;
        args[6] = term15281;
        args[7] = term15283;
        callMethod(klass, "strEscape", argTypes, term15203, args);
    }

};



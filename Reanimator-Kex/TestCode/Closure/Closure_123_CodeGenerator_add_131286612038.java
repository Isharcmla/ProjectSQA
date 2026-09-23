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

public class CodeGenerator_add_131286612038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5435;

    public CodeGenerator_add_131286612038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5436 = new HashMap();
        Class<? extends Object> term26732 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term26731 = ((Class) term26732).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term26731).setAccessible(true);
        Object enum75 = ((Field) term26731).get((Object) null);
        term5435 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term5435, term5435.getClass(), "escapedJsStrings", term5436);
        setField(term5435, term5435.getClass(), "cc", null);
        setField(term5435, term5435.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term5435, term5435.getClass(), "preferSingleQuotes", true);
        setBooleanField(term5435, term5435.getClass(), "trustedStrings", false);
        setField(term5435, term5435.getClass(), "languageMode", enum75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        try {
            callMethod(klass, "add", argTypes, term5435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



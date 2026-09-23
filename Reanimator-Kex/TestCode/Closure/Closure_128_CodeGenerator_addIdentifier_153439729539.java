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

public class CodeGenerator_addIdentifier_153439729539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4651;

    public CodeGenerator_addIdentifier_153439729539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4652 = new HashMap();
        term4651 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term4651, term4651.getClass(), "ESCAPED_JS_STRINGS", term4652);
        setField(term4651, term4651.getClass(), "cc", null);
        setField(term4651, term4651.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term4651, term4651.getClass(), "preferSingleQuotes", false);
        setBooleanField(term4651, term4651.getClass(), "trustedStrings", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        try {
            callMethod(klass, "addIdentifier", argTypes, term4651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



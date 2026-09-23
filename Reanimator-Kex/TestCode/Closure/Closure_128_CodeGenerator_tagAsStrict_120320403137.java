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

public class CodeGenerator_tagAsStrict_120320403137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4603;

    public CodeGenerator_tagAsStrict_120320403137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4604 = new HashMap();
        term4603 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term4603, term4603.getClass(), "ESCAPED_JS_STRINGS", term4604);
        setField(term4603, term4603.getClass(), "cc", null);
        setField(term4603, term4603.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term4603, term4603.getClass(), "preferSingleQuotes", true);
        setBooleanField(term4603, term4603.getClass(), "trustedStrings", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "tagAsStrict", argTypes, term4603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



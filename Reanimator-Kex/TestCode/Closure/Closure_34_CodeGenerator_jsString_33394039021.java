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
import java.lang.Boolean;

public class CodeGenerator_jsString_33394039021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2719;
     Object term2742;

    public CodeGenerator_jsString_33394039021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2720 = new HashMap();
        term2719 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2719, term2719.getClass(), "ESCAPED_JS_STRINGS", term2720);
        setField(term2719, term2719.getClass(), "cc", null);
        setField(term2719, term2719.getClass(), "outputCharsetEncoder", null);
        term2742 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "UlajhuVLaP";
        args[1] = term2742;
        callMethod(klass, "jsString", argTypes, term2719, args);
    }

};



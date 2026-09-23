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
import java.lang.Character;
import java.lang.Boolean;

public class CodeGenerator_strEscape_39078959626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7497;
     Object term7522;
     Object term7560;
     Object term7562;

    public CodeGenerator_strEscape_39078959626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7498 = new HashMap();
        term7497 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7497, term7497.getClass(), "ESCAPED_JS_STRINGS", term7498);
        setField(term7497, term7497.getClass(), "cc", null);
        setField(term7497, term7497.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7497, term7497.getClass(), "preferSingleQuotes", false);
        setBooleanField(term7497, term7497.getClass(), "trustedStrings", true);
        term7522 = new Character('P');
        term7560 = new Boolean(false);
        term7562 = new Boolean(false);
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
        args[1] = term7522;
        args[2] = "IgRJUzaCwW";
        args[3] = "JUmudUmaaV";
        args[4] = "KoyGrUJeJW";
        args[5] = null;
        args[6] = term7560;
        args[7] = term7562;
        callMethod(klass, "strEscape", argTypes, term7497, args);
    }

};



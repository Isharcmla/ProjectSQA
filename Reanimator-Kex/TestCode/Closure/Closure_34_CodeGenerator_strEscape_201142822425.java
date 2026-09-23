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
import java.lang.Character;
import java.lang.Boolean;

public class CodeGenerator_strEscape_201142822425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2832;
     Object term2870;

    public CodeGenerator_strEscape_201142822425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2832 = new Character('P');
        term2870 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.nio.charset.CharsetEncoder");
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = "GzFkzHGYFt";
        args[1] = term2832;
        args[2] = "tShwQLRGNe";
        args[3] = "LvtrsXUliU";
        args[4] = "xLbjWUgOIL";
        args[5] = null;
        args[6] = term2870;
        callMethod(klass, "strEscape", argTypes, null, args);
    }

};



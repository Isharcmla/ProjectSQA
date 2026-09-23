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
import java.lang.StringBuffer;

public class AbstractCommandLineRunner_writeOutput_196761170099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103195;
     Object term103300;

    public AbstractCommandLineRunner_writeOutput_196761170099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103195 = new StringBuffer();
        term103300 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term103301 = (byte[]) newByteArray(16);
        setField(term103300, term103300.getClass(), "toStringCache", null);
        setByteElement(term103301, 0, (byte) 110);
        setByteElement(term103301, 1, (byte) 117);
        setByteElement(term103301, 2, (byte) 108);
        setByteElement(term103301, 3, (byte) 108);
        setByteElement(term103301, 4, (byte) 10);
        setField(term103300, term103300.getClass(), "value", term103301);
        setByteField(term103300, term103300.getClass(), "coder", (byte) 0);
        setIntField(term103300, term103300.getClass(), "count", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term103195;
        args[1] = null;
        args[2] = null;
        args[3] = "";
        args[4] = "";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term103195, term103300));
    }

};



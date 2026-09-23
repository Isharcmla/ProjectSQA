package org.apache.commons.lang.text;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_appendln_1141018072217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5085;
     Object term5144;
     Object term5176;
     Object term5178;

    public StrBuilder_appendln_1141018072217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5085 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5086 = (char[]) newCharArray(32);
        setField(term5085, term5085.getClass(), "buffer", term5086);
        setIntField(term5085, term5085.getClass(), "size", -93135961);
        setField(term5085, term5085.getClass(), "newLine", "jiKYgYHqIS");
        setField(term5085, term5085.getClass(), "nullText", "DfISiziTgG");
        term5144 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5157 = (byte[]) newByteArray(16);
        setField(term5144, term5144.getClass(), "toStringCache", "XqgfKFvPSD");
        setField(term5144, term5144.getClass(), "value", term5157);
        setByteField(term5144, term5144.getClass(), "coder", (byte) 75);
        setIntField(term5144, term5144.getClass(), "count", -112921587);
        term5176 = new Integer(933028652);
        term5178 = new Integer(287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5144;
        args[1] = term5176;
        args[2] = term5178;
        try {
            callMethod(klass, "appendln", argTypes, term5085, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



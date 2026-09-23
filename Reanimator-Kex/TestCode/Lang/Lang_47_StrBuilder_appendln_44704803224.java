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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_appendln_44704803224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5706;
     Object term5765;

    public StrBuilder_appendln_44704803224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5706 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5707 = (char[]) newCharArray(32);
        setField(term5706, term5706.getClass(), "buffer", term5707);
        setIntField(term5706, term5706.getClass(), "size", 1063420942);
        setField(term5706, term5706.getClass(), "newLine", "qxSDVejjiY");
        setField(term5706, term5706.getClass(), "nullText", "xBsXSDjXYK");
        term5765 = (char[]) newCharArray(1);
        setCharElement(term5765, 0, 'r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5765;
        try {
            callMethod(klass, "appendln", argTypes, term5706, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



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

public class StrBuilder_getChars_1317089266135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2094;
     Object term2153;
     Object term2155;
     Object term2157;
     Object term2162;

    public StrBuilder_getChars_1317089266135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2094 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2095 = (char[]) newCharArray(32);
        setField(term2094, term2094.getClass(), "buffer", term2095);
        setIntField(term2094, term2094.getClass(), "size", 590364439);
        setField(term2094, term2094.getClass(), "newLine", "aKnKipADSo");
        setField(term2094, term2094.getClass(), "nullText", "wSQxaModmm");
        term2153 = new Integer(865208305);
        term2155 = new Integer(-1275173084);
        term2157 = (char[]) newCharArray(4);
        setCharElement(term2157, 0, 'Z');
        setCharElement(term2157, 1, 't');
        setCharElement(term2157, 2, 'T');
        setCharElement(term2157, 3, 'D');
        term2162 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(char.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2153;
        args[1] = term2155;
        args[2] = term2157;
        args[3] = term2162;
        try {
            callMethod(klass, "getChars", argTypes, term2094, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



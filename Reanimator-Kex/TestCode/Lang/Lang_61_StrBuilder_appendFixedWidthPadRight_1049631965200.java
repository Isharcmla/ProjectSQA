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
import java.lang.Integer;
import java.lang.Character;

public class StrBuilder_appendFixedWidthPadRight_1049631965200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5152;
     Object term5211;
     Object term5212;
     Object term5214;

    public StrBuilder_appendFixedWidthPadRight_1049631965200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5152 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5153 = (char[]) newCharArray(32);
        setField(term5152, term5152.getClass(), "buffer", term5153);
        setIntField(term5152, term5152.getClass(), "size", 287287233);
        setField(term5152, term5152.getClass(), "newLine", "JiVRgTZvKc");
        setField(term5152, term5152.getClass(), "nullText", "XPKmummaqg");
        term5211 = newInstance(Class.forName("java.lang.Object"));
        term5212 = new Integer(962840079);
        term5214 = new Character('u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term5211;
        args[1] = term5212;
        args[2] = term5214;
        try {
            callMethod(klass, "appendFixedWidthPadRight", argTypes, term5152, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



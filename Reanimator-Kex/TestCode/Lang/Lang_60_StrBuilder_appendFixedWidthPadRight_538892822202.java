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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Character;

public class StrBuilder_appendFixedWidthPadRight_538892822202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5268;
     Object term5327;
     Object term5329;
     Object term5331;

    public StrBuilder_appendFixedWidthPadRight_538892822202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5268 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5269 = (char[]) newCharArray(32);
        setField(term5268, term5268.getClass(), "buffer", term5269);
        setIntField(term5268, term5268.getClass(), "size", 1540719661);
        setField(term5268, term5268.getClass(), "newLine", "BKLfkLiZTH");
        setField(term5268, term5268.getClass(), "nullText", "SPpkrGcPRr");
        term5327 = new Integer(1265463001);
        term5329 = new Integer(335112684);
        term5331 = new Character('L');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term5327;
        args[1] = term5329;
        args[2] = term5331;
        try {
            callMethod(klass, "appendFixedWidthPadRight", argTypes, term5268, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};



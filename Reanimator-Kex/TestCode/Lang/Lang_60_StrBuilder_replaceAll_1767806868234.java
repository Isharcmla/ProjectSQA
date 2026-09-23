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
import java.lang.Character;

public class StrBuilder_replaceAll_1767806868234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7796;
     Object term7855;
     Object term7857;

    public StrBuilder_replaceAll_1767806868234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7796 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7797 = (char[]) newCharArray(32);
        setField(term7796, term7796.getClass(), "buffer", term7797);
        setIntField(term7796, term7796.getClass(), "size", 1045657203);
        setField(term7796, term7796.getClass(), "newLine", "UfQtPRyWRC");
        setField(term7796, term7796.getClass(), "nullText", "FPvxVzzSvD");
        term7855 = new Character('P');
        term7857 = new Character('w');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term7855;
        args[1] = term7857;
        try {
            callMethod(klass, "replaceAll", argTypes, term7796, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



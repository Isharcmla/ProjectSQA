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

public class StrBuilder_appendSeparator_1020037396254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7261;
     Object term7320;

    public StrBuilder_appendSeparator_1020037396254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7261 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7262 = (char[]) newCharArray(32);
        setField(term7261, term7261.getClass(), "buffer", term7262);
        setIntField(term7261, term7261.getClass(), "size", 444029505);
        setField(term7261, term7261.getClass(), "newLine", "PznxWXsZME");
        setField(term7261, term7261.getClass(), "nullText", "ZzIujlwVsw");
        term7320 = new Character('H');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term7320;
        try {
            callMethod(klass, "appendSeparator", argTypes, term7261, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Character;
import java.lang.Integer;

public class StrBuilder_indexOf_1329248800259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10407;
     Object term10466;
     Object term10468;
     Object term81316;

    public StrBuilder_indexOf_1329248800259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10407 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10408 = (char[]) newCharArray(32);
        setField(term10407, term10407.getClass(), "buffer", term10408);
        setIntField(term10407, term10407.getClass(), "size", -1498296052);
        setField(term10407, term10407.getClass(), "newLine", "HDaezxQfQR");
        setField(term10407, term10407.getClass(), "nullText", "iikZEapDlu");
        term10466 = new Character('j');
        term10468 = new Integer(2098647989);
        term81316 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81317 = (char[]) newCharArray(32);
        setField(term81316, term81316.getClass(), "buffer", term81317);
        setIntField(term81316, term81316.getClass(), "size", -1498296052);
        setField(term81316, term81316.getClass(), "newLine", "HDaezxQfQR");
        setField(term81316, term81316.getClass(), "nullText", "iikZEapDlu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10466;
        args[1] = term10468;
        Object retValue = callMethod(klass, "indexOf", argTypes, term10407, args);
        assertTrue(recursiveEquals(term10407, term81316));
        assertTrue(recursiveEquals(term10466, 'j'));
        assertTrue(recursiveEquals(term10468, 2098647989));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



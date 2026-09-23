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
import java.lang.Integer;
import java.lang.Character;

public class StrBuilder_appendFixedWidthPadLeft_688195012191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4919;
     Object term4978;
     Object term4979;
     Object term4981;
     Object term58310;
     Object term58316;

    public StrBuilder_appendFixedWidthPadLeft_688195012191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4919 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4920 = (char[]) newCharArray(32);
        setField(term4919, term4919.getClass(), "buffer", term4920);
        setIntField(term4919, term4919.getClass(), "size", 1324040357);
        setField(term4919, term4919.getClass(), "newLine", "JqXGgAhZPl");
        setField(term4919, term4919.getClass(), "nullText", "jiKYgYHqIS");
        term4978 = newInstance(Class.forName("java.lang.Object"));
        term4979 = new Integer(-1588772968);
        term4981 = new Character('b');
        term58310 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term58311 = (char[]) newCharArray(32);
        setField(term58310, term58310.getClass(), "buffer", term58311);
        setIntField(term58310, term58310.getClass(), "size", 1324040357);
        setField(term58310, term58310.getClass(), "newLine", "JqXGgAhZPl");
        setField(term58310, term58310.getClass(), "nullText", "jiKYgYHqIS");
        term58316 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term4978;
        args[1] = term4979;
        args[2] = term4981;
        callMethod(klass, "appendFixedWidthPadLeft", argTypes, term4919, args);
        assertTrue(recursiveEquals(term4919, term58310));
        assertTrue(recursiveEquals(term4978, term58316));
        assertTrue(recursiveEquals(term4979, -1588772968));
        assertTrue(recursiveEquals(term4981, 'b'));
    }

};



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
import java.lang.Integer;

public class StrBuilder_lastIndexOf_1171348458262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11127;
     Object term11186;
     Object term11188;

    public StrBuilder_lastIndexOf_1171348458262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11127 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11128 = (char[]) newCharArray(32);
        setField(term11127, term11127.getClass(), "buffer", term11128);
        setIntField(term11127, term11127.getClass(), "size", 1398204340);
        setField(term11127, term11127.getClass(), "newLine", "NnpwZBUTvx");
        setField(term11127, term11127.getClass(), "nullText", "tlQSNgTkQX");
        term11186 = new Character('C');
        term11188 = new Integer(229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term11186;
        args[1] = term11188;
        try {
            callMethod(klass, "lastIndexOf", argTypes, term11127, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



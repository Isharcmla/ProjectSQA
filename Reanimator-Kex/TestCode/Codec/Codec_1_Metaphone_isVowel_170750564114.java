package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Metaphone_isVowel_170750564114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term27;
     Object term59;

    public Metaphone_isVowel_170750564114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term25, term25.getClass(), "maxCodeLen", 4);
        term27 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term40 = (byte[]) newByteArray(16);
        setField(term27, term27.getClass(), "toStringCache", "sjlJAEtRrb");
        setField(term27, term27.getClass(), "value", term40);
        setByteField(term27, term27.getClass(), "coder", (byte) 47);
        setIntField(term27, term27.getClass(), "count", 568599855);
        term59 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term27;
        args[1] = term59;
        try {
            callMethod(klass, "isVowel", argTypes, term25, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};

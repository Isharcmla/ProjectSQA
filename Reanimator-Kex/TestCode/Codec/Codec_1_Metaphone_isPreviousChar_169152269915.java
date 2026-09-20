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
import java.lang.Character;

public class Metaphone_isPreviousChar_169152269915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term89;
     Object term121;
     Object term123;

    public Metaphone_isPreviousChar_169152269915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term87, term87.getClass(), "maxCodeLen", 4);
        term89 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term102 = (byte[]) newByteArray(16);
        setField(term89, term89.getClass(), "toStringCache", "MuLcgQHgqz");
        setField(term89, term89.getClass(), "value", term102);
        setByteField(term89, term89.getClass(), "coder", (byte) 48);
        setIntField(term89, term89.getClass(), "count", 1484323161);
        term121 = new Integer(391863371);
        term123 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term89;
        args[1] = term121;
        args[2] = term123;
        try {
            callMethod(klass, "isPreviousChar", argTypes, term87, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};

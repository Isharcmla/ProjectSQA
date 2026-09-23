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

public class StrBuilder_indexOf_1329278622319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13114;
     Object term13173;

    public StrBuilder_indexOf_1329278622319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13114 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13115 = (char[]) newCharArray(32);
        setField(term13114, term13114.getClass(), "buffer", term13115);
        setIntField(term13114, term13114.getClass(), "size", 114754804);
        setField(term13114, term13114.getClass(), "newLine", "bxrCBbrrct");
        setField(term13114, term13114.getClass(), "nullText", "CKWpJaaaxX");
        term13173 = new Character('W');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term13173;
        try {
            callMethod(klass, "indexOf", argTypes, term13114, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



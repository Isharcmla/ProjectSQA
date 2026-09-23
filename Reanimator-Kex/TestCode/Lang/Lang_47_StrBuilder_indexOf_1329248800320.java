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

public class StrBuilder_indexOf_1329248800320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13227;
     Object term13286;
     Object term13288;

    public StrBuilder_indexOf_1329248800320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13227 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13228 = (char[]) newCharArray(32);
        setField(term13227, term13227.getClass(), "buffer", term13228);
        setIntField(term13227, term13227.getClass(), "size", 1687361082);
        setField(term13227, term13227.getClass(), "newLine", "UBRmXJmfrt");
        setField(term13227, term13227.getClass(), "nullText", "WZzvmIHhzZ");
        term13286 = new Character('E');
        term13288 = new Integer(584893196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term13286;
        args[1] = term13288;
        try {
            callMethod(klass, "indexOf", argTypes, term13227, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



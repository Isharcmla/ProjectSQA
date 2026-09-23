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

public class StrBuilder_indexOf_1695911743324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13721;
     Object term13780;
     Object term95110;

    public StrBuilder_indexOf_1695911743324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13721 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13722 = (char[]) newCharArray(32);
        setField(term13721, term13721.getClass(), "buffer", term13722);
        setIntField(term13721, term13721.getClass(), "size", 389427431);
        setField(term13721, term13721.getClass(), "newLine", "beAMpkroCQ");
        setField(term13721, term13721.getClass(), "nullText", "uSUvKAyuvd");
        term13780 = new Integer(-1945706126);
        term95110 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term95111 = (char[]) newCharArray(32);
        setField(term95110, term95110.getClass(), "buffer", term95111);
        setIntField(term95110, term95110.getClass(), "size", 389427431);
        setField(term95110, term95110.getClass(), "newLine", "beAMpkroCQ");
        setField(term95110, term95110.getClass(), "nullText", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13780;
        Object retValue = callMethod(klass, "indexOf", argTypes, term13721, args);
        assertTrue(recursiveEquals(term13721, term95110));
        assertTrue(recursiveEquals(term13780, -1945706126));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



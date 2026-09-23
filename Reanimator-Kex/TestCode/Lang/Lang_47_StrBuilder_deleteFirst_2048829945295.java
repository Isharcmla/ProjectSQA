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

public class StrBuilder_deleteFirst_2048829945295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10227;
     Object term86417;
     Object term86235;

    public StrBuilder_deleteFirst_2048829945295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10227 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10228 = (char[]) newCharArray(32);
        setField(term10227, term10227.getClass(), "buffer", term10228);
        setIntField(term10227, term10227.getClass(), "size", 202001407);
        setField(term10227, term10227.getClass(), "newLine", "OqbwYQfvAe");
        setField(term10227, term10227.getClass(), "nullText", "tRxZafjqIx");
        term86417 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term86418 = (char[]) newCharArray(32);
        setField(term86417, term86417.getClass(), "buffer", term86418);
        setIntField(term86417, term86417.getClass(), "size", 202001407);
        setField(term86417, term86417.getClass(), "newLine", "OqbwYQfvAe");
        setField(term86417, term86417.getClass(), "nullText", "tRxZafjqIx");
        term86235 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term86236 = (char[]) newCharArray(32);
        setField(term86235, term86235.getClass(), "buffer", term86236);
        setIntField(term86235, term86235.getClass(), "size", 202001407);
        setField(term86235, term86235.getClass(), "newLine", "OqbwYQfvAe");
        setField(term86235, term86235.getClass(), "nullText", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term10227, args);
        assertTrue(recursiveEquals(term10227, term86417));
        assertTrue(recursiveEquals(retValue, term86235));
    }

};



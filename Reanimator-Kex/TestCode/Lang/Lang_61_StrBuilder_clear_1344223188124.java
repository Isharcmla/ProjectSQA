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

public class StrBuilder_clear_1344223188124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1294;
     Object term36054;
     Object term35995;

    public StrBuilder_clear_1344223188124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1294 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1295 = (char[]) newCharArray(32);
        setField(term1294, term1294.getClass(), "buffer", term1295);
        setIntField(term1294, term1294.getClass(), "size", 1585847225);
        setField(term1294, term1294.getClass(), "newLine", "vrQLuWIDJX");
        setField(term1294, term1294.getClass(), "nullText", "flxyYxBRtu");
        term36054 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term36055 = (char[]) newCharArray(32);
        setField(term36054, term36054.getClass(), "buffer", term36055);
        setIntField(term36054, term36054.getClass(), "size", 0);
        setField(term36054, term36054.getClass(), "newLine", "vrQLuWIDJX");
        setField(term36054, term36054.getClass(), "nullText", "flxyYxBRtu");
        term35995 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term35996 = (char[]) newCharArray(32);
        setField(term35995, term35995.getClass(), "buffer", term35996);
        setIntField(term35995, term35995.getClass(), "size", 0);
        setField(term35995, term35995.getClass(), "newLine", "vrQLuWIDJX");
        setField(term35995, term35995.getClass(), "nullText", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clear", argTypes, term1294, args);
        assertTrue(recursiveEquals(term1294, term36054));
        assertTrue(recursiveEquals(retValue, term35995));
    }

};



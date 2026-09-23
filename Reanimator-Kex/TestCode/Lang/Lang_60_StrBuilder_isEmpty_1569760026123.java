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

public class StrBuilder_isEmpty_1569760026123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;
     Object term35998;

    public StrBuilder_isEmpty_1569760026123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1183 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1184 = (char[]) newCharArray(32);
        setField(term1183, term1183.getClass(), "buffer", term1184);
        setIntField(term1183, term1183.getClass(), "size", -883034806);
        setField(term1183, term1183.getClass(), "newLine", "eZFUvlxvGV");
        setField(term1183, term1183.getClass(), "nullText", "BYqFIqCKAV");
        term35998 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term35999 = (char[]) newCharArray(32);
        setField(term35998, term35998.getClass(), "buffer", term35999);
        setIntField(term35998, term35998.getClass(), "size", -883034806);
        setField(term35998, term35998.getClass(), "newLine", "eZFUvlxvGV");
        setField(term35998, term35998.getClass(), "nullText", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term1183, args);
        assertTrue(recursiveEquals(term1183, term35998));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class StrBuilder_appendln_1316354815235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6400;
     Object term6459;

    public StrBuilder_appendln_1316354815235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6400 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6401 = (char[]) newCharArray(32);
        setField(term6400, term6400.getClass(), "buffer", term6401);
        setIntField(term6400, term6400.getClass(), "size", -1547384488);
        setField(term6400, term6400.getClass(), "newLine", "XylxrMBraH");
        setField(term6400, term6400.getClass(), "nullText", "pORebkoRdD");
        term6459 = new Float(0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term6459;
        try {
            callMethod(klass, "appendln", argTypes, term6400, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



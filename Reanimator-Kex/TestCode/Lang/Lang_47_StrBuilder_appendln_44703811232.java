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
import java.lang.Integer;

public class StrBuilder_appendln_44703811232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6174;
     Object term6233;

    public StrBuilder_appendln_44703811232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6174 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6175 = (char[]) newCharArray(32);
        setField(term6174, term6174.getClass(), "buffer", term6175);
        setIntField(term6174, term6174.getClass(), "size", 1240914516);
        setField(term6174, term6174.getClass(), "newLine", "RYdKCNNMBR");
        setField(term6174, term6174.getClass(), "nullText", "yGtHPyvYiQ");
        term6233 = new Integer(-1465035361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6233;
        try {
            callMethod(klass, "appendln", argTypes, term6174, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



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
import java.lang.Integer;
import java.lang.Double;

public class StrBuilder_insert_185816135220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6457;
     Object term6516;
     Object term6518;

    public StrBuilder_insert_185816135220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6457 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6458 = (char[]) newCharArray(32);
        setField(term6457, term6457.getClass(), "buffer", term6458);
        setIntField(term6457, term6457.getClass(), "size", -1034506028);
        setField(term6457, term6457.getClass(), "newLine", "dpNsDgfPso");
        setField(term6457, term6457.getClass(), "nullText", "hCWPJQKpdc");
        term6516 = new Integer(-1263114719);
        term6518 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term6516;
        args[1] = term6518;
        try {
            callMethod(klass, "insert", argTypes, term6457, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



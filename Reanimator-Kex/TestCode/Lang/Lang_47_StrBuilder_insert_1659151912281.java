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

public class StrBuilder_insert_1659151912281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8932;
     Object term8991;
     Object term8993;

    public StrBuilder_insert_1659151912281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8932 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8933 = (char[]) newCharArray(32);
        setField(term8932, term8932.getClass(), "buffer", term8933);
        setIntField(term8932, term8932.getClass(), "size", -375014958);
        setField(term8932, term8932.getClass(), "newLine", "OYbzXylRWW");
        setField(term8932, term8932.getClass(), "nullText", "DSNsTGYXDF");
        term8991 = new Integer(1107176718);
        term8993 = new Integer(480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8991;
        args[1] = term8993;
        try {
            callMethod(klass, "insert", argTypes, term8932, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



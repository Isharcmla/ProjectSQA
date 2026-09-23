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
import java.lang.Character;

public class StrBuilder_insert_1659152904214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5997;
     Object term6056;
     Object term6058;

    public StrBuilder_insert_1659152904214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5997 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5998 = (char[]) newCharArray(32);
        setField(term5997, term5997.getClass(), "buffer", term5998);
        setIntField(term5997, term5997.getClass(), "size", 1442160736);
        setField(term5997, term5997.getClass(), "newLine", "OEXDRUKcFl");
        setField(term5997, term5997.getClass(), "nullText", "RYdKCNNMBR");
        term6056 = new Integer(1114000454);
        term6058 = new Character('x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term6056;
        args[1] = term6058;
        try {
            callMethod(klass, "insert", argTypes, term5997, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



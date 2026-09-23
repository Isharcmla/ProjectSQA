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

public class StrBuilder_appendln_43750499225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5820;
     Object term5879;
     Object term5886;
     Object term5888;

    public StrBuilder_appendln_43750499225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5820 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5821 = (char[]) newCharArray(32);
        setField(term5820, term5820.getClass(), "buffer", term5821);
        setIntField(term5820, term5820.getClass(), "size", 1375330971);
        setField(term5820, term5820.getClass(), "newLine", "sEnIVFtZuQ");
        setField(term5820, term5820.getClass(), "nullText", "ZVecLZMLHF");
        term5879 = (char[]) newCharArray(6);
        setCharElement(term5879, 0, 'b');
        setCharElement(term5879, 1, 'M');
        setCharElement(term5879, 2, 'u');
        setCharElement(term5879, 3, 'L');
        setCharElement(term5879, 4, 'c');
        setCharElement(term5879, 5, 'g');
        term5886 = new Integer(-478195677);
        term5888 = new Integer(972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5879;
        args[1] = term5886;
        args[2] = term5888;
        try {
            callMethod(klass, "appendln", argTypes, term5820, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



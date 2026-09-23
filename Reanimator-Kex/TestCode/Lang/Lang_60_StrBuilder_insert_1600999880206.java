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

public class StrBuilder_insert_1600999880206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5760;
     Object term5819;
     Object term5821;
     Object term5824;
     Object term5826;

    public StrBuilder_insert_1600999880206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5760 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5761 = (char[]) newCharArray(32);
        setField(term5760, term5760.getClass(), "buffer", term5761);
        setIntField(term5760, term5760.getClass(), "size", 1655935355);
        setField(term5760, term5760.getClass(), "newLine", "ZVecLZMLHF");
        setField(term5760, term5760.getClass(), "nullText", "fztQhjqwdP");
        term5819 = new Integer(-481533957);
        term5821 = (char[]) newCharArray(2);
        setCharElement(term5821, 0, 'z');
        setCharElement(term5821, 1, 'x');
        term5824 = new Integer(1240914516);
        term5826 = new Integer(-1465035361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term5819;
        args[1] = term5821;
        args[2] = term5824;
        args[3] = term5826;
        try {
            callMethod(klass, "insert", argTypes, term5760, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



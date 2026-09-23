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
import java.lang.Character;

public class StrBuilder_setCharAt_1223373802126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518;
     Object term1577;
     Object term1579;

    public StrBuilder_setCharAt_1223373802126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1518 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1519 = (char[]) newCharArray(32);
        setField(term1518, term1518.getClass(), "buffer", term1519);
        setIntField(term1518, term1518.getClass(), "size", -1456670397);
        setField(term1518, term1518.getClass(), "newLine", "TEParAifyi");
        setField(term1518, term1518.getClass(), "nullText", "OWDIEULEFu");
        term1577 = new Integer(1622346318);
        term1579 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1577;
        args[1] = term1579;
        try {
            callMethod(klass, "setCharAt", argTypes, term1518, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



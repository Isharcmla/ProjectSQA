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

public class StrBuilder_insert_1659152904280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8817;
     Object term8876;
     Object term8878;

    public StrBuilder_insert_1659152904280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8817 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8818 = (char[]) newCharArray(32);
        setField(term8817, term8817.getClass(), "buffer", term8818);
        setIntField(term8817, term8817.getClass(), "size", 568954359);
        setField(term8817, term8817.getClass(), "newLine", "smnHEqRFRx");
        setField(term8817, term8817.getClass(), "nullText", "XYtryyobou");
        term8876 = new Integer(53410913);
        term8878 = new Character('J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term8876;
        args[1] = term8878;
        try {
            callMethod(klass, "insert", argTypes, term8817, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



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

public class StrBuilder_insert_1600999880268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8582;
     Object term8641;
     Object term8643;
     Object term8645;
     Object term8647;

    public StrBuilder_insert_1600999880268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8582 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8583 = (char[]) newCharArray(32);
        setField(term8582, term8582.getClass(), "buffer", term8583);
        setIntField(term8582, term8582.getClass(), "size", 906181092);
        setField(term8582, term8582.getClass(), "newLine", "BRIVNtfUWU");
        setField(term8582, term8582.getClass(), "nullText", "DbiCVtPPCT");
        term8641 = new Integer(1045657203);
        term8643 = (char[]) newCharArray(1);
        setCharElement(term8643, 0, 'j');
        term8645 = new Integer(1386130016);
        term8647 = new Integer(1072005683);
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
        args[0] = term8641;
        args[1] = term8643;
        args[2] = term8645;
        args[3] = term8647;
        try {
            callMethod(klass, "insert", argTypes, term8582, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



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

public class StrBuilder_appendFixedWidthPadLeft_900329775198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5035;
     Object term5094;
     Object term5096;
     Object term5098;

    public StrBuilder_appendFixedWidthPadLeft_900329775198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5035 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5036 = (char[]) newCharArray(32);
        setField(term5035, term5035.getClass(), "buffer", term5036);
        setIntField(term5035, term5035.getClass(), "size", -93135961);
        setField(term5035, term5035.getClass(), "newLine", "DfISiziTgG");
        setField(term5035, term5035.getClass(), "nullText", "XqgfKFvPSD");
        term5094 = new Integer(-112921587);
        term5096 = new Integer(933028652);
        term5098 = new Character('M');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term5094;
        args[1] = term5096;
        args[2] = term5098;
        try {
            callMethod(klass, "appendFixedWidthPadLeft", argTypes, term5035, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



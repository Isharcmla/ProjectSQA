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

public class StrBuilder_delete_1381226422288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9509;
     Object term9568;
     Object term9570;

    public StrBuilder_delete_1381226422288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9509 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9510 = (char[]) newCharArray(32);
        setField(term9509, term9509.getClass(), "buffer", term9510);
        setIntField(term9509, term9509.getClass(), "size", -2063457669);
        setField(term9509, term9509.getClass(), "newLine", "jXzmYyrnnT");
        setField(term9509, term9509.getClass(), "nullText", "igCAtimmYB");
        term9568 = new Integer(-1222006000);
        term9570 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9568;
        args[1] = term9570;
        try {
            callMethod(klass, "delete", argTypes, term9509, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



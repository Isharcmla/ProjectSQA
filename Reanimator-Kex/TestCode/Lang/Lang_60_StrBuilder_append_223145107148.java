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

public class StrBuilder_append_223145107148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3388;
     Object term3447;
     Object term3506;
     Object term3508;

    public StrBuilder_append_223145107148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3388 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3389 = (char[]) newCharArray(32);
        setField(term3388, term3388.getClass(), "buffer", term3389);
        setIntField(term3388, term3388.getClass(), "size", -817164822);
        setField(term3388, term3388.getClass(), "newLine", "eqJfYWRaEL");
        setField(term3388, term3388.getClass(), "nullText", "fhkbdRViHi");
        term3447 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3448 = (char[]) newCharArray(32);
        setField(term3447, term3447.getClass(), "buffer", term3448);
        setIntField(term3447, term3447.getClass(), "size", -1016503459);
        setField(term3447, term3447.getClass(), "newLine", "uWHnvSvaPl");
        setField(term3447, term3447.getClass(), "nullText", "kBdSllIBVz");
        term3506 = new Integer(-1968847291);
        term3508 = new Integer(579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3447;
        args[1] = term3506;
        args[2] = term3508;
        try {
            callMethod(klass, "append", argTypes, term3388, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



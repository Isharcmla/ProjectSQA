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
import java.lang.Boolean;

public class StrBuilder_insert_1659152904207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5882;
     Object term5941;
     Object term5943;

    public StrBuilder_insert_1659152904207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5882 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5883 = (char[]) newCharArray(32);
        setField(term5882, term5882.getClass(), "buffer", term5883);
        setIntField(term5882, term5882.getClass(), "size", 1090617576);
        setField(term5882, term5882.getClass(), "newLine", "eVpkWxjuki");
        setField(term5882, term5882.getClass(), "nullText", "SJiQaLvSKv");
        term5941 = new Integer(-1547384488);
        term5943 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term5941;
        args[1] = term5943;
        try {
            callMethod(klass, "insert", argTypes, term5882, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class Base64_decode_1981855093101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64693;
     Object term64780;
     Object term64779;

    public Base64_decode_1981855093101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64693 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term64693, term64693.getClass(), "buffer", null);
        setIntField(term64693, term64693.getClass(), "pos", 0);
        setIntField(term64693, term64693.getClass(), "readPos", 0);
        setIntField(term64693, term64693.getClass(), "currentLinePos", 0);
        setIntField(term64693, term64693.getClass(), "modulus", 0);
        setBooleanField(term64693, term64693.getClass(), "eof", false);
        setIntField(term64693, term64693.getClass(), "decodeSize", 489);
        setIntField(term64693, term64693.getClass(), "x", 0);
        term64780 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term64780, term64780.getClass(), "encodeTable", null);
        setIntField(term64780, term64780.getClass(), "lineLength", 0);
        setField(term64780, term64780.getClass(), "lineSeparator", null);
        setIntField(term64780, term64780.getClass(), "decodeSize", 489);
        setIntField(term64780, term64780.getClass(), "encodeSize", 0);
        setField(term64780, term64780.getClass(), "buffer", null);
        setIntField(term64780, term64780.getClass(), "pos", 0);
        setIntField(term64780, term64780.getClass(), "readPos", 0);
        setIntField(term64780, term64780.getClass(), "currentLinePos", 0);
        setIntField(term64780, term64780.getClass(), "modulus", 0);
        setBooleanField(term64780, term64780.getClass(), "eof", false);
        setIntField(term64780, term64780.getClass(), "x", 0);
        term64779 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "decode", argTypes, term64693, args);
        assertTrue(recursiveEquals(term64693, term64780));
        assertTrue(recursiveEquals(retValue, term64779));
    }

};



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

public class StrBuilder_append_1027806917157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4082;
     Object term4141;

    public StrBuilder_append_1027806917157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4082 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4083 = (char[]) newCharArray(32);
        setField(term4082, term4082.getClass(), "buffer", term4083);
        setIntField(term4082, term4082.getClass(), "size", 292681826);
        setField(term4082, term4082.getClass(), "newLine", "MAcUBcBckh");
        setField(term4082, term4082.getClass(), "nullText", "oVgzLbrsFr");
        term4141 = new Integer(458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4141;
        try {
            callMethod(klass, "append", argTypes, term4082, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class StrBuilder_insert_1659152904273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8702;
     Object term8761;
     Object term8763;

    public StrBuilder_insert_1659152904273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8702 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8703 = (char[]) newCharArray(32);
        setField(term8702, term8702.getClass(), "buffer", term8703);
        setIntField(term8702, term8702.getClass(), "size", 1861318859);
        setField(term8702, term8702.getClass(), "newLine", "WzFopsaDuG");
        setField(term8702, term8702.getClass(), "nullText", "PapWxkhEWe");
        term8761 = new Integer(1474524152);
        term8763 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term8761;
        args[1] = term8763;
        try {
            callMethod(klass, "insert", argTypes, term8702, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};



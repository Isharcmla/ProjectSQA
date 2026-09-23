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

public class StrBuilder_substring_440212205312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12301;
     Object term12360;
     Object term12362;

    public StrBuilder_substring_440212205312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12301 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12302 = (char[]) newCharArray(32);
        setField(term12301, term12301.getClass(), "buffer", term12302);
        setIntField(term12301, term12301.getClass(), "size", -2066804303);
        setField(term12301, term12301.getClass(), "newLine", "MHGKyEnwKc");
        setField(term12301, term12301.getClass(), "nullText", "ShIELyuULw");
        term12360 = new Integer(-1731761810);
        term12362 = new Integer(197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term12360;
        args[1] = term12362;
        try {
            callMethod(klass, "substring", argTypes, term12301, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



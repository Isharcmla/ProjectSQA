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

public class StrBuilder_deleteCharAt_1475985237127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1633;
     Object term1692;

    public StrBuilder_deleteCharAt_1475985237127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1633 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1634 = (char[]) newCharArray(32);
        setField(term1633, term1633.getClass(), "buffer", term1634);
        setIntField(term1633, term1633.getClass(), "size", 1048535127);
        setField(term1633, term1633.getClass(), "newLine", "dWRymuLBtr");
        setField(term1633, term1633.getClass(), "nullText", "AijpHYOFuy");
        term1692 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1692;
        try {
            callMethod(klass, "deleteCharAt", argTypes, term1633, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



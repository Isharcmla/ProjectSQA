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

public class StrBuilder_insert_1659151912215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6112;
     Object term6171;
     Object term6173;

    public StrBuilder_insert_1659151912215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6112 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6113 = (char[]) newCharArray(32);
        setField(term6112, term6112.getClass(), "buffer", term6113);
        setIntField(term6112, term6112.getClass(), "size", -556405712);
        setField(term6112, term6112.getClass(), "newLine", "yGtHPyvYiQ");
        setField(term6112, term6112.getClass(), "nullText", "MvRIxilFMJ");
        term6171 = new Integer(-1772434990);
        term6173 = new Integer(-1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term6171;
        args[1] = term6173;
        try {
            callMethod(klass, "insert", argTypes, term6112, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



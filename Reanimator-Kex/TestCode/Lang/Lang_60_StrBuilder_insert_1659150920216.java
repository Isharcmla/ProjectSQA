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
import java.lang.Long;

public class StrBuilder_insert_1659150920216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6227;
     Object term6286;
     Object term6288;

    public StrBuilder_insert_1659150920216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6227 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6228 = (char[]) newCharArray(32);
        setField(term6227, term6227.getClass(), "buffer", term6228);
        setIntField(term6227, term6227.getClass(), "size", -505439934);
        setField(term6227, term6227.getClass(), "newLine", "iNwOJRBEjp");
        setField(term6227, term6227.getClass(), "nullText", "XylxrMBraH");
        term6286 = new Integer(-344842608);
        term6288 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term6286;
        args[1] = term6288;
        try {
            callMethod(klass, "insert", argTypes, term6227, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



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

public class StrBuilder_delete_1381226422222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6689;
     Object term6748;
     Object term6750;

    public StrBuilder_delete_1381226422222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6689 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6690 = (char[]) newCharArray(32);
        setField(term6689, term6689.getClass(), "buffer", term6690);
        setIntField(term6689, term6689.getClass(), "size", 683666002);
        setField(term6689, term6689.getClass(), "newLine", "AdxvLJhNLe");
        setField(term6689, term6689.getClass(), "nullText", "lHfTrWKMPk");
        term6748 = new Integer(1596213415);
        term6750 = new Integer(-268815336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term6748;
        args[1] = term6750;
        try {
            callMethod(klass, "delete", argTypes, term6689, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



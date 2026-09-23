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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_lastIndexOf_1917684179329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14330;
     Object term96379;

    public StrBuilder_lastIndexOf_1917684179329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14330 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14331 = (char[]) newCharArray(32);
        setField(term14330, term14330.getClass(), "buffer", term14331);
        setIntField(term14330, term14330.getClass(), "size", -1870495012);
        setField(term14330, term14330.getClass(), "newLine", "vvoLrMGCoN");
        setField(term14330, term14330.getClass(), "nullText", "pXdglvyrQe");
        term96379 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96380 = (char[]) newCharArray(32);
        setField(term96379, term96379.getClass(), "buffer", term96380);
        setIntField(term96379, term96379.getClass(), "size", -1870495012);
        setField(term96379, term96379.getClass(), "newLine", "vvoLrMGCoN");
        setField(term96379, term96379.getClass(), "nullText", "pXdglvyrQe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term14330, args);
        assertTrue(recursiveEquals(term14330, term96379));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



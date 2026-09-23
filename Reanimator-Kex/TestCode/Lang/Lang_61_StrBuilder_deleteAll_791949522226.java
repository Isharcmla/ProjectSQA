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

public class StrBuilder_deleteAll_791949522226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7030;
     Object term70163;
     Object term70090;

    public StrBuilder_deleteAll_791949522226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7030 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7031 = (char[]) newCharArray(32);
        setField(term7030, term7030.getClass(), "buffer", term7031);
        setIntField(term7030, term7030.getClass(), "size", 339854490);
        setField(term7030, term7030.getClass(), "newLine", "OJJtVNPyKZ");
        setField(term7030, term7030.getClass(), "nullText", "AKNapTAfmD");
        term70163 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70164 = (char[]) newCharArray(32);
        setField(term70163, term70163.getClass(), "buffer", term70164);
        setIntField(term70163, term70163.getClass(), "size", 339854490);
        setField(term70163, term70163.getClass(), "newLine", "OJJtVNPyKZ");
        setField(term70163, term70163.getClass(), "nullText", "AKNapTAfmD");
        term70090 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70091 = (char[]) newCharArray(32);
        setField(term70090, term70090.getClass(), "buffer", term70091);
        setIntField(term70090, term70090.getClass(), "size", 339854490);
        setField(term70090, term70090.getClass(), "newLine", "OJJtVNPyKZ");
        setField(term70090, term70090.getClass(), "nullText", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        Object retValue = callMethod(klass, "deleteAll", argTypes, term7030, args);
        assertTrue(recursiveEquals(term7030, term70163));
        assertTrue(recursiveEquals(retValue, term70090));
    }

};



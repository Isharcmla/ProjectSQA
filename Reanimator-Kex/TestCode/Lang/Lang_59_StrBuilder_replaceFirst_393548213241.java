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

public class StrBuilder_replaceFirst_393548213241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8469;
     Object term76617;
     Object term76423;

    public StrBuilder_replaceFirst_393548213241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8469 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8470 = (char[]) newCharArray(32);
        setField(term8469, term8469.getClass(), "buffer", term8470);
        setIntField(term8469, term8469.getClass(), "size", 568954359);
        setField(term8469, term8469.getClass(), "newLine", "aWYOWZFyaX");
        setField(term8469, term8469.getClass(), "nullText", "BRIVNtfUWU");
        term76617 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term76618 = (char[]) newCharArray(32);
        setField(term76617, term76617.getClass(), "buffer", term76618);
        setIntField(term76617, term76617.getClass(), "size", 568954359);
        setField(term76617, term76617.getClass(), "newLine", "aWYOWZFyaX");
        setField(term76617, term76617.getClass(), "nullText", "BRIVNtfUWU");
        term76423 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term76424 = (char[]) newCharArray(32);
        setField(term76423, term76423.getClass(), "buffer", term76424);
        setIntField(term76423, term76423.getClass(), "size", 568954359);
        setField(term76423, term76423.getClass(), "newLine", "aWYOWZFyaX");
        setField(term76423, term76423.getClass(), "nullText", "BRIVNtfUWU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "DbiCVtPPCT";
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term8469, args);
        assertTrue(recursiveEquals(term8469, term76617));
        assertTrue(recursiveEquals(retValue, term76423));
    }

};



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

public class StrBuilder_deleteFirst_1040172870435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139495;
     Object term140881;
     Object term140843;

    public StrBuilder_deleteFirst_1040172870435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139495 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term138325 = (char[]) newCharArray(31);
        setIntField(term139495, term139495.getClass(), "size", 31);
        setCharElement(term138325, 26, (char) 65535);
        setField(term139495, term139495.getClass(), "buffer", term138325);
        term140881 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term140882 = (char[]) newCharArray(31);
        setField(term140881, term140881.getClass(), "buffer", term140882);
        setIntField(term140881, term140881.getClass(), "size", 30);
        setField(term140881, term140881.getClass(), "newLine", null);
        setField(term140881, term140881.getClass(), "nullText", null);
        term140843 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term140844 = (char[]) newCharArray(31);
        setField(term140843, term140843.getClass(), "buffer", term140844);
        setIntField(term140843, term140843.getClass(), "size", 30);
        setField(term140843, term140843.getClass(), "newLine", null);
        setField(term140843, term140843.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 65535;
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term139495, args);
        assertTrue(recursiveEquals(term139495, term140881));
        assertTrue(recursiveEquals(retValue, term140843));
    }

};



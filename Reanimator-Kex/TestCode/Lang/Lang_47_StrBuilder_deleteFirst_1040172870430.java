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

public class StrBuilder_deleteFirst_1040172870430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131062;
     Object term133827;
     Object term133792;

    public StrBuilder_deleteFirst_1040172870430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131062 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term129929 = (char[]) newCharArray(31);
        setIntField(term131062, term131062.getClass(), "size", 26);
        setField(term131062, term131062.getClass(), "buffer", term129929);
        term133827 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term133828 = (char[]) newCharArray(31);
        setField(term133827, term133827.getClass(), "buffer", term133828);
        setIntField(term133827, term133827.getClass(), "size", 26);
        setField(term133827, term133827.getClass(), "newLine", null);
        setField(term133827, term133827.getClass(), "nullText", null);
        term133792 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term133793 = (char[]) newCharArray(31);
        setField(term133792, term133792.getClass(), "buffer", term133793);
        setIntField(term133792, term133792.getClass(), "size", 26);
        setField(term133792, term133792.getClass(), "newLine", null);
        setField(term133792, term133792.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 65535;
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term131062, args);
        assertTrue(recursiveEquals(term131062, term133827));
        assertTrue(recursiveEquals(retValue, term133792));
    }

};



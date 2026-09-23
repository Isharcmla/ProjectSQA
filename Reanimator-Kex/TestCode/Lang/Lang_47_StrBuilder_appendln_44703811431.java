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

public class StrBuilder_appendln_44703811431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133053;
     Object term136675;
     Object term133925;

    public StrBuilder_appendln_44703811431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133053 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term131852 = (char[]) newCharArray(544);
        setIntField(term133053, term133053.getClass(), "size", 480);
        setField(term133053, term133053.getClass(), "buffer", term131852);
        term136675 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term136676 = (char[]) newCharArray(544);
        setCharElement(term136676, 480, (char) 48);
        setCharElement(term136676, 481, (char) 10);
        setField(term136675, term136675.getClass(), "buffer", term136676);
        setIntField(term136675, term136675.getClass(), "size", 482);
        setField(term136675, term136675.getClass(), "newLine", null);
        setField(term136675, term136675.getClass(), "nullText", null);
        term133925 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term133926 = (char[]) newCharArray(544);
        setCharElement(term133926, 480, (char) 48);
        setCharElement(term133926, 481, (char) 10);
        setField(term133925, term133925.getClass(), "buffer", term133926);
        setIntField(term133925, term133925.getClass(), "size", 482);
        setField(term133925, term133925.getClass(), "newLine", null);
        setField(term133925, term133925.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendln", argTypes, term133053, args);
        assertTrue(recursiveEquals(term133053, term136675));
        assertTrue(recursiveEquals(retValue, term133925));
    }

};



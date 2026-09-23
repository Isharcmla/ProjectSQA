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

public class StrBuilder_setNewLineText_331816485136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term36520;
     Object term36449;

    public StrBuilder_setNewLineText_331816485136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term137 = (char[]) newCharArray(32);
        setField(term136, term136.getClass(), "buffer", term137);
        setIntField(term136, term136.getClass(), "size", 1484323161);
        setField(term136, term136.getClass(), "newLine", "xxtlPwDYFs");
        setField(term136, term136.getClass(), "nullText", "jJCZpVmanW");
        term36520 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term36521 = (char[]) newCharArray(32);
        setField(term36520, term36520.getClass(), "buffer", term36521);
        setIntField(term36520, term36520.getClass(), "size", 1484323161);
        setField(term36520, term36520.getClass(), "newLine", "EGtDIRbSSb");
        setField(term36520, term36520.getClass(), "nullText", "jJCZpVmanW");
        term36449 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term36450 = (char[]) newCharArray(32);
        setField(term36449, term36449.getClass(), "buffer", term36450);
        setIntField(term36449, term36449.getClass(), "size", 1484323161);
        setField(term36449, term36449.getClass(), "newLine", "EGtDIRbSSb");
        setField(term36449, term36449.getClass(), "nullText", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        Object retValue = callMethod(klass, "setNewLineText", argTypes, term136, args);
        assertTrue(recursiveEquals(term136, term36520));
        assertTrue(recursiveEquals(retValue, term36449));
    }

};



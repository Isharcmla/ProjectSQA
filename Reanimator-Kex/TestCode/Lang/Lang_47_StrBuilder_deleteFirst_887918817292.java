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

public class StrBuilder_deleteFirst_887918817292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9983;
     Object term85608;
     Object term85535;

    public StrBuilder_deleteFirst_887918817292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9983 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9984 = (char[]) newCharArray(32);
        setField(term9983, term9983.getClass(), "buffer", term9984);
        setIntField(term9983, term9983.getClass(), "size", -25637976);
        setField(term9983, term9983.getClass(), "newLine", "iljANwuEjk");
        setField(term9983, term9983.getClass(), "nullText", "kNqaJKIATy");
        term85608 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term85609 = (char[]) newCharArray(32);
        setField(term85608, term85608.getClass(), "buffer", term85609);
        setIntField(term85608, term85608.getClass(), "size", -25637976);
        setField(term85608, term85608.getClass(), "newLine", "iljANwuEjk");
        setField(term85608, term85608.getClass(), "nullText", "kNqaJKIATy");
        term85535 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term85536 = (char[]) newCharArray(32);
        setField(term85535, term85535.getClass(), "buffer", term85536);
        setIntField(term85535, term85535.getClass(), "size", -25637976);
        setField(term85535, term85535.getClass(), "newLine", "iljANwuEjk");
        setField(term85535, term85535.getClass(), "nullText", "kNqaJKIATy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vKQukfbJUd";
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term9983, args);
        assertTrue(recursiveEquals(term9983, term85608));
        assertTrue(recursiveEquals(retValue, term85535));
    }

};



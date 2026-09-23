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

public class StrBuilder_contains_528601805253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10050;
     Object term79038;

    public StrBuilder_contains_528601805253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10050 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10051 = (char[]) newCharArray(32);
        setField(term10050, term10050.getClass(), "buffer", term10051);
        setIntField(term10050, term10050.getClass(), "size", -1697741339);
        setField(term10050, term10050.getClass(), "newLine", "OqbwYQfvAe");
        setField(term10050, term10050.getClass(), "nullText", "tRxZafjqIx");
        term79038 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term79039 = (char[]) newCharArray(32);
        setField(term79038, term79038.getClass(), "buffer", term79039);
        setIntField(term79038, term79038.getClass(), "size", -1697741339);
        setField(term79038, term79038.getClass(), "newLine", "OqbwYQfvAe");
        setField(term79038, term79038.getClass(), "nullText", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        Object retValue = callMethod(klass, "contains", argTypes, term10050, args);
        assertTrue(recursiveEquals(term10050, term79038));
        assertTrue(recursiveEquals(retValue, false));
    }

};



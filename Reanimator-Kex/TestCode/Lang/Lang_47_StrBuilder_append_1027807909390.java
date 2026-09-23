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

public class StrBuilder_append_1027807909390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68005;
     Object term67908;
     Object term116250;
     Object term116251;
     Object term116247;

    public StrBuilder_append_1027807909390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68005 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term67908 = (char[]) newCharArray(0);
        term116250 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term116250, term116250.getClass(), "buffer", null);
        setIntField(term116250, term116250.getClass(), "size", 0);
        setField(term116250, term116250.getClass(), "newLine", null);
        setField(term116250, term116250.getClass(), "nullText", null);
        term116251 = (char[]) newCharArray(0);
        term116247 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term116247, term116247.getClass(), "buffer", null);
        setIntField(term116247, term116247.getClass(), "size", 0);
        setField(term116247, term116247.getClass(), "newLine", null);
        setField(term116247, term116247.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term67908;
        Object retValue = callMethod(klass, "append", argTypes, term68005, args);
        assertTrue(recursiveEquals(term68005, term116250));
        assertTrue(recursiveEquals(term67908, term116251));
        assertTrue(recursiveEquals(retValue, term116247));
    }

};



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

public class StrBuilder_replaceFirst_1238446619420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1678958;
     Object term1706220;
     Object term1704692;

    public StrBuilder_replaceFirst_1238446619420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1678958 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1573701 = (char[]) newCharArray(511);
        setIntField(term1678958, term1678958.getClass(), "size", 706);
        setField(term1678958, term1678958.getClass(), "buffer", term1573701);
        term1706220 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1706221 = (char[]) newCharArray(511);
        setField(term1706220, term1706220.getClass(), "buffer", term1706221);
        setIntField(term1706220, term1706220.getClass(), "size", 706);
        setField(term1706220, term1706220.getClass(), "newLine", null);
        setField(term1706220, term1706220.getClass(), "nullText", null);
        term1704692 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1704693 = (char[]) newCharArray(511);
        setField(term1704692, term1704692.getClass(), "buffer", term1704693);
        setIntField(term1704692, term1704692.getClass(), "size", 706);
        setField(term1704692, term1704692.getClass(), "newLine", null);
        setField(term1704692, term1704692.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84\uFF84";
        args[1] = null;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term1678958, args);
        assertTrue(recursiveEquals(term1678958, term1706220));
        assertTrue(recursiveEquals(retValue, term1704692));
    }

};



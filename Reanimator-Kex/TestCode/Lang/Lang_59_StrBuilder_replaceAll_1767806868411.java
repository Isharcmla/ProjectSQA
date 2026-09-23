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

public class StrBuilder_replaceAll_1767806868411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417552;
     Object term1417854;
     Object term1417818;

    public StrBuilder_replaceAll_1767806868411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1417552 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1416538 = (char[]) newCharArray(31);
        setIntField(term1417552, term1417552.getClass(), "size", 23);
        setField(term1417552, term1417552.getClass(), "buffer", term1416538);
        term1417854 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1417855 = (char[]) newCharArray(31);
        setField(term1417854, term1417854.getClass(), "buffer", term1417855);
        setIntField(term1417854, term1417854.getClass(), "size", 23);
        setField(term1417854, term1417854.getClass(), "newLine", null);
        setField(term1417854, term1417854.getClass(), "nullText", null);
        term1417818 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1417819 = (char[]) newCharArray(31);
        setField(term1417818, term1417818.getClass(), "buffer", term1417819);
        setIntField(term1417818, term1417818.getClass(), "size", 23);
        setField(term1417818, term1417818.getClass(), "newLine", null);
        setField(term1417818, term1417818.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceAll", argTypes, term1417552, args);
        assertTrue(recursiveEquals(term1417552, term1417854));
        assertTrue(recursiveEquals(retValue, term1417818));
    }

};



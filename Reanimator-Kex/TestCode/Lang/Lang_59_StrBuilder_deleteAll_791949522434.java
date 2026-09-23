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

public class StrBuilder_deleteAll_791949522434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2032596;
     Object term2201124;
     Object term2200096;

    public StrBuilder_deleteAll_791949522434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2032596 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1959276 = (char[]) newCharArray(511);
        setIntField(term2032596, term2032596.getClass(), "size", 648);
        setField(term2032596, term2032596.getClass(), "buffer", term1959276);
        term2201124 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2201125 = (char[]) newCharArray(511);
        setField(term2201124, term2201124.getClass(), "buffer", term2201125);
        setIntField(term2201124, term2201124.getClass(), "size", 648);
        setField(term2201124, term2201124.getClass(), "newLine", null);
        setField(term2201124, term2201124.getClass(), "nullText", null);
        term2200096 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2200097 = (char[]) newCharArray(511);
        setField(term2200096, term2200096.getClass(), "buffer", term2200097);
        setIntField(term2200096, term2200096.getClass(), "size", 648);
        setField(term2200096, term2200096.getClass(), "newLine", null);
        setField(term2200096, term2200096.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444";
        Object retValue = callMethod(klass, "deleteAll", argTypes, term2032596, args);
        assertTrue(recursiveEquals(term2032596, term2201124));
        assertTrue(recursiveEquals(retValue, term2200096));
    }

};



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

public class StrBuilder_indexOf_1481532675362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208517;
     Object term211178;

    public StrBuilder_indexOf_1481532675362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208517 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term197737 = (char[]) newCharArray(511);
        setIntField(term208517, term208517.getClass(), "size", 514);
        setField(term208517, term208517.getClass(), "buffer", term197737);
        term211178 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term211179 = (char[]) newCharArray(511);
        setField(term211178, term211178.getClass(), "buffer", term211179);
        setIntField(term211178, term211178.getClass(), "size", 514);
        setField(term211178, term211178.getClass(), "newLine", null);
        setField(term211178, term211178.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        Object retValue = callMethod(klass, "indexOf", argTypes, term208517, args);
        assertTrue(recursiveEquals(term208517, term211178));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



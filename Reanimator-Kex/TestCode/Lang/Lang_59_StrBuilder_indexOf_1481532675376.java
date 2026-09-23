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

public class StrBuilder_indexOf_1481532675376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243432;
     Object term270291;

    public StrBuilder_indexOf_1481532675376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243432 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term215519 = (char[]) newCharArray(507);
        setIntField(term243432, term243432.getClass(), "size", 1024);
        setField(term243432, term243432.getClass(), "buffer", term215519);
        term270291 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term270292 = (char[]) newCharArray(507);
        setField(term270291, term270291.getClass(), "buffer", term270292);
        setIntField(term270291, term270291.getClass(), "size", 1024);
        setField(term270291, term270291.getClass(), "newLine", null);
        setField(term270291, term270291.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ";
        Object retValue = callMethod(klass, "indexOf", argTypes, term243432, args);
        assertTrue(recursiveEquals(term243432, term270291));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



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

public class StrBuilder_appendNewLine_1790607321361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53069;
     Object term104783;
     Object term104777;

    public StrBuilder_appendNewLine_1790607321361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53069 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term53069, term53069.getClass(), "newLine", "");
        term104783 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term104783, term104783.getClass(), "buffer", null);
        setIntField(term104783, term104783.getClass(), "size", 0);
        setField(term104783, term104783.getClass(), "newLine", "");
        setField(term104783, term104783.getClass(), "nullText", null);
        term104777 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term104777, term104777.getClass(), "buffer", null);
        setIntField(term104777, term104777.getClass(), "size", 0);
        setField(term104777, term104777.getClass(), "newLine", "");
        setField(term104777, term104777.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNewLine", argTypes, term53069, args);
        assertTrue(recursiveEquals(term53069, term104783));
        assertTrue(recursiveEquals(retValue, term104777));
    }

};



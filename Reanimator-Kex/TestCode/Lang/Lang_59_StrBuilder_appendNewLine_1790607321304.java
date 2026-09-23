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

public class StrBuilder_appendNewLine_1790607321304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50933;
     Object term93120;
     Object term93114;

    public StrBuilder_appendNewLine_1790607321304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50933 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term50933, term50933.getClass(), "newLine", "");
        term93120 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93120, term93120.getClass(), "buffer", null);
        setIntField(term93120, term93120.getClass(), "size", 0);
        setField(term93120, term93120.getClass(), "newLine", "");
        setField(term93120, term93120.getClass(), "nullText", null);
        term93114 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93114, term93114.getClass(), "buffer", null);
        setIntField(term93114, term93114.getClass(), "size", 0);
        setField(term93114, term93114.getClass(), "newLine", "");
        setField(term93114, term93114.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNewLine", argTypes, term50933, args);
        assertTrue(recursiveEquals(term50933, term93120));
        assertTrue(recursiveEquals(retValue, term93114));
    }

};



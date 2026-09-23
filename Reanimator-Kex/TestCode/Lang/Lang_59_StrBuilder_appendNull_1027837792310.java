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

public class StrBuilder_appendNull_1027837792310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55659;
     Object term98040;
     Object term98026;

    public StrBuilder_appendNull_1027837792310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55659 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term55659, term55659.getClass(), "nullText", null);
        term98040 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term98040, term98040.getClass(), "buffer", null);
        setIntField(term98040, term98040.getClass(), "size", 0);
        setField(term98040, term98040.getClass(), "newLine", null);
        setField(term98040, term98040.getClass(), "nullText", null);
        term98026 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term98026, term98026.getClass(), "buffer", null);
        setIntField(term98026, term98026.getClass(), "size", 0);
        setField(term98026, term98026.getClass(), "newLine", null);
        setField(term98026, term98026.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNull", argTypes, term55659, args);
        assertTrue(recursiveEquals(term55659, term98040));
        assertTrue(recursiveEquals(retValue, term98026));
    }

};



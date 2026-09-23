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

public class StrBuilder_ensureCapacity_89262521296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49365;
     Object term91146;
     Object term91142;

    public StrBuilder_ensureCapacity_89262521296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49365 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term49269 = (char[]) newCharArray(0);
        setField(term49365, term49365.getClass(), "buffer", term49269);
        term91146 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term91147 = (char[]) newCharArray(0);
        setField(term91146, term91146.getClass(), "buffer", term91147);
        setIntField(term91146, term91146.getClass(), "size", 0);
        setField(term91146, term91146.getClass(), "newLine", null);
        setField(term91146, term91146.getClass(), "nullText", null);
        term91142 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term91143 = (char[]) newCharArray(0);
        setField(term91142, term91142.getClass(), "buffer", term91143);
        setIntField(term91142, term91142.getClass(), "size", 0);
        setField(term91142, term91142.getClass(), "newLine", null);
        setField(term91142, term91142.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "ensureCapacity", argTypes, term49365, args);
        assertTrue(recursiveEquals(term49365, term91146));
        assertTrue(recursiveEquals(retValue, term91142));
    }

};



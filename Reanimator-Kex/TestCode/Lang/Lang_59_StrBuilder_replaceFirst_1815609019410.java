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

public class StrBuilder_replaceFirst_1815609019410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1416502;
     Object term1417675;
     Object term1417639;

    public StrBuilder_replaceFirst_1815609019410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1416502 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1415331 = (char[]) newCharArray(31);
        setIntField(term1416502, term1416502.getClass(), "size", 31);
        setCharElement(term1415331, 26, (char) 65535);
        setField(term1416502, term1416502.getClass(), "buffer", term1415331);
        term1417675 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1417676 = (char[]) newCharArray(31);
        setField(term1417675, term1417675.getClass(), "buffer", term1417676);
        setIntField(term1417675, term1417675.getClass(), "size", 31);
        setField(term1417675, term1417675.getClass(), "newLine", null);
        setField(term1417675, term1417675.getClass(), "nullText", null);
        term1417639 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1417640 = (char[]) newCharArray(31);
        setField(term1417639, term1417639.getClass(), "buffer", term1417640);
        setIntField(term1417639, term1417639.getClass(), "size", 31);
        setField(term1417639, term1417639.getClass(), "newLine", null);
        setField(term1417639, term1417639.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term1416502, args);
        assertTrue(recursiveEquals(term1416502, term1417675));
        assertTrue(recursiveEquals(retValue, term1417639));
    }

};



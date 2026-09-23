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

public class StrBuilder_contains_829616729318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13003;
     Object term93349;

    public StrBuilder_contains_829616729318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13003 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13004 = (char[]) newCharArray(32);
        setField(term13003, term13003.getClass(), "buffer", term13004);
        setIntField(term13003, term13003.getClass(), "size", 729658803);
        setField(term13003, term13003.getClass(), "newLine", "SIODFGaQhr");
        setField(term13003, term13003.getClass(), "nullText", "qYzsiuXOgS");
        term93349 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term93350 = (char[]) newCharArray(32);
        setField(term93349, term93349.getClass(), "buffer", term93350);
        setIntField(term93349, term93349.getClass(), "size", 729658803);
        setField(term93349, term93349.getClass(), "newLine", "SIODFGaQhr");
        setField(term93349, term93349.getClass(), "nullText", "qYzsiuXOgS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "contains", argTypes, term13003, args);
        assertTrue(recursiveEquals(term13003, term93349));
        assertTrue(recursiveEquals(retValue, false));
    }

};



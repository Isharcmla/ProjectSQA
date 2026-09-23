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

public class StrBuilder_reverse_1810590847243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8880;
     Object term75289;
     Object term75230;

    public StrBuilder_reverse_1810590847243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8880 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8881 = (char[]) newCharArray(32);
        setField(term8880, term8880.getClass(), "buffer", term8881);
        setIntField(term8880, term8880.getClass(), "size", -343325701);
        setField(term8880, term8880.getClass(), "newLine", "sQvGcVjdEx");
        setField(term8880, term8880.getClass(), "nullText", "rLHAoqXgPh");
        term75289 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term75290 = (char[]) newCharArray(32);
        setField(term75289, term75289.getClass(), "buffer", term75290);
        setIntField(term75289, term75289.getClass(), "size", -343325701);
        setField(term75289, term75289.getClass(), "newLine", "sQvGcVjdEx");
        setField(term75289, term75289.getClass(), "nullText", "rLHAoqXgPh");
        term75230 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term75231 = (char[]) newCharArray(32);
        setField(term75230, term75230.getClass(), "buffer", term75231);
        setIntField(term75230, term75230.getClass(), "size", -343325701);
        setField(term75230, term75230.getClass(), "newLine", "sQvGcVjdEx");
        setField(term75230, term75230.getClass(), "nullText", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reverse", argTypes, term8880, args);
        assertTrue(recursiveEquals(term8880, term75289));
        assertTrue(recursiveEquals(retValue, term75230));
    }

};



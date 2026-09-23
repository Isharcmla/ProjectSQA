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

public class StrBuilder_reverse_1810590847244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8880;
     Object term77471;
     Object term77412;

    public StrBuilder_reverse_1810590847244() {
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
        term77471 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term77472 = (char[]) newCharArray(32);
        setField(term77471, term77471.getClass(), "buffer", term77472);
        setIntField(term77471, term77471.getClass(), "size", -343325701);
        setField(term77471, term77471.getClass(), "newLine", "sQvGcVjdEx");
        setField(term77471, term77471.getClass(), "nullText", "rLHAoqXgPh");
        term77412 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term77413 = (char[]) newCharArray(32);
        setField(term77412, term77412.getClass(), "buffer", term77413);
        setIntField(term77412, term77412.getClass(), "size", -343325701);
        setField(term77412, term77412.getClass(), "newLine", "sQvGcVjdEx");
        setField(term77412, term77412.getClass(), "nullText", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reverse", argTypes, term8880, args);
        assertTrue(recursiveEquals(term8880, term77471));
        assertTrue(recursiveEquals(retValue, term77412));
    }

};



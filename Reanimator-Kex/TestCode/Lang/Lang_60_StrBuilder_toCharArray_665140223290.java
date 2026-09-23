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

public class StrBuilder_toCharArray_665140223290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44825;
     Object term88937;
     Object term88934;

    public StrBuilder_toCharArray_665140223290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44825 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term44825, term44825.getClass(), "size", 0);
        term88937 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term88937, term88937.getClass(), "buffer", null);
        setIntField(term88937, term88937.getClass(), "size", 0);
        setField(term88937, term88937.getClass(), "newLine", null);
        setField(term88937, term88937.getClass(), "nullText", null);
        term88934 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toCharArray", argTypes, term44825, args);
        assertTrue(recursiveEquals(term44825, term88937));
        assertTrue(recursiveEquals(retValue, term88934));
    }

};



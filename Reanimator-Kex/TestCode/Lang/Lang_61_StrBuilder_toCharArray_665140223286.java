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

public class StrBuilder_toCharArray_665140223286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42489;
     Object term85532;
     Object term85529;

    public StrBuilder_toCharArray_665140223286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42489 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term42489, term42489.getClass(), "size", 0);
        term85532 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term85532, term85532.getClass(), "buffer", null);
        setIntField(term85532, term85532.getClass(), "size", 0);
        setField(term85532, term85532.getClass(), "newLine", null);
        setField(term85532, term85532.getClass(), "nullText", null);
        term85529 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toCharArray", argTypes, term42489, args);
        assertTrue(recursiveEquals(term42489, term85532));
        assertTrue(recursiveEquals(retValue, term85529));
    }

};



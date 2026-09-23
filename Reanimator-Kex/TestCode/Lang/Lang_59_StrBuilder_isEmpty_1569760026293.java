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

public class StrBuilder_isEmpty_1569760026293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48123;
     Object term90605;

    public StrBuilder_isEmpty_1569760026293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48123 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term48123, term48123.getClass(), "size", 0);
        term90605 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term90605, term90605.getClass(), "buffer", null);
        setIntField(term90605, term90605.getClass(), "size", 0);
        setField(term90605, term90605.getClass(), "newLine", null);
        setField(term90605, term90605.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term48123, args);
        assertTrue(recursiveEquals(term48123, term90605));
        assertTrue(recursiveEquals(retValue, true));
    }

};



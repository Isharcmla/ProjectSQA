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

public class StrBuilder_insert_1589296603424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122869;
     Object term129048;
     Object term129038;

    public StrBuilder_insert_1589296603424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122869 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term122869, term122869.getClass(), "size", 0);
        term129048 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term129048, term129048.getClass(), "buffer", null);
        setIntField(term129048, term129048.getClass(), "size", 0);
        setField(term129048, term129048.getClass(), "newLine", null);
        setField(term129048, term129048.getClass(), "nullText", null);
        term129038 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term129038, term129038.getClass(), "buffer", null);
        setIntField(term129038, term129038.getClass(), "size", 0);
        setField(term129038, term129038.getClass(), "newLine", null);
        setField(term129038, term129038.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = "";
        Object retValue = callMethod(klass, "insert", argTypes, term122869, args);
        assertTrue(recursiveEquals(term122869, term129048));
        assertTrue(recursiveEquals(retValue, term129038));
    }

};



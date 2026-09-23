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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_deleteImpl_1568930280221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6572;
     Object term6631;
     Object term6633;
     Object term6635;

    public StrBuilder_deleteImpl_1568930280221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6572 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6573 = (char[]) newCharArray(32);
        setField(term6572, term6572.getClass(), "buffer", term6573);
        setIntField(term6572, term6572.getClass(), "size", -894662986);
        setField(term6572, term6572.getClass(), "newLine", "WzMEhMXkKx");
        setField(term6572, term6572.getClass(), "nullText", "XOiDvlDhdc");
        term6631 = new Integer(304775596);
        term6633 = new Integer(-1347665717);
        term6635 = new Integer(-1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6631;
        args[1] = term6633;
        args[2] = term6635;
        try {
            callMethod(klass, "deleteImpl", argTypes, term6572, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



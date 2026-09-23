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

public class StrBuilder_deleteAll_791949522351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129952;
     Object term157679;
     Object term156670;

    public StrBuilder_deleteAll_791949522351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129952 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term122066 = (char[]) newCharArray(495);
        setIntField(term129952, term129952.getClass(), "size", 520);
        setField(term129952, term129952.getClass(), "buffer", term122066);
        term157679 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term157680 = (char[]) newCharArray(495);
        setField(term157679, term157679.getClass(), "buffer", term157680);
        setIntField(term157679, term157679.getClass(), "size", 520);
        setField(term157679, term157679.getClass(), "newLine", null);
        setField(term157679, term157679.getClass(), "nullText", null);
        term156670 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term156671 = (char[]) newCharArray(495);
        setField(term156670, term156670.getClass(), "buffer", term156671);
        setIntField(term156670, term156670.getClass(), "size", 520);
        setField(term156670, term156670.getClass(), "newLine", null);
        setField(term156670, term156670.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
        Object retValue = callMethod(klass, "deleteAll", argTypes, term129952, args);
        assertTrue(recursiveEquals(term129952, term157679));
        assertTrue(recursiveEquals(retValue, term156670));
    }

};



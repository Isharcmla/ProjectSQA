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

public class StrBuilder_lastIndexOf_1019064583263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11242;
     Object term81615;

    public StrBuilder_lastIndexOf_1019064583263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11242 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11243 = (char[]) newCharArray(32);
        setField(term11242, term11242.getClass(), "buffer", term11243);
        setIntField(term11242, term11242.getClass(), "size", -461771056);
        setField(term11242, term11242.getClass(), "newLine", "PCipZnmBOF");
        setField(term11242, term11242.getClass(), "nullText", "zcorEihhLK");
        term81615 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81616 = (char[]) newCharArray(32);
        setField(term81615, term81615.getClass(), "buffer", term81616);
        setIntField(term81615, term81615.getClass(), "size", -461771056);
        setField(term81615, term81615.getClass(), "newLine", "PCipZnmBOF");
        setField(term81615, term81615.getClass(), "nullText", "zcorEihhLK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term11242, args);
        assertTrue(recursiveEquals(term11242, term81615));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



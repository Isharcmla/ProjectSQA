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

public class StrBuilder_setNullText_70591154284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40907;
     Object term89998;
     Object term89996;

    public StrBuilder_setNullText_70591154284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40907 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term89998 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term89998, term89998.getClass(), "buffer", null);
        setIntField(term89998, term89998.getClass(), "size", 0);
        setField(term89998, term89998.getClass(), "newLine", null);
        setField(term89998, term89998.getClass(), "nullText", null);
        term89996 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term89996, term89996.getClass(), "buffer", null);
        setIntField(term89996, term89996.getClass(), "size", 0);
        setField(term89996, term89996.getClass(), "newLine", null);
        setField(term89996, term89996.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setNullText", argTypes, term40907, args);
        assertTrue(recursiveEquals(term40907, term89998));
        assertTrue(recursiveEquals(retValue, term89996));
    }

};



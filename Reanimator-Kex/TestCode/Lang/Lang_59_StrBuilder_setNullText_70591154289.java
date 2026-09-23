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

public class StrBuilder_setNullText_70591154289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47005;
     Object term90182;
     Object term90178;

    public StrBuilder_setNullText_70591154289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47005 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term90182 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term90182, term90182.getClass(), "buffer", null);
        setIntField(term90182, term90182.getClass(), "size", 0);
        setField(term90182, term90182.getClass(), "newLine", null);
        setField(term90182, term90182.getClass(), "nullText", null);
        term90178 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term90178, term90178.getClass(), "buffer", null);
        setIntField(term90178, term90178.getClass(), "size", 0);
        setField(term90178, term90178.getClass(), "newLine", null);
        setField(term90178, term90178.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "setNullText", argTypes, term47005, args);
        assertTrue(recursiveEquals(term47005, term90182));
        assertTrue(recursiveEquals(retValue, term90178));
    }

};



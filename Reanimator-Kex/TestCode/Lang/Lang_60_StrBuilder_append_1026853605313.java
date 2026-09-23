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

public class StrBuilder_append_1026853605313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57010;
     Object term100686;
     Object term100682;

    public StrBuilder_append_1026853605313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57010 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term100686 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term100686, term100686.getClass(), "buffer", null);
        setIntField(term100686, term100686.getClass(), "size", 0);
        setField(term100686, term100686.getClass(), "newLine", null);
        setField(term100686, term100686.getClass(), "nullText", null);
        term100682 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term100682, term100682.getClass(), "buffer", null);
        setIntField(term100682, term100682.getClass(), "size", 0);
        setField(term100682, term100682.getClass(), "newLine", null);
        setField(term100682, term100682.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term57010, args);
        assertTrue(recursiveEquals(term57010, term100686));
        assertTrue(recursiveEquals(retValue, term100682));
    }

};



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

public class StrBuilder_append_1026853605360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155121;
     Object term154020;
     Object term157510;
     Object term157511;
     Object term156505;

    public StrBuilder_append_1026853605360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155121 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term154020 = (char[]) newCharArray(1000);
        term157510 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term157510, term157510.getClass(), "buffer", null);
        setIntField(term157510, term157510.getClass(), "size", 0);
        setField(term157510, term157510.getClass(), "newLine", null);
        setField(term157510, term157510.getClass(), "nullText", null);
        term157511 = (char[]) newCharArray(1000);
        term156505 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term156505, term156505.getClass(), "buffer", null);
        setIntField(term156505, term156505.getClass(), "size", 0);
        setField(term156505, term156505.getClass(), "newLine", null);
        setField(term156505, term156505.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term154020;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term155121, args);
        assertTrue(recursiveEquals(term155121, term157510));
        assertTrue(recursiveEquals(term154020, term157511));
        assertTrue(recursiveEquals(retValue, term156505));
    }

};



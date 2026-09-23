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

public class StrBuilder_append_223145107302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50635;
     Object term93064;
     Object term93060;

    public StrBuilder_append_223145107302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50635 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term93064 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93064, term93064.getClass(), "buffer", null);
        setIntField(term93064, term93064.getClass(), "size", 0);
        setField(term93064, term93064.getClass(), "newLine", null);
        setField(term93064, term93064.getClass(), "nullText", null);
        term93060 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93060, term93060.getClass(), "buffer", null);
        setIntField(term93060, term93060.getClass(), "size", 0);
        setField(term93060, term93060.getClass(), "newLine", null);
        setField(term93060, term93060.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term50635, args);
        assertTrue(recursiveEquals(term50635, term93064));
        assertTrue(recursiveEquals(retValue, term93060));
    }

};



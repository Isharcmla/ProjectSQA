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

public class StrBuilder_setLength_1724723337283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40816;
     Object term89994;
     Object term89991;

    public StrBuilder_setLength_1724723337283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40816 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term89994 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term89994, term89994.getClass(), "buffer", null);
        setIntField(term89994, term89994.getClass(), "size", 0);
        setField(term89994, term89994.getClass(), "newLine", null);
        setField(term89994, term89994.getClass(), "nullText", null);
        term89991 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term89991, term89991.getClass(), "buffer", null);
        setIntField(term89991, term89991.getClass(), "size", 0);
        setField(term89991, term89991.getClass(), "newLine", null);
        setField(term89991, term89991.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "setLength", argTypes, term40816, args);
        assertTrue(recursiveEquals(term40816, term89994));
        assertTrue(recursiveEquals(retValue, term89991));
    }

};



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

public class StrBuilder_appendNewLine_1790607321300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50347;
     Object term92760;
     Object term92753;

    public StrBuilder_appendNewLine_1790607321300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50347 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term50347, term50347.getClass(), "newLine", "");
        term92760 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term92760, term92760.getClass(), "buffer", null);
        setIntField(term92760, term92760.getClass(), "size", 0);
        setField(term92760, term92760.getClass(), "newLine", "");
        setField(term92760, term92760.getClass(), "nullText", null);
        term92753 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term92753, term92753.getClass(), "buffer", null);
        setIntField(term92753, term92753.getClass(), "size", 0);
        setField(term92753, term92753.getClass(), "newLine", "");
        setField(term92753, term92753.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNewLine", argTypes, term50347, args);
        assertTrue(recursiveEquals(term50347, term92760));
        assertTrue(recursiveEquals(retValue, term92753));
    }

};



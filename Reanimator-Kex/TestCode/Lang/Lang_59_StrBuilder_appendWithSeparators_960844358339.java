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
import java.util.ArrayList;

public class StrBuilder_appendWithSeparators_960844358339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74651;
     Object term74703;
     Object term109003;
     Object term109004;

    public StrBuilder_appendWithSeparators_960844358339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74651 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term74703 = new ArrayList();
        term109003 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term109003, term109003.getClass(), "buffer", null);
        setIntField(term109003, term109003.getClass(), "size", 0);
        setField(term109003, term109003.getClass(), "newLine", null);
        setField(term109003, term109003.getClass(), "nullText", null);
        term109004 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term74703;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term74651, args);
        assertTrue(recursiveEquals(term74651, term109003));
        assertTrue(recursiveEquals(term74703, term109004));
    }

};



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
import java.lang.Object;

public class StrBuilder_appendWithSeparators_174823995331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60333;
     Object term60231;
     Object term116942;
     Object term116943;

    public StrBuilder_appendWithSeparators_174823995331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60333 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term60231 = (Object[]) newArray("java.lang.Object", 489);
        term116942 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term116942, term116942.getClass(), "buffer", null);
        setIntField(term116942, term116942.getClass(), "size", 0);
        setField(term116942, term116942.getClass(), "newLine", null);
        setField(term116942, term116942.getClass(), "nullText", null);
        term116943 = (Object[]) newArray("java.lang.Object", 489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term60231;
        args[1] = "";
        callMethod(klass, "appendWithSeparators", argTypes, term60333, args);
        assertTrue(recursiveEquals(term60333, term116942));
        assertTrue(recursiveEquals(term60231, term116943));
    }

};



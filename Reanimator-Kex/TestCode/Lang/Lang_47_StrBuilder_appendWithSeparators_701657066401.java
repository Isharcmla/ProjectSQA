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

public class StrBuilder_appendWithSeparators_701657066401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72770;
     Object term72868;
     Object term118343;
     Object term118344;

    public StrBuilder_appendWithSeparators_701657066401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72770 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term72868 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedQueue$Itr"));
        term118343 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term118343, term118343.getClass(), "buffer", null);
        setIntField(term118343, term118343.getClass(), "size", 0);
        setField(term118343, term118343.getClass(), "newLine", null);
        setField(term118343, term118343.getClass(), "nullText", null);
        term118344 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedQueue$Itr"));
        setField(term118344, term118344.getClass(), "nextNode", null);
        setField(term118344, term118344.getClass(), "nextItem", null);
        setField(term118344, term118344.getClass(), "lastRet", null);
        setField(term118344, term118344.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term72868;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term72770, args);
        assertTrue(recursiveEquals(term72770, term118343));
        assertTrue(recursiveEquals(term72868, term118344));
    }

};



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

public class StrBuilder_appendAll_194184678490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286412;
     Object term286506;
     Object term318631;
     Object term318632;

    public StrBuilder_appendAll_194184678490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286412 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term286506 = newInstance(Class.forName("java.util.concurrent.LinkedTransferQueue$Itr"));
        term318631 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term318631, term318631.getClass(), "buffer", null);
        setIntField(term318631, term318631.getClass(), "size", 0);
        setField(term318631, term318631.getClass(), "newLine", null);
        setField(term318631, term318631.getClass(), "nullText", null);
        term318632 = newInstance(Class.forName("java.util.concurrent.LinkedTransferQueue$Itr"));
        setField(term318632, term318632.getClass(), "nextNode", null);
        setField(term318632, term318632.getClass(), "nextItem", null);
        setField(term318632, term318632.getClass(), "lastRet", null);
        setField(term318632, term318632.getClass(), "ancestor", null);
        setField(term318632, term318632.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term286506;
        callMethod(klass, "appendAll", argTypes, term286412, args);
        assertTrue(recursiveEquals(term286412, term318631));
        assertTrue(recursiveEquals(term286506, term318632));
    }

};



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

public class StrBuilder_reverse_1810590847464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225200;
     Object term250457;
     Object term250455;

    public StrBuilder_reverse_1810590847464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225200 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term225200, term225200.getClass(), "size", 0);
        term250457 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term250457, term250457.getClass(), "buffer", null);
        setIntField(term250457, term250457.getClass(), "size", 0);
        setField(term250457, term250457.getClass(), "newLine", null);
        setField(term250457, term250457.getClass(), "nullText", null);
        term250455 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term250455, term250455.getClass(), "buffer", null);
        setIntField(term250455, term250455.getClass(), "size", 0);
        setField(term250455, term250455.getClass(), "newLine", null);
        setField(term250455, term250455.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reverse", argTypes, term225200, args);
        assertTrue(recursiveEquals(term225200, term250457));
        assertTrue(recursiveEquals(retValue, term250455));
    }

};



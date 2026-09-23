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

public class StrBuilder_append_1027806917322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58940;
     Object term97533;
     Object term96433;

    public StrBuilder_append_1027806917322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58940 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term57739 = (char[]) newCharArray(544);
        setIntField(term58940, term58940.getClass(), "size", 480);
        setField(term58940, term58940.getClass(), "buffer", term57739);
        term97533 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97534 = (char[]) newCharArray(544);
        setCharElement(term97534, 480, (char) 48);
        setField(term97533, term97533.getClass(), "buffer", term97534);
        setIntField(term97533, term97533.getClass(), "size", 481);
        setField(term97533, term97533.getClass(), "newLine", null);
        setField(term97533, term97533.getClass(), "nullText", null);
        term96433 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96434 = (char[]) newCharArray(544);
        setCharElement(term96434, 480, (char) 48);
        setField(term96433, term96433.getClass(), "buffer", term96434);
        setIntField(term96433, term96433.getClass(), "size", 481);
        setField(term96433, term96433.getClass(), "newLine", null);
        setField(term96433, term96433.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term58940, args);
        assertTrue(recursiveEquals(term58940, term97533));
        assertTrue(recursiveEquals(retValue, term96433));
    }

};



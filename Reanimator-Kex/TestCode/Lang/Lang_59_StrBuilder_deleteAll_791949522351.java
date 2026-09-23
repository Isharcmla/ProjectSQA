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

public class StrBuilder_deleteAll_791949522351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140015;
     Object term160654;
     Object term159645;

    public StrBuilder_deleteAll_791949522351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140015 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term132129 = (char[]) newCharArray(495);
        setIntField(term140015, term140015.getClass(), "size", 520);
        setField(term140015, term140015.getClass(), "buffer", term132129);
        term160654 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term160655 = (char[]) newCharArray(495);
        setField(term160654, term160654.getClass(), "buffer", term160655);
        setIntField(term160654, term160654.getClass(), "size", 520);
        setField(term160654, term160654.getClass(), "newLine", null);
        setField(term160654, term160654.getClass(), "nullText", null);
        term159645 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term159646 = (char[]) newCharArray(495);
        setField(term159645, term159645.getClass(), "buffer", term159646);
        setIntField(term159645, term159645.getClass(), "size", 520);
        setField(term159645, term159645.getClass(), "newLine", null);
        setField(term159645, term159645.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
        Object retValue = callMethod(klass, "deleteAll", argTypes, term140015, args);
        assertTrue(recursiveEquals(term140015, term160654));
        assertTrue(recursiveEquals(retValue, term159645));
    }

};



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

public class StrBuilder_deleteAll_791949522377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197981;
     Object term200841;
     Object term199335;

    public StrBuilder_deleteAll_791949522377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197981 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term188741 = (char[]) newCharArray(511);
        setIntField(term197981, term197981.getClass(), "size", 1073741825);
        setField(term197981, term197981.getClass(), "buffer", term188741);
        term200841 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term200842 = (char[]) newCharArray(511);
        setField(term200841, term200841.getClass(), "buffer", term200842);
        setIntField(term200841, term200841.getClass(), "size", 1073741825);
        setField(term200841, term200841.getClass(), "newLine", null);
        setField(term200841, term200841.getClass(), "nullText", null);
        term199335 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term199336 = (char[]) newCharArray(511);
        setField(term199335, term199335.getClass(), "buffer", term199336);
        setIntField(term199335, term199335.getClass(), "size", 1073741825);
        setField(term199335, term199335.getClass(), "newLine", null);
        setField(term199335, term199335.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80";
        Object retValue = callMethod(klass, "deleteAll", argTypes, term197981, args);
        assertTrue(recursiveEquals(term197981, term200841));
        assertTrue(recursiveEquals(retValue, term199335));
    }

};



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

public class StrBuilder_replaceAll_1105099622303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11156;
     Object term89269;
     Object term89075;

    public StrBuilder_replaceAll_1105099622303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11156 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11157 = (char[]) newCharArray(32);
        setField(term11156, term11156.getClass(), "buffer", term11157);
        setIntField(term11156, term11156.getClass(), "size", 1283079251);
        setField(term11156, term11156.getClass(), "newLine", "izPpKDErnQ");
        setField(term11156, term11156.getClass(), "nullText", "NnpwZBUTvx");
        term89269 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term89270 = (char[]) newCharArray(32);
        setField(term89269, term89269.getClass(), "buffer", term89270);
        setIntField(term89269, term89269.getClass(), "size", 1283079251);
        setField(term89269, term89269.getClass(), "newLine", "izPpKDErnQ");
        setField(term89269, term89269.getClass(), "nullText", "NnpwZBUTvx");
        term89075 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term89076 = (char[]) newCharArray(32);
        setField(term89075, term89075.getClass(), "buffer", term89076);
        setIntField(term89075, term89075.getClass(), "size", 1283079251);
        setField(term89075, term89075.getClass(), "newLine", "izPpKDErnQ");
        setField(term89075, term89075.getClass(), "nullText", "NnpwZBUTvx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "tlQSNgTkQX";
        Object retValue = callMethod(klass, "replaceAll", argTypes, term11156, args);
        assertTrue(recursiveEquals(term11156, term89269));
        assertTrue(recursiveEquals(retValue, term89075));
    }

};



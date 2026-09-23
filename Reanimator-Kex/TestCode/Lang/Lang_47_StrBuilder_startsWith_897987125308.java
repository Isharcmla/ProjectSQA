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

public class StrBuilder_startsWith_897987125308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11922;
     Object term90788;

    public StrBuilder_startsWith_897987125308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11922 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11923 = (char[]) newCharArray(32);
        setField(term11922, term11922.getClass(), "buffer", term11923);
        setIntField(term11922, term11922.getClass(), "size", 1041916673);
        setField(term11922, term11922.getClass(), "newLine", "gUvcueTURF");
        setField(term11922, term11922.getClass(), "nullText", "EwQBhZjCIT");
        term90788 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term90789 = (char[]) newCharArray(32);
        setField(term90788, term90788.getClass(), "buffer", term90789);
        setIntField(term90788, term90788.getClass(), "size", 1041916673);
        setField(term90788, term90788.getClass(), "newLine", "gUvcueTURF");
        setField(term90788, term90788.getClass(), "nullText", "EwQBhZjCIT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aSkmSwTnEw";
        Object retValue = callMethod(klass, "startsWith", argTypes, term11922, args);
        assertTrue(recursiveEquals(term11922, term90788));
        assertTrue(recursiveEquals(retValue, false));
    }

};



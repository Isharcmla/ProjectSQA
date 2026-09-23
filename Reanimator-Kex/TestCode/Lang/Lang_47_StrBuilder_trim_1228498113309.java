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

public class StrBuilder_trim_1228498113309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11811;
     Object term90985;
     Object term90926;

    public StrBuilder_trim_1228498113309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11811 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11812 = (char[]) newCharArray(32);
        setField(term11811, term11811.getClass(), "buffer", term11812);
        setIntField(term11811, term11811.getClass(), "size", -1274456137);
        setField(term11811, term11811.getClass(), "newLine", "AHbZyFOmlo");
        setField(term11811, term11811.getClass(), "nullText", "TwfWVQGiIj");
        term90985 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term90986 = (char[]) newCharArray(32);
        setField(term90985, term90985.getClass(), "buffer", term90986);
        setIntField(term90985, term90985.getClass(), "size", -1274456137);
        setField(term90985, term90985.getClass(), "newLine", "AHbZyFOmlo");
        setField(term90985, term90985.getClass(), "nullText", "TwfWVQGiIj");
        term90926 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term90927 = (char[]) newCharArray(32);
        setField(term90926, term90926.getClass(), "buffer", term90927);
        setIntField(term90926, term90926.getClass(), "size", -1274456137);
        setField(term90926, term90926.getClass(), "newLine", "AHbZyFOmlo");
        setField(term90926, term90926.getClass(), "nullText", "TwfWVQGiIj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term11811, args);
        assertTrue(recursiveEquals(term11811, term90985));
        assertTrue(recursiveEquals(retValue, term90926));
    }

};



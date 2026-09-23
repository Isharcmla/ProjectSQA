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

public class StrBuilder_equals_461800784274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12289;
     Object term12348;
     Object term85119;
     Object term85125;

    public StrBuilder_equals_461800784274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12289 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12290 = (char[]) newCharArray(32);
        setField(term12289, term12289.getClass(), "buffer", term12290);
        setIntField(term12289, term12289.getClass(), "size", -1885090354);
        setField(term12289, term12289.getClass(), "newLine", "XfRABIFVEp");
        setField(term12289, term12289.getClass(), "nullText", "MHGKyEnwKc");
        term12348 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12349 = (char[]) newCharArray(32);
        setField(term12348, term12348.getClass(), "buffer", term12349);
        setIntField(term12348, term12348.getClass(), "size", -2066804303);
        setField(term12348, term12348.getClass(), "newLine", "ShIELyuULw");
        setField(term12348, term12348.getClass(), "nullText", "IpQuOGMgmj");
        term85119 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term85120 = (char[]) newCharArray(32);
        setField(term85119, term85119.getClass(), "buffer", term85120);
        setIntField(term85119, term85119.getClass(), "size", -1885090354);
        setField(term85119, term85119.getClass(), "newLine", "XfRABIFVEp");
        setField(term85119, term85119.getClass(), "nullText", "MHGKyEnwKc");
        term85125 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term85126 = (char[]) newCharArray(32);
        setField(term85125, term85125.getClass(), "buffer", term85126);
        setIntField(term85125, term85125.getClass(), "size", -2066804303);
        setField(term85125, term85125.getClass(), "newLine", "ShIELyuULw");
        setField(term85125, term85125.getClass(), "nullText", "IpQuOGMgmj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term12348;
        Object retValue = callMethod(klass, "equals", argTypes, term12289, args);
        assertTrue(recursiveEquals(term12289, term85119));
        assertTrue(recursiveEquals(term12348, term85125));
        assertTrue(recursiveEquals(retValue, false));
    }

};



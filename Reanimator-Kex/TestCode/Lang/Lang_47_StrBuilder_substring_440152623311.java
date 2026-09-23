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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_substring_440152623311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12188;
     Object term12247;

    public StrBuilder_substring_440152623311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12188 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12189 = (char[]) newCharArray(32);
        setField(term12188, term12188.getClass(), "buffer", term12189);
        setIntField(term12188, term12188.getClass(), "size", 663292551);
        setField(term12188, term12188.getClass(), "newLine", "OcJCIDNIXA");
        setField(term12188, term12188.getClass(), "nullText", "XfRABIFVEp");
        term12247 = new Integer(-1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12247;
        try {
            callMethod(klass, "substring", argTypes, term12188, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



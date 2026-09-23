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
import java.lang.Integer;

public class StrBuilder_lastIndexOf_98458295330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14441;
     Object term14500;
     Object term96552;

    public StrBuilder_lastIndexOf_98458295330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14441 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14442 = (char[]) newCharArray(32);
        setField(term14441, term14441.getClass(), "buffer", term14442);
        setIntField(term14441, term14441.getClass(), "size", -1310015129);
        setField(term14441, term14441.getClass(), "newLine", "OcfNzHYdki");
        setField(term14441, term14441.getClass(), "nullText", "uPuCVuZYOI");
        term14500 = new Integer(-2104981311);
        term96552 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96553 = (char[]) newCharArray(32);
        setField(term96552, term96552.getClass(), "buffer", term96553);
        setIntField(term96552, term96552.getClass(), "size", -1310015129);
        setField(term96552, term96552.getClass(), "newLine", "OcfNzHYdki");
        setField(term96552, term96552.getClass(), "nullText", "uPuCVuZYOI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14500;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term14441, args);
        assertTrue(recursiveEquals(term14441, term96552));
        assertTrue(recursiveEquals(term14500, -2104981311));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



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

public class StrBuilder_replaceFirst_393548213240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8469;
     Object term74983;
     Object term74789;

    public StrBuilder_replaceFirst_393548213240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8469 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8470 = (char[]) newCharArray(32);
        setField(term8469, term8469.getClass(), "buffer", term8470);
        setIntField(term8469, term8469.getClass(), "size", 568954359);
        setField(term8469, term8469.getClass(), "newLine", "aWYOWZFyaX");
        setField(term8469, term8469.getClass(), "nullText", "BRIVNtfUWU");
        term74983 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term74984 = (char[]) newCharArray(32);
        setField(term74983, term74983.getClass(), "buffer", term74984);
        setIntField(term74983, term74983.getClass(), "size", 568954359);
        setField(term74983, term74983.getClass(), "newLine", "aWYOWZFyaX");
        setField(term74983, term74983.getClass(), "nullText", "BRIVNtfUWU");
        term74789 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term74790 = (char[]) newCharArray(32);
        setField(term74789, term74789.getClass(), "buffer", term74790);
        setIntField(term74789, term74789.getClass(), "size", 568954359);
        setField(term74789, term74789.getClass(), "newLine", "aWYOWZFyaX");
        setField(term74789, term74789.getClass(), "nullText", "BRIVNtfUWU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "DbiCVtPPCT";
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term8469, args);
        assertTrue(recursiveEquals(term8469, term74983));
        assertTrue(recursiveEquals(retValue, term74789));
    }

};


